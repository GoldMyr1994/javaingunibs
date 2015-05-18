package ing.olympicMedals.test;

import static org.junit.Assert.*;
import ing.olympicMedals.Nation;
import ing.olympicMedals.NationList;

import org.junit.Test;

public class ElencoNazioniTest {
	@Test
	public void testAggiuntaNazione() throws Exception {
		final NationList nazioni = new NationList();
		nazioni.addNation(new Nation("Italia"));
		nazioni.addNation(new Nation("Spagna"));
		nazioni.addNation(new Nation("Giappone"));
		assertEquals(3, nazioni.getLenght());
	}
	
	@Test
	public void testRicercaNazionePresente() throws Exception {
		final NationList nazioni = new NationList();
		nazioni.addNation(new Nation("Italia"));
		nazioni.addNation(new Nation("Spagna"));
		nazioni.addNation(new Nation("Giappone"));
		assertTrue(nazioni.alreadyExist("Spagna"));
	}
	
	@Test
	public void testRicercaNazioneNonPresente() throws Exception {
		final NationList nazioni = new NationList();
		nazioni.addNation(new Nation("Italia"));
		nazioni.addNation(new Nation("Spagna"));
		nazioni.addNation(new Nation("Giappone"));
		assertFalse(nazioni.alreadyExist("Olanda"));
	}
}
