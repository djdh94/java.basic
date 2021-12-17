
public class WhileQ2 {

	public static void main(String[] args) {
		// 반복문의 경우 3개의 요소가 필요
		// 1. 조건식(참 거짓 판단으로 실행 유지 여부 결정)
		// 2. 변수(조건식을 처음에는 true였다가 일정 시점뒤에 필요에 따라 false로 만들기 위해)
		// 3. 변수 증감(변수증감을 줘야 변수값이 변동이 생김)
		// for문같은경우 위 3개 요소를 한 주에 담는다면
		// while은 따로 떨어뜨려 두는 것이 특징입니다.
		// 따라서 한 줄에 있냐, 떨어져있냐만 빼면 같은 구문
		
		// i while문 변수 생성
		int i=2; //구구단이므로 시작값2
		// i while문의 조건식 생성(범위 2~9를 갖게하기위해 10되면 탈출)
		while(i<=9) {
			// j while문 변수 생성
			int j =1; //i가 x단어이므로,j는 1부터 시작.
			while(j<=9) {// j while문의 조건식생성 (범위1~9)
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}
			System.out.println("============");
			i++;
			
		}

	}

}
