package Assignment1;

public class SumOfDigitsFromString {
	
	public static void main(String[] args) {
	String text = "Tes12Le79af65";
   int original=0, remainder=0, sumOfDigits=0;
   int parseInt=Integer.parseInt(text.replaceAll("\\D", ""));
   original=parseInt;
   while(original>0)
   {
	remainder=original%10;
	sumOfDigits=sumOfDigits+remainder;
	original=original/10;
   }
   System.out.println("Sum of Digits are " +sumOfDigits);
	}
}
/*
 * Method 1
 * Pseudo Code
 * Declare a String text with the following value
	String text = "Tes12Le79af65";
   Declare a int variable sum
	int sum = 0;
 * a) using replaceAll(), replace all the non-digits into ""
 * b) Now, convert the String into array
 * c) Iterate over the array and get each character
 * d) Using Character.getNumericValue(), Change the char into int
 * e) Add the values to sum & print 
 */