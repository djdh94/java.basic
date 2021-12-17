
public class ForQ1P112 {

	public static void main(String[] args) {
		// Hello Java를 10번 출력하는 구문을 작성해주세요
		// for문을 사용해서 작성하기
		
		for(int i=0; i<10; i++) {
			System.out.println("Hello Java"+i);
		}
		
		// 반복문 내의 System.out.print()는 다음줄로 내려주는 기능이 없어서
		// 계속해서 한줄에 이어서 출력됩니다. println < ln이 내려주는기능
		// 한줄만 내리고 싶은 경우 비어있는 sysout 실행하면 됩니다.
		
		System.out.println();
		System.out.print("안녕");
	}

}
