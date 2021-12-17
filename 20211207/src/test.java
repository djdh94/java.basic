import java.util.Scanner;

public class test {
	
	public static double FToC(double f) {
	return (f-32)/1.8;
		
	}

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("오늘의 화씨를 입력해주세요");
		double f=scan.nextDouble();
		double c = FToC(f);
		System.out.println("오늘의 섭씨온도는:"+c);
		
	}
}