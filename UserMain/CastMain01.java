package Java0322.UserMain;


public class CastMain01 {
	/*
	public static void print(Child01 c) {
		c.info();
	}
	
	public static void print(Child02 c2) {
		c2.info();
	}
	*/
	public static void print(Parent p) {	// 매개변수가 묵시적형변환이 일어남
		p.info();
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.sleep();
			c.study();
		} else if(p instanceof Child02) {
			Child02 c2 = (Child02)p;
			c2.sing();
			c2.play();
		}
		// instanceof는 상속관계거나 같은 클래스 내에 있을때 가능
	}
	
	
	public static void main(String[] args) {

		Child01 c01 = new Child01();
		print(c01);
		
		Child02 c02 = new Child02();
		print(c02);
		
		Parent p = new Parent();
		print(p);
		
		/*
		Parent p = new Child01();		// 묵시적형변환
		System.out.println(p.name + ", " + p.age);
		p.info();
		*/
		
		/*
		Child01 c01 = new Child01();
		System.out.println(c01.name + ", " + c01.age);
		c01.info();
		
		Parent p = new Parent();
		System.out.println(p.name + ", " + p.age);
		p.info();
		*/
		
		
	}

}
