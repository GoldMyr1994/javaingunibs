/**
 * 
 */
package ing.olympicMedals;

import java.util.Vector;

import ing.myUtil.ReaderInput;
import ing.myUtil.StdMenu;


/**
 * @author Mauro Conte
 * @version 1.0.0
 * @since   1.0.0
 *
 */
public class OlympicMedalsMain {

	private final static String TITLE = "PODIO OLIMPICO.";
	private final static String EXIT_MSG = "PODIO OLIMPICO EXIT.";
	private final static String OPT_ADD_NATION = "Aggiungere una nazione ";
	private final static String OPT_ADD_COMPETITION = "Aggiungere una gara ";
	private final static String OPT_SET_PODIUM = "Assegnare un podio ";
	private final static String OPT_LOG_NATIONS = "Visualizza lista nazioni ";
	private final static String OPT_LOG_COMPETITIONS = "Visualizza lista gare ";
	private final static String OPT_LOG_RESULT = "Visualizza risultati ";
	private final static String GET_NATION = "Inserire il nome di una nazione ";
	private final static String GET_COMPETITION = "Inserire il nome di una gara ";
	private final static String ERROR_CHOOSE = "La scelata %d non esiste nel menu ";
	private final static int PODIUM_LENGHT = 3;
	
	private static NationList listN;
	private static CompetitionList listC;
	private static StdMenu menu;
	
	
	/**
	 * main
	 * public static void main(String[])
	 * @param args
	 */
	public static void main(String[] args) {
		listN = new NationList();
		listC = new CompetitionList();
		menu = new StdMenu(	TITLE					, 
							OPT_ADD_NATION			,
							OPT_ADD_COMPETITION		,
							OPT_SET_PODIUM			,
							OPT_LOG_NATIONS			,
							OPT_LOG_COMPETITIONS	,
							OPT_LOG_RESULT			);
		int choose;
		
		do{
			System.out.println(menu.toString());
			choose = menu.waitChoose();
			
			switch (choose) {
				case 1:
					getNation();
					break;
				case 2:
					getCompetition();
					break;
				case 3:
					System.out.println(OPT_SET_PODIUM);
					String compName;
					do {
						compName = ReaderInput.readLine(GET_COMPETITION);
					} while(!listC.alreadyExist(compName));
					Competition c = listC.get(compName);
					for(int i = 0; i<PODIUM_LENGHT; i++) {
						String natName;
						do {
							natName = ReaderInput.readLine(GET_NATION +" per la posizione "+(i+1));
						} while(!listN.alreadyExist(natName));
						Nation theNat = listN.get(natName);
						c.setPodiumN(theNat, i);
						switch (i) {
						case 0:
							theNat.addGold();
							break;
						case 1:
							theNat.addSilver();
							break;
						case 2:
							theNat.addBronze();
							break;
						}
					}
					break;
				case 4:
					System.out.println(OPT_LOG_NATIONS);
					System.out.println(listN.toString());
					break;
				case 5:
					System.out.println(OPT_LOG_COMPETITIONS);
					System.out.println(listC.toString());
					break;
				case 6:
					System.out.println(OPT_LOG_RESULT);
					logResult();
					break;
				case 0:
					System.out.println(EXIT_MSG);
					break;
					
				default:
					System.out.println(String.format(ERROR_CHOOSE, choose));
					
					break;
			}
		} while (choose != 0);
	}
	
	private static void getNation() {
		System.out.println(OPT_ADD_NATION);
		String natName;
		do {
			natName = ReaderInput.readLine(GET_NATION);
		} while(listN.alreadyExist(natName));
		listN.addNation(new Nation(natName));
	}
	
	private static void getCompetition() {
		System.out.println(OPT_ADD_COMPETITION);
		String cmpName;
		do {
			cmpName = ReaderInput.readLine(GET_COMPETITION);
		} while(listC.alreadyExist(cmpName));
		listC.addCompetition(new Competition(PODIUM_LENGHT, cmpName));
	}
	
	private static void logResult() {
		
		String format = "     __ %-10s + %10d - %10d - %10d\n";
		Nation[] nl = new Nation[listN.getLenght()];
		for(int i=0; i<listN.getLenght(); i++) {
			nl[i] = listN.get(i);
		}
		
		boolean change = true;
		while(change){
			change = false;
			for(int i=0; i<nl.length-1; i++) {
				if(nl[i].getScore() < nl[i+1].getScore()) {
					Nation tmp = nl[i];
					nl[i] = nl[i+1];
					nl[i+1] = tmp;
					change = true;
				}
			}
		}
		for (Nation nation : nl) {
			System.out.print(String.format(format, nation.getNation(), nation.getGold(), nation.getSilver(), nation.getBronze()));
		}
	}

}