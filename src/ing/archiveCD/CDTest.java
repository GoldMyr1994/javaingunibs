package ing.archiveCD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CDTest {

	private CD myCD;
	
	@Before
	public void setUp() {
		myCD = new CD("clandestino", "manu chao");
		myCD.addTrack(new Track("clandestino", 2.28));
//		myCD.addTrack(new Track("desaparecido", 3.47));
//		myCD.addTrack(new Track("bongo bong", 2.38));
//		myCD.addTrack(new Track("je ne t'aime plus", 2.03));
//		myCD.addTrack(new Track("mentira...", 4.37));
//		myCD.addTrack(new Track("lagrimas de oro", 2.58));
//		myCD.addTrack(new Track("mama call", 2.21));
//		myCD.addTrack(new Track("luna y sol", 3.07));
//		myCD.addTrack(new Track("", 0.00));

		
	}

	@Test
	public void testGetTitle() {
		assertEquals("clandestino", myCD.getTitle());
	}

	@Test
	public void testGetAuthor() {
		assertEquals("manu chao", myCD.getAuthor());
	}

	@Test
	public void testAddTrack() {
		assertEquals(1,myCD.addTrack(new Track("desaparecido", 3.49)));
	}

	@Test
	public void testSelectTrackByIndex() {
		assertEquals(new Track("clandestino", 2.28).toString(),myCD.selectTrackByIndex(0).toString());
	}

	@Test
	public void testSelectTrackByTitle() {
		assertEquals(new Track("clandestino", 2.28).toString(), myCD.selectTrackByTitle("clandestino").toString());
	}

	@Test
	public void testToString() {
		myCD.addTrack(new Track("desaparecido", 3.49));
		assertEquals("clandestino - manu chao\nclandestino [02:28]\ndesaparecido [03:49]", myCD.toString());
	}

}
