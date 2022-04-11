package cd.edu.variable;

import java.util.Scanner;

public class ChangeTemperature {
	public static void main(String[] args) {

		double c;
		int f;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("섭씨 온도 입력:");
		f = scn.nextInt();
		
		c = 5/9.0*(f-32);
		
		System.out.printf("%.1f", c);
			
		
		
	}

}
