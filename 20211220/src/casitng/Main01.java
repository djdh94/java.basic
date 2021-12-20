package casitng;

public class Main01 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("김대현",28);
		
		Animal d1 = new Dog("김승곤",28);
		
		Animal c1 = new Cat("박성준",28);
		
		c1.sit();
		d1.sit();
		a1.sit();
		
		// 각 자료형에 맞는 변수로 대입
		Cat cat =(Cat) c1;// c1은 Animal타입이지만 힙에 저장된 데이터가 Cat이므로 Cat으로 변환 가능
		cat.haAk();
		
		//Dog에 대해서도 똑같이 정의
		Dog dog =(Dog)d1;
		dog.dig();

	}

}
