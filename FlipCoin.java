/**
 * FlipCoin
 * 
 * Program to compute head and tail percentage
 * 
 * Tossing the coin multiple times and   
 * computing head and tail percentage.
 * 
 * Taking input (i.e no of times fliping the coin)
 * as positive integer only. 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class FlipCoin {
	
	//method to get the user input
	public static int getUserInput() {
		
		System.out.println("Enter how many times want to flip coin :");
		
		Scanner sc = new Scanner(System.in);
		int noOfFlips = sc.nextInt();
		
		return noOfFlips;
	}
	
	public static void main(String[] args) {

		int tailCounter = 0;
		int headCounter = 0;
		
		int totalFlips=getUserInput();

		int i = 0;
		int j = 1;

		while(i < 1 ) {
			
			//checking if user input is positive or not
			if(totalFlips > 0) {
				
				while(j <= totalFlips) {
			
					double flipResult= Math.random();
			
					if(flipResult < 0.5) {
						tailCounter++;
					}
					else {
						headCounter++;
					}
			
					j++;
				}
		
				i++;
			}
			else {
				i=0;
				System.out.println("Enter positive integer only");
				totalFlips=getUserInput();
			}
		}
		
		double tailPercentage = tailCounter / (double)totalFlips *100;
		double headPercentage = headCounter / (double)totalFlips *100;

		System.out.println("Tail Percentage : "+tailPercentage);
		System.out.println("Head Percentage : "+headPercentage);
	}

}
