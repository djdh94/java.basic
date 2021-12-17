package game.interaction;

public class Monster {

	private int hp;
	private int atk;
	private int def;
	
	public Monster() {
		this.hp=10;
		this.atk=5;
		this.def=2;
	}
	
	public void doBattle(int uAtk) {
		// 몬스터의 체력을 유지 공격력 만큼 차감시키기
		hp=(hp+def)-uAtk;
		if(hp<=0) {//전사의 공격 결과 트롤이 죽으면 (체력이 0이하라면)
			hp=0;//필수는 아님, 죽은 몬스터 체력 0으로 보정
			System.out.println("몬스터가 죽어서 더이상 반응하지 않습니다.");
			return;//메서드를 종료
		}
		System.out.println("몬스터의 남은체력: "+hp);//트롤이 안죽어야 실행됨
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

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
}
