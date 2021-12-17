
public class ForQ4117 {

	public static void main(String[] args) {
		// 2~9단까지 모두를 출력하는 코드를 작성하기(구구단)
		// 구구단은 2~9단까지 출력하면됨
		// 중첩반복문을 사용
		// 바깥쪽 반복문은 2~9까지 반복(int i)
		// 안쪽반복문은 1~9까지 반복(int j)
		// i*j를 출력하기
		
		
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			
		}

	}
}
