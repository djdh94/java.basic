package collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복중지
		// 4. 3에서 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
				
		List<Integer> lotto = new ArrayList<>();
		List<Integer> luckyNum = new ArrayList<>();
				
		int getNum = 0;
		int getNum2 = 0;
		int count=0;
		
		while(lotto.size() != 6) {
		getNum = (int)(Math.random() * 45) +1;
		if(!lotto.contains(getNum)) {
						
			lotto.add(getNum);
			}	
		} Collections.sort(lotto);
		
				
				
		// 아래 6개 뽑고 비교하는 부분을 반복문으로 처리해야합니다.
		// 조건식은 당첨인 경우 탈출로 해주시면 됩니다.
		while(!lotto.equals(luckyNum)) {
		// 6개가 이미 뽑혀있는 상황이라면 당첨번호를 어떻게 해 줘야 할지?
			
			luckyNum.clear();
				
			while(luckyNum.size() != 6) {
				
			getNum2 = (int)(Math.random() * 45) +1;
			if(!luckyNum.contains(getNum2)) {
							
			luckyNum.add(getNum2);
			}
		} Collections.sort(luckyNum);
		count+=1;
		System.out.println(""+lotto+luckyNum);
		
	}System.out.println("최종바퀴횟수:"+count);
	// 반복문이 몇바퀴 돌았는지 카운팅하는 로직을 위에 추가해주세요.
	 // 반복문 진입전에 int count=0;을 만들어 놓고
	// 반복문이 한 바퀴돌때마다 count++;를 이용해서 1씩 증가시켜놓고
	// 탈출 후에 콘솔에 최종횟수만 찍히도록합니다.
					
	}
}