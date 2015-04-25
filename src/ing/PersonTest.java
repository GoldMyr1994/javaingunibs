package ing;

import static org.junit.Assert.assertEquals;
import ing.Person.Gender;

import org.junit.Test;

public class PersonTest {
	
	private Person me = new Person("Mauro","Conte",1994,7,2,Gender.MALE);
	
	@Test
	public void testGetFirstName() throws Exception {
		assertEquals("Mauro", me.getFirstName());
	}
	@Test
	public void testGetLastName() throws Exception {
		assertEquals("Conte", me.getLastName());
	}
	@Test
	public void testGetAge() throws Exception {
		assertEquals(20, me.getAge());
	}
	@Test
	public void testToString() throws Exception {
		String strTest = "Person [firstName=mauro, lastName=conte, age=20, gender=MALE]";
		assertEquals(strTest, me.toString());
	}
	@Test
	public void testToGender() throws Exception {
		assertEquals(Gender.MALE, me.getGender());
	}

}
