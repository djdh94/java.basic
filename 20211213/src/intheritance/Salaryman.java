package intheritance;
//Person을 상속해서 Salaryman을 만들기
//샐러리맨 연봉(salary)를 가집니다.
//getSalaryInfo()로 상태를 조회가능

public class Salaryman extends Person {
	
	
	public int salary;
	
	
	public void getSalaryInfo() {
		System.out.println("이름: "+name+",나이: "+age+", 연봉: "+salary);
	}
	
	
	
	
	
	

	

}
