package ing.blog;

import static org.junit.Assert.*;
import ing.Person;

import org.junit.Test;

public class PostTest {
	Person i = new Person("mauro","conte",1994,7,2,Person.Gender.MALE);
	Post aPost = new Post("A","B.html",i,"bla bla bla figurati te il JavaDoc");

	//HOW TO TEST GET TIME?????
	
	@Test
	public void testGetTitle() {
		assertEquals("A",aPost.getTitle());
	}
	
	@Test
	public void testGetPermalinlk() {
		assertEquals("B.html",aPost.getPermalink());
	}

	@Test
	public void testGetAuthor() {
		String itos = new Person("mauro","conte",1994,7,2,Person.Gender.MALE).toString();
		assertEquals(itos,aPost.getAuthor().toString());
	}
	
	@Test
	public void testGetText() {
		assertEquals("Bla bla bla figurati te il JavaDoc",aPost.getText());
	}
	
	
}
