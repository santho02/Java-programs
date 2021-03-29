package week1.day2;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,sum=0,rem;
		int orgNum=n;
         while(n>0)
         {
        	rem=n%10;
        	sum=sum+(rem*rem*rem);
        	n=n/10;
         }if(sum==orgNum)
         {
        	 System.out.println("Armstrong");
         }else
         System.out.println("Not a Armstrong");
         
	}

}
