package ing.olympicMedals.test;

import static org.junit.Assert.*;
import ing.olympicMedals.Competition;
import ing.olympicMedals.Nation;

import org.junit.Test;

public class GaraTest {
	private static final String NOME = "salto in lungo";
	private static final int NUMMEDAGLIE = 3;
	
	@Test
	public void testGaraNonEseguita() throws Exception {
		final Competition gara = new Competition(NUMMEDAGLIE,NOME);
		assertFalse(gara.isReady());
	}
	
	@Test
	public void testGaraEseguita() throws Exception {
		final Competition gara = new Competition(NUMMEDAGLIE,NOME);
		final Nation[] nazioniPremiate = {new Nation("Italia"),new Nation("Spagna"),new Nation("Giappone")};
		for(int i=0; i<NUMMEDAGLIE; i++){
			gara.setPodiumN(nazioniPremiate[i], i);
		}
		assertTrue(gara.isReady());
	}
	
	@Test
	public void testGaraNazionePremiata() throws Exception {
		final Competition gara = new Competition(NUMMEDAGLIE,NOME);
		final Nation[] nazioniPremiate = {new Nation("Italia"),new Nation("Spagna"),new Nation("Giappone")};
		for(int i=0; i<NUMMEDAGLIE; i++){
			gara.setPodiumN(nazioniPremiate[i], i);
		}
		assertEquals(nazioniPremiate[0],gara.getPodiumN(0));
	}
	
}
