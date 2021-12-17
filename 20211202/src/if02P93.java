import java.util.Scanner;

public class if02P93 {

	public static void main(String[] args) {
		// 교재 93페이지 프로그램 4-1코드입니다.
		Scanner scan = new Scanner(System.in);
		
		// 변수 선언
		int su;
		
		System.out.println("정수입력 : ");
		su = scan.nextInt();
		
		// if문의 실행문이 한줄이면 {} 생략가능
		if(su>0) 
			System.out.println("영수입니다.");
		

	}

}
