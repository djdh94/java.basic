import java.util.Scanner;

public class P87Q3_2 {

	public static void main(String[] args) {
		//Scanner로 정수를 받으세요
		// 1~n까지 순서대로 더해나갔을때
		// 1부터 몇까지 더해야 입력되 정수를 초과하는지 계산해주는
		// 프로그램 작성
		
		// 변수는 총3개(몇 바퀴쨰인지 카운트,총합,목표값)
		// 무한루프(while(true)를 사용합니다.
		// 총합에 값을 누적한 다음 if문에 총합이 목표값보다 크다면
		// break를 실행하도록 짜주면된다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("총합이 몇이상이 되면 종료하겠습니까?");
		int goal = scan.nextInt();
		// 총합(0부터시작해서 누적된값구함)
		int total=0;
		//count=바퀴수(1바퀴 2바퀴 형식으로 1부터 시작)
		int count=1;
		// 몇바퀴를 돌아야하는지 모르니 무한루프로 시작
		while(true) {
			// n바퀴째일때 그 바퀴수를 더함
			total+=count;
			System.out.println("1부터"+count+"까지의 총합은:"+total+"입니다");
			if(total>=goal) {
				System.out.println("목표값:"+goal);
				System.out.println("총합:"+total);
				System.out.println("몇까지더했나?:"+count);
				break;
			}
			count++;
		}
		
		

	}

}
