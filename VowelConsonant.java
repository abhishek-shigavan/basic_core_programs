/**
 * VowelConsonant
 * 
 * Program to check if the alphabet is
 * vowel or consonant.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class VowelConsonant {

/**
 * storing all the vowels in the string
 * and checking if the alphabet is present
 * in the string or not.
 * 
 * @return index of character in string
 */	
	public static int checkAlphabet(char ch){
	        
		    // Make the list of vowels
	        String str = "aeiouAEIOU";
	        int result=str.indexOf(ch);
	        return result;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter character to check :");
		char inputCharacter = sc.next().charAt(0);
		
		int checkResult = checkAlphabet(inputCharacter);
		
		if(checkResult >= 0) {
			System.out.println(inputCharacter+" is Vowel");
		}
		else {
			System.out.println(inputCharacter+" is Consonant");
		}
	}
}
