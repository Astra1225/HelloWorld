package cd.edu.variable;

import java.util.Scanner;
public class HomeWork2 {

	public static void main(String[] args) {
//영수증 물건의 가격과 현금 
//[현금]10000원, [물건가격]6818원, [부가세]750원, [총합]7500원, [잔돈]2500원
		Scanner scn = new Scanner(System.in);
		
		double Money=0; 
	    double Goods_Price=0;
	    double VAT=0;
	    double Price=0;
	    double Changes=0;

	    
	    System.out.print("현금입력:");
	    Money = scn.nextDouble();
	    
	    System.out.print("상품가격:");
	    Goods_Price = scn.nextDouble();
	    
	    
	    VAT = (Goods_Price * 0.1);
	    Price = Goods_Price+VAT;
	    Changes = Money - Price; 
	    
	    System.out.printf("[현금] %.0f원\n", Money);
	    System.out.printf("[물건가격] %.0f원\n", Goods_Price);
	    System.out.printf("[부가세] %.0f원\n", VAT);
	    System.out.printf("[총합] %.0f원\n", Price);
	    System.out.printf("[잔돈] %.0f원\n", Changes);

	    
		
	}

}
