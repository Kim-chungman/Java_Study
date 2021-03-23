package Java0323.Lecture12;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
			System.out.println("main start...");
		
			Random r = new Random();
			int num = r.nextInt(3);		// 0~2 사이의 난수 발생
			System.out.println("num : " + num);
		
			String str = null;
	
		try {
			System.out.println(10 / num);
			System.out.println("첫번째 문자 : " + str.charAt(0));
			
		} catch(Exception e) {				// 묵시적형변환
			System.out.println("이유 : " + e.getMessage());		// "/ by zero"
//			e.printStackTrace();
		} 
		
		/*
		try {
			System.out.println(10 / num);
			System.out.println("첫번째 문자 : " + str.charAt(0));
		} catch(ArithmeticException ae) {
//			System.out.println("이유 : " + ae.getMessage());		// "/ by zero"
			ae.printStackTrace();
		} catch(NullPointerException a) {
			System.out.println("NullPointerException 진입...");
		}
		*/
		
		System.out.println("main end...");
		
	}

}
