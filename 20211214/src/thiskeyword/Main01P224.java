package thiskeyword;

public class Main01P224 {

	public static void main(String[] args) {
		
		//Person을 두 명 생성해 보시되
		// 생성시 지역간 데이터 교환을 염두에 두고 확인해가면서 생성
		// 생성된 Person은 getInfo()를 실행합니다.
		
		Person p1=new Person("김대현",28,1000,"컴퓨터");
		
		Person p2=new Person("김승곤",28,519,"경찰");
		
		p1.getInfo();
		p2.getInfo();

	}

}
