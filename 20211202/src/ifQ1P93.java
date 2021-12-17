import java.util.Scanner;

public class ifQ1P93 {

	public static void main(String[] args) {
		// 주어진 변수 a에 스캐너로 정수값을 입력받도록 만들어주세요
		// 입력받은 정수가 0이상이면 "0보다 크거나 같습니다" 를 콘솔창에
		// 그렇지 않으면 "0보다 작습니다."를 콘솔창에 출력한느 코드를
		// if 블럭(if문) 2개를 이용해 구현해주세요.
		
		Scanner scan = new Scanner(System.in);
		
		
		int a;
		System.out.println("정수를 입력해주세요");
		a = scan.nextInt();
		if(a>=0) {
			System.out.println("0보다 크거나 같습니다.");
		}
		
		else{
			System.out.println("0보다 작습니다.");
		}
		scan.close();
	}
}
