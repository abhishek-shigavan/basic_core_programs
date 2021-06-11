/**
 * PowerProblem
 * 
 * Program to compute power table of 2
 * 
 * Printing power table till user defined
 * power of 2
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class PowerProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Power for 2 :");
		int maxPower= sc.nextInt();
		
		int powerOf2 = 1;
		
		if(maxPower > 0 && maxPower < 31 ) {
			
			int powerLimit=(int)Math.pow(2, maxPower);
			
			while(powerOf2 < powerLimit) {
				//computing power of 2
				powerOf2 = 2*powerOf2; 
				System.out.println(powerOf2);	
			}	
		}
		else if(maxPower == 0) {
			System.out.println(powerOf2);
		}
		else {
			System.out.println(" Power for 2 should be between 0-30 ");
		}
		
	}
}
