package ing.archiveCD;

import static org.junit.Assert.*;

import org.junit.Test;

public class _ArchivioCdTest {
	@Test
	public void testAggiuntaCd() throws Exception {
		final ArchiveCD archivio = new ArchiveCD();
		archivio.addCD(new CD("Anime salve", "Fabrizio De Andr�"));
		archivio.addCD(new CD("Storia di un impiegato", "Fabrizio De Andr�"));
		assertEquals(2, archivio.getArchiveLenght());
	}
	
	@Test
	public void testRicercaTitoloPresente() throws Exception {
		final ArchiveCD archivio = new ArchiveCD();
		archivio.addCD(new CD("Anime salve", "Fabrizio De Andr�"));
		archivio.addCD(new CD("Storia di un impiegato", "Fabrizio De Andr�"));
		assertTrue(archivio.hasCD("Anime salve"));
	}
	
	@Test
	public void testRicercaTitoloNonPresente() throws Exception {
		final ArchiveCD archivio = new ArchiveCD();
		archivio.addCD(new CD("Anime salve", "Fabrizio De Andr�"));
		archivio.addCD(new CD("Storia di un impiegato", "Fabrizio De Andr�"));
		assertFalse(archivio.hasCD("La buona novella"));
	}
	
	@Test
	public void testEliminazioneCdPerTitolo() throws Exception {
		final ArchiveCD archivio = new ArchiveCD();
		archivio.addCD(new CD("Anime salve", "Fabrizio De Andr�"));
		archivio.addCD(new CD("Storia di un impiegato", "Fabrizio De Andr�"));
		assertEquals(2, archivio.getArchiveLenght());
		archivio.deleteCD("Anime salve");
		assertEquals(1, archivio.getArchiveLenght());
		assertFalse(archivio.hasCD("Anime salve"));
	}
}
