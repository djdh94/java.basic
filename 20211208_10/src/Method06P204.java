
public class Method06P204 {

	public static int mul(int a,int b,int c) {
		return a*b*c;
		
	}
	
	public static void info() {
		System.out.println("안녕하세요");
		System.out.println("자바 메서드 학습중입니다.");
		System.out.println("1번의 호출로 3줄을 콘솔에 작성");
	}
	
	public static void main(String[] args) {
		
		int result=mul(1,2,3);
		System.out.println(result);
		
		// mul 메서드를 선언
		// 임의로 이름붙인 정수 변수 3개를 입력받아
		// 3개를 곱한 값을 return 해줍니다.
		
		
		// info 메서드선언
		// 이 메서드는 내부에서
		// "안녕하세요"
		// "자바 메서드 학습중입니다."
		// "1번의 호출로 3줄을 콘솔에 작성"
		// 라는 문장만 출력하고 return은 없습니다.
		
		for(int i=0; i<3; i++)
		{
			info();
		}
	}

}
