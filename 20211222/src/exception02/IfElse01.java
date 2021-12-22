package exception02;

import java.util.Scanner;

public class IfElse01 {

		public static void main(String[] args) {
			// int a,b에 스캐너로 각각 정수를 입력받아주세요
			// a/b의 격롸를 콘솔에 띄어주시되
			// a/b를 실행하기전에
			// b가 0인지 검사해서 0인 경우는
			//a/b를 하지말고 0으로 숫자를 나눌수없습니다.
			//라는 경고만 띄우도록 만들어주세요
			
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("정수를 입력해주세요");
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(b==0) {
				System.out.println("0으로 나눌수 없습니다");
			}
			System.out.println("a/b의결과:"+a/b);
			
		}
}
