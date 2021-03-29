package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=13;
		boolean flag=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
			if(flag==true) {
				System.out.println("prime");
			}else
				System.out.println("Not a prime");
		}
	}


