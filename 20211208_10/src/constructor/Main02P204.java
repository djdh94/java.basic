package constructor;

public class Main02P204 {

	public static void main(String[] args) {
		
		// 실패 사례
		BasketballPlayer b = new BasketballPlayer(180,100);
		
		b.dunkShoot();
		// 성공 사례
		BasketballPlayer b2 = new BasketballPlayer(185,120);
		b2.dunkShoot();
	}
}
