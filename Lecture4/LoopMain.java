package Lecture4;

public class LoopMain {

	public static void main(String[] args) {

		
		loop01 : for(int i =1; i <=3; i++) {
			for(int j =1; j<=5; j++) {
				
				if(j==3) {
					break loop01;					// 가장 가까운 반복문 즉, for문! 탈출 출력값:12 x 3줄
				}							
							
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		
		/*
		for(int i =1; i <=3; i++) {
			for(int j =1; j<=5; j++) {
				
				if(j==3) {
					continue;					// 3을 수행하지 않고 바로 j++로 이동, print수행x
				}							
							
				System.out.print(j);
				
			}
			System.out.println();
		}
		*/

	}

}
