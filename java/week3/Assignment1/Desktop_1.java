package week3.Assignment1;

public class Desktop_1 implements HardWare, Software{
 public void desktopModel(String model) {
	 System.out.println("The mode is "+model);
 }
	public static void main(String[] args) {
     Desktop_1 dp=new Desktop_1();
     dp.desktopModel("HP Pavilion");
	}
	@Override
	public void hardwareResources() {
   System.out.println("Its New SSD!!");		
	}
	@Override
	public void softwareResources() {
		System.out.println("New Version 1.8.254");		
	}

}
