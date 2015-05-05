package ing.archiveCD;

import ing.myUtil.StringOperations;

import java.util.Vector;


public class CD {

	private final String title;
	private final String author;
	private final Vector<Track> listTrack;
	
	public CD(String title, String author) {
		this.title = title.toLowerCase();
		this.author = author.toLowerCase();
		this.listTrack = new Vector<Track>();
	}
	
	public CD(String title, String author, Vector<Track> listTrack) {
		this.title = title.toLowerCase();
		this.author = author.toLowerCase();
		this.listTrack = listTrack;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return StringOperations.CapitalizeFirstLetter(title);
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return StringOperations.CapitalizeFirstLetter(author);
	}
	
	public void addTrack(Track t) {
		listTrack.add(t);
	}
	
	public String selectRandomTrack() {
		return listTrack.size()>0 ? listTrack.get((int)Math.random()*(listTrack.size()-1)).toString() : "";
	}
	
	public String selectTrackByIndex(int i) {
		String foundedTrack = listTrack.size()>0 ? listTrack.get(i).toString() : "";
		return foundedTrack;
	}
	
	public String selectTrackByTitle(String t) {
		String foundedTrack = "";
		String titleToFind = StringOperations.CapitalizeFirstLetter(t.toLowerCase());
		for(Track currentTrack : listTrack) {
			if(currentTrack.getTitle().equals(titleToFind)) {
				foundedTrack = currentTrack.toString();
				break;
			}
		}
		return foundedTrack;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		//TODO vedi il tostring del list track
		return "CD [title=" + getTitle() + ", author=" + getAuthor() + ", listTrack=" + listTrack.toString() + "]";
	}
	
}
