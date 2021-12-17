package structure;

public class Structure02P190 {
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	
	public static void getInfo(Person p) {
		System.out.println(p.name+"의정보입니다");
		
	
		
	}
	
	public static void main(String[] args) {
		// 사람 두명 만들기(a,b)
		
		
		Person p4 = new Person();
		
		p4.name="최찬영";
		p4.age=28;
		p4.pNum="5159";
		
		Person p5 = new Person();
		
		p5.name="박성준";
		p5.age=28;
		p5.pNum="5156";

		getInfo(p4);
		getInfo(p5);
		
	}  
}
