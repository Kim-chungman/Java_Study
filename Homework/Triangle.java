package Homework;

public class Triangle extends Rectangle {
	
	private double area;
	
	Triangle(){
		
	}
	
	Triangle(String name, int width, int height){				// 부모클래스인 Rectangle에 해당하는 생성자 호출
		super(name, width, height);								// Rectangle은 Shape에 해당하는 생성자 호출
	}
	
	public double triangleArea() {								// 삼각형 면적구하기
		area = (super.getWidth()*super.getHeight())/2;
		return area;
	}
	
	public void print() {										// 출력
		System.out.println("선택하신 도형은 " + super.getName() + "입니다.");
		System.out.print("밑변이 " + super.getWidth() + "고 높이가 " + super.getHeight() + "인 " + super.getName() +"의 면적의 넓이는 " + area + "입니다.");
	}
	

}
