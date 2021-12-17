package structure;

public class PersonClass {
	//100번지에 들어있는것:name,age,키,등 , 겟인포
	// 사람 정보를 Person에서 만들었던 것처럼 만들어 주시되
	// 여러분들이 추가하고 싶은 특성을 하나더 추가해서 만들기
	
	public String name;
	public int age;
	public int height;
	public String haircolor;
	public boolean glasses;//안경착용시 true false
	
	//추가로 아까의 조회 메서드를 내부에 생성해주세요
	//클래스 내부에 생성할때는 static을 적지 않습니다.
	//클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능합니다.
	public void getInfo() {
		System.out.println(name+"의정보를 조회합니다");
		System.out.println("이름:"+name+" 나이:"+age+" 키:" + height+ " 머리컬러 : " + haircolor );
		System.out.println("====================");
	}
	

}
