package Java0326.Lecture15.Map;

import java.util.HashMap;
import java.util.Map;

class Member{
	
	private String name;
	private String phone;	// 폰넘버
	
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	/*
	@Override
	public boolean equals(Object obj) {			// 묵시적 형변환
		
		boolean result = false;
		
		Member mem = (Member)obj;				// 명시적 형변환
		
		if(name.equals(mem.name) && phone.equals(mem.phone)) {
			result = true;
		}
		
		return result;
	}
	*/

}

class Car{
	
	private String name;	// 차량 이름	
	private String id;		// 차량번호
	
	public Car(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
}

class MemberInfo{
	private Member m;
	private Car c;
	
	public MemberInfo(Member m, Car c){
		this.m = m;
		this.c = c;
	}
	
}

class Test{
	
	public Map<String, Object> returnTest() {
		
		Member m = new Member("aaa", "1111");
		Car c = new Car("bbb", "ccc");
	
		Map<String, Object> map = new HashMap();
		map.put("Member", m);
		map.put("Car", c);
		
		return map;
	}
	
//	public MemberInfo returnTest3() {
		
	//	Member m = new Member();
	//	Car c = new Car();
		
	//	MemberInfo info = new MemberInfo(m, c);
		
	//	return info;
	
//	}
	/*
	public Object[] returnTest() {
		
		Member m = new Member();
		Car c = new Car();
		
		Object[] arr = new Object[2];
		arr[0] = m;
		arr[1] = c;
		
		return arr;
	}
	*/
}

public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> carList = new HashMap<>();
		
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "12소1212"));
		carList.put(new Member("윤길동", "010-3333-4444"), new Car("모닝", "34가6354"));
		carList.put(new Member("박길동", "010-5555-6666"), new Car("그랜저", "26도4623"));
		carList.put(new Member("강길동", "010-7777-8888"), new Car("카니말", "81고3456"));

		System.out.println("등록대수 : " + carList.size());
		
		carList.put(new Member("홍길동", "010-8888-9999"), new Car("SM3", "25다3434"));
		System.out.println("등록대수 : " + carList.size());
		
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("제네시스", "42너3524"));
		System.out.println("등록대수 : " + carList.size());
		
		/*
		// equals가 true면서 hashcode 값도 동일해야한다...
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		System.out.println(m);	// Member@71dac704 @뒤가 hashcode
		System.out.println(m2); // Member@123772c4
		*/
		
		/*
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		if(m.equals(m2)) {
			System.out.println("같은 사람입니다.");
		} else {
			System.out.println("다른 사람입니다.");
		}
		// equals 메소드를 오버라이드 필요(주소값 비교로 equals를 안하도록)
		*/
	}

}
