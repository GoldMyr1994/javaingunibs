package ing.olympicMedals.test;

import static org.junit.Assert.assertTrue;
import ing.olympicMedals.Nation;

import org.junit.Test;

public class NazioneTest {
	
	@Test
	public void testNazioneMeglioDi() throws Exception {
		final Nation nazione = new Nation("Italia");
		final Nation altraNazione = new Nation("Spagna");
		nazione.addGold();//ORO
		nazione.addSilver();//ARGENTO
		altraNazione.addGold();//ORO
		altraNazione.addBronze();//BRONZO
		assertTrue(nazione.medalsBetterThan(altraNazione));
	}
	
}
