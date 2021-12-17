package heapmemory;

public class StringComparison {

	public static void main(String[] args) {
		// 문자열은 같은 문자로 저장시 같은 주소로 공유합니다.
		String str1 = "Hello";
		String str2 = "Hello";
		
		// 일반 변수의 배정 값 조회시 .hashCode()를 씁니다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		// 문자열은 일부분만 변경이 불가능함.
		//str1[0] = "Q";
		// str1 == str2 와 같이 비교하는 것은 문자열 비교가 아니고
		// 주소비교입니다.
		System.out.println(new String("Hello"));
		System.out.println(str1 == new String("Hello"));
		System.out.println(str1 == str2);
		
		//문자열간 비교는(주소말고 내용물간비교) .equals()로 진행
		System.out.println(str1.equals(new String("Hello")));

	}

}
