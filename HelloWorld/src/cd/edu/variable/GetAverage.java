package cd.edu.variable;

import java.util.Scanner;

public class GetAverage {
	public static void main(String[] args) {
		//입력 값을 num1, num2, num3
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;
		
		int age = 10;
		String myName = "김환식";

		System.out.println("첫 번째 정수의 값 입력:");
		num1 = scn.nextInt();
		
		System.out.println("두 번째 정수의 값 입력:");
		num2 = scn.nextInt();
		
		
		System.out.println("세 번째 정수의 값 입력:");
		num3 = scn.nextInt();
		
		double avg = (num1 + num2 + num3) / 3.0;
		
		//정수 연산 -> 정수. 10, 15, 15 => 40/3.0 => 13 
	
//		System.out.printf("이름은 %3s이고 평균은 %.2f이고 나이는 %5d", myName, avg, age);
		
		System.out.printf("입력한 세 정수는 %3d, %3d, %3d이고 평균은 %.2f 이다.", num1, num2, num3, avg);
		//결과값 : 입력한 세 정수는 10, 15, 15이고 평균은 13.33333입니다.
	}
}
