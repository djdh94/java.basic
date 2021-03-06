package game.accessmodifier;

public class Warrior extends Commoner {
	
	public Warrior(String id) {
		super(id);
	}
	
	public void doubleAttack() {
		System.out.println("더블어택으로 사냥을 시작합니다");
		setHp(getHp()-4);
		setExp((getExp())+25);
	}
	
	public void Attack() {
		System.out.println("어택으로 사냥을 시작합니다");
		setHp((getHp())-2);
		setExp((getExp())+10);
	}
	public void getInfo() {
		//심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		System.out.println("현재 체력: "+getHp());
		//체력뿐만 아니라 나머지 요소들도 조회하기
		System.out.println("현재 마나: "+getMp());
		System.out.println("현재 레벨: "+getLv());
		System.out.println("현재 경험치: "+getExp());
		System.out.println("현재 유저명: "+getId());
	}

	
}
