package Java0323.Lecture12;

import java.util.Random;

/*final*/ class Super{
	
	private /*final*/ int MAX = 100;
	
	public /*final*/ void info() {
		System.out.println("super클래스에서 정의된 메소드...");
	}
}

class Sub extends Super{
	
	@Override
	public void info() {
		System.out.println("sub클래스에서 정의된 메소드...");
	}
}

/*
class MyString extends String{
	// The type MyString cannot subclass the final class String
}
*/

class MyRandom extends Random{

	/**
	 * bound가 10일때 1 ~ 10 사이의 난수 추출
	 * @param bound 추출정수 범위
	 * @return 1 ~ bound 사이의 난수
	 */
	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		return super.nextInt(bound) + 1;
	}
	
}

public class FinalMain {

	public static void main(String[] args) {

		/*
		 *  1~100사이의 난수를 발생시켜 출력하는 코드를 작성
		 */
		Random r = new MyRandom();
		int random = r.nextInt(3);
		System.out.println("추출된 정수 : " + random);

	}

}
