
public class ForQ8P118 {

	public static void main(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		// 힌트 : 띄어쓰기를 3/2/1개 순으로 적는 반복문하나
		//      *을 1/2/3/4/ 개 순으로 적는 반복문 하나
		//      i반복문내부에 j,k, 총 2개의 반복문 추가로 돕니다.
		
		for(int i=0; i<4; i++) {
			// 별 왼쪽에 띄어쓰기가 찍히므로, 먼저 찍히도록 띄어쓰기를 세팅
			// 띄어쓰기는 3/2/1/0개 순으로 줄어들도록 반봇횟수를 줄여준다
			for(int j=0; j<4-i-1; j++) {
				System.out.print(" ");
			}
			// *은 1/2/3/4개 순으로 늘어나도록 반복횟수를 세팅한다.
				for(int k=0; k<i+1; k++) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
}
