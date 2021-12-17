package intheritance;

public class Person {

	// 사람이라면 공통적으로 가질 수 있는 속성 정의
	
	public String name;
	public int age;
	

	

	
	//getInfo() 이름은 name입니다. 나이는 age입니다. 라고 찍기
	
	public void getInfo() {
		System.out.println("이름은: "+name+"입니다.");
		System.out.println("나이는: "+age+"입니다");
	}
}	
