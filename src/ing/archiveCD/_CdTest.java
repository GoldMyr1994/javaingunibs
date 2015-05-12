package ing.archiveCD;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class _CdTest {
	private static final String TITOLO = "Anime salve";
	private static final String AUTORE = "Fabrizio De André";
	
	@Test
	public void testToStringSenzaBrani() throws Exception {
		assertEquals("Anime salve - Fabrizio De André", new CD(TITOLO, AUTORE).toString());
	}
	
	@Test
	public void testToStringConBrani() throws Exception {
		final CD cd = new CD(TITOLO, AUTORE);
		cd.addTrack(new Track("Anime salve", 5, 52));
		cd.addTrack(new Track("Le acciughe fanno il pallone", 4, 47));
		cd.addTrack(new Track("Smisurata preghiera", 7, 8));
		assertEquals("Anime salve - Fabrizio De André\nAnime salve [05:52]\nLe acciughe fanno il pallone [04:47]\nSmisurata preghiera [07:08]", cd.toString());
	}
	
	@Test
	public void testHaTitoloTrue() throws Exception {
		final CD cd = new CD(TITOLO, AUTORE);
		assertTrue(cd.hasTitle(TITOLO));
	}
	
	@Test
	public void testHaTitoloFalse() throws Exception {
		final CD cd = new CD(TITOLO, AUTORE);
		assertFalse(cd.hasTitle("La buona novella"));
	}
	
	@Test
	public void testEstrazioneCasualeBrano() throws Exception {
		final CD cd = new CD("_A Title_", "_An Author_");
		final int numeroBrani = 10;
		for(int i = 0; i < numeroBrani; i++) {
			cd.addTrack(new Track("Brano " + i, i, i));
		}
		final int numeroEstrazioni = 100;
		Set<String> titoliBraniEstratti = new HashSet<String>();
		for(int i = 0; i < numeroEstrazioni; i++) {
			Track b = cd.selectRandomTrack();
			titoliBraniEstratti.add(b.getTitle());
		}
		assertTrue(titoliBraniEstratti.size() >= 7);
	}
}
