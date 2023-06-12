package Curs9;

import java.util.Scanner;

/*
Simulam lucrul cu un ATM
avem 3 operatiuni:
1. withdraw;
2. deposit
3. checkBalance

Intrebam userul ce operatiune vrea sa faca
Daca vrea withdraw (balance = balance - amount) si printam soldul
-> daca withdraw este mai mare decat balanta arunc InsuficientFuds
Daca vrea deposit (balance = balance+amount) si printam soldul
-> daca amount <=0 throw InvalidAmountException
Daca vrea checkBalance (printam soldul)

Programul face parte dintr-u intreg sistem bancar, ceea ce implica multiple conturi (curent/de economii/credit/etc)
Toate conturile au aceleasi 3 operatiuni, dar implementari specifice
noi implementam ATM pe cont curent

Dupa ce utilizatorul efectueaza o operatiune, il intrebam daca vrea sa continue

*/

public class Atm {
	
	double amount;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		CurrentAccount acc = new CurrentAccount();
		acc.balance=1000;
		
		Atm atm = new Atm();
		
		boolean flag = true;
		
		while(flag) {
			//Scanner scan = new Scanner(System.in);
			
			try {
				atm.atmOperations(acc);
				System.out.println("Do you wat to continue? ");
				flag = scan.nextBoolean();
				
			} catch (InvalidAmountException | InsuficientFundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void atmOperations(CurrentAccount obj) throws InvalidAmountException, InsuficientFundsException {
		//Scanner scan = new Scanner(System.in);
		System.out.println("Hi, available operations are:");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check balance");
		
		int option = scan.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Please enter the deposit amount: ");
			double amount = scan.nextDouble();
			obj.deposit(amount);
			break;
			
		case 2:
			System.out.println("Please enter the withdraw amount: ");
			double amount2 = scan.nextDouble();
			obj.withdraw(amount2);
			break;
			
		case 3:
			obj.checkBalance();
			break;
			
		default:
			System.out.println("Invalid option!");
			
		}
		
		//scan.close();

	}

}
