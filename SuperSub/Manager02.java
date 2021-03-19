package SuperSub;

public class Manager02 extends Employee {

	Employee[]	empList;	// 관리사원 목록
	
	Manager02(int no, String name, int salary, String grade, Employee[] empList){
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
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
