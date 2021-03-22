package Homework;


public class Rectangle extends Shape {
	
	private int area;
	
	public Rectangle(){
		
	}
	
	public Rectangle(String name, int width, int height) {		// 부모클래스인 Shape에서 해당하는 생성자 호출
		super(name, width, height);
	}
	
	public String getName() {									// 이름 불러오기
		return super.getName();
	}
	
	public int getWidth() {										// 가로길이 불러오기
		return super.getWidth();
	}
	
	public int getHeight() {									// 세로길이 불러오기
		return super.getHeight();
	}
	
	public int rectangleArea() {								// 직사각형 면적구하기
		this.area = super.getWidth()*super.getHeight();
		return area;
	}
	
	public void print() {										// 출력
		System.out.println("선택하신 도형은 " + getName() + "입니다.");
		System.out.print("가로가 " + getWidth() + "고 세로가 " + getHeight() + "인 " + getName() +"의 면적의 넓이는 " + this.area + "입니다.");
	}
	
}
