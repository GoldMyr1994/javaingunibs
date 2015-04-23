package ing.myUtil;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class ReaderInputTest {
	
	@Test
	public void testReadInt() {
		ByteArrayInputStream in = new ByteArrayInputStream(("12"+System.getProperty("line.separator")).getBytes());
		System.setIn(in);
		assertEquals(ReaderInput.readInt(), 12);
	}

	@Test
	public void testReadDouble() {
		ByteArrayInputStream in = new ByteArrayInputStream(("12,13"+System.getProperty("line.separator")).getBytes());
		System.setIn(in);
		assertEquals(ReaderInput.readDouble(), 12.13, 0.001);
	}

	@Test
	public void testReadWord() {
		ByteArrayInputStream in = new ByteArrayInputStream(("ciao a tutti quanti"+System.getProperty("line.separator")).getBytes());
		System.setIn(in);
		assertEquals(ReaderInput.readWord(), "ciao");

	}

	@Test
	public void testReadLine() {
		ByteArrayInputStream in = new ByteArrayInputStream(("ciao a tutti quanti"+System.getProperty("line.separator")).getBytes());
		System.setIn(in);
		assertEquals(ReaderInput.readLine(), "ciao a tutti quanti");
	}

}
