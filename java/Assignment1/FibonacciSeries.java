package Assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8,firstNum=0,secNum=1,sum;
		System.out.print(firstNum+" ");
		for(int i=0;i<=range;i++)
		{
			sum=firstNum+secNum;
			secNum=firstNum;
			firstNum=sum;
			System.out.print(sum+" ");
		} 
		

	}

}
//initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		// Print first number
		
		// Iterate from 1 to the range
		
		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign first number to the sum
		
		// print sum