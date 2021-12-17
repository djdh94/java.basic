package polymorphism;

public class Studentz extends Person{
	
	public String zxc;
	
public Studentz(String name, int age, String zxc) {
		
		super(name,age);
		this.zxc=zxc;
	}

	public void showPerosn() {
	super.showPerson();
	System.out.println("학생: "+zxc);
}


}
