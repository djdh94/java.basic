package casitng;

public class Main02 {

	public static void main(String[] args) {
		//Animal로 Cat을 받아서 생성
		Animal a1 = new Cat("김승곤",28);
		Animal d1 = new Dog("김승곤",28);
		
		//a변수와 연결된 heap쪽 자료가 Cat인지 확인
		System.out.println(a1 instanceof Cat);
		System.out.println(d1 instanceof Dog);
		System.out.println(a1 instanceof Animal);

	}

}
