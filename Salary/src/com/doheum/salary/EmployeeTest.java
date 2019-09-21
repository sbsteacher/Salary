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

/*

1. 다음을 만족하는 클래스 Employee를 작성하시오(1에서 4번까지 관련된 문제입니다).
- 클래스 Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
- 필드(접근지시어 protected): 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
- 생성자 : (인자로 받은) 이름, 나이, 주소, 부서를 지정하는 생성자 정의
- 메소드 (public) printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력


2. 다음을 만족하는 클래스 Regular를 작성하시오.
- 클래스 Regular는 위에서 구현된 클래스 Employee의 하위 클래스
- 생성자 : (인자로 받은) 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
- Setter : 월급 정보 필드를 지정
- 메소드 printInfo() : 인자는 없고 "정규직"이라는 정보와 월급을 출력


3. 다음을 만족하는 클래스 Temporary를 작성하시오.
- 클래스 Temporary는 위 클래스 Employee의 하위 클래스
- 필드 : 일한 시간, 시간당 보수를 선언하고 시간당 보수의 초기 값으로 10000 저장
- 생성자 : (인자로 받은)이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
- Setter : 일한 시간을 지정하면서 급여를 일한 시간 * 시간당 급여(salary)변수에 계산하여 저장
- 메소드 printInfo() : 인자는 없고 "비정규직"이라는 정보와 일한 시간과 급여(salary)를 출력


- 또한 다음 프로그램으로 클래스 Employee, Regular, Temporary를 점검하는 프로그램 실행

*/