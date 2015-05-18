package ing.olympicMedals.test;

import static org.junit.Assert.*;
import ing.olympicMedals.Competition;
import ing.olympicMedals.CompetitionList;

import org.junit.Test;

public class ElencoGareTest {
	@Test
	public void testAggiuntaGara() throws Exception {
		final CompetitionList gare = new CompetitionList();
		gare.addCompetition(new Competition(3,"Lancio del peso"));
		gare.addCompetition(new Competition(3,"100MT piani"));
		assertEquals(2, gare.getLenght());
	}
	
	@Test
	public void testRicercaGaraPresente() throws Exception {
		final CompetitionList gare = new CompetitionList();
		gare.addCompetition(new Competition(3,"Lancio del peso"));
		gare.addCompetition(new Competition(3,"100MT piani"));
		assertTrue(gare.alreadyExist("Lancio del peso"));
	}
	
	@Test
	public void testRicercaGaraNonPresente() throws Exception {
		final CompetitionList gare = new CompetitionList();
		gare.addCompetition(new Competition(3,"Lancio del peso"));
		gare.addCompetition(new Competition(3,"100MT piani"));
		assertFalse(gare.alreadyExist("Lancio del martello"));
	}
}
