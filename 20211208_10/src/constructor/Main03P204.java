package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		
		Webtoon w = new Webtoon("싸움독학","김대현");
		
		//웹툰 정보안내
		w.getlnfo();
		
		//웹툰 업로드
		w.uploadWebtoon();
		
		//웹툰 완결지식
		w.completeWebtton();
		

	}

}
