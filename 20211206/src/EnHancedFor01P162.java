
public class EnHancedFor01P162 {

	public static void main(String[] args) {
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 넣습니다.
		// 이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼입니다.
		
		// 7개의 요소를 묶어서 arr1에 저장
		int [] arr1 = {100,211,339,475,591,600,700};
		//arr1[순번]을 입력해서 내부요소를 하나만 꺼낼수있음(순번은 0부터시작)
		
		// 배열 내부 요소의 개수는 배열명.length로 확인할수있따.
		System.out.println("배열내부요소갯수");
		System.out.println(arr1.length);
		for(int item:arr1) {
			System.out.println(item);
		}
		
		// 배열 내부 요소의 개수는 배열명.length로 확인할수있따.
		/*for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}*/
	}

}
