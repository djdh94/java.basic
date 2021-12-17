import java.util.Scanner;

public class ContinueQ1P123 {

	public static void main(String[] args) {
		// 1부터 n까지 총합을 구하되 홀수끼리만 더한
		// 총합을 구하는 구문을 작성
		// continue 문을 반드시 사용하는 로직
		// n은 스캐너 입력받기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력");
		
		//1.정수입력받기
		int goal=scan.nextInt();//튜톨 돌리고싶으면 scan.next대신 아무숫자 넣으면됨 ex)goal=4;
		int total=0;
		int count=0;
		
		//2.반복문 만들기
		while(count<goal) {
			count+=1;
			//3. count가 짝수면 스킵
			if(count%2==0) {
				continue;
			}
			//4.홀수면 총합 더하기
			total+=count;
			//5. 진행상황 콘솔에 찍기
			System.out.println("현재 1부터"+count+"까지더했습니다.");
			System.out.println("총합은"+total+"입니다");
		}

		
	}

}
