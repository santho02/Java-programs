package week3.Assignment1;

public class Desktop extends Computer {
              public void desktopSize(double sizeOfComp) {
            	  System.out.println("The desktop Size is "+ sizeOfComp);
              }
	public static void main(String[] args) {
       Desktop obj =new Desktop();
       obj.computerModel();
       obj.desktopSize(14.5);
       
	}

}

