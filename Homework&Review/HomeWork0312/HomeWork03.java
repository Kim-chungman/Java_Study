package HomeWork0312;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 문제 3 : 소수는 1 ~ (판단정수) 사이의 소수로만 나누어 약수가 존재하지 않는다라는 규칙성을 이용하여
   2~100 사이의 소수를 구분 및 출력하는 코드를 작성하세요. (배열활용)
   작성자가 이해한 문제 : 1. 판단정수를 하나 입력받고 1부터 판단정수 사이의 소수를 구한 뒤 판단정수를 소수로 나누었을 때
   						나누어 떨어지지 않는다면 소수임을 확인한다.
   					2. 2~100사이의 소수는 자기보다 작은 소수로 나누었을 때 나누어 떨어지지 않는 규칙을 이용해서 소수를 배열에 담는다. 	
 */
public class HomeWork03 {

	public static void main(String[] args) {
		// <문제> - 정수 입력받고 1~정수(입력받은) 사이의 소수를 구하고 소수들로 정수를 나누었을 때 나누어 떨어지지 않으면 소수
		//		   예시 : 입력받은 정수-20일때 1~20 사이의 소수는 {2, 3, 5, 7, 11, 13, 17, 19} 20은 2로 나누어 떨어짐으로 소수x
		Scanner sc = new Scanner(System.in);
		
		System.out.println("판단하고자 하는 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int cnt = 0;
		int [] arr = new int[num/2];
		for(int i = 2; i < num; i++) {
			for(int j =2; j <= i; j++) {			// 1~num 사이의 소수 구하기
				if(j==i) {
					arr[cnt] = j;					// 1~num 사이의 소수 저장
					cnt++;
				}
				if(i % j == 0) {					// 소수가 아니라면 빠져나옴 -> num이 소수인지 판별하러 이동
					break;
				}
			}
		}
		int [] prime = new int[cnt];
		System.arraycopy(arr, 0, prime, 0, cnt);	// 1~num사이의 소수 복사
		System.out.println("1 ~ " + num + "사이의 소수 : " + Arrays.toString(prime));
		
		// 1~num 사이의 소수로 나누어 num이 소수인지 확인하기!
		for(int i : prime) {
			if(num % i ==0) {
				System.out.println(num + "은 " + i + "로 나누어 떨어짐으로 소수가 아닙니다.");
				break;
			} else if(i > num/2) {
				System.out.println(num + "은 소수가 맞습니다.");
				break;
			}
		}
	}

}
