package ing.archiveCD;

import ing.myUtil.Math;
import ing.myUtil.StringOperations;

/**
 * 
 * @author 		Mauro Conte
 * @version  	1.1
 * @since  		1.0
 * @see			ing.myUtil.ReaderInput
 */
public class Track {

	private final String title;
	private final double lenght;

	/**
	 * 
	 * @param title of the track
	 * @param lenght of the track in seconds 
	 */
	public Track(String title, double lenght) {
		this.title = title.toLowerCase();
		this.lenght = lenght;
	}

	/**
	 * @return the title of the track, first letter uppercase
	 */
	public String getTitle() {
		return StringOperations.CapitalizeFirstLetter(title);
	}

	/**
	 * @return the lenght of the track
	 */
	public double getLenght() {
		return lenght;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		//return "Track [title=" + getTitle() + ", lenght=" + lenght + "]";
		return String.format("Track [title=" + getTitle() + ", lenght=%2."+Math.countDecimalPosition(lenght)+"f]", lenght);
	}

}
