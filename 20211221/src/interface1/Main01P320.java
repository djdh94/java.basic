package interface1;

public class Main01P320 {

	public static void main(String[] args) {
	// 인터페이스의 경우는 부모쪽에 멤버변수가 따로 없고
	// 모든 메서드를 다 오버라이딩 해야하기 떄문에
	// 부모타입에서 자식쪽의 기능을 실행하려 할때
	// 기본적으로 부모쪽에서 정의한 내용을 실행하는데 제약이 없습니다.
		
		Vehicle v1 = new Car("김대현");
		v1.accel();
		v1.accel();
		v1.showStatus();
		v1.breakSpeed();
		v1.showStatus();
		v1.reFuel();
		v1.showStatus();
		
	
	}

}
