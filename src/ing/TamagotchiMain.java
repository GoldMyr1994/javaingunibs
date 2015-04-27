package ing;

import ing.myUtil.ReaderInput;

public class TamagotchiMain {

	private static final String WELCOME_MESSAGE = "Benvenuto in TamagotchiLand";
	private static final String STEP_1_MESSAGE = "Verra ora creato un tamagotchi";
	private static final String GET_NAME_MESSAGE = "Inserire nome per il Tamagotchi: ";
	
	public static void main(String[] args) {
		System.out.println(WELCOME_MESSAGE);
		System.out.println(STEP_1_MESSAGE);
		String name = ReaderInput.readWord(GET_NAME_MESSAGE);
		Tamagotchi tama = new Tamagotchi(name,Tamagotchi.DEFAULT_SATIETY,Tamagotchi.DEFAULT_EMOTIVITY);
		System.out.println(tama.toString());
		
	}

}
