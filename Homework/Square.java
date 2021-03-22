package Homework;


public class Square extends Shape {
	
	private int area;

	public Square(){
		
	}
	
	public Square(String name, int width) {				// 부모클래스인 Shape에 해당하는 생성자호출
		super(name, width);
	}
	
	public int getWidth() {								// 가로길이(=세로) 불러오기
		return super.getWidth();
	}
	
	public String getName() {							// 이름 불러오기
		return super.getName();
	}
	
	public int squareArea() {							// 정사각형 면적구하기
		this.area = super.getWidth()*super.getWidth();
		return area;
	}
	
	public void print() {								// 출력
		System.out.println("선택하신 도형은 " + super.getName() + "입니다.");
		System.out.print("가로와 세로가 " + super.getWidth() + "인 " + super.getName() +"의 면적의 넓이는 " + this.area + "입니다.");
	}
}
