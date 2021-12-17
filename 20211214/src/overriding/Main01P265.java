package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		
		//말과 돼지를 생성해보기
		
		Horse h = new Horse();
		h.name="김승곤";
		h.age=28;
		h.rank=0;
		h.getInfo();
		
		Pig p = new Pig();
		p.name="이리";
		p.age=25;
		p.getInfo();

	}

}
