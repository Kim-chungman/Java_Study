package Java0322.UserMain;

public class Child01 extends Parent{

	/*private*/ String name = "자식01";
	
	@Override
	public void info() {
		System.out.println("Child01 클래스에서 재정의 된 메소드...");
	}
	
	public void study() {
		System.out.println("나는 공부를 합니다.");	
	}
	
	public void sleep() {
		System.out.println("나는 잡니다.");
	}
}
