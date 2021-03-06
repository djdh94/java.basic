package test;

public class Warrior {

	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior() {
		
		this.hp=20;
		this.mp=10;
		this.atk=4;
		this.def=1;
		this.exp=0; 
		
	}
	
	//교전 할 경우 상호간에 수치값이 교환되어야 합니다.
	//워리어 쪽에서 오크쪽 수치를 깎는다
	//오크쪽에서 워리어 수치를 깍는다
	
	public void huntOrc(Orc orc) {
		System.out.println("오크를 사냥합니다");
		orc.doBattle(this.atk);//오크를 때림
		this.hp=(this.hp+this.def)-orc.getAtk();
		System.out.println("교전결과 전사체력: "+this.hp);
	}
	
	
	public void huntTroll(Troll troll) {
		
		System.out.println("트롤을 사냥합니다");
		troll.doBattl(this.atk);//트롤을때림
		if(troll.getHp()>0) {
			this.hp=this.hp+this.def-troll.getAtk();
			
			
		}else {System.out.println("트롤이 전사하였습니다");
			
		}System.out.println("교전결과 전사체력: "+this.hp);
		
		
		
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
}
