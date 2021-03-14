package HomeWork0312;

import java.util.Arrays;

/*
 * 문제 4 : 2~100사이의 소수 출력(교수님이 설명한 규칙으로 코드를 작성 할 것)
 */
public class HomeWork04 {

	public static void main(String[] args) {
		// 배열 생성
		int [] prime = new int[99];							// 2~100까지 숫자는 (100-2)+1
		for(int i = 0; i < prime.length; i++) {
			prime[i] = i+2;									// 2~100까지 배열 값 저장
		}
		
		// 소수만 남기고 소수의 배수는 0으로 만들기
		for(int i = 0; i < prime.length; i++) {
			for(int j = 2; j < prime.length/2; j++) {
				if(prime[i] != j && prime[i] % j ==0) {		// prime[i]가 j가 아니면서 prime[i]%j=0 이라면
					prime[i] = 0;							// prime[i]는 j의 배수다. 따라서 prime[i]에 0을 대입
				}
			}
		}
		
		// <출력> 출력문은 저 보기 편하게 만드려는 의도였습니다..ㅎㅎ  
		int cnt = 1;
		for(int i = 0; i < prime.length; i++) {
			if(cnt % 9 != 0) {
				System.out.print(prime[i] + "\t");
				cnt++;
			} else {
				System.out.print(prime[i] + "\t");
				System.out.println();
				cnt = 1;
			}
		}
	}

}
