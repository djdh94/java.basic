
public class test {

	
	public static void main(String[] args) 
	{
		//math=96,23,52,82,72,31,58
		
		int[] math = {96,23,52,82,72,31,58};
		int[] eng = {62,42,68,31,80,77,45};
		int[] com = {10,28,39,74,65,90,98};
		
		int total=0;
		for(int count:com) {
			
			total+=count;
		}System.out.println("컴퓨터평균:"+total/com.length);
	
		
	}

}
