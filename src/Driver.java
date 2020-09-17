import java.util.Scanner;
import java.lang.Math;
public class Driver 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter in a binary number:"); //prompt to enter a number
		Scanner myNumber = new Scanner(System.in); // Taking in as a string
		String NumberAsString = myNumber.nextLine(); // Taking it in as next line
		
		int Number = Integer.parseInt(NumberAsString); //changing string into integer
		
		System.out.println(Number + 2); // printing out number + 2		
		System.out.println(BinaryToDecimal(Number)); // calling BinaryToDecimal function
		 //int Number2 = Integer.parseInt(BinaryToDecimal(Number)); // Turning the string from BinaryToDecimal into an Int.
		// System.out.println(DecimalToHexa(Number2)); // calling DecimalToHexa function		
	}
	public static String BinaryToDecimal(int number) 
	{
		String answer = ""; //empty string
		int answerAsNum = 0; // number that = 0
		String numberAsString = number + ""; //creating number into string but backwards
		for(int i = numberAsString.length(); i == 0; i--)  // going through backwards to make sure i matches up correctly with the power anticipated
		{
			int exponent = (int) Math.pow(2, i);
			answerAsNum = answerAsNum + (numberAsString.charAt(i) * exponent);
		}
		return answer;
	}	
	
	public static String DecimalToHexa(int number) 
	{
		String answer = ""; //empty string
		String map = "012345689ABCDEF"; // string to use as for charAt method
		while(number != 0) //while loop
		{
			int temp = (number % 16); //finding remainder 
			answer = map.charAt(temp) + answer; //adding the remainder to the string using charAt
			number = number / 16;	// diving the current number by 16		
		}
		return answer;
	}
}


