package ing.tamazoo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamagordoTest {


	private Tamagordo my = new Tamagordo();
	
	@Test
	public void testConstructorB() throws Exception{
		Tamagordo myTama = new Tamagordo("tamazio");
		assertEquals("Tamagordo [name=tamazio, satiety=50.0, emotivity=100.0]", myTama.toString());
	}
	
	@Test
	public void testFeedAndGetSatiety() throws Exception{
		double [] expected = new double[]
				{
					55,60.5,66.55,73.205,80.525,88.578,97.435,100,100,100,
					100,100,100,100,100,100,100,100,100,100
				};
		double [] actuals = new double[20];
		for(int i = 0; i<10; i++) {
			my.feed(1);
			actuals[i] = my.getSatiety();
			actuals[i+10] = my.getEmotivity();
		}
		assertArrayEquals(expected, actuals, 0.001);
	}
	
	@Test
	public void testCaressAndGetEmotivity() throws Exception{
		my.caress(41);
		double [] expected = new double[]
				{
					100,100,100,100,100,100,100,100,100,100,
					8,7,6,5,4,3,2,1,0,0
				};
		double [] actuals = new double[20];
		for(int i = 0; i<10; i++) {
			my.caress(1);
			actuals[i] = my.getEmotivity();
			actuals[i+10] = my.getSatiety();
		}
		assertArrayEquals(expected, actuals, 0.1);
	}
	
	@Test
	public void testName() throws Exception {
		assertEquals("tamagordo", my.getName());
	}

	@Test
	public void testIsAlive() throws Exception {
		assertEquals(true, my.isAlive());
	}
	
	@Test
	public void testStarve() throws Exception{
		for(int i=0; i<1000; i++) {
			my.caress(1); 
		}
		//se il tTamagordo viene solo coccolato
		//prima o poi muore di fame
		assertEquals(false, my.isAlive());
	}
	
	@Test
	public void testLoneliness() throws Exception{
		for(int i=0; i<50; i++) {
			my.feed(1); 
		}
		//se il tTamagordo viene solo nutrito
		//prima o poi muore di solitudine
		assertEquals(false, my.isAlive());
	}
	
	@Test
	public void testIsHappy() throws Exception {
		int [] expected = new int[]{1,0,0};
		int [] actuals = new int[3];
		//All'inizio è sicuramente felice
		if(my.isHappy()) actuals[0]= 1;
		else actuals[0]= 0;
		my.feed(7);
		if(my.isHappy()) actuals[1]= 1;
		else actuals[1]= 0;
		my.caress(174);
		if(my.isHappy()) actuals[2]= 1;
		else actuals[2]= 0;
		assertArrayEquals(expected, actuals);
	}
	
	@Test
	public void testToString() throws Exception{
		assertEquals("Tamagordo [name="+Tamagordo.DEFAULT_NAME+", satiety="+Tamagordo.DEFAULT_SATIETY+".0, emotivity="+Tamagordo.DEFAULT_EMOTIVITY+".0]", my.toString());
	}

}
