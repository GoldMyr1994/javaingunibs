package ing.archiveCD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrackTest {

	private Track[] TrackNum;
	private final String TRACK_TO_STRING = "Track [title=desaparecido, min=3, sec=47]";
	
	@Before
	public void setUp() {
		TrackNum = new Track[3];
		TrackNum[0] = new Track("Desaparecido", 3.47);
		TrackNum[1] = new Track("Desaparecido", 3, 47);
		TrackNum[2] = new Track("Desaparecido", 227);
	}
	
	@Test
	public void testGetLenght() {
		double[] expected = {3.47,3.47,3.47};
		double[] actual = new double[3];
		int i=0;
		for(Track t : TrackNum) {
			actual[i] = t.getLenght();
			i++;
		}

		assertArrayEquals(expected, actual, Math.pow(10, 9));
	}
	
	@Test
	public void testToString() {
		String[] expected = {TRACK_TO_STRING,TRACK_TO_STRING,TRACK_TO_STRING,};
		String[] actual = new String[3];
		int i=0;
		for(Track t : TrackNum) {
			actual[i] = t.toString();
			i++;
		}
		assertArrayEquals(expected, actual);
	}

}
