package math1;

public class Math06 {

	public static void main(String[] args) {
		// 가위바위보 게임 만들기
		// Math.random()을 이용해 1/3확률로 가위,바위,보를 부여받으며
		// 가위>보,바위>가위,보>가위의 상성을 가집니다.
		// 값은 요소가 나오면 무승부입니다.
		// 가위 바위 보를 뽑는 부분부터 작성해주세요.
		// 0 = 가위, 1= 바위, 2=보
	
		int myValue=(int)(Math.random()*3);
		int comValue=(int)(Math.random()*3);
		
		if(myValue == 0 && comValue == 2) {
			System.out.println("내가 이겼습니다.");
			System.out.println("내 값:"+myValue);
			System.out.println("컴퓨터 값:"+comValue);
		}else if(myValue == 0 && comValue == 1) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("내 값:"+myValue);
			System.out.println("컴퓨터 값:"+comValue);
		}else if(myValue == 1 && comValue == 0) {
			System.out.println("내가 이겼습니다.");
			System.out.println("내 값:"+myValue);
			System.out.println("컴퓨터 값:"+comValue);
		}else if(myValue == 1 && comValue == 2) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("내 값:"+myValue);
			System.out.println("컴퓨터 값:"+comValue);
		}else if(myValue == 2 && comValue == 0) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("내 값:"+myValue);
			System.out.println("컴퓨터 값:"+comValue);
		}else if(myValue == 2 && comValue == 1) {
			System.out.println("내가 이겼습니다.");
			System.out.println("내 값:"+myValue);
			System.out.println("컴퓨터 값:"+comValue);
		}else {
			System.out.println("무승부입니다.");
			System.out.println("내 값:"+myValue);
			System.out.println("컴퓨터 값:"+comValue);
		}
		
		/*if(myValue>comValue) {
			
		}else if(myValue<comValue) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("내 값:"+myValue);
			System.out.println("컴퓨터 값:"+comValue);
		}else {
			System.out.println("무승부 입니다");
			;*/
		
	}

}
