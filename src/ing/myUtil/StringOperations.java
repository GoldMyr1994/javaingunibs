 package ing.myUtil;

public class StringOperations {
	
	/**
	 * StringOperations is non-instantiable 
	 */
	private StringOperations() {}; 
	
	public static String CapitalizeFirstLetter(char[] txt) {
		txt[0] = Character.toUpperCase(txt[0]);
		return new String(txt);
	}
	
	public static String CapitalizeFirstLetter(String txt) {
		char[] toCapitalize = txt.toCharArray();
		return StringOperations.CapitalizeFirstLetter(toCapitalize);
	}
	
	/**
	 * 
	 * @param txt the text to capitalize
	 * @return capitalized text
	 */
	public static String CapitalizeFirstLetterOfEachWord(String txt) {
		String compiledTxt = "";
		// TODO usa system get space
		String[] splittedTxt = txt.split(" ");
		int i = 0;
		for (String word : splittedTxt) {
			if (i == 0)
				compiledTxt += CapitalizeFirstLetter(word);
			else
				compiledTxt += " " + CapitalizeFirstLetter(word);
			i++;
		}

		return compiledTxt;
	}
}
