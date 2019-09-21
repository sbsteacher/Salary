package com.doheum.salary;

public class Temporary extends Employee {
	private int workTime;
	private int payPerTime;
	
	public Temporary(String name, int age, String addr, String department) {
		super(name, age, addr, department);
		this.payPerTime = 10000;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
		this.salary = this.workTime * this.payPerTime;
	}
	
	@Override
	public void printInfo() {
		System.out.printf("비정규직  일한시간: %d,  급여: %,d\n", 
				this.workTime, this.salary);
	}
	
	
}






