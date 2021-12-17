package interation;

public class Buyer {
	private int money;//소지금액
	private int apple;//사과 소지개수
	
	public Buyer(int money) {
		this.money=money;
		this.apple=0;
	}
	
	public void buyApple(Seller seller,int apple) {
		if(apple*2000>this.money) {
			System.out.println("돈이 모자랍니다:"+this.money);
			return;
		}
		
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getApple() {
		return apple;
	}

	public void setApple(int apple) {
		this.apple = apple;
	}
}
