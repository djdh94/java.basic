
public class UnaryQ1P65 {

	public static void main(String[] args) {
		// int a에 15를 담고 전위->후위순으로 --를 Unary01처럼 사용해서
		// 1씩 차감하고, 콘솔에 찍는것을 반복해주세요
		// 단,실행 로직은 Unary01에서 그랬듯 주석으로 하단에 풀어서 작성
		int a;
		a=15;
		System.out.println(a--);
		// 1.콘솔에 찍기 : sysout(a(15))
		System.out.println(a);
		// 2.a(15)에서 1 차감 후 저장 : a = a(15)-1
		System.out.println(--a);
		System.out.println(a);
		//1. a(14)에서 1차감후 저장 : a = a(14) -1
		//2. 콘솔에 찍기 : sysout(a(13))
	}

}
