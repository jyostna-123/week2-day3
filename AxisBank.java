package org.system;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Override test");
	}

	public static void main(String[] args) {
		AxisBank override=new AxisBank();
		override.deposit();

	}

}
