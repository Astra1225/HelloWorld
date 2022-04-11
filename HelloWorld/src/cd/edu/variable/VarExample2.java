package cd.edu.variable;

public class VarExample2 {
	public static void main(String[] args) {
		//국어 85, 영어 70, 수학 60
		//평균 변수 선언. (+ + ) /
		
		int Korean=85, English=75, math=60;
		double sum=0, avg=0;
		sum = (Korean+English+math);
		avg = sum/3.0;
		
		System.out.print("85점, 75점, 60점의 점수 평균:"
				+ avg + "입니다.");

		
	
	}

}
