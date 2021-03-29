package week3.Assignment2;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {   
		String input="PayPal India";
		char[] charArray=input.toCharArray();
		
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			boolean addResult=charSet.add(charArray[i]);
			if(addResult== false) {
				dupCharSet.add(charArray[i]);
			}				
		}
		for (Character eachValue : charSet) {
			if(eachValue != ' ') {
				System.out.print(eachValue);
			}			
		}		
	}
}
/*
Declare a String as PayPal India

//Convert it into a character array

//Declare a Set as charSet for Character

//Declare a Set as dupCharSet for duplicate Character

//Iterate character array and add it into charSet

//if the character is already in the charSet then, add it to the dupCharSet

//Check the dupCharSet elements and remove those in the charSet

//Iterate using charSet

//Check the iterator variable isn't equals to an empty space

//print each character for charSet 
 */