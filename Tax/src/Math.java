
public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;				
		System.out.println("Value of number is: " + number);
		//0
		// Assign the value of 5 to number
		number = 5;	
		//output will be 5
		System.out.println("Value of number is: " + number);
		// Assigns the result of adding 3 and 7
		number = 3 + 7;
		//10
		System.out.println("Value of number is: " + number);
		// Assign the value to be whatever is stored plus 1
		//11
		number = number + 1;		
		System.out.println("Value of number is: " + number);
		// Triple the value stored in number
		//33
		number = number * 3;		
		System.out.println("Value of number is: " + number);
		// Calculate the equation then stores the result
		//66
		number = number + number;	
		System.out.println("Value of number is: " + number);
		// Using multiple variables
		int anotherNumber = 10;
		int sum = 0;
		sum = number + anotherNumber;
		//76
		System.out.println("Value of sum is: " + sum);
		String neewSum = Integer.toString(sum);
		float newFloat = Float.parseFloat(neewSum);
		newFloat = newFloat / 10;
		
		System.out.println("Value of sum is: " + newFloat);
		
		--newFloat;
		System.out.println(newFloat);
		
		//truncate float to integer
		
		newFloat = (int)newFloat;
		int newInt = 10;
		
		System.out.println(newFloat);
		

	}

}
