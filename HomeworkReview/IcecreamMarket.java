package HomeworkReview;

import java.util.Scanner;

public class IcecreamMarket {

	Icecream[] iceArr;						// 아이스크림명과 아이스크림 가격을 받을수 있는 배열
	Scanner sc = new Scanner(System.in);
	
	int inputInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	String inputString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	void doSomething() {
		// 손님이 아이스크림을 구매
		buy();
		
		// 구매정보 출력
		info();
	}
	
	void buy() {
		int count = inputInt("아이스크림 몇개 구입할래? : ");
		System.out.println(count + "개");
		
		iceArr = new Icecream[count];
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			String name = inputString("아이스크림명 : ");
			int price = inputInt("아이스크림 가격 : ");
			
			iceArr[i] = new Icecream();			// 생성자를 통해 출력
			iceArr[i].set(name, price);
		}
	}
	
	void info() {
		System.out.println("< 총 " + iceArr.length + "개 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		int no = 1;
		for(Icecream ice : iceArr) {
			System.out.println(no++ + "\t" + ice.getName() + "\t\t" + ice.getPrice());
		}
	}

}
