package Lecture8;

class Car {

	Car() {
		System.out.println("Car() 생성자 호출");
	}
	
	Car(String s){
		System.out.println("Car(String) 생성자 호출");
	}
	
	Car(int i, String s){
		System.out.println("Car(int, String) 생성자 호출");
	}
	
	void car() {		// 일반 메소드
		System.out.println("일반메소드 Car() 호출...");
	}
}


public class ConstructorMain01 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = new Car("소나타");
		Car c3 = new Car(1000, "모닝");
		
		c.car();

	}

}
