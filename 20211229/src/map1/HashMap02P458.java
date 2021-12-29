package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당메뉴판을 만들어보세요
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개이상 집어넣어주세요
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("피자", 15000);
		map.put("치킨", 25000);
		map.put("탕수육", 15000);
		map.put("짜장면", 5000);
		map.put("짬뽕", 5000);
		
		System.out.println(map.get("피자"));
		System.out.println(map.get("치킨"));
		System.out.println(map.get("탕수육"));
	}

}
