
public class ForQ6P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같이 코드작성
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느곳이 세로,가로를 담당하는지 생각
		// 힌트 : 별 개수가 점점 늘어나는데, 점점숫자가 커지는 변수가 뭐가 있을지 생각해보기
		
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}