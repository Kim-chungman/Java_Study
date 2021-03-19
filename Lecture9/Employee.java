package Lecture9;

public class Employee {

	private String name;
	private int salary;
	private String grade;
	private static int totalEmployee;
	
	Employee(){
		++Employee.totalEmployee;
	}
	
	Employee(String name, int salary, String grade){
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		++Employee.totalEmployee;
	}
	
	void info() {
		System.out.println("이름 : " + this.name + ", 연봉 : " + this.salary + ", 직급 : " + this.grade);
		Employee.printTotalEmployee();
	}
	
	static void printTotalEmployee() {
		System.out.println("총 사원수 : " + Employee.totalEmployee + "명");
	}
	
	String getName(){
		return this.name;
	}
	
	int getSalary() {
		return this.salary;
	}
	
	String getGrade() {
		return this.grade;
	}
	
	void setSalary(int salary){
		this.salary = salary;	
	}
}