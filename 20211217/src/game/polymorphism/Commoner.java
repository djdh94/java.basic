package game.polymorphism;

public class Commoner {

	// 속성(필드,변수)값으로 name, hp, mp, atk를 추가해주세요
	
	private String name;
	private int hp;
	private int mp;
	private int atk;
	
	// 생성자로 위 필드를 초기화하도록 설정해주세요.
	public Commoner() {
		
		this.name="김승곤";
		this.hp=8;
		this.mp=3;
		this.atk=2;
	}
	
	// 다형성을 적용해 어떤 몬스터가 오더라도 이 메서드 하나로 처리함
	// 몬스터타입이 없어서 에러가 나므로 우선 같은 패키지내에 Monster 생성
	// 몬스터는 name(몬스터이름)
	public void hunt(Monster monster) {
		//몬스터의 doBattle(사용자공격력)을 호출해서 몬스테 체력을 깍아줍니다
		monster.doBattle(this.atk);
		// 오크가 반격 가능한 상태인지 검사
		if(monster.getHp()>0) {
			// 몬스터의 공격력을 받아와 사용자의 체력을 깎아주세요.
			this.hp=this.hp-monster.getAtk();
			System.out.println("교전결과"+name+"의 체력:"+this.hp);
		}
		
		
		
		
	}
	
	
}
