package ing.olympicMedals;

/**
 * 
 * @author Tommaso Fanelli
 * @version 1.0.0
 * @since   1.0.0
 *
 */
public class Competition {
	
	private final String type;
	private int lenght;
	private Nation[] podium;	
	
	/**
	 * 
	 * @param the lenght of podium
	 * @param the type of competition
	 */
	public Competition (int lenght, String type) {
		this.lenght = lenght;
		this.podium = new Nation[this.lenght];
		this.type = type;
	}
	
	/**
	 * 
	 * @return true if the podium is assigned
	 */
	public boolean isReady() {
		boolean result = true;
		for(int i = 0 ; i < lenght; i++){
			if(podium[i] == null) result = false;
		}
		return result;
	}
	
	/**
	 * 
	 * @return the type of the competition
	 */
	public String getType(){
		return type;
	}
	
	/**
	 * 
	 * @param i postation to get
	 * @return the nation in -i position
	 */
	public Nation getPodiumN(int i) {
		return podium[i];
	}
	
	/**
	 * 
	 * @param n the nation to set
	 * @param i the position
	 */
	public void setPodiumN(Nation n, int i) {
		this.podium[i] = n;
	}
	
	
	@Override
	public String toString() {
		return getType();
	}



}

