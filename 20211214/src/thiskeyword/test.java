package thiskeyword;

public class test {

	private int speed;
	
	public test(int speed) {
		
		this.speed=speed;
	}
	
	public void fly() {
	
		
		if(speed+500>900) {
			speed=900;
		}else
			speed=500;
	}
	
	public void breakSpeed() {
		speed-=100;
	}
	
}
  