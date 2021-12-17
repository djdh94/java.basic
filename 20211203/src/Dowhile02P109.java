import java.util.Scanner;

public class Dowhile02P109 {

	public static void main(String[] args) {
		//배달어플만들었다고 가정
		// 주문금액을 입력받습니다
		// 주문금액이 15000 미만이면 프로그램이 멈춥니다.
		// 주문금액은 Scanner를 이용해 order 변수에 직접 입력받습니다.
		// 단 ,do while로 작성해 첫 주문은 주문금액이 15000 미만이어도
		// " 배달 완료했습니다"라고 출력한뒤
		// 다시 주문금액을 입력받는 로직을 반복문 내부 작성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주문금액을 입력해주세요");
		
		int order = scan.nextInt();
		
		
		do {
				System.out.println("주문금액은" + order + "원입니다.");
				System.out.println("배달을 완료했습니다");
				System.out.println("다음 배달금액을 입력해주세요");
			order = scan.nextInt();
		}while(order>=15000);//돌리는조건
		System.out.println("금액이 모자라 종료되었습니다.");
	}

}
