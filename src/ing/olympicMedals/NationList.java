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
	
	public Nation get(String name) {
		Nation nation = null;
		for (Nation n : elements) {
			if(n.getNation().equalsIgnoreCase(name)) nation = n;
		}
		return nation;
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
		if(elements.size() > 0) {
		 for(Nation n : elements){
			 if(nationName.equalsIgnoreCase(n.getNation())) result = true;
		 }
		}
		return result;
	 }
	
	
	@Override
	public String toString(){
		String format = "- %s \n";
		String toString = "Nazioni:\n";
		for (Nation nation : elements) {
			toString += String.format(format, nation.toString());
		}
		
		return toString;
		
//		if(elements.size()>0) return String.format("\nNazioni:\n"+"%s \n", elements);
//		else return String.format("\nNon ci sono ancora nazioni\n");
	}

}
