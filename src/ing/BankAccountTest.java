package ing;

import static org.junit.Assert.*;
import ing.Person;
import ing.Person.Gender;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	BankAccount myAccount = new BankAccount(new Person("Mauro","Conte",1994,7,2,Gender.MALE));
	
	@Before
	public void setUp() throws Exception {
		myAccount.deposit(30.23);
	}
	
	@Test
	public void testConstructor2() throws Exception {
		BankAccount anotherAccount = new BankAccount(new Person("Mauro","Conte",1994,7,2,Gender.MALE),30.23);
		assertEquals(anotherAccount.toString(), myAccount.toString());
	}
	
	@Test
	public void testDeposit() throws Exception {
		assertEquals(30.23+10, myAccount.deposit(10) ,0.001);
	}
	
	@Test(expected=Exception.class)
	public void testWithDraw1() throws Exception {
		myAccount.withdraw(50);
		//assertEquals(0, myAccount.withdraw(50),0.001);
	}
	
	@Test
	public void testWithDraw2() throws Exception {
		assertEquals(30.21, myAccount.withdraw(30.21), 0.001);
	}
	
	@Test
	public void testGetBalance() throws Exception {
		assertEquals(30.23, myAccount.getBalance(), 0.001);
	}
	
	@Test
	public void testToString() throws Exception {
		String strTest = "BankAccount [owner=Person [firstName=mauro, lastName=conte, age=20, gender=MALE], balance=30.23]";
		assertEquals(strTest, myAccount.toString());
	}
}
