package HomeworkReview;

public class Icecream {			// 편의점에서 아이스크림 한개씩 사는 형식으로 생각 할 수 있다.

	String name;
	int price;
	
	
	void set(String n, int p) {
		name = n;
		price = p;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
}
