package ing.archiveCD;

import java.util.Vector;

public class CD {

	private final String title;
	private final String author;
	private final Vector<Track> listTrack;
	
	public CD(String title, String author) {
		//this.title = title.toLowerCase();
		this.title = title;
		//this.author = author.toLowerCase();
		this.author = author;
		this.listTrack = new Vector<Track>();
	}
	
	public CD(String title, String author, Vector<Track> listTrack) {
		//this.title = title.toLowerCase();
		this.title = title;
		//this.author = author.toLowerCase();
		this.author = author;
		this.listTrack = listTrack;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	
	public int addTrack(Track t) {
		return listTrack.add(t)? listTrack.size()-1 : -1 ;
	}
	
	public Track selectRandomTrack() {
		return listTrack.size()>0 ? listTrack.get((int)(Math.random()*(listTrack.size()-1))) : null;
	}
	
	public Track selectTrackByIndex(int i) {
		Track foundedTrack = listTrack.size()>0 ? listTrack.get(i) : null;
		return foundedTrack;
	}
	
	public Track selectTrackByTitle(String t) {
		Track foundedTrack = null;
		String titleToFind = t.toLowerCase();
		for(Track currentTrack : listTrack) {
			if(currentTrack.getTitle().equals(titleToFind)) {
				foundedTrack = currentTrack;
				break;
			}
		}
		return foundedTrack;
	}
	
	public boolean hasTitle(String title) {
		if(this.title.equals(title)) return true;
		else return false;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		//TODO vedi il tostring del list track
		//Anime salve - Fabrizio De André\nAnime salve [05:52]\nLe acciughe fanno il pallone [04:47]\nSmisurata preghiera [07:08]
		if(listTrack.size()>0) 	return String.format("%s - %s\n", getTitle(), getAuthor())+listTrackToString();
		else return String.format("%s - %s", getTitle(), getAuthor())+listTrackToString();
	}
	
	public String listTrackToString() {
		String str = "" ;
		int i = 0;
		for(Track curr : this.listTrack) {
			str += i==0?curr.toString():"\n"+curr.toString();
			i++;
		}
		return str;
	}
	
}
