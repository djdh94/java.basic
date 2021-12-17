package game.inheritance;

public class Archer extends Commoner{

	protected int rDam;
	
	public void getInfo() {
	System.out.println("캐릭터 생성완료");
	System.out.println("아이디:"+id+",레벨:"+lv+",마나:"+mp+",체력:"+hp+",원거리데미지:"+rDam);
	}
	
	public Archer(String id) {
		super(id);
		this.rDam=5;
	}
}
