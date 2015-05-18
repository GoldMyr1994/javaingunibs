package ing.olympicMedals;

/**
 * 
 * @author Tommaso Fanelli
 * @version 1.0
 * @since 1.0
 *
 */

public class Nation {
	
	

	private final String nation;
	private final String FORMAT_TO_STRING = " %s ";
	
	
	
	public Nation (String nation){
		this.nation = nation;
	}
	
	
	
	public String getNation(){
		return nation;
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format( FORMAT_TO_STRING , getNation());
    }

	
	
}