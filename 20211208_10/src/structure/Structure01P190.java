package structure;

public class Structure01P190 {

	public static void main(String[] args) {//실행부
		// 현실세계에서 일어난일을 컴퓨터로 묘사하기위해 쓴다?
		// 이제부터는 실행코드와 정의 코드를 분리한다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .java파일에 저장합니다.
		
		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person p1 = new Person();
		// p1 내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name="김은총";
		System.out.println(p1.name);
		p1.age =20;
		System.out.println(p1.age);
		
		p1.pNum="010";
		System.out.println(p1.pNum);
		
		p1.uNum=011;
		System.out.println(p1.uNum);
		
		// 또 다른 사람을 만들기
		Person p2 = new Person();
		
		// p2에도 name,age,pNum,uNum을 부여해서 
		// 콘솔에 찍기
		p2.name="김은충";
		System.out.println(p2.name);
		p2.age =21;
		System.out.println(p2.age);
		
		p2.pNum="011";
		System.out.println(p2.pNum);
		
		p2.uNum=184;
		System.out.println(p2.uNum);
		
		
		
		
		
		Person p3 = new Person();
		
		p3.age=28;
		System.out.println(p3.age);
		p3.name="김대현";
		System.out.println(p3.name);
		p3.pNum="01087548";
		System.out.println(p3.pNum);
		p3.uNum=56;
		System.out.println(p3.uNum);
		
		
		
		
	}

}
