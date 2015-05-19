package ing.olympicMedals;

import java.util.*;


public class CompetitionList {
	
	private Vector <Competition> elements;
	
	public CompetitionList(){
		elements = new Vector <Competition>();
	}
	
	
//	public String [] getType()
//	{
//	 String [] result = new String[elements.size()];
//	 for (int i = 0; i < result.length; i++)
//		{
//		  result[i] = elements.get(i).getType();
//		}
//		
//	 return result;
//	}
	

	public Competition get(int i) {
		return elements.get(i);
	}
	
	
	public void addCompetition(Competition n ){
		elements.add(n);
	}
	
	public int getLenght(){
		return elements.size();
	}
	
	
	public boolean alreadyExist(String competitionName){
		boolean result = false;
		if(elements.size()>0) {
		 for(Competition n : elements){
			 if(competitionName.equalsIgnoreCase(n.getType())) result = true;
		 }
		}
		return result;
	 }
	
	
	
	public boolean isEmpty(){
		boolean result = false;
		if(elements.size() == 0) result = true;
		return result;
	}
	
	@Override
	public String toString(){
		if(elements.size()>0) return String.format("\nCompetizioni:\n"+"%s \n", elements);
		else return String.format("\nNon ci sono ancora competizioni\n");
	}


}
