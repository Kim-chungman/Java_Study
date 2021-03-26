package Java0326.Lecture15.FileIO;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileIOMain05 {

	public static void main(String[] args) {

		write();
//		read();

	}
	
	public static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			
			fis = new FileInputStream("dogInfo.txt");
			dis = new DataInputStream(fis);
			
			String data = dis.readUTF();
			System.out.println(data);
			
			String[] strArr = data.split(":");
			System.out.println(Arrays.toString(strArr));
			
			Dog d = new Dog(strArr[0], Integer.parseInt(strArr[1]), strArr[2]);
			
		} catch (Exception e) {
			
		} finally {
			FileClose.close(dis, fis);
		}

		
	}
	
	public static void write() {
		
		Dog d = new Dog("앙꼬", 4, "푸들");
		Dog d2 = new Dog("공주", 2, "요크셔테리어");
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			
			fos = new FileOutputStream("dogInfo.txt");
			dos = new DataOutputStream(fos);
			
			dos.writeUTF(d.getName() + ":" + d.getAge() + ":" + d.getKind());
			
			
		} catch (Exception e) {
			
		} finally {
			FileClose.close(dos, fos);
		}
		System.out.println("dogInfo에 저장완료...");
	}

}
