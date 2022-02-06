package week3.Assignment3;

/*
 Class     :AxisBank
 Methods :deposit()
 */
public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Deposited Amount is 30000");
	}
	public static void main(String[] args) {
		System.out.println("Method Overriding");
		System.out.println("*******************************");
		AxisBank bank = new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();
	}

}
