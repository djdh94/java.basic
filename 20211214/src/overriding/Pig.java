package overriding;

public class Pig extends Animal {

	public int weight;
	
	public void howl() {
		System.out.println("꿀꿀");
	}
	
	public void getInfo() {
		System.out.println("이름: "+name+"나이: "+age);
	}
}
