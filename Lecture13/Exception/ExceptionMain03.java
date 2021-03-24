package Java0324.Lecture13.Exception;

public class ExceptionMain03 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		for(int i = -2; i < 3; i++) {
			System.out.println(i + "번째 반복문 수행중...");
			try {
				System.out.println(10 / i);
			} catch(ArithmeticException ae) {
				System.out.println("예외발생...");
				break;
			} finally {				// break문을 만나고 finally를 찍고 나감.
				System.out.println("반복문 수행중...");
			}
		}

		System.out.println("main end...");
	}

}
