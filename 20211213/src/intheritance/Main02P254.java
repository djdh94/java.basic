package intheritance;

public class Main02P254 {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		
		st1.name="김대현";
		st1.age=28;
		st1.stuNum=21;
		
		st1.getInfo();
		st1.getStudentInfo();
		
		Salaryman s2= new Salaryman();
		
		s2.age=28;
		s2.name="김대현";
		s2.salary=1000;
		
		s2.getSalaryInfo();
	}

}
