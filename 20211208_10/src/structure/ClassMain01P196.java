package structure;

public class ClassMain01P196 {

	public static void main(String[] args) {
	  
		// PersonClass 메서드는 작성필요없음
		// 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놔서
	    	 
		//사람 두명을 만들어보세요
		
		PersonClass p1 = new PersonClass();
		
		p1.name="김승곤";
		p1.age=28;
		p1.height=130;
		p1.haircolor="블랙";
		
		PersonClass p2 = new PersonClass();
		
		p2.name="박성준";
		p2.age=28;
		p2.height=135;
		p2.haircolor="블랙";
		
		// 만든 사람 두명의 정보를 콘솔에 찍어보세요
	    	 
		p1.getInfo();
		p2.getInfo();
	    

 }
}
