
public class Assignment01P80 {

	public static void main(String[] args) {
		// 대입 연산자란 특정 변수 값을 연산자 우측에 해당하는 값을 이용해
		// 연산한 결과값으로 계산해 저장하는 기능을 수행합니다.
		// 단순 연산자인 = 이 있으며, 추가로 확장된
		// 복합대입연산자로 +=,-=,/-,*=,%= 등이 있습니다.
		// 대입 연산자를 사용하는 경우 코드 실행방향이 오른쪽에서 왼쪽입니다.
		int a = 10;
		System.out.println(a);
		
		a+=10; //a=a+10; //10을 증가시키는 코드
		System.out.println(a);//20으로증가
		//5감소시키는코드
		a-=5;
		System.out.println(a);
		
		// 3배 증가시키는 코드
		a*=3;
		System.out.println(a);
		
		// 4로 나누어 코드(정수)
		a/=4;
		System.out.println(a);// 11이 나오는것 확인

		// 12 나머지 연산 코드
		a%=12;
		System.out.println(a); //11이 나오는것 확인
	}
}
