package SuperSub;

public class Manager03 extends Employee {

	Employee[]	empList;	// 관리사원 목록
	
	Manager03(int no, String name, int salary, String grade, Employee[] empList){
		super(no, name, salary, grade);		// 부모 생성자 호출
		/*
		this.no = no;						// super class의 멤버변수가 private면 직접 접근이 불가능하다.
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		*/
		this.empList = empList;
	}
	
	@Override
	void info() {
		System.out.println();
		super.info();
		print();
		System.out.println("\t\t관리사원 목록");
		print();
		for(Employee e : empList) {
			e.info();
		}
		print();	}
	
	void print() {
		System.out.println("================================================");
	}
}
