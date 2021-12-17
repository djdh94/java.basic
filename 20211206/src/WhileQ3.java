import java.util.Scanner;

public class WhileQ3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		// ForQ5118을 while을 사용하는 로직으로 고치기
		// i,j변수,조건식,증감식 부분을 신경써서 옮기기
		
		/*for(int i=1; i<=a; i++) {
		for(int j=1; j<=a; j++) {
			System.out.print("*");
		}
		System.out.println();*/
		System.out.println("너비를 입력해주세요");
		
		int count=scan.nextInt();
		
		// i 반복문 영역
		int i=0;
		while(i<count) {
			
			// j반복문 영역
			int j=0;
			
			while(j<count) {
				System.out.print("*");
				j++;
			}// j반복문 끝
			System.out.println();
			i++;
			
		}

	}

}
