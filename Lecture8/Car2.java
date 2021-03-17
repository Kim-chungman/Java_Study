package Lecture8;
/*
 * 생성자의 특징
 * 1. 클래스명과 동일
 * 2. 반환형이 존재하지 않는다.
 * 3. 디폴트생성자 지원
 * 4. 오버로딩 지원한다.
 * 5. 객체 초기화 담당
 */
public class Car2 {

	Car2() {
		System.out.println("Car() 생성자 호출");
	}
	
	Car2(String s){
		System.out.println("Car(String) 생성자 호출");
	}
	
	Car2(int i, String s){
		System.out.println("Car(int, String) 생성자 호출");
	}
	
	void car2() {		// 일반 메소드
		System.out.println("일반메소드 Car() 호출...");
	}
}
