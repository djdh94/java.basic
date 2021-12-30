package test;



import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("망고", 51);
		map.put("고", 551);
		map.put("망", 5181);
		map.put("냉", 51561);
	
		System.out.println(map.get("망고"));
		System.out.println(map.get("고"));
		System.out.println(map.get("망"));
			
		
	}

}
