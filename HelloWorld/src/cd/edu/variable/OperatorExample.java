package cd.edu.variable;

public class OperatorExample {
	public static void main(String[] args) {
		// 나머지 : %
		// 6/4 => 몫: 1, 나머지 : 2
		
		int result = 6 / 4;
		int remainder = 6 % 4;
		
		int val = 5;

		if(val % 2 == 0) {
			System.out.println("짝수입니다.");
		 } else {
			 System.out.println("홀수입니다.");
			 
		 }
		
		//75300원을 5만원=> ?개, 1만원 => ?개 5천원 => ?개
				//1천원 => ?개, 5백원 => ?개, 1백원 => ?개
				//75300원 5만원 1개, 1만원 2개, 5천원 1개, 5백원 1개, 1백원 3개.
				
		
		int sum = 75300;
		
		System.out.println("5만원권 " + sum/50000+ "장");
		System.out.println("1만원권 " + sum%50000/10000+ "장");
		System.out.println("5천원권 " + sum%50000%10000/5000+ "장");
		System.out.println("1백원권 " + sum%50000%10000%5000/100+ "장");
	}
}