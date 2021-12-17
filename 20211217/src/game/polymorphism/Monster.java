package game.polymorphism;

// 모든 사냥감의 뼈대가 되는 클래스
public class Monster {


	private String name;
	private int hp;
	private int atk;
	
	public Monster(String name,int hp,int atk) {
		
		this.name=name;
		this.hp=hp;
		this.atk=atk;
	}
	
	
	
	
	
	// doBattle(int)를 생성해주세요
	public void doBattle(int uAtk) {
	// 사용자의 공격력만큼 몬스터의 체력이 깎입니다.	
	this.hp=hp-uAtk;
	// 0이되면 교전이 불가능하다는 메시지를 줍니다
	if(this.hp<=0) {
		hp=0;
		System.out.println("몬스터 사망");
		return;
	}else
		// 체력이 0보다 높은 경우에는 남은체력을 마지막에 콘솔창에 띄어줍니다.
		System.out.println("몬스터체력: "+this.hp);
		
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getHp() {
		return hp;
	}





	public void setHp(int hp) {
		this.hp = hp;
	}





	public int getAtk() {
		return atk;
	}





	public void setAtk(int atk) {
		this.atk = atk;
	}
	
}
