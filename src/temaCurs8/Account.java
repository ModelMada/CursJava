package temaCurs8;
import java.util.*;

public class Account {

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
	}

	private int accountNumber;
	public double balance = 2000.00;
	public Customer accountOwner;
	
	public void withdrawAmount (int amount) throws InsufficientFundsException {
		System.out.println("Introduceti suma pe care doriti sa o eliberati: ");
		Scanner scan = new Scanner(System.in);
		amount = scan.nextInt();
		
		if(amount > balance) {
			throw new InsufficientFundsException("The amount you entered is greater than the available balance: " + balance + ". Thank you for using our ATM");			
			};
		
		scan.close();
		}
	}

