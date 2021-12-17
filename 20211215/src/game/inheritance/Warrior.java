package game.inheritance;

public class Warrior extends Commoner{


		private int pDam;
	
	public void getInfo() {
		System.out.println("캐릭터 생성완료");
		System.out.println("아이디:"+id+",레벨:"+lv+",마나:"+mp+",체력:"+hp+",물리데미지:"+pDam);
	}
	
	public Warrior(String id) {
		super(id);//생성자 내부에서 다른 코드에 앞서서 무조건 1순위로 들어와야함
		this.pDam=2;//물리데미지 설정
	}
}
	

