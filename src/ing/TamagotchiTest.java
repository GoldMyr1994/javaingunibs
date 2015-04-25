package ing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamagotchiTest {

	private Tamagotchi my = new Tamagotchi();
	
	@Test
	public void testConstructorB() throws Exception{
		Tamagotchi myTama = new Tamagotchi("tama", 40, 60);
		assertEquals("Tamagotchi [name=tama, satiety=40, emotivity=60]", myTama.toString());
	}
	
	@Test
	public void testFeedAndGetSatiety() throws Exception{
		my.feed(10);
		assertEquals(60, my.getSatiety());
	}
	
	@Test
	public void testCaressAndGetEmotivity() throws Exception{
		my.caress(10);
		assertEquals(60, my.getEmotivity());
	}
	
	@Test
	public void testName() throws Exception {
		assertEquals("tama", my.getName());
	}

	@Test
	public void testIsAlive() throws Exception {
		assertEquals(true, my.isAlive());
	}
	
	@Test
	public void testStarve() throws Exception{
		my.caress(50);
		assertEquals(false, my.isAlive());
	}
	
	@Test
	public void testLoneliness() throws Exception{
		my.feed(50);
		assertEquals(false, my.isAlive());
	}
	
	@Test
	public void testIsHappy() throws Exception {
		int [] expected = new int[]{1,0,0};
		int [] actuals = new int[3];
		if(my.isHappy()) actuals[0]= 1;
		else actuals[0]= 0;
		my.feed(41);
		if(my.isHappy()) actuals[1]= 1;
		else actuals[1]= 0;
		my.caress(82);
		if(my.isHappy()) actuals[2]= 1;
		else actuals[2]= 0;
		assertArrayEquals(expected, actuals);
	}
	
	@Test
	public void testToString() throws Exception{
		assertEquals("Tamagotchi [name=tama, satiety=50, emotivity=50]", my.toString());
	}
}
