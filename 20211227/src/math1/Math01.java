package math1;

public class Math01 {

	public static void main(String[] args) {
		// Math는 자바에서 이미 기본으로 제공하는 기능이라
		// import없이 사용 가능합니다.
		// abs=절대값
		// ceil=올림기능
		// floor=내림기능
		
		int a = -1024;
		System.out.println(Math.abs(a));
		
		double b = 3.14;
		System.out.println(Math.ceil(b));
		
		double c = 19.9;
		System.out.println(Math.floor(c));

	}

}
