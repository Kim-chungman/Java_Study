package Homework;


import java.util.Scanner;
/*
 * <구상>				상속
 * IcecreamStore    <- 		Employee				|	customer
 * 아이스크림 가게		  		직원 						|	(몇개 살지? 뭘 살지? 계속 구매할지? 입력)
 * 아이스크림 기본정보	  		정보기억					|	구매정보 확인
 * (이름, 가격)		  		(총 개수, 손님수, 총 금액)	|
 */
public class IcecreamStore {

	private String name;					// 아이스크림명
	private int price;						// 아이스크림 가격
	Scanner sc = new Scanner(System.in);
	
	public IcecreamStore(){						// 생성자
		
	}
	
	public String getName() {				// 아이스크림 이름을 저장할 메소드
		return this.name;
	}
	
	public int getPrice() {					// 아이스크림 가격을 저장할 메소드
		return this.price;
	}
	
	public void icecreaminfo(String n, int p) {	// i번째 배열에 이름과 가격을 저장
		this.name = n;
		this.price = p;
	}
	
	public String setName(String msg) {			// 아이스크림 이름을 바꿀 메소드
		System.out.print(msg);
		this.name = sc.nextLine();
		return name;
	}
	
	public int setPrice(String msg) {			// 아이스크림 가격을 바꿀 메소드
		System.out.print(msg);
		this.price = sc.nextInt();
		sc.nextLine();
		return price;
	}
	
}
