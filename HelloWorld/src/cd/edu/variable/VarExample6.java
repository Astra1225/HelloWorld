package cd.edu.variable;

public class VarExample6 {
	public static void main(String[] args) {
	String myName = "김환식"; //참조 데이터 타입.
	
	int age = 25; // 기본 데이터 타입.
	double height = 167.4;
	int mathScore, engScore;
	mathScore = 80;
	engScore = 90;
	
	System.out.println(myName + "의 나이는 " + age//
			+ "이고 키는 " + height + "이고 "
			+ "영어, 수학점수의 합은 " + (mathScore + engScore)
			+ "입니다.");
//	char firstChar = myName.charAt(0);
//	System.out.println((int)firstChar);
	
   }

}
