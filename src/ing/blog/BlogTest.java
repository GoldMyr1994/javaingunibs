package ing.blog;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlogTest {
	
	Blog myBlog = new Blog("bel blog del cazzo","http://goldmyr.co");

	@Test
	public void testGetName() {
		assertEquals("Bel blog del cazzo", myBlog.getName());
	}

	@Test
	public void testGetUrl() {
		assertEquals("http://goldmyr.co", myBlog.getUrl());
	}

}
