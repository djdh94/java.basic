package test;

public class Archer {

	private int hp;
	private int atk;
	private int def;
	
	public Archer() {
		this.hp=5;
		this.atk=3;
		this.def=1;
	}
	
	public void huntTroll(Troll troll) {
		
		troll.doBattl(this.atk);
		if(troll.getHp()>0) {
			this.hp=this.hp+this.def-troll.getAtk();
		}else {
			System.out.println("트롤사망");
		}System.out.println("교전결과 전사체력: "+this.hp);
	}
}
