package string1;

public class String04P399 {
	public static void main(String[] args) {
		 // length()는 문자열의 길이를 알수있따.
		// 정수로 몇글자 인지 알려줍니다.
		String name= "sdofjksdifjsdi";
		System.out.println(name.length());
		
		// replace는 찾아바꾸기 입니다.
		// .replace("찾을단어","바꿔줄단어"); 순으로 입력입니다.
		String report="안녕하세요,리포트 김영수,김명수";
		// report 자체가 변경되지 않으므로, 저장까지 해줘야 합니다.
		// report의 변경사항을 저장하지 않는다면
		
		report=report.replace("김명수", "김승곤");
		System.out.println(report);
				
	}
}
