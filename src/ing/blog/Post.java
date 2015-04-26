package ing.blog;

import ing.Person;
import ing.myUtil.StringOperations;

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
		this.text = text;
		this.date = LocalDate.now();
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return StringOperations.CapitalizeFirstLetter(this.title);
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
		return StringOperations.CapitalizeFirstLetter(this.text);
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new String(	title + " di("+ getAuthor().getFirstName() + " "+ getAuthor().getLastName()+")   " 
							+ getText() +"- publicato il "+ date.toString());
	}

}
