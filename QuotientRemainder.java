/**
 * QuotientRemainder
 * 
 * Program to compute quotient and
 * remainder
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class QuotientRemainder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter divident : ");
		int isDivident = sc.nextInt();
		System.out.println("Enter divisor : ");
		int isDivisor = sc.nextInt();
		
		int isQuotient = isDivident / isDivisor ;
		int isRemainder = isDivident % isDivisor;
		
		System.out.println("Quotient : "+isQuotient);
		System.out.println("Remainder : "+isRemainder);
	}
}
