package Lecture3;
/*
 * *
 * **
 * ***
 * ****
 * *****
 */
public class LoopMain04 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {				// 행 의미
			for(int j=1; j<=i; j++) {			// 열 의미
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
