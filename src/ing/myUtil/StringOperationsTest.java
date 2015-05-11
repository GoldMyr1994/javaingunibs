package ing.myUtil;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringOperationsTest {
	
	@Test
	public void testCapitalizeFirstLetter() {
		String[] arrayStrings = new String[]{"ciao", "Ciao", "ciao ciao", "CIAO"};
		String[] expected = new String[]{"Ciao", "Ciao", "Ciao ciao", "CIAO"};
		String[] actual = new String[4];
		int i = 0;
		for(String s : arrayStrings) {
			actual[i] = StringOperations.CapitalizeFirstLetter(s);
			i++;
		}
		assertArrayEquals(expected,actual);
	}
	
	@Test
	public void testCapitalizeFirstLetterOfEachWord() {
		String expected = "Ciao Io Sono Molto Bello E Tommy Fa Un Figo.";
		String actual = "ciao io sono molto bello e tommy fa un figo.";
		assertEquals(expected,StringOperations.CapitalizeFirstLetterOfEachWord(actual));
	}

}
