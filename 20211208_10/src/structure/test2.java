package structure;

public class test2 {

	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	public test2(String n,String p) {
	name = n;
	series=1;
	painter=p;
	complete=false;
	}
	public void getinfo() {
		System.out.println("제목은:"+name+", 회차는:"+series+", 작가:"+painter+", 완결여부:"+complete);
		
	}
	
	public void uploadWebtoon() {
		series+=1;
	}
	
	public void completeWebtoon() {
		complete=true;
	}
}
