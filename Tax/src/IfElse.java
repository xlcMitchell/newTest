import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Enter a number: ");

        num = scanner.nextInt();
        
        if(num >= 18) {
        	System.out.println("Welcome");
        }else {
        	System.out.println("You are not old enough sorry");
        }
        
        int num2 = scanner.nextInt();
        
        if(num2 > num) {
        	System.out.println("The 2nd number is greater");
        }else {
        	System.out.println("The 2nd number is smaller");
        }
        
        System.out.println("Enter another number");
        
        int even = scanner.nextInt();
        
        System.out.println(even % 2);
        
        if(even % 2 == 0) {
        	System.out.println("Even");
        }else {
        	System.out.println("Odd");
        }
        


	}

}
