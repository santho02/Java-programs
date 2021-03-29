package week3.Assignment1;

public class AxisBank extends BankInfo {

	public void deposit(int depo) {
		System.out.println("The Deposit amount is "+depo);
	}
	public static void main(String[] args) {
     AxisBank axis=new AxisBank();
     axis.saving(1000);
     axis.fixed(2000);
     axis.deposit(3000);
	}
}

