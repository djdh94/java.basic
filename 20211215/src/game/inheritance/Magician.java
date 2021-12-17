package game.inheritance;

public class Magician extends Commoner{

	protected int mDam;
	
	public void getInfo() {
		System.out.println("캐릭터 생성완료");
		System.out.println("아이디:"+id+",레벨:"+lv+",마나:"+mp+",체력:"+hp+",마법데미지"+mDam);
	}
	
	public Magician(String id) {
		super(id);
		this.mDam=3;
	}
	
}
