package ing.olympicMedals;

import java.util.*;

public class NationList {
	
	private Vector<Nation> elements;
	
	public NationList(){
		elements = new Vector<Nation>();
	}
	
	public Nation get(int i) {
		return elements.get(i);
	}
	
	
	public void addNation(Nation n){
		elements.addElement(n);
	}
	
	public int getLenght(){
		return elements.size();
	}
	
	
	public boolean isEmpty(){
		boolean result = false;
		if(elements.size() == 0) result = true;
		return result;
	}
	
	 
	public boolean alreadyExist(String nationName){
		boolean result = false;
		 for(Nation n : elements){
			 if(nationName.equalsIgnoreCase(n.getNation())) result = true;
		 }return result;
	 }

}
