package ing.archiveCD;

import ing.myUtil.MyMenu;
import ing.myUtil.ReaderInput;

public class AchiveCDMain {

	private static final String WELCOME_MESSAGE = "Benvenuto nel tuo archivio CD";
	private static final String GET_USER_NAME = "Inserisci il nome dell'utente: ";
	private static final String ARCHIVE_OWNER = "Archivio CD di ";

	private static final String CREATE_NEW_CD = "Crea un nuovo CD";
	private static final String SEE_CD = "Visualizza un CD";
	private static final String REMOVE_CD = "Rimuovi un CD";
	private static final String SEE_ENTIRE_COLLECTION = "Visualizza l'intera collezione";
	private static final String SELECT_RANDOM_TRAK = "Visualizza un brano casuale";

	private static final String WRITE_CD_NAME = "Inserisci il nome del CD: ";
	private static final String WRITE_AUTHOR_NAME = "Inserisci il nome dell'autore: ";
	private static final String NEW_TRACK = "Vuoi agiungere un nuovo brano? (y/n) ";
	
	private static final String WRITE_TRACK_NAME = "Inserisci il nome della traccia: ";
	private static final String GET_MIN_TRACK = "Inserisci i minuti del brano: ";
	private static final String GET_SEC_TRACK = "Inserisci i secondi del brano: ";
	
	private static final String WRITE_CD_TO_SEE = "Inserisci il nome del CD da visualizzare: ";
	
	private static final String WRITE_CD_TO_DELETE = "Inserisci il nome del CD da eliminare ";
	private static final String CONFIRM_DELETE = "Sei sicuro di voler eliminare questo CD? (y/n) ";
	private static final String DELETED = "Il CD selezionato è stato eliminato";
	
	private static ArchiveCD myarchive;

	public static void main(String[] args) {
		
		System.out.println(WELCOME_MESSAGE);
		String name = ReaderInput.readLine(GET_USER_NAME);
		
		int _menu;
		
		 String [] voci = {CREATE_NEW_CD,SEE_CD,REMOVE_CD,SEE_ENTIRE_COLLECTION,SELECT_RANDOM_TRAK};
		 MyMenu menu = new MyMenu (ARCHIVE_OWNER +name, voci);
		 myarchive = new ArchiveCD();       
			  
			
	   do{     
	      _menu = menu.scegli();


	        
	switch (_menu){
	  
	  case 1: 
		  CD theNewCD = askForACd();
		  myarchive.addCD(theNewCD);
	     break;
	  
	  
	  case 2:
		   System.out.println("\n\n"+ myarchive.selectCD(ReaderInput.readLine(WRITE_CD_TO_SEE)).toString()+"\n\n");
		   break;
	
	 
	  case 3:
		 char a; 
		 String title;
		 
		 title = ReaderInput.readLine(WRITE_CD_TO_DELETE);
		 a = ReaderInput.readLine(CONFIRM_DELETE).toLowerCase().charAt(0);
		if (a != 'n' ){
		  myarchive.deleteCD(title);
		  System.out.println("\n\n"+DELETED+"\n\n\n");
		}
		  break;
	  
	  
	  case 4 :
		  System.out.println("\n\n"+myarchive.toString()+"\n\n");
		  break;
	 
	 
	  case 5 :
		Track aTrack =   myarchive.selectRandomTrack();
		  if (aTrack!=null) System.out.println(aTrack.toString());
		  
		  break;

	 
	  case 0 :
		  break;
		   
	   }
	         
	 } while(_menu!=0);
  }

	private static CD askForACd() {
		CD cd;
		String t, a;
		t = ReaderInput.readLine(WRITE_CD_NAME);
		a = ReaderInput.readLine(WRITE_AUTHOR_NAME);
		cd = new CD(t, a);

		Character choose = ReaderInput.readLine(NEW_TRACK).toLowerCase().charAt(0);
		while (choose != 'n') {
			cd.addTrack(askForATrack());
			choose = ReaderInput.readLine(NEW_TRACK).toLowerCase().charAt(0);
		}

		return cd;
	}

	private static Track askForATrack() {

		Track track;
		String t;
		int m, s;

		t = ReaderInput.readLine(WRITE_TRACK_NAME);
		m = ReaderInput.readInt(GET_MIN_TRACK);
		s = ReaderInput.readInt(GET_SEC_TRACK);
		track = new Track(t, m, s);

		System.out.println(track.toString());

		return track;

	}

}
