package ing.archiveCD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrackTest {

	private Track TrackN1;
	
	@Before
	public void setUp() {
		TrackN1 = new Track("Desaparecido", 3.47);
	}
	
	@Test
	public void testGetLenght() {
		assertEquals(3.47, TrackN1.getLenght(), 0.001);
	}
	
	@Test
	public void testGetTitle() {
		assertEquals("Desaparecido", TrackN1.getTitle());
	}
	
	@Test
	public void testToString() {
		assertEquals("Track [title=Desaparecido, lenght=3,49]", TrackN1.toString());
	}

}
