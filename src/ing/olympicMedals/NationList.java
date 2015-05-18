package ing.olympicMedals;
import java.util.*;

public class NationList {
	
	private Vector<Nation> elements;
	
	public NationList(){
		elements = new Vector<Nation>();
	}
	
	
	public void addNation(Nation n){
		elements.addElement(n);
	}
	
	
	public boolean isEmpty(){
		boolean result = false;
		if(elements.size() == 0) result = true;
		return result;
	}
	
	 
	public boolean alreadyExist(String nationName){
		boolean result = false;
		 for(Nation n : elements){
			 if(nationName.equals(n.getNation())) result = true;
		 }return result;
	 }

}
