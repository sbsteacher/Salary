package com.doheum.salary;

public class EmployeeTest {
	public static void main(String[] args) {
		Regular re = new Regular("홍길동", 28, "대구시", "위인전");		
		re.setSalary(1_000_000);
		re.printInfo();
		/*
		Employee em = new Employee("홍길동", 28, "대구시", "위인전");
		em.printInfo();
		em.name = "이순신";
		em.printInfo();
		*/
		
	}
}
