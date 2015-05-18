package ing.olympicMedals;


public class Competition {
	
	private final String type;
	private final String FORMAT_TO_STRING = " %s ";
	
	private int lenght;
	private Nation[] podium;	
	
	
	
	public Competition (int lenght, String type) {
		this.lenght = lenght;
		this.podium = new Nation[this.lenght];
		this.type = type;
	}
	
	
	
	public boolean isReady() {
		boolean result = true;
		for(int i = 0 ; i < lenght; i++){
			if(podium[i] == null) result = false;
		}
		return result;
	}
	
	
	public String getType(){
		return type;
	}
	
	
	public Nation getPodiumN(int i) {
		return podium[i];
	}
	
	
	public void setPodiumN(Nation n, int i) {
		this.podium[i] = n;
	}
	
	
	@Override
	public String toString() {
		return String.format(FORMAT_TO_STRING,getType());
	}



}

