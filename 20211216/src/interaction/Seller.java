package interaction;

public class Seller {

	private int money;//매출
	private int mango;//재고
	
	public Seller(int mango) {
		this.money=0;
		this.mango=mango;
	}
	//sellMango(int mango)를이용해서 망고개수를 입렵갇으면 (doBattle과 유사)
	//자신의 this.mango는 갯수만큼 차감하고, this.money는 망고개수*가격 만큼 증가
	public void sellMango(int mango) {
	//망고가 모자라면 "망고가 모자랍니다"라고 하고 메서드를 종료합니다.
	if(this.mango<mango) {
		System.out.println("망고가 모자랍니다. 현재재고:"+this.mango);
		return;//메서드 강제종료구문
	}
	//자신의 this.mango는 갯수만큼 차감하고, this.money는 망고개수*가격만큼 증가
	this.mango-=mango;
	this.money+=mango*4000;
	}
	public void showSeller() {
		System.out.println("--------------");
		System.out.println("현재소지금:"+this.money+",현재망고재고:"+this.mango);
		System.out.println("-------------------");
	}
	
	//Buyer에서 망고개수를 확인할 수 있도록 getMango() 게터만 하나 만들어주세요.
	public int getMango() {
		return this.mango;
	}
}
