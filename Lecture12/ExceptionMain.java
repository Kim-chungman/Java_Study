package Java0323.Lecture12;

import java.util.Random;

public class ExceptionMain {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		Random r = new Random();
		int num = r.nextInt(3);		// 0~2 사이의 난수 발생
		System.out.println("num : " + num);
		
		System.out.println(10 / num);
		
		System.out.println("main end...");
		
	}

}