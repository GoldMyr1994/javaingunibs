package ing.archiveCD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArchiveCDTest {

	private CD clandestino;
	
	@Before
	public void setUp() {
		clandestino = new CD("clandestino", "manu chao");
		clandestino.addTrack(new Track("clandestino", 2.28));
		clandestino.addTrack(new Track("desaparecido", 3.47));
		clandestino.addTrack(new Track("bongo bong", 2.38));
		clandestino.addTrack(new Track("je ne t'aime plus", 2.03));
		clandestino.addTrack(new Track("mentira...", 4.37));
		clandestino.addTrack(new Track("lagrimas de oro", 2.58));
		clandestino.addTrack(new Track("mama call", 2.21));
		clandestino.addTrack(new Track("luna y sol", 3.07));
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddCD() {
		fail("Not yet implemented");
	}

	@Test
	public void testItemToString() {
		String 	expected = "CD [title=Clandestino, author=Manu chao,";
				expected += " listTrack=[Track [title=Clandestino, lenght=2,28], ";
				expected += "Track [title=Desaparecido, lenght=3,49]]]";
				expected += "Track [title=Desaparecido, lenght=3,49]]]";
				expected += "Track [title=Desaparecido, lenght=3,49]]]";
				
		
		//assertEquals(expected);
	}

	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

}
