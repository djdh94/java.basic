package interface1;

public class Airplane implements Vehicle{

	private int speed;
	private int gas;
	
	public Airplane() {
		this.speed=AIRPLANE_MINSPEED;
		this.gas=AIRPLANE_MAX_GAS;
	}
	@Override
	public void accel() {
		if(this.speed+AIRPLANE_SPEED>AIRPLANE_MAX_SPEED) 
		{
			this.speed=AIRPLANE_MAX_SPEED;
		}else
		{
			this.speed+=AIRPLANE_SPEED;
		}
		this.gas-=AIRPLANE_BREAK_GAS;
		if(this.gas<AIRPLANE_MINGAS) {
			this.gas=AIRPLANE_MINGAS;
		}
	}
	@Override
	public void breakSpeed() {
		if(this.speed-AIRPLANE_BREAK<AIRPLANE_MINSPEED) 
		{
			this.speed=AIRPLANE_MINSPEED;
		}else 
		{
			this.speed-=AIRPLANE_BREAK;
		}
		this.gas-=AIRPLANE_BREAK_GAS;
		if(this.gas<AIRPLANE_MINGAS) {
			this.gas=AIRPLANE_MINGAS;
		}
	}
	@Override
	public void reFuel() {
		if(this.gas>AIRPLANE_MAX_GAS) 
		{
			this.gas=AIRPLANE_MAX_GAS;
		}else {
			this.gas+=AIRPLANE_OILE;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("현재속도:"+speed+"현재 연료량:"+gas);
	}
	
}
