import java.util.Scanner;

public class ForQ3P112 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2~9단 사이의 숫자를 입력해주세요");
		int dan = scan.nextInt();
		
		if(dan>=2 && dan<=9) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}
		}
		else {
			System.out.println("수의 범위는 2~9로 넣어주세요");
		}
	}
}
