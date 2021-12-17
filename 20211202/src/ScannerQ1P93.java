import java.util.Scanner;

public class ScannerQ1P93 {

	public static void main(String[] args) {
		// 환율 계산기 만들기
		// 네이버에 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장해주세요
		// 스캐너를 이용해서 won 변수에 원화 금액을 입력하세요
		// 원화와 환율을 이용해
		// 원화 xxxx원을 환전시 xxxx(화폐) 입니다. 출력
		
		
		Scanner scan = new Scanner(System.in);
		
		double rate = 42.47;
		System.out.println("대만 달러의 환율은" + rate +" 입니다");
		System.out.println("원화를 입력해주세요.");
		int won = scan.nextInt();
		System.out.println("원화"+won+"원을 대만 달러로 환전시" + won/rate + "ntd입니다.");
		System.out.println(Math.round(won/rate*10000) / 10000.0 + "ntd입니다.");
		// won/rate를 Math.round()로 감싼다음, 10^n승을 곱하고 10.0^n승을 나눠주면
				// n승에 해당하는 자리수만큼 소수점 자리까지만 나옵니다. 
		scan.close();
		//다 사용한 scan 변수는 .close()로 닫아줘야 메모리가 회수됩니다.
		
		
		
		

	}

}
