package Lecture3;
/*
 * 12345
 * 23456
 * 34567
 * 45678
 * 56789
 * 
 * 56789
 * 45678
 * 34567
 * 23456
 * 12345
 * 
 * *****
 * ****
 * ***
 * **
 * *
 */
public class ExamMain01 {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------");
		System.out.println("<문제1>");
		for(int i = 1; i<=5; i++) {									// 5개 행
			for(int j = i; j<=i+4; j++) {							// 5개 열 필요 5개씩 찍기위해 초기회 j=i, 조건식 i+4개 필요
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		System.out.println("--------------------------------");
		System.out.println("<문제2>");								
		for(int i = 5; i>=1; i--) {									// 5개 행
			for(int j = i; j<=i+4; j++) {							// 5개 열 필요 5부터 시작해서 감소+ 5개씩 찍기
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		System.out.println("--------------------------------");
		System.out.println("<문제3>");
		for(int i = 5; i>=1; i--) {									// 5개 행
			for(int j = 0; j<=i-1; j++) {							// 5개 열 필요 점점 작아지도록
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		System.out.println("--------------------------------");
		System.out.println("<문제4>");
		for(int i = 1; i<=9; i++) {
			if(i<=5) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			} else {
			for(int j = i; j<=9; j++) {							
				System.out.print("*");
			}
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		
		System.out.println("--------------------------------");
		System.out.println("<문제5>");
		for(int i = 1; i<=9; i++) {
			if(i<=5) {
			for(int j = 1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=6-i; j++) {
				System.out.print("*");
			}
			} else {
			for(int j = 1; j<=9-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i-4; j++) {
				System.out.print("*");
			}
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
	}

}
