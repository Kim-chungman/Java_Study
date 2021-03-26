package Java0326.Lecture15.FileIO;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain04 {

	public static void write() {
		
		char c = 'A';
		int i = 97;
		double d = 12.34;
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("Iodata/test.dat");
			dos = new DataOutputStream(fos);
		
			dos.writeChar(c);
			dos.writeInt(i);
			dos.writeDouble(d);
			
			System.out.println("쓰기완료...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos);
			FileClose.close(fos);
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("Iodata/test.dat");
			dis = new DataInputStream(fis);
			
			// 순서 매우 중요!! 뒤바뀌면 데이터가 이상하게 불러옴.
			char c = dis.readChar();
			int i = dis.readInt();
			double d = dis.readDouble();
			
			System.out.println("읽어온 데이터 출력");
			System.out.println("문자 : " + c);
			System.out.println("정수 : " + i);
			System.out.println("실수 : " + d);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
		
	}
	
	public static void main(String[] args) {

		read();
//		write();
		

	}

}
