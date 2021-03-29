package Assignment1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
         int count=0;
         String temp=null;
        String[] charArray= text.split(" ");
        
        for (int i = 0; i < charArray.length-1; i++) {
			for (int j = i; j < charArray.length; j++) {
				if(charArray[i].equals(charArray[j])) {
					temp=charArray[i];
					count++;
				}
							}
		}
        if(count>1)
		{
			System.out.println(text.replace(temp,""));
		}
		else
			System.out.println();

	}

}
/*
 * Pseudo code 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 * g) Displaying the String without duplicate words	
 */