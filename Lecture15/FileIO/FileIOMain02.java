package Java0326.Lecture15.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IOdata/dog.jpg => IOdata/dog2.jpg 복사
 * 기계입장 :입력장치				출력장치
 * 
 * 	<작업순서>
 * 1. Stream open
 * 2. read/write
 * 3. Stream close
 */

public class FileIOMain02 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			
			long start = System.currentTimeMillis();
			
		// 1. Stream open	
			fis = new FileInputStream("Iodata/dog.jpg");
			fos = new FileOutputStream("Iodata/dog2.jpg");
		//	FileInputStream fis = new FileInputStream("Iodata/dog.jpg");
		//	FileOutputStream fos = new FileOutputStream("Iodata/dog2.jpg");
			
		// 2. read/write
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("복사완료!");
//			while(true);					// 외부에서 lock이 걸려있기때문에 파일이 0바이트로 나옴
			System.out.println("소요시간 : " + (end - start)/1000. + "초");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
		// 3. Stream close
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
