package ing.blog;

import ing.Person;

import java.time.LocalDate;

public class Post {
	
	private final String title;
	private final String permalink;
	private final Person author;
	private final String text;
	private final LocalDate date;
	
	public Post(String title, String permalink, Person author, String text) {
		this.title = title.toLowerCase();
		this.permalink = permalink; //NO OPERATION LOWERCASE
		this.author = author;
		this.text = text.toLowerCase();
		this.date = LocalDate.now();
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		char[] title = this.title.toCharArray();
		title[0] = Character.toUpperCase(title[0]);
		return new String(title);
	}

	/**
	 * @return the permalink
	 */
	public String getPermalink() {
		return permalink;
	}

	/**
	 * @return the authorName
	 */
	public Person getAuthor() {
		return author;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

}
