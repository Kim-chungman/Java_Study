package Java0322.UserMain;

public class CastMain02 {

	public static void main(String[] args) {
		
//		Child01 c = (Child01)new Parent();		// 실행시 예외발생
		
		Parent p = new Child02();
		p.info();
//		p.play();	//실행불가
		
		Child02 c = (Child02)p;
		c.info();
		c.sing();
		c.play();
		
	}

}
