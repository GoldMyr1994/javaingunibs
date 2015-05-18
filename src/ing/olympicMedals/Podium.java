package ing.olympicMedals;

public class Podium {

	private final int lenght;
	private Nation[] podium;

	public Podium(int lenght) {
		this.lenght = lenght;
		this.podium = new Nation[this.lenght];
	}
	
	public boolean isReady() {
		boolean result = true;
		for(int i = 0 ; i < lenght; i++){
			if(podium[i] == null) result = false;
		}
		return result;
	}
	
	/**
	 * @return the podium
	 */
	public Nation getPodiumN(int i) {
		return podium[i];
	}

	/**
	 * @param podium the podium to set
	 */
	public void setPodiumN(Nation n, int i) {
		this.podium[i] = n;
	}
}
