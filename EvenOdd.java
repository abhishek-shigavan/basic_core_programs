/**
 * EvenOdd
 * 
 * Program to check if the given number
 * is even or odd.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check even / odd :");
		int inputNumber = sc.nextInt();
		
		if(inputNumber%2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
}
