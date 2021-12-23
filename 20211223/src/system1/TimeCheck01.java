package system1;

public class TimeCheck01 {
	public static void main(String[] args) {
		// currentTimeMills의 자료는 long형에 저장해야 합니다.
		// 시작지점
		long start = System.currentTimeMillis();
		System.out.println("시작시간:"+start);
		
		long all =0;
		
		for(int i=0; i<20000000; i++) {
			all +=i;
		}
		System.out.println("1부터 20억까지 다더하면"+all);
		
		// 끝나는 시점
		long end=System.currentTimeMillis();
		System.out.println("끝난시간:"+end);
		System.out.println("소요시간: "+(end-start));
		
				
				
	}
}
