package cd.edu.variable;

import java.util.Scanner;

public class HighScore {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		int sum, MaxValue;
		double avg;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫번째 점수 입력:");
		num1 = scn.nextInt();
		
		System.out.println("두번째 점수 입력:");
		num2 = scn.nextInt();
		
		System.out.println("세번째 점수 입력:");
		num3 = scn.nextInt();
		
		sum = num1 + num2 + num3;
		
		avg = sum / 3.0;
		
		MaxValue = num1;
		if( MaxValue < num2) {
			MaxValue = num2;
		}
		if (MaxValue < num3){
				MaxValue = num3;
		}
		
		System.out.printf("세 과목의 총 합은 %d이고 평균은 %.2f 이고 최고점은 %d이다.", sum, avg, MaxValue);
		
		
	}

}
