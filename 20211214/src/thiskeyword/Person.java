package thiskeyword;

public class Person {

	// 사람의 정보를 여기 기입합니다.
	private String name;
	private int age;
	private int money;
	private String major;
	
	public Person(String n,int a, int money, String major) {
	
		name=n;
		age=a;
		this.money=money;
		this.major=major;
		
	}
	
	// 이름,나이,소지금액,전공을 콘솔에 찍어보세요
	public void getInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+age);
		System.out.println("소지금: "+this.money);
		System.out.println("전공: "+this.major);
	}
	
}
