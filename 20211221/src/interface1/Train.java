package interface1;

public class Train implements Vehicle{

	
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed=CAR_MIN;
		this.gas=MAX_GAS;
		this.name=name;
	}
	@Override
	public void accel() {
		if(this.speed+CAR_SPD_UP>CAR_MAX) {
			this.speed=CAR_MAX;
		}else {
			speed+=CAR_SPD_UP;
		}
		this.gas-=7;
		if(this.gas<CAR_MIN) {
			this.gas=CAR_MIN;
		}
	}
	@Override
	public void breakSpeed() {
		if(speed-CAR_BREAK_DOWN<CAR_MIN) {
			speed=CAR_MIN;
		}else {
			this.speed-=CAR_BREAK_DOWN;
		}
	}
	@Override
	public void reFuel() {
		if(this.gas+CAR_OILE>MAX_GAS) {
			this.gas=MAX_GAS;
		}
		this.gas+=CAR_OILE;
	}
	@Override
	public void showStatus() {
		System.out.println("현재속도:"+speed+"현재 연료량:"+gas+"차주:"+name);
	}
}
