package Conditions;

import java.util.Scanner;

//Choose your Option :
//1. Balance Check
//2. Deposit
//3. Withdraw
//4. Exit
//
//
//1. Your Balance : $XXXXX
//
//2. Please enter the deposit amount :
//   500(Dont Accept Negitive Numbers, Error : Please enter proper amount )
//   Your Amount Deposited
//   Current Balance : $XXXXX
//
//3. Enter the amount to withdraw
//   XXXXX(balance > withdraw amount) , Error : Insufficient Funds
//   Please collect your Cash.
//   Remaining Balance : XXXXX
//4. Thank you...!!!, visit again.
public class boaATM {

	public static double balance = 500;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int choice;
		System.out.println("choose your option : ");
		System.out.println("1. Balance Check");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			displayBalance();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withDraw();
			break;
		case 4:
			System.out.println("Thank you...!!!, visit again.");
			break;
		default:
			System.out.println("Invalid option");
		}

		sc.close();
	}

	private static void withDraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Withdrawl amout:");
		double Withdrawl_Amout = sc.nextDouble();
		if (Withdrawl_Amout < 0) {
			System.out.println("Error: Please enter a proper amount.");

		} else if (Withdrawl_Amout > balance) {
			System.out.println("Insufficient balance");
		} else {
			balance -= Withdrawl_Amout;
			System.err.println("collect your amount");
			displayBalance();
		}
		sc.close();

	}

	private static void deposit() {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the amount to deposit $:");
		double deposit_Amount = sc.nextDouble();

		if (deposit_Amount < 0) {
			System.out.println("Error: please enter valid amount");

		} else {
			balance += deposit_Amount;
			System.out.println("deposited");
			displayBalance();
		}
		sc.close();

	}

	private static void displayBalance() {

		System.out.println("Your balabce :" + balance + "$");
	}
}