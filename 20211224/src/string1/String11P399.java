package string1;

public class String11P399 {

	public static void main(String[] args) {
		// String.valueOf()는 괄호 사이의 자료를 문자열로 바꿔줍니다.
		String a = String.valueOf(1000);
		//int a=1000;
		System.out.println(a);
		System.out.println(a+1);
		
		// 실수 하나를 임의로 문자열로 바꿔서 저장해보세요.
		
		String b=String.valueOf(1000.5189);
		
		// String.valueOf()를 쓰지않고도 대체로
		// +""만으로도 문자열로 만들 수 있습니다.
		// 자바는 문자열+다른자료없이 오는 경우 전부 문자로 치환해 처리합니다.
		String c=1000+""; // ="1000"
		System.out.println(c+1);
		
		String d = true+"";
		System.out.println(d+1);
		
		String e = String.valueOf(true);
		System.out.println(e+1);
	}

}
