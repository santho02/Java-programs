package week3.Assignment1;

public class Calculator {
	
	public void addValue(int a, int b) {
		System.out.println("Add two numbers: "+(a+b));
	}
 
	public void addValue(int a, int b, int c) {
		System.out.println("The value of a is "+a+" and the value of b is "+b+" and the value of c is "+c);
	}
   
   public void multiplyValue(int a, int b) {
	   System.out.println("Multiply the value: "+(a*b));
   }
  

   public void multiplyValue(int c, double d) {
	   System.out.println("The value of c is "+c+" and the value of d is "+d);
   }

   public void subtractValue(int a, int b) {
	   System.out.println("Subtract the value: "+(a-b));
   }
   
   public void subtractValue(double c, double d) {
	   System.out.println("The value of c is "+c+" and the value of d is "+d);
   }

   public void divideValue(int a, int b) {
	   System.out.println("Divide the value : "+(a/b));
   }

   public void divideValue(double c, double d) {
	   System.out.println("The value is "+c+" and the value of d is "+d);
   }

	public static void main(String[] args) {
     Calculator c=new Calculator();
     c.addValue(1, 2);
     c.addValue(3, 4, 5);
     c.multiplyValue(11, 22);
     c.multiplyValue(33, 44.43);
     c.subtractValue(66, 77);
     c.subtractValue(88.8, 99.88);
     c.divideValue(121, 131);
     c.divideValue(22.21, 33.31);
					
	}
}
/*
   POLYMORPHISM
Assignment 1:
Create class Calculator with below methods
- 2 methods for add, 1 method with 2 int args , 1 method with 3 int args
- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
- 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
- 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int
create object for the Calculator class and execute all the methods
 */

