package Lecture7;

public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method();
		
		m.call();
		m.call(10);
		m.call(10.33);
		m.call("Hello");
		m.call('A');
		m.call("hello", true);			// 순서중요! m.call(true, "hello");는 다른거
		m.call(true, "hello");
	}

}
