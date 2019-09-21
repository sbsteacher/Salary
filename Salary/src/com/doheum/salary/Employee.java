package com.doheum.salary;

public class Employee extends Object {
	protected String name;
	protected int age;
	protected String addr;
	protected String department;
	protected int salary;	

	public Employee(String name, int age, String addr, String department) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.department = department;		
	}
	
	public void printInfo() {
		System.out.printf("이름 : %s\n", this.name);
		System.out.printf("나이 : %d\n", this.age);
		System.out.printf("주소 : %s\n", this.addr);
		System.out.printf("부서 : %s\n", this.department);
	}	
}


