package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		
		
		Car c = new Car();
		
		c.model="트레이블레이저";
		c.owner="김대현";
		c.price=26000000;
		
		Car c2 = new Car();
		c2.model="카마로";
		c2.owner="김대현";
		c2.price=55000000;
		
		c.getInfo();
		c2.getInfo();

	}

}
