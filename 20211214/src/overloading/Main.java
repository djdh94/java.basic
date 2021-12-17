package overloading;

public class Main {

	public static void main(String[] args) {
		//1.Calculator를 생성해주세요
		Calculator c = new Calculator();
		
		//2. plus(int,int)를 호출해주세요, 값은 임의로 넣기
	
		c.plus(10, 10);
		
		//3. plus(double)을 호출해주세요. 값은임의로 넣기
		c.plus(23.5);
		
		//4. plus(String)을 Calculator에 새로 추가하고 호출
		//   이 메서드는 sysout("문자열은 연산 대상이 아닙니다)출력
		
		c.plus("ㄴ");
		
		

	}

}
