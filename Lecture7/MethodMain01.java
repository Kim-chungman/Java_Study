package Lecture7;
/*
 * **********
 * hello
 * **********
 * hi
 * **********
 * Good-bye
 * **********
 */
public class MethodMain01 {
	
	/**
	 * 임의의 문자를 반복하여 출력하는 기능
	 * @param c 출력할 문자
	 * @param cnt 출력 횟수
	 */
	
	static int printstar(char c, int cnt) {						// printstar와 main method는 독립적으로 움직임
		for(int i = 0; i < cnt; i++) {
			System.out.print(c);
		}
		System.out.println();
		
		return 10;
	}
	
	public static void main(String[] args) {
		
		int data = printstar('*', 10);								// printstar의 정의부로 이동 -> 작업수행 -> ;종료
//		System.out.println("**********");							// 반복문은 연속적으로 문장이 나올 때 가능
		System.out.println("hello");
		printstar('|', 9);											// char c = '|', int cnt = 9;
		System.out.println("hi");
		printstar('#', 8);
		System.out.println("Good-bye");
		printstar('-', 7);

	}

}
