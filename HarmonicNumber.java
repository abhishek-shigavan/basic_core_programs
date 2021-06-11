/**
 * HarmonicNumber
 * 
 * Program to find nth harmonic number.
 * 
 * Taking value from user for nth harmonic
 * number and calculate the harmonic number.
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter nth harmonic number : ");
		int nthHarmonic = sc.nextInt();
		
		double harmonicNumber = 1;
		int flag =0;
		
		while(nthHarmonic > 0) {
			
			if(nthHarmonic == 1) {
				harmonicNumber =harmonicNumber;
			}
			
			for(double i=2; i<=nthHarmonic; i++) {
			
				harmonicNumber=harmonicNumber +(1/i);
			}
			System.out.println(nthHarmonic+"th Harmonic number is : "+harmonicNumber);
			
			flag =1;
			break;
		}
		
		if(flag == 0) {
			System.out.println("Value should be greater than 0");
		}
	}
}
