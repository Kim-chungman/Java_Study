package HomeWork0312;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 다음과 같은 결과를 보이는 프로그램 작성하세요.
   짝수 몇개 입력 : 5
   홀수 몇개 입력 : 4
 */
public class HomeWork02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("다음을 입력해주세요.");
		System.out.print("짝수 개수 : \n");
		int EvenNumber = sc.nextInt();							// 짝수 배열 크기
		System.out.print("홀수 개수 : \n");
		int OddNumber = sc.nextInt();							// 홀수 배열 크기
		
		int[] even = new int[EvenNumber];						// 크기가 EvenNumber만큼의 짝수 배열 생성
		int[] odd = new int[OddNumber];							// 크기가 OddNumber만큼의 홀수 배열 생성
		int[] num = new int[EvenNumber+OddNumber];				// 짝수+홀수를 담을수 있는 크기의 배열 생성
		
		int cnt = 0;											// 짝수 개수 카운트
		int cnt2 = 0;											// 홀수 개수 카운트
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("num" + (i+1) + " : ");
			num[i] = sc.nextInt();								// i번째 배열 값 저장
			
			if(num[i]%2==0 || num[i] == 0) {					// 짝수일 때 
				if(cnt >= even.length) {						// 짝수를 담을 수 있는 크기를 초과 할 때
					System.out.println("짝수 개수 " + even.length + "를 초과 할 수 없습니다.");
					i -= 1;
				} else if(num[i] <= 0) {						// 입력 값이 0보다 작거나 같을 때
					System.out.println("짝수도 홀수도 아닙니다. 다시 입력하세요.");
					i -= 1;
				} else{											// 짝수 값 저장
					even[cnt] = num[i];
					cnt++;
				}
			} else {											// 홀수일 때
				if(cnt2 >= odd.length) {						// 홀수를 담을 수 있는 크기를 초과 할 때
					System.out.println("홀수 개수 " + odd.length + "를 초과 할 수 없습니다.");
					i -= 1;
				} else {										// 홀수 값 저장
					odd[cnt2] = num[i];
					cnt2++;
				}
			}
		}
		System.out.println("<print>");
		System.out.println(Arrays.toString(num));				// num 배열 값 출력
	}

}


