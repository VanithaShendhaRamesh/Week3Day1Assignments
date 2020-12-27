package org.system;
/*Assignment3:
============
Method Overriding
    Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.*/
public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit Account - Axis Bank");
	}
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
	/*	BankInfo bank1 = new BankInfo();
		bank1.deposit();*/

	}

}
