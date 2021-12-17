package accessmodifier2;

import accessmodfier.Warrior;

public class Main02P197 {

	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번하세요
		
		Warrior w1= new Warrior("전사전사");
		//w1.hp=1000000;
		// hp가 package friendly일때
		// 패키지가 달라서 hp 변경불가
		w1.hunt();
		w1.hunt();
		w1.hunt();

	}

}
