package constructor;

public class BasketballPlayer {

	public String player;
	public int height;
	public int jumpHeight;//변수 첫글자는 소문자,이후 첫단어만 대문자
	
	//생성자 생성
	public BasketballPlayer(int h, int j) {
		
		
		height = h;
		jumpHeight=j;
		System.out.println("키:"+h+",점프력:"+j);

	}
	// 덩크슛하기 라는 행동을 작성.
	public void dunkShoot() {
		//키+점프력이 300이 넘는다면 덩크 성공 아니면 실패
		if((height+jumpHeight)>300) {
			
			System.out.println("덩크슛 성공");
		}else
			System.out.println("덩크슛 실패");
	}
		
	
}
