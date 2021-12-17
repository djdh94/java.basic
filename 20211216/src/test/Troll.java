package test;

public class Troll {

	private int hp;
	private int def;
	private int atk;
	
	public Troll() {
		this.hp=6;
		this.def=1;
		this.atk=2;
	}
	
	public void doBattl(int uAtk) {
		//전사한테 처맞는거
		this.hp=(this.hp+this.def)-uAtk;
		if(this.hp<=0) {
			hp=0;
			System.out.println("트롤이 죽어 교전이 끝납니다");
			return;
		}
		System.out.println("트롤남은체력: "+this.hp);
	
		
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	
}
