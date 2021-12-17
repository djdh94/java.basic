import java.util.Scanner;

public class ForQ5P118 {

	public static void main(String[] args) {
		//Scanner로 정수를 입력받게 해주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성하기
		// ex) 3 입력시
		// ***
		// ***
		// *** 과 같이 출력
		// 가로줄 출력시 System.out.print("*"); 을
		// 다음줄로 내릴 때만 System.out.print();을 씁니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int a = scan.nextInt();
		
		//바깥쪽 for문이 println를 실행하므로 세로길이를 담당
		// print를 이용해 별을 일렬로 나열시키므로 가로길이를 담당
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
