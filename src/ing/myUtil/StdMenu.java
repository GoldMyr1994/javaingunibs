/**
 * 
 */
package ing.myUtil;

/**
 * @author Mauro Conte
 * @version 1.0.0
 * @since   1.0.0
 */
public class StdMenu {

	private static final String FORMAT_OPTIONS_COIHE = "%d - %s";
	
	private final String FRAME = "===========================================";
	private final String REQ_DATA = "Digita il numero dell'opzione desiderata => ";
	
	private final String DEFAULT_EXIT_TXT = "Esci";
	private final int DEFAULT_EXIT_SELCT = 0;
	
	private final String title;
	private final String[] option;
	
	/**
	 * 
	 * @param title of the menu
	 * @param options list in the menu
	 */
	public StdMenu(String title, String ... options) {
		this.title = title;
		this.option = options;
	}
	
	/**
	 * 
	 * @return the selected option
	 */
	public int waitChoose() {
		return ReaderInput.readIntBetween(REQ_DATA, 0, this.option.length);
	}
	
	@Override
	public String toString() {
		String toString = "";
		toString += FRAME;
		toString += System.getProperty("line.separator");
		toString += title;
		toString += System.getProperty("line.separator");
		
		for(int i=0; i<this.option.length; i++) {
			toString += String.format(FORMAT_OPTIONS_COIHE, i, this.option[i]);
			toString += System.getProperty("line.separator");
		}
		toString += System.getProperty("line.separator");
		toString += String.format(FORMAT_OPTIONS_COIHE, DEFAULT_EXIT_SELCT, DEFAULT_EXIT_TXT);
		toString += System.getProperty("line.separator");
		return toString;
	}
}
