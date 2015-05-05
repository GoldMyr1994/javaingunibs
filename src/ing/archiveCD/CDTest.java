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
//		myCD.addTrack(new Track("", 0.00));
//		myCD.addTrack(new Track("", 0.00));
//		myCD.addTrack(new Track("", 0.00));

		
	}

	@Test
	public void testGetTitle() {
		assertEquals("Clandestino", myCD.getTitle());
	}

	@Test
	public void testGetAuthor() {
		assertEquals("Manu chao", myCD.getAuthor());
	}

	@Test
	public void testAddTrack() {
		myCD.addTrack(new Track("desaparecido", 3.49));
		assertEquals("Track [title=Desaparecido, lenght=3,49]",myCD.selectTrackByIndex(1));
	}

	@Test
	public void testSelectRandomTrack() {
		String theTrack = "";
		for(int i=0;i<=10;i++) theTrack = myCD.selectRandomTrack();
		assertEquals("Track [title=Clandestino, lenght=2,28]",theTrack);
	}

	@Test
	public void testSelectTrackByIndex() {
		assertEquals("Track [title=Clandestino, lenght=2,28]",myCD.selectTrackByIndex(0));
	}

	@Test
	public void testSelectTrackByTitle() {
		assertEquals("Track [title=Clandestino, lenght=2,28]",myCD.selectTrackByTitle("clandestino"));
	}

	@Test
	public void testToString() {
		myCD.addTrack(new Track("desaparecido", 3.49));
		assertEquals("CD [title=Clandestino, author=Manu chao, listTrack=[Track [title=Clandestino, lenght=2,28], Track [title=Desaparecido, lenght=3,49]]]", myCD.toString());
	}

}
