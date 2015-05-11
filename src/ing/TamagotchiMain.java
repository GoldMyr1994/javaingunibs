package ing;

/**
 * @author Tommaso Fanelli
 * @version 1.4
 * @since 1.0
 * 
 */

import ing.myUtil.MyMenu;
import ing.myUtil.ReaderInput;

public class TamagotchiMain {

	private static final String WELCOME_MESSAGE = "Benvenuto in TamagotchiLand";
	private static final String STEP_1_MESSAGE = "Verra ora creato un tamagotchi";
	private static final String GET_NAME_MESSAGE = "Inserire nome per il Tamagotchi: ";
	private static final String STEP_2_MESSAGE = "Se desideri accarezzare ";
	private static final String STEP_2_MESSAGE_B = " inserire \"1\"";
	private static final String STEP_3_MESSAGE = "Se desideri dare dei biscotti a ";
	private static final String STEP_3_MESSAGE_B = " inserire \"2\"";
//	private static final String STEP_4_MESSAGE = "Se desideri uscire inserire \"3\"";
	
	
/**
 * 
 * @param args
 */
	
   public static void main(String[] args) {
		System.out.println(WELCOME_MESSAGE);
		System.out.println(STEP_1_MESSAGE);
		String name = ReaderInput.readLine(GET_NAME_MESSAGE);
		Tamagotchi tama = new Tamagotchi(name);
		System.out.println("\n"+tama.toString()+"\n");
		
		int _menu;
//		int choose;
		


	do{
//		System.out.println(STEP_2_MESSAGE+tama.getName()+STEP_2_MESSAGE_B);
//		System.out.println(STEP_3_MESSAGE+tama.getName()+STEP_3_MESSAGE_B);
//		System.out.println(STEP_4_MESSAGE);
		
//	  choose = ReaderInput.readInt();
        String [] voci = {STEP_2_MESSAGE+tama.getName()+STEP_2_MESSAGE_B,STEP_3_MESSAGE+tama.getName()+STEP_3_MESSAGE_B,};
        MyMenu menu = new MyMenu(tama.getName(),voci);
        _menu = menu.scegli();
	 
		int quantity;
		
		switch (_menu){
		case 1 :
			quantity = ReaderInput.readInt("Quante carezze vuoi dare a "+tama.getName()+ "?");
			tama.caress(quantity);
			break;
		
		case 2 :
			quantity = ReaderInput.readInt("Quanti biscotti vuoi dare a "+tama.getName()+ "?");
			tama.feed(quantity);
			break;
		
		case 0 :
			break;
		 }
	   

		
	    if(_menu == 0) {
			System.out.println(tama.getName()+" è andato a dormire");
			break;
		}
		
	    
		System.out.println("\n"+tama.toString()+"\n");
	
		

	if (_menu < 4){
	   if (tama.isAlive()){
	      if(tama.isHappy()) {
			 System.out.println("Sono felice :)");
		   } else {
			 System.out.println("Sono triste :(");
	   }
	 } else {System.out.println(tama.getName()+ " è morto +_+ ");
		break;
   }
}  else  {	

        System.out.println("Non hai inserito il numero giusto");
	  }
		
        } while(_menu!=3);
		
	
		
	}

}
