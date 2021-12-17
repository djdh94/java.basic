package polymorphism;

public class Student extends Person{
	
	//학생의 등급인 grade를 선업합니다.
	
	private int grade;
	// super()를 이용해 person(부모)생성자까지 커버하는 생성자를 만들기
	// grade까지 입력받기
	// 부모쪽에서 쓸 자원인 string name,int age를 받고
	// student 자신이 쓸 자원인 int grade 이렇게 3개를 입력요청합니다
	public Student(String name,int age,int grade) {
		//부모쪽 생성자에 name,age를 넘겨주기 위해
		// super(name,age);를 호출하고
		// 자식쪽에서는 this.grade=grade로 받습니다.
		super(name,age);
		this.grade=grade;
	}
	
	//상속받은 showPerosn을 활용한 showPerson를 작성합니다
	public void showPerson() {
		//부모쪽 showperson 호출
		super.showPerson(); // 이름과 나이를 콘솔에 찍어주는 구문
		System.out.println("학생의 성적:"+grade);
	}
	
	// 신분을 밝히는 코드를 Student에만(Person에는 정의x)작성합니다.
	
	
	public void showStudent() {
		super.showPerson();
		System.out.println("저는 학생입니다");
	}
}
