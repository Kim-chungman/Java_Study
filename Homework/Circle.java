package Homework;
public class Circle extends Square{
	
	private final double PI = 3.14;						// PI값 3.14로 상수고정
	private double area;								// area는 double형
	
	public Circle(){
		
	}
	
	public Circle(String name, int width) {				// 부모클래스인 정사각형(Square) 생성자호출
		super(name, width);								// 정사각형클래스는 해당하는 Shape 생성자호출
	}
	
	public double circleArea() {						// 원의 면적
		area = super.getWidth()*super.getWidth()*PI;
		return area;
	}
	
	public void print() {								// 출력
		System.out.println("선택하신 도형은 " + super.getName() + "입니다.");
		System.out.print("반지름이 " + super.getWidth() + "인 " + super.getName() +"의 넓이는 " + area + "입니다.");
	}

}

