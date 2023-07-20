package temaCurs8;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsufficientFundsException {
		// TODO Auto-generated method stub

		Customer client = new Customer("Adrian","Bucuresti","adrian@abc.com");
		SavingsAccount cont = new SavingsAccount();
		cont.setAccountNumber(13);
		cont.setAccountOwner(client);
		cont.setBalance(200.00);
		System.out.println("Hi, " + client.getName()+"!");
		cont.withdrawAmount(0);
	}

}
