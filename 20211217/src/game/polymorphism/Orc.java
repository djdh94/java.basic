package game.polymorphism;

// Monster를 상속해주세요
public class Orc extends Monster{
	
// 생성자를 설정해주시되, 기본적으로 체력은 5, 공격력은 2, name에 "오크"를 넣어주세요.
	private int hp;
	private int atk;
	private String name;
	
	
	public Orc() {
		super("오크",5,2);
		
		
	}

}
