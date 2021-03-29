package week1.day1;

public class PrimeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=8,count=0;
		for(int i=1;i<=input;i++) 
		{
			if(input%i==0)
			{
				count++;
			}
		} System.out.println(count);
		
		if(count==2)
		{
			System.out.println("Prime");
		}else
			System.out.println("Not a Prime");

	}

}
