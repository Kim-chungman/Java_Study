package HomeWork0312;

import java.util.Random;
import java.util.Scanner;

/*
 * 문제 7 : 컴퓨터가 맞추는 프로그램
 */
public class HomeWork07 {

	public static void main(String[] args) {
		
		System.out.println("1~100 사이의 정수를 골라주세요.");
		
		int max = 100;											// 대답의 최댓값 설정
		int min = 1;											// 대답의 최솟값 설정
		
		int [] answer = new int[5];								// 대답 5개를 받을 배열 설정
		for(int i = 0; i < answer.length; i++) {
			Random random = new Random();
			answer[i] = random.nextInt(max - min +1) + min;		// min ~ max 사이의 수 랜덤 생성
			System.out.println("생각하신 숫자가 " + answer[i] + "입니까?");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("맞으면 0, 작은 수면 1, 큰 수면 2 => ");
			int num = sc.nextInt();
			
			switch(num) {
				case 0 : 										// 정답시 switch문 빠져나옴
					System.out.println("정답입니다~");
					break;
				case 1 :										// 대답보다 작은 수면 대답 값을 max로 설정
					System.out.println(answer[i] + "보다 작은 수 입니다.");
					max = answer[i];
					System.out.println("기회가 " + (4-i) + "번 남았습니다.");
					if(i==4) {									// 대답을 5번하고 case 1이라면 기회 소진
						System.out.println("아쉽지만 틀렸습니다.");
					}
					break;
				case 2 :										// 대답보다 큰 수면 대답 값을 min로 설정
					System.out.println(answer[i] + "보다 큰 수 입니다.");
					min = answer[i];
					System.out.println("기회가 " + (4-i) + "번 남았습니다.");
					if(i==4) {									// 대답을 5번하고 case 2라면 기회 소진
						System.out.println("아쉽지만 틀렸습니다.");
					}
					break;
				default :
			}
			
			if(num == 0) {										// 정답일 때 for문 탈출. 프로그램 종료.
				break;
			}
			
		}

	}

}
