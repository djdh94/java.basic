package exception02;

public class TryCatch02P353 {

	public static void main(String[] args) {
		// 아까 exception01 패키지 내부의 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요
		// 발생할 예외에 대한 처리는 try~catch블록을 활용합니다
		// /by zero(0으로 나누기)에 대한 처리는 허용하지 않습니다.
		String a ="23df";
		try {
		int result = Integer.parseInt(a);
		System.out.println(result);
		}catch(Exception e){//익섹셥은 다받아주는기능
			System.out.println("변경이 불가합니다");
		}
	}

}
