/**
 * PrimeFactorization
 * 
 * Program to compute Prime Factors
 * of  user given number.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class PrimeFactorization {
/**
 * 
 * This method computes the Prime Factor of
 * number and print it.
 * 
 *       
 */	
	public static void isPrimeFactor(int number) {
		int counter =0;	//count exponent of prime factor
		int primeNumber = number;
		
		for(int i =2; i<=number; i++) {
			
			if(number%i == 0) {
				
				while( number%i == 0) {
					number=number/i;
					counter++;
				}
				System.out.println("Prime Factors of "+primeNumber+" : "+i+"  ("+counter+" time )");
				counter =0;	// Again initialize it to 0 for next iteration
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to compute Prime Factor : ");
		int inputNumber = sc.nextInt();
		
		isPrimeFactor(inputNumber);
			
	}
	
}
