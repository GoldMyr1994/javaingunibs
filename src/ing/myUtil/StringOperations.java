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
	
}
