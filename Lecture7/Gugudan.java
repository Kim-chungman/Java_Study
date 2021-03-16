package Lecture7;

import java.util.Scanner;

/**
 * 구구단과 관련된 여러가지 기능을 가지는 기능클래스
 * @author HP
 *
 */
public class Gugudan {

	Scanner sc = new Scanner(System.in);
	
	void print(int dan) {
		
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	void print() {
		
		print(2, 9);
		
		/*
		for(int i  = 2; i <= 9; i++) {
			print(i);
		}
		*/
		
		/*
		for(int i = 2; i <= 9; i++) {
			System.out.println("*** " + i + "단 ***");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		*/
	}
	/**
	 * 시작단에서 종료단까지 구구단 출력
	 * @param sDan
	 * @param eDan
	 */
	void print(int sDan, int eDan) {
		for(int i = sDan; i <= eDan; i++) {
			print(i);
		}
	}
	
	int getDan() {
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}
	
	int getDan(String msg) {
		System.out.print(msg);
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
		
	}
}
