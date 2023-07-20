package temaCurs8;

import java.util.Scanner;

public class SavingsAccount extends Account {

	public void SavingsAccount(int accountNumber, int balance, Customer accountOwner) {
		setAccountNumber(accountNumber);
		setBalance(balance);
		setAccountOwner(accountOwner);		
	};
	
	@Override
	public void withdrawAmount (int amount) throws InsufficientFundsException {
		System.out.println("Introduceti suma pe care doriti sa o eliberati: ");
		Scanner scan = new Scanner(System.in);
		amount = scan.nextInt();
		
		if(amount > balance) {
			throw new InsufficientFundsException("The amount you entered is greater than the available balance: " + balance + ". Thank you for using our ATM");			
			}
			else {
				System.out.println("Please pick up your money!");
				balance = balance - amount;
				System.out.println("Current balance: " + balance);
				System.out.println("Thank you for using our ATM");
			}
		
		scan.close();
		}

}
