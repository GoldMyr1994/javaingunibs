/**
 * 
 */
package ing.olympicMedals;

import java.util.Vector;

import ing.myUtil.MyMenu;
import ing.myUtil.ReaderInput;


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
	private static MyMenu menu;
	
	
	/**
	 * main
	 * public static void main(String[])
	 * @param args
	 */
	public static void main(String[] args) {
		listN = new NationList();
		listC = new CompetitionList();
		menu = new MyMenu(	TITLE					, 
							OPT_ADD_NATION			,
							OPT_ADD_COMPETITION		,
							OPT_SET_PODIUM			,
							OPT_LOG_NATIONS			,
							OPT_LOG_COMPETITIONS	,
							OPT_LOG_RESULT			);
		int choose;
		
		do{
			choose = menu.scegli();
			
			switch (choose) {
				case 1:
					getNation();
					break;
				case 2:
					getCompetition();
					break;
				case 3:
					System.out.println(OPT_SET_PODIUM);
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
		double VAL_ORO = 1000;
		double VAL_ARG = 10;
		double VAL_BRO = 0.1;
		
		Vector<Nation> a = new Vector<Nation>();
		Vector<Double> b = new Vector<Double>();
		
		Nation tmpN;
		int i,j;
		
		for(i=0; i<listN.getLenght(); i++) {
			
			tmpN = listN.get(i);
			a.add(tmpN);
			
			for(j=0; j<listC.getLenght(); j++) {
				Competition tmp = listC.get(j);
				if(tmp.getPodiumN(0) == tmpN) {
					if(b.size() < i+1) b.add(0,0.0);
					b.set(i,b.get(i)+VAL_ORO);
				} 
				if(tmp.getPodiumN(1) == tmpN) {
					if(b.size() < i+1) b.add(0,0.0);
					b.set(i,b.get(i)+VAL_ARG);
				} 
				if(tmp.getPodiumN(2) == tmpN) {
					if(b.size() < i+1) b.add(0,0.0);
					b.set(i,b.get(i)+VAL_BRO);
				} 
			}
		}
		
		
		
	}

}