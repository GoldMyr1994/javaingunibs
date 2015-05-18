package ing.olympicMedals;

import java.util.*;

public class CompetitionList {
	
	private Vector <Competition> elements;
	
	public CompetitionList(){
		elements = new Vector <Competition>();
	}
	
	
	public String [] getType()
	{
	 String [] result = new String[elements.size()];
	 for (int i = 0; i < result.length; i++)
		{
		  result[i] = elements.get(i).getType();
		}
		
	 return result;
	}
	
	
	public void addCompetition(Competition n ){
		elements.addElement(n);
	}
	
	public boolean isEmpty(){
		boolean result = false;
		if(elements.size() == 0) result = true;
		return result;
	}

}
