package ing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamagotchiTest {

private Tamagotchi my = new Tamagotchi();
	
	@Test
	public void testName() throws Exception {
		assertEquals("tama", my.getName());
	}

	@Test
	public void testIsAlive() throws Exception {
		assertEquals(true, my.isAlive());
	}

	@Test
	public void testIsHappy() throws Exception {
		assertEquals(true, my.isHappy());
	}

}
