package week1.day1; 

public class DivisibleBy3or7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=25;i++)
		{
			if(i%3==0 && i%7==0)
			{
				System.out.println(i+"bizfiz");
			}else
			if(i%3==0)
			{
				System.out.println(i+"biz");
			}else
				if(i%7==0) {
				System.out.println(i+"fiz");
			}
			
				
		}

	}

}
