import java.util.Scanner;

public class MethodQ1P204 {

	// 화씨온도를 입력하면 섭씨온도로 바꿔주는 메서드를 작성해보기
	// 메서드 이름은 FToC이고, double을 리턴합니다.
	// 리턴받은 결과값은 main메서드에서 프린트로 출력하기
	// 화씨 = (섭씨 * 1.8)+32
	// 1.양변에 32를 뺀다.(=>화씨 -32 = 섭씨*1.8)
	// 2.양변을 1.8로 나눈다.(=>(화씨-32)/1.8 = 섭씨
	// 3.섭씨 온도를 유도해낼수있음
	
	public static double FToC(double h) {
		double c =(h-32)/1.8; // return(h-32)/1.8;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("화씨온도를 입력해주세요");
		double h = scan.nextDouble();
		double a = FToC(h);
	System.out.println("오늘 섭씨의 온도는:"+a+"도입니다.");
				
	
		
	}

}
