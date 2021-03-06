package game.interaction;

public class Archer {

	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	public Archer() {
		this.hp=30;
		this.mp=20;
		this.atk=4;
		this.def=1;
		this.exp=0;
	}
	
	public void huntOrc(Orc orc) {
		// 전사가 오크를 때리기 위해서 먼저 Orc의 doBattle을 호출합니다.
		orc.doBattle(this.atk);
		//전사도 오크에게 공격을 받음
		this.hp=this.hp+this.def-orc.getAtk();
		System.out.println("교전결과 아처의 체력: "+this.hp);
				
	}
	
	public void huntTroll(Troll troll) {
		
		// 전사가 트롤때리기 위해서 먼저 Troll의 doBattle을 호출합니다.
		troll.doBattle(this.atk);//트롤을 전사가 공격
		if(troll.getHp()>0) {//트롤체력이 0보다 큰지 검사(0보다 크다면)
			this.hp=this.hp+this.def-troll.getAtk();//정상교전진행
			
		}else {
			System.out.println("트롤이 이미죽어 교전끝");//트롤이 죽었음
		}
		System.out.println("교전결과 아처의 체력: "+this.hp);//교전 결과 브리핑
		}
	
	
	
		public void huntMonster(Monster mt) {
		mt.doBattle(this.atk);//몬스터를 아처가 공격
		if(mt.getHp()>0) {
			this.hp=this.hp+this.def-mt.getAtk();//정상교전진행
		}else {
			System.out.println("몬스터 이미 죽어 교전끝");
		}
		System.out.println("교전결과 아처의 체력:"+this.hp);
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
