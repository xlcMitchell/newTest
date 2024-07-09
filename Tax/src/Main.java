import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		final double tax = 0.15;
	           
		 Scanner scanner = new Scanner(System.in);
		 double price = 0;
		 System.out.println("Enter price of item: ");
		 price = scanner.nextDouble();
		 
		 //another branch
		 
		    //random comment
//hello    
		         //new update test
		  double taxToPay;
		  taxToPay = price * tax;
		  
		  
		  System.out.println("$" + taxToPay);
		       // Output how much tax they have to pay
		    
	}

}