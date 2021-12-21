package interface1;

// 인터페이스는 interface 선언을 사용합니다
// 내부에는 상수인 값과 추상메서드만 선언할수있습니다.
// 애초에 구현(implements)을 전제로 설계되기 떄문에
// 일반 변수, 메서드를 내부에 선언할 수 없습니다.
// 다형성에서는 부모클래스의 역할을 합니다
public interface Vehicle {
	//최대 연료량
	int MAX_GAS=100;
	int CAR_SPD_UP=10;
	int CAR_BREAK_DOWN=10;
	int CAR_MIN=0;
	int CAR_OILE=70;
	int CAR_MAX=300;
	
	int AIRPLANE_MAX_GAS=1000;
	int AIRPLANE_MAX_SPEED=900;
	int AIRPLANE_SPEED=400;
	int AIRPLANE_BREAK=300;
	int AIRPLANE_BREAK_GAS=150;
	int AIRPLANE_OILE=500;
	int AIRPLANE_MINSPEED=0;
	int AIRPLANE_MINGAS=0;
	
	
	// 탈 것이라면 가지고 있을 공통적 기능을 전부 추상메서드로 작성
	// {
	// 실행문..
	// }
	// 와 같은 실행문 부분(메서드의 몸체)없이 선언만 해주세요
	
	public void accel();//가속
	public void breakSpeed();//감속
	public void reFuel();//주유
	public void showStatus();//계기판 조회
	
	
}
