package constructor;

public class Main01P204 {

	public static void main(String[] args) {
		

		//자동차 한대를 만들기
		//연료량은 100
		// 속도는 0
		//주인은 본인이름으로 만들기
		
		Car c= new Car("김대현");
		
		// 생성자로 gas,speed,owner를 처리
		/*c.gas=100;
		c.speed=0;
		c.owner="김대현";*/
		//차 뽑자마자 먼저 상태확인
		c.getInfo();
		
		// 액셀을 두번 밟아주세요
		c.accelSpeed();
		c.accelSpeed();
		c.getInfo();
		
		//브레이크를 밟아주세요
		c.breakSpeed();
		c.getInfo();
		
		//주유를 넣어주세요
		c.putGas();
		c.getInfo();
	}

}
