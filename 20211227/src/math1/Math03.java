package math1;

public class Math03 {

	public static void main(String[] args) {
		// rint()는 현재 수에서 가장 가까운 정수를 실수형태로 구해줍니다.
		double a = 3.50000000000000000001;
		System.out.println(Math.rint(a));
		
		double b = -3.499999999999999999999;
		System.out.println(Math.rint(b));
		
		System.out.println(Math.round(a));
		System.out.println(Math.round(b));

	}

}
