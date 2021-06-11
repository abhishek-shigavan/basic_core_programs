/**
 * SwapNumber
 * 
 * Program to swap two numbers.
 * 
 * Taking two numbers and swapping them
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class SwapNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number :");
		int secondNumber = sc.nextInt();
		
		int temp = 0;
		
		//swapping numbers using temp
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("After swapping");
		System.out.println("First Number :" +firstNumber);
		System.out.println("Second Number :" +secondNumber);
	}
	
}
