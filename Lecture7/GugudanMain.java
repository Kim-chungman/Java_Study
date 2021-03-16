package Lecture7;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		
		Gugudan gu = new Gugudan();
		
		/*
		System.out.println("2~9 사이의 단 입력 :");
		int dan = gu.getDan();
		int dan = sc.nextInt();
		sc.nextLine();
		*/
		
		int dan = gu.getDan("2~9 사이의 단 입력 :");
		
		gu.print(dan);
		
		gu.print();
		
		int startDan = gu.getDan("시작단을 입력 : ");
		int endDan = gu.getDan("종료단을 입력 : ");
		
		/*
		System.out.println("시작단을 입력 : ");
		int startDan = gu.getDan();
		//sc.nextLine();
		
		System.out.println("종료단을 입력 : ");
		int endDan = gu.getDan();
		// sc.nextLine();
		*/
		
		gu.print(startDan, endDan);

	}

}
