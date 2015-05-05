package ing;

/**
 * A bank account has a balance that can be changed by 
 * deposits and withdrawals.
 * 
 * diocane
 * @author Mauro Conte
 * @version 1.0
 * @since 1.0
 * @see Person
 */
public class BankAccount {

	private final String FAIL_MSG = "You can not complete this task!";
	private final String SUCCESS_MSG = "Task completed!";
	
	private final Person owner;
	private double balance;
	
	/**
	 * Constructs a bank account with a zero balance and an owner
	 * @param the owner
	 * @see Person
	 */
	public BankAccount(Person owner) {
		this.owner = owner;
		this.balance = 0;
	}
	/**
	 * Constructs a bank account with a balance and an owner
	 * @param the owner
	 * @param initial balance
	 * @see Person
	 */
	public BankAccount(Person owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	/**
	 * Deposits money into the bank account.
	 * @param the rate to deposit
	 * @return the new balance
	 */
	public double deposit(double rate) {
		if(rate>0) this.balance+=rate;
		return balance;
	}
	
	/**
	 * Withdraws money from the bank account.
	 * @param the rate to withdraw
	 * @return the withdrawed rate
	 * @throws Exception 
	 */
	public double withdraw(double rate) throws Exception {
		double withdrawed = 0;
		if(rate>0 && balance >= rate) {
			balance -= rate;
			withdrawed = rate;
			System.out.println(this.SUCCESS_MSG);
		} else {
			//TODO meglio output o occezzione da gestire nel codice del main
			System.out.println(this.FAIL_MSG);
			throw new Exception("Too much money requested");
		}
		return withdrawed;
	}
	
	/**
	 * Gets the current balance of the bank account.
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @return the owner
	 * @see Person
	 */
	public Person getOwner() {
		return owner;
	}
	
	@Override
	public String toString() {
		return "BankAccount [owner=" + owner.toString() + ", balance=" + balance + "]";
	}
}
