package Java0326.Lecture15.FileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain03 {

	// dog.jgp => dog3.jpg 복사
	public static void main(String[] args) {
	
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			long start = System.currentTimeMillis();
			
			fis = new FileInputStream("Iodata/dog.jpg");
			fos = new FileOutputStream("Iodata/dog.jpg");
			
			// 버퍼사용 객체연결
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			// 복사수행
			while(true) {
				int c = bis.read();
				if(c == -1)break;
				bos.write(c);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("복사완료!");
			System.out.println("소요시간 : " + (end - start)/1000. + "초");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			/*
			FileClose.close(bis);
			FileClose.close(bos);
			FileClose.close(fis);
			FileClose.close(fos);
			*/
			/*
			if(bis != null) {
				try {
					bis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(bos != null) {
				try {
					bos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fis != null) {
				try {
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		*/
		}
		
	}

}
