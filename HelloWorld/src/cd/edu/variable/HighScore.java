package cd.edu.variable;

import java.util.Scanner;

public class HighScore {

	public static void main(String[] args) {
		
		int Korean, English, Math;
		int sum, MaxValue;
		double avg;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("국어 점수 입력:");
		Korean = scn.nextInt();
		
		System.out.println("영어 점수 입력:");
		English = scn.nextInt();
		
		System.out.println("수학 점수 입력:");
		Math = scn.nextInt();
		
		sum = Korean + English + Math;
		
		avg = sum / 3.0;
		
		MaxValue = Korean;
		if( MaxValue < English) {
			MaxValue = English;
		}
		if (MaxValue < Math){
				MaxValue = Math;
		}
		
		System.out.printf("세 과목의 총 합은 %d이고 평균은 %.2f 이고 최고점은 %d이다.", sum, avg, MaxValue);
		
		
	}

}
