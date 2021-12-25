package string1;

public class String08P399 {

	public static void main(String[] args) {
		// trim() 은 공백이 아닌 문자가 시작하기 직전 모든 지점과
		// 공백이 아닌 문자로 끝난 이후 지점의 모든 공백을 제거합니다.
		
		String str="            Hello         Java  ";
		System.out.println(str.trim());
		System.out.println(str);
		
		// replace()를 이용해서 공백전체를 없애보세요
		System.out.println(str.replace(" ",""));
		
		// trim()과 replace()를 이용해 hello java사이의 공백을
		// 한칸만 남기기.
		
		System.out.println(str.replace("  ","").trim());
		
		

	}

}
