package SuperSub;

class One{
	One(){
		System.out.println("One 생성자 호출...");
	}
	
}

class Two extends One{
	Two(){
	//  super();가 숨어있음.
		System.out.println("Two 생성자 호출...");
	}
	
}

class Three extends Two{
	Three(){
	//  super();가 숨어있음.
		System.out.println("Three 생성자 호출...");
	}
	
}

public class ExtendsMain {

	
	public static void main(String[] args) {
		
		new Three();

	}

}
