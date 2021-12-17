package structure;

public class Structure03P190 {

	public static void getCatInfo(Cat e) {
		System.out.println("고양이 이름:"+e.name+"고양이특성:"+e.information+"고양이나이:"+e.age);
	
		
		
	}
	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		c.name="bee";
		c.information="hair loss";
		c.age=2;
		
		Cat c1 = new Cat();
		c1.name = "ree";
		c1.information = "sand";
		c1.age=3;
		
		getCatInfo(c);
		getCatInfo(c1);
		
	}

}
