package week1.day1;

public class Oneplus {

	    public int getprice() {
	    	return 30000;
	    }
	    public String getmodel() {
	    	return "7pro";
	    }
	  private void showwallpaper() {
		  System.out.println("Shown");
	  }
	    public int mobileprice(int price) {
	    	if(price == 1) {
	    		return 10000;
	    	}
	    	else if(price == 2)
	    	{
	    		return 20000;
	    	}else if(price == 3)
	    	{
	    		return 30000;
	    	}else
	    	{
	    		return 40000;
	    	}
	    			
	    }
	 public static void main(String[] args) {
		System.out.println("Hi");
		Oneplus obj=new Oneplus();
		System.out.println(obj.getprice());
		System.out.println(obj.getmodel());
		obj.showwallpaper();
		System.out.println(obj.mobileprice(4));
	}
	}


