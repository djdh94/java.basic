package casitng;

public class Cat extends Animal{
	
	
	public Cat(String name,int age) {
		super(name,age);
	}
	
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}
	
	public void haAk() {
		System.out.println("하악질중");
	}
	
}
