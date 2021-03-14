package HomeWork0312;

import java.util.Random;
import java.util.Scanner;

/*
 * 문제 6 : 숫자맞추기 게임 구성(사용자가 맞추는 프로그램)
 */
public class HomeWork06 {

	public static void main(String[] args) {
	
		Random random = new Random();
		int solution = random.nextInt(100)+1;							// 1~100 사이 랜덤 숫자 생성
																		// solution은 컴퓨터가 설정한 답
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이의 숫자를 입력해 주세요 : ");
		int [] answer = new int[5];										// 내 대답을 저장 할 배열 생성
		int max = 100;
		int min = 1;
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = sc.nextInt();
			if(answer[i] == solution) {									
				System.out.println("정답입니다~");
				break;
			} else if(answer[i] > solution) {							// 내 대답이 정답보다 큰 경우
				System.out.println(answer[i] + "보다 작은 수 입니다.");
				System.out.println("기회는" + (4-i) + "번 남았습니다.");
				max = answer[i];										// 정답 < 대답이기 때문에 max값에 대답 저장
				System.out.println(min + "~" + max + " 사이의 숫자를 입력해 주세요. : ");
				
			} else if(answer[i] < solution) {							// 내 대답이 정답보다 작은 경우
				System.out.println(answer[i] + "보다 큰 수 입니다.");
				System.out.println("기회는" + (4-i) + "번 남았습니다.");			
				min = answer[i];										// 정답 > 대답이기 때문에 min값에 대답 저장
				System.out.println(min + "~" + max + " 사이의 숫자를 입력해 주세요. : ");
			}
			if(i==4 && answer[4] != solution) {							// 대답 기회가 끝나고 마지막 대답이 정답이 아닌 경우
				System.out.println("아쉽게도 기회가 끝났습니다.");
				System.out.println("정답은 " + solution + " 입니다.");		// 기회 소진 후 정답 알려줌
			}
		}

	}

}
