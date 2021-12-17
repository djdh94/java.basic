package constructor;

public class Webtoon {

	
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	//생성자
	public Webtoon(String n, String p) {
		
		name=n;
		series=1;//모든웹툰은 첫 회차가 1이므로
		painter=p;
		complete=false;
		
		
	}
	// 클래스 내부에서 메서드 만드는 방법
	//public 리턴자료형(int,void등) 메서드명(요구할자료)
	// 실행할 내용들
	
	public void getlnfo() {
		
		System.out.println("웹툰 정보안내");
		System.out.println("제목은:"+name+",회차는:"+series+",작가:"+painter+",완결여부:"+complete);
	}
	
	public void uploadWebtoon() {
		
		series+=1;
	}
	
	public void completeWebtton() {
		complete=true;
	}
	
}

