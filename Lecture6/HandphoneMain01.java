package Lecture6;

public class HandphoneMain01 {

	public static void main(String[] args) {
		
		Handphone hp2 = new Handphone();
		Handphone[] hpArr = new Handphone[] {new Handphone(), hp2, new Handphone()};
		
		hpArr[0].name = "홍길동";
		hpArr[0].phone = "010-1111-2222";
		hpArr[0].company = "삼성";
		
		hpArr[1].name = "윤길동";
		hpArr[1].phone = "010-3333-4444";
		hpArr[1].company = "애플";
		
		hpArr[2].name = "한길동";
		hpArr[2].phone = "010-5555-6666";
		hpArr[2].company = "엘지";
		
		for(int i = 0; i < hpArr.length; i++) {
			System.out.println("소유주명 : " + hpArr[i].name);
			System.out.println("전화번호 : " + hpArr[i].phone);
			System.out.println("제조자 : " + hpArr[i].company);
			System.out.println("==============================");
		}

	}

}
