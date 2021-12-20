package static2;import javax.print.attribute.standard.PresentationDirection;

public class Asean {
//출석(check),중간고사(midTerm),기말고사(finalTerm)을 변수로 설정
	//위 변수들을 개별 객체가 따로따로 관리하는 변수들입니다.
	
	private int check;
	private int midTerm;
	private int finalTerm;
	
	// 공용발표점수인 presentationScore를 static으로 만들어주세요
	// 이점수는 19점입니다.
	private static int PersentationScore=19;
	
	//public으로 설정하면 바로 sysout으로 조히가능하고
	//private인 경우는 오로지 static 메서드를 통해서만 조회가능
	
	// 생성자는 객체 생성시 출석,중간고사,기말고사 점수만 받아서 초기화합니다
	public Asean(int check,int midTerm,int finalTerm) {
		
		this.check=check;
		this.midTerm=midTerm;
		this.finalTerm=finalTerm;
	}
	//일반 메서드로 showaseaninfo()를 생성해주시되 성적 전체를 콘솔에 조회가능하게 해주세요
	public void showAseanInfo() {
		System.out.println("출석:"+check+",중간고사:"+midTerm+",기말고사:"+finalTerm+",발표:"+PersentationScore);
	}
	//private static은 같은 static영역에서 접근하도록 만들어야합니다.
	public static void showPre() {
		System.out.println("ASEAN조의 발표점수는:"+PersentationScore);
	}
	
	
}
