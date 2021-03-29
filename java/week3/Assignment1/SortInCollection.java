package week3.Assignment1;

import java.util.Arrays;


public class SortInCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		int length= input.length;
	   Arrays.sort(input);
		for (int i = length-1; i >=0 ; i--) {
			System.out.println(input[i]);
		}
		
	}

}
/*
//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

//get the length of the array		

//sort the array			

//Iterate it in the reverse order

//print the array

//Required Output: Wipro, HCL , CTS, Aspire Systems
*/