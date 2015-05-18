package ing.myUtil;

/**
 * 
 * @author Tommaso Fanelli & Mauro Conte
 *
 */
public class MyMenu {
	
	final private static String CORNICE = "======================================";
	final private static String VOCE_USCITA = "0 - Esci";
	final private static String RICHIESTA_INSERIMENTO = "Digita il numero dell'opzione desiderata => ";
	
	private String titolo;
	private String [] voci;
	
	public MyMenu (String _titolo, String ... _voci) {
		titolo = _titolo;
		voci = _voci;
	}
	
	public int scegli () {
		stampa();
		return ReaderInput.readIntBetween(RICHIESTA_INSERIMENTO,0,voci.length);
	}
	
	private void stampa ()
	{
		System.out.println(CORNICE);
		System.out.println(titolo);
		System.out.println(CORNICE);
		
		for (int i=0; i<voci.length; i++) {
			System.out.println( (i+1) + " - " + voci[i]);
		}
		
		System.out.println();
		System.out.println(VOCE_USCITA);
		System.out.println();
	}
}


