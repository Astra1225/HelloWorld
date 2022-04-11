package cd.edu.variable;

public class HomeWork1 {

	public static void main(String[] args) {
// 오렌지 127개, 10개씩 담을 수 있는 상자, 5개씩 담을 수 있는 상자
		int Big_Box=10, Small_Box=5, Orange=127;
		int Value1, Value2;
		
		Value1 = Orange / Big_Box;
		Value2 = (Orange % Big_Box)/Small_Box;
		
		System.out.printf("10개씩 담는 상자는 %d개이며,"
				+ "5개씩 담는 상자는 %d개이다.", Value1, Value2);
	}

}
