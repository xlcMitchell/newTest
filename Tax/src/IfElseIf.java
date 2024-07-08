import java.util.Scanner;
public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter your name");
       
       String name = scanner.next();
       
       if(name.length() > 20) {
    	   System.out.println("Error");
       }else if(name.length() < 3){
    	   System.out.println("Error must be longer than three characters");
       }else {
    	   System.out.println("Welcome to the program " + name);
       }
       
       System.out.println("Enter integer");
       
       int integerOne = scanner.nextInt();
       
       System.out.println("Enter integer");
       
       int integerTwo = scanner.nextInt();
       
       if(integerTwo == integerOne) {
    	   System.out.println("same");
       }else if(integerTwo > integerOne) {
    	   System.out.println(integerTwo);
       }else {
    	   System.out.println(integerOne);
       }
       
      
       
       
       
	}

}
