package test;

public class Monster {

	private int hp;
	private int def;
	private int atk;
	
	public Monster() {
		this.hp=6;
		this.def=2;
		this.atk=2;
	}
	
	public void doB(int uAtk) {
		
		this.hp=(this.hp+this.def)-uAtk;
		if(this.hp<0) {
			hp=0;
			System.out.println("트롤사망");
			return;
		}
		System.out.println("트롤남은체력:"+this.hp);
		
	}
}
