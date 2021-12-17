 package test;

public class Orc {

	private int hp;
	private int atk;
	private int def;
	
	public Orc() {
		this.hp=5;
		this.atk=3;
		this.def=0;
	}
	
	public void doBattle(int uAtk) {
		hp=(hp+def)-uAtk;
		System.out.println("오크의 체력:"+hp);
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
