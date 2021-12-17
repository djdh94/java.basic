package superclass;

public class Main01 {

	public static void main(String[] args) {
		//비행기를 생성해서 초기속도는 300으로 세팅하고
		// 가속2번으로 900으로 속도를 만들고
		// 0까지 내리기
		
		Airplane a1= new Airplane(0);
		
		a1.fly();
		a1.fly();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
	
		
		
		

	}

}
