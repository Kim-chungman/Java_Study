package Java0326.Lecture15.FileIO;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main(String[] args) {
		
		System.out.println("입력을 하세요. ctrl+z를 누르면 종료합니다.");
		InputStream is = System.in;
		
		InputStreamReader isr = new InputStreamReader(is);
		
		try {
			while(true) {
				int c = isr.read();	// 너 입출력 장치 없으면 어떡해? 입출력 장치에 문제 있으면 어떡해?
				if(c == -1) break;
				System.out.print((char)c);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		/*
		System.out.println("입력을 하세요. ctrl+z를 누르면 종료합니다.");
		InputStream is = System.in;
		while(true) {
			int c = is.read();
			if(c == -1) break;		// 라인의 첫 열에서만 가능(ctrl+z)
			System.out.print((char)c);	// Buffer를 써서 한번에 우르르 출력
		}
		*/
	}

}
