package HomeWork;

import java.util.Scanner;

/*
 * 3개의 정수를 입력받아 큰수에서 작은수 순으로 출력하세요.
 */
public class HomeWork01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 정수를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2) {
			if(num3>num1) {
				System.out.println("입력하신 정수의 크기비교는 "+num3+">"+num1+">"+num2+"순서입니다.");
			} else if(num3>num2) {
				System.out.println("입력하신 정수의 크기비교는 "+num1+">"+num3+">"+num2+"순서입니다.");
			} else {
				System.out.println("입력하신 정수의 크기비교는 "+num1+">"+num2+">"+num3+"순서입니다.");
			}
		} else {
			if(num3>num2) {
				System.out.println("입력하신 정수의 크기비교는 "+num3+">"+num2+">"+num1+"순서입니다.");
			} else if(num3>num1) {
				System.out.println("입력하신 정수의 크기비교는 "+num2+">"+num3+">"+num1+"순서입니다.");
			} else {
				System.out.println("입력하신 정수의 크기비교는 "+num2+">"+num1+">"+num3+"순서입니다.");
			}
		}

	}

}
