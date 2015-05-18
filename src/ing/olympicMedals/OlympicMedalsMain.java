/**
 * 
 */
package ing.olympicMedals;

import ing.myUtil.MyMenu;

/**
 * @author Mauro Conte
 * @version 1.0.0
 * @since   1.0.0
 *
 */
public class OlympicMedalsMain {

	private final static String TITLE = "PODIO OLIMPICO.";
	private final static String OPT_ADD_NATION = "Aggiungere una nazione ";
	private final static String OPT_ADD_COMPETITION = "Aggiungere una nazione ";
	private final static String OPT_SET_PODIUM = "Assegnare un podio ";
	private final static String GET_NATION = "Inserire il nome di una nazione ";
	private final static String GET_COMPETITION = "Inserire il nome di una gara ";
	private final static String ERROR_CHOOSE = "La scelata %d non esiste nel menu ";
	
	private static MyMenu menu;
	
	
	/**
	 * main
	 * public static void main(String[])
	 * @param args
	 */
	public static void main(String[] args) {
		menu = new MyMenu(TITLE, OPT_ADD_NATION,OPT_ADD_COMPETITION,OPT_SET_PODIUM);
		int choose;
		
		do{
			choose = menu.scegli();
			
			switch (choose) {
				case 1:
					System.out.println(OPT_ADD_NATION);
					break;
				case 2:
					System.out.println(OPT_ADD_COMPETITION);
					break;
				case 3:
					System.out.println(OPT_SET_PODIUM);
					break;
				case 0:
					break;
					
				default:
					System.out.println(String.format(ERROR_CHOOSE, choose));
					break;
			}
		} while (choose != 0);
	}

}
