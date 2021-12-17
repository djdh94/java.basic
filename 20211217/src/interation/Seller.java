package interation;

public class Seller {

	private int money;
	private int apple;
	
	public Seller(int apple) {
		
		this.money=0;
		this.apple=apple;
	}
	
	public void sellApple(int apple) {
		
		if(this.apple<apple) {
			System.out.println("사과가 모자랍니다");
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
