package overloading;

public class Calculator {
		
	public void plus(int a) {
		System.out.println(a+"에 1을 더한 값은"+(a+1)+"입니다");
	}
	
	public void plus(int a,int b) {
		System.out.println(a+"에 "+b+"을 더한 값은"+(a+b)+"입니다");
	}
	
	public void plus(double a) {
		System.out.println(a+"에 0.5를 더한 값은"+(a+0.5)+"입니다");
	}
	
	public void plus(String e) {
		System.out.println("문자대상이아닙니다.");
	}
}
