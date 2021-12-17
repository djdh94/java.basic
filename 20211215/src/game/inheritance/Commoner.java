package game.inheritance;

public class Commoner {

	protected int lv;
	protected int hp;
	protected String id;
	protected int mp;
	
	public Commoner(String id) {
		
		this.id=id;
		this.lv=1;
		this.mp=10;
		this.hp=20;
		
		
	}
	
	public void getInfo() {
		System.out.println("캐릭터 생성완료");
		System.out.println("아이디:"+id+",레벨:"+lv+",마나:"+mp+",체력:"+hp);
	}
}
