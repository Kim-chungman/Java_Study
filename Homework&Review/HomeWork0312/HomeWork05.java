package HomeWork0312;

import java.util.Scanner;

/*
 * 문제 5 : 별 찍기
 * 1)      *		2)  ***			3)	*****	
 * 		  **			**				 ***
 * 		 ***			*				  *
 * 		****			**				 ***
 * 	   *****			***				*****
 */
public class HomeWork05 {

	public static void main(String[] args) {
		
		// 1) 직각삼각형 찍기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("라인 수를 입력해주세요(3~20) : ");
		int triangle = sc.nextInt();
		
		int star = 1;
		for(int i = 1; i <= triangle; i++) {							// 입력받은 triangle만큼의 행 생성
			if(triangle < 3 || triangle > 20) {							// 3보다 작거나 20보다 크면 오류
				System.out.println("3~20 사이의 정수를 입력해주세요.");
				break;
			}
			for(int j = 1; j <= triangle; j++) {						// 열도 고정이 아니라 변수임으로 triangle로 설정
				if(triangle-j >= star) {								// " "과  "*"의 관계
					System.out.print(' ');								// tri-j  j만큼 찍힘 
				} else {
					System.out.print('*');
				}
			}
			star++;
			System.out.println();
		}

		// 2) 문제
		System.out.println("--------------------------");
		Scanner s = new Scanner(System.in);
		
		System.out.println("라인 수를 입력해주세요(3~20) : ");
		int num = s.nextInt();
		if(num % 2 ==0 && num >= 3) {									// 4 이상의 짝수일 때 -1로 계산
			num -= 1;
		} else if(num < 3 && num > 20) {
			System.out.println("3~20 사이의 정수를 입력해주세요.");
		}
		
		star = num/2;
		int space = num-2;
		for(int i = 1; i <= num; i++) {
			if(i <= (num/2)+1) {										// num/2+1 행까지 감소하는 구조
				for(int j = 1; j <= num; j++) {							// 9*9로 계산(공백을 문자로 생각)
					String a = num-j >= star ? "*" : " ";
					System.out.print(a);
				}
				star++;
			} else {													// num/2+1 ~ num까지 증가하는 구조
				for(int j = 1; j <= num; j++) {
					String a = num-j >= space ? "*" : " ";
					System.out.print(a);
				}
				space--;
			}
			System.out.println();
		}
		
		// 3) 문제
		System.out.println("--------------------------");
		Scanner c = new Scanner(System.in);
		
		System.out.println("라인 수를 입력해주세요(3~20) : ");
		int num2 = c.nextInt();
		if(num2 % 2 ==0 && num2 >= 3) {									// 4 이상의 짝수일 때 -1로 계산
			num2 -= 1;
		} else if(num2 < 3 && num2 > 20) {
			System.out.println("3~20 사이의 정수를 입력해주세요.");
		}
		
		space = 0;
		for(int i = 1; i <= num2; i++) {
			for(int j = 1; j <= num2; j++) {
				if(j <= space || j >= (num2+1)-space) {					// num2*num2 행렬로 봤을 때 대칭 규칙성 활용
					System.out.print(' ');								// 1행은 j가 1~num2까지 커질 때 한번도 조건식 만족 못함으로 num2개 만큼 *생성
				} else {												// 2행부터는 space가 1이 되므로 양쪽에 한개씩 빈칸 생성 
					System.out.print('*');
				}
			}
			System.out.println();
			if(i < num2/2+1) {											// num/2+1까지 빈칸의 개수가 늘어나고(별의 개수는 줄어들고) 그 이후로는 반대구조
				space++;
			} else {
				space--;
			}
		}
	}
}
