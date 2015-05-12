package ing.archiveCD;

import java.util.Vector;

/**
 * 
 * @author Mauro Conte
 * @version 1.3
 * @since 1.0
 * @see Track
 */
public class CD {

	private final String title;
	private final String author;
	private final Vector<Track> listTrack;
	
	/**
	 * <p><b>CD</b><p>
	 * <p><i style="margin-left:40px">public CD(String, String)</i></p>
	 * @param the title of the cd
	 * @param the author of the cd
	 */
	public CD(String title, String author) {
		this.title = title;
		this.author = author;
		this.listTrack = new Vector<Track>();
	}
	
	/**
	 * <p><b>CD</b><p>
	 * <p><i style="margin-left:40px">public CD(String, String, Vector<Track>)</i></p>
	 * @param the title of the cd
	 * @param the author of the cd
	 * @param listTrack in cd
	 */
	public CD(String title, String author, Vector<Track> listTrack) {
		this.title = title;
		this.author = author;
		this.listTrack = listTrack;
	}

	/**
	 * <p><b>getTitle</b><p>
	 * <p><i style="margin-left:40px">public getTitle()</i></p>
	 * @return the title of the CD
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <p><b>getAuthor</b><p>
	 * <p><i style="margin-left:40px">public getAuthor()</i></p>
	 * @return the author of the CD
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * <p><b>addTrack</b><p>
	 * <p><i style="margin-left:40px">public addTrack(Track)</i></p>
	 * @param t the track to add
	 * @return index of added track, -1 otherwise
	 */
	public int addTrack(Track t) {
		return listTrack.add(t)? listTrack.size()-1 : -1 ;
	}
	
	/**
	 * <p><b>selectRandomTrack</b><p>
	 * <p><i style="margin-left:40px">public selectRandomTrack()</i></p>
	 * @return a random track
	 */
	public Track selectRandomTrack() {
		int randomIndex = (int)(Math.random()*(listTrack.size()-1));
		return listTrack.size()>0 ? listTrack.get(randomIndex) : null;
	}
	
	/**
	 * <p><b>selectTrackByIndex</b><p>
	 * <p><i style="margin-left:40px">public selectTrackByIndex(int)</i></p>
	 * @param i
	 * @return the index -i track
	 */
	public Track selectTrackByIndex(int i) {
		Track foundedTrack = (listTrack.size()>=i)  ? listTrack.get(i) : null;
		return foundedTrack;
	}
	
	/**
	 * <p><b>selectTrackByTitle</b><p>
	 * <p><i style="margin-left:40px">public selectTrackByTitle(String)</i></p>
	 * @param t
	 * @return the title -t track
	 */
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
	
	/**
	 * <p><b>hasTitle</b><p>
	 * <p><i style="margin-left:40px">public hasTitle(String)</i></p>
	 * @param the required title
	 * @return true if title exits, false otherwise
	 */
	public boolean hasTitle(String title) {
		if(this.title.equals(title)) return true;
		else return false;
	}
	
	public int getLenght() {
		return listTrack.size();
	}

	@Override
	public String toString() {
		if(listTrack.size()>0) 	return String.format("%s - %s\n", getTitle(), getAuthor())+listTrackToString();
		else return String.format("%s - %s", getTitle(), getAuthor())+listTrackToString();
	}
	
	/**
	 * <p><b>selectTrackByTitle</b><p>
	 * <p><i style="margin-left:40px">public selectTrackByTitle(String)</i></p>
	 * @return string rapresenting a list of track
	 */
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
