package ing.archiveCD;

/**
 * 
 * @author 		Mauro Conte
 * @version  	1.2
 * @since  		1.0
 */
public class Track {
	
	private final String FORMAT_TO_STRING = "%s [%02d:%02d]";
	private final int INT_TO_DOUBLE_POSITION = 100;
	private final int SEC_PER_MIN = 60;
	
	private final String title;
	private final int min;
	private final int sec;

	/**
	 * <p><b>Track</b><p>
	 * <p><i style="margin-left:40px">public Track(String, double)</i></p>
	 * @param title of the track
	 * @param lenght of the track in minutes 
	 */
	public Track(String title, double lenghtInMin) {
		//this.title = title.toLowerCase();
		this.title = title;
		this.min = new Double(lenghtInMin).intValue();
		this.sec = (int)(Math.round(lenghtInMin*INT_TO_DOUBLE_POSITION) - min*INT_TO_DOUBLE_POSITION);
	}
	
	/**
	 * <p><b>Track</b><p>
	 * <p><i style="margin-left:40px">public Track(String, int, int)</i></p>
	 * @param title of the track
	 * @param min of the track
	 * @param sec of the track
	 */
	public Track(String title, int min, int sec) {
		//this.title = title.toLowerCase();
		this.title = title;
		this.min = min;
		this.sec = sec;
	}
	
	/**
	 * <p><b>Track</b><p>
	 * <p><i style="margin-left:40px">public Track(String, int)</i></p>
	 * @param title of the track
	 * @param lenghtInSec the lenght of the track in seconds
	 */
	public Track(String title, int lenghtInSec) {
		//this.title = title.toLowerCase();
		this.title = title;
		this.min = lenghtInSec/SEC_PER_MIN;
		this.sec = lenghtInSec%SEC_PER_MIN;
	}
	
	/**
	 * <p><b>getTitle</b><p>
	 * <p><i style="margin-left:40px">public String getTitle()</i></p>
	 * @return the title of the track
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * <p><b>getLenght</b><p>
	 * <p><i style="margin-left:40px">public double getLenght()</i></p>
	 * @return the lenght of the track
	 */
	public double getLenght() {
		return this.min+(double)this.sec/INT_TO_DOUBLE_POSITION;
	}


	@Override
	public String toString() {
		return String.format(FORMAT_TO_STRING, getTitle(), min, sec);
	}

}
