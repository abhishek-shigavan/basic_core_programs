/**
 * LeapYear
 * 
 * Program to check if the year is
 * Leap year or not.
 * 
 * Taking value of year in 4 digit only
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		while (i < 1) {
			
			System.out.println("Enter year to check if it is leap year or not :");
			int yearValue = sc.nextInt();
			
			int length = String.valueOf(yearValue).length();
			
			if (length == 4) {
				boolean flag = false;
			
				//checking if the year is leap or not
				if(yearValue % 400 == 0){
					flag = true;
				}
				else if (yearValue % 100 == 0){
					flag = false;
				}
				else if(yearValue % 4 == 0){
					flag = true;
				}
				else{
					flag = false;
				}
	        
				//checking flag value 
				if(flag == true){
					System.out.println("Year "+yearValue+" is a Leap Year");
				}
				else {
					System.out.println("Year "+yearValue+" is not a Leap Year");
				}
				
				i++;
			}
			else {
				i=0; //Initializing to zero to iterate the loop again
				System.out.println("Year should be of 4 digit");
			}
		}
	}
	
	
}
