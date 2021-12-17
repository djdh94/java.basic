
public class EnhancdeFor02P162 {

	public static void main(String[] args) {
		
	
		int math[] = {96,23,52,82,72,31,58};
		int eng[] = {62,42,68,31,80,77,45};
		int com[] = {10,28,39,74,65,90,98};
		
		int total =0;
		
		/*for(int score:math) {
			
			total += score;
			
		}System.out.println("수학평균 :"+total/math.length);*/

		/*for(int i=0; i<eng.length; i++) {
			total +=eng[i];
		}System.out.println("영어평균:"+total/eng.length);*/
		
		for(int a:com) {
			total+=a;
		}System.out.println("컴퓨터 평균:"+total/com.length);
	}

}
