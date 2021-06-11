/**
 * LargestNumber
 * 
 * Program to find out largest number form
 * multiple random numbers.
 * 
 * Taking multiple random numbers as
 * user specify and find out largest among them
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many no u want to compare : ");
		int numberLimit = sc.nextInt();
		
		int i =1;
		int maxNumber =0;
		
		while(i <= numberLimit) {
			
			int randomNumber = (int)(Math.floor(Math.random() * 100) % 100)+1;
			System.out.println(randomNumber);
			
			if(i == 1) {
				maxNumber = randomNumber;
			}
			else if(randomNumber > maxNumber) {
				maxNumber = randomNumber;
			}
			
			i++;
		}
		System.out.println("Maximum number : "+maxNumber);
	}
}
