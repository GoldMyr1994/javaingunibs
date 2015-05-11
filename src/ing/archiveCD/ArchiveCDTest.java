package ing.archiveCD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArchiveCDTest {

	private ArchiveCD myArchive;
	private CD clandestino;
	private CD proxima;
	
	@Before
	public void setUp() {
		myArchive = new ArchiveCD();
		clandestino = new CD("clandestino", "manu chao");
		clandestino.addTrack(new Track("clandestino", 2.28));
		clandestino.addTrack(new Track("desaparecido", 3.47));
		clandestino.addTrack(new Track("bongo bong", 2.38));
		clandestino.addTrack(new Track("je ne t'aime plus", 2.03));
		clandestino.addTrack(new Track("mentira...", 4.37));
		clandestino.addTrack(new Track("lagrimas de oro", 2.58));
		clandestino.addTrack(new Track("mama call", 2.21));
		clandestino.addTrack(new Track("luna y sol", 3.07));
		myArchive.addCD(clandestino);
		proxima = new CD("Próxima Estación: Esperanza", "manu chao");
		proxima.addTrack(new Track("merry blues",2.23));
		proxima.addTrack(new Track("bixio",2.34));
		proxima.addTrack(new Track("promiscuity",3.04));
		proxima.addTrack(new Track("la primavera",2.55));
		proxima.addTrack(new Track("me gustas tú",3.54));
		proxima.addTrack(new Track("denia",2.32));
		proxima.addTrack(new Track("mi vida",2.01));
		proxima.addTrack(new Track("trapped by love",3.21));
		
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddCD() {
		myArchive.addCD(proxima);
		String 	expected = "Próxima Estación: Esperanza - manu chao\n";
		expected += "merry blues [02:23]\n";
		expected += "bixio [02:34]\n";
		expected += "promiscuity [03:04]\n";
		expected += "la primavera [02:55]\n";
		expected += "me gustas tú [03:54]\n";
		expected += "denia [02:32]\n";
		expected += "mi vida [02:01]\n";
		expected += "trapped by love [03:21]";
		
		assertEquals(expected,myArchive.itemToString(1));
	}

	@Test
	public void testItemToString() {
		String 	expected = "clandestino - manu chao\n";
				expected += "clandestino [02:28]\n";
				expected += "desaparecido [03:47]\n";
				expected += "bongo bong [02:38]\n";
				expected += "je ne t'aime plus [02:03]\n";
				expected += "mentira... [04:37]\n";
				expected += "lagrimas de oro [02:58]\n";
				expected += "mama call [02:21]\n";
				expected += "luna y sol [03:07]";
		assertEquals(expected,myArchive.itemToString(0));
	}

	@Test
	public void testRemoveItem() {
		myArchive.addCD(proxima);
		String 	expected = "clandestino - manu chao\n";
		expected += "clandestino [02:28]\n";
		expected += "desaparecido [03:47]\n";
		expected += "bongo bong [02:38]\n";
		expected += "je ne t'aime plus [02:03]\n";
		expected += "mentira... [04:37]\n";
		expected += "lagrimas de oro [02:58]\n";
		expected += "mama call [02:21]\n";
		expected += "luna y sol [03:07]";
		
		assertEquals(expected,myArchive.itemToString(0));
		
	}

}
