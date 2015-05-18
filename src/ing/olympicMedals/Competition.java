package ing.olympicMedals;

import java.util.Vector;


public class Competition extends Podium {
	
	private static int N_POSITION = 3;
	private final String type;
	private final String FORMAT_TO_STRING = " %s ";
	
	
	public Competition (String type){
		super(N_POSITION);
		this.type = type;
	}
	
	public Competition (String type, Vector<Nation> podium){
		super(N_POSITION);
		this.type = type;
	}

	public String getType(){
		return type;
	}
	
	
	@Override
	public String toString() {
		return String.format(FORMAT_TO_STRING,getType());
	}



}

