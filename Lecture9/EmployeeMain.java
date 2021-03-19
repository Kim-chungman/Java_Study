package Lecture9;

public class EmployeeMain {

	public static void main(String[] args) {
// main 메소드에서는 객체생성과 메소드호출로만 구성되어있도록.
		
		Employee.printTotalEmployee();
		
		
//		Employee e = new Employee();
//		e.name = "홍길동"; (직접 접근하는것은 좋지않다.)
		Employee e = new Employee("홍길동", 3200, "사원");
		e.info();
		Employee e2 = new Employee("강길동", 4000, "주임");
		e2.info();
		Employee e3 = new Employee("윤길동", 3600, "사원");
		e3.info();
		
		
		Employee.printTotalEmployee();
		
		System.out.println("사원명 : " + e.getName());
		System.out.println("연봉 : " + e.getSalary());
		System.out.println("직급 : " + e.getGrade());
		
		e.setSalary(3800);
		System.out.println("연봉 : " + e.getSalary());
	}

}
