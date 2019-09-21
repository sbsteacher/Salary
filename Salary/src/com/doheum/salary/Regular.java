package com.doheum.salary;

public class Regular extends Employee {
	public Regular(String name, int age, String addr, String department) {
		super(name, age, addr, department);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}	
	
	@Override
	public void printInfo() {
		System.out.printf("정규직 월급 : %,d원\n", this.salary);
	}
}
