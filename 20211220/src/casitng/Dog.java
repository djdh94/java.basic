package casitng;

public class Dog extends Animal{

	public Dog(String name,int age) {
		super(name,age);
	}
	
	public void dig() {
		System.out.println("개가 땅을 팝니다");
	}
	
	public void sit() {
		System.out.println("강아지가 앉습니다");
	}
}
