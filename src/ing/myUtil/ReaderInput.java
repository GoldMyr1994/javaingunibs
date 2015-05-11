package ing.myUtil;

import java.util.Scanner;

/**
 * Helper class containing useful input function.
 * 
 * @author Mauro CONTE
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class ReaderInput {
	
	/**
	 * ReaderInput is non-instantiable 
	 */
	private ReaderInput() {}; 

	private final static String ERROR_FORMAT = "Attenzione: il dato inserito non e' nel formato corretto";
	
	private static Scanner myReader;
	
	private static void setUpScanner() {
		myReader = null;
		myReader = new Scanner(System.in);
	}
	
	/**
	 * 
	 * @param msg to print on screen
	 * @return int value readed from keybord
	 */
	public static final int readInt(String msg) {
		setUpScanner();
		boolean ended = false;
		int valueFromReader = 0;
		do {
			System.out.print(msg);
			if(myReader.hasNextInt()) {
				valueFromReader = myReader.nextInt();
				ended = true;
			} else {
				System.out.println(ERROR_FORMAT);
				myReader.next();
			}
		} while(!ended);
		myReader.nextLine();
		return valueFromReader;
	}
	
	
	
	public static final int readIntBetween(String msg,int min,int max){
		int readInt = readInt(msg);
	 while(!((readInt<=max) && (readInt>=min))){
		 System.out.println(ERROR_FORMAT);
		 readInt = readInt(msg);
	 }
	 return readInt;
	}
	
	/**
	 * 
	 * @param msg to print on screen
	 * @return double value readed from keybord
	 */
	public static final double readDouble(String msg) {
		setUpScanner();
		boolean ended = false;
		double valueFromReader = 0;
		do {
			System.out.print(msg);
			if(myReader.hasNextDouble()) {
				valueFromReader = myReader.nextDouble();
				ended = true;
			} else {
				System.out.println(ERROR_FORMAT);
				myReader.next();
			}
		} while(!ended);
		myReader.nextLine();
		return valueFromReader;
	}
	
	/**
	 * 
	 * @param msg to print on screen
	 * @return String value readed from keybord
	 */
	public static final String readWord(String msg) {
		setUpScanner();
		boolean ended = false;
		String valueFromReader = "";
		do {
			System.out.print(msg);
			if(myReader.hasNext()) {
				valueFromReader = myReader.next();
				ended = true;
			} else {
				System.out.println(ERROR_FORMAT);
				myReader.next();
			}
		} while(!ended);
		myReader.nextLine();
		return valueFromReader;
	}
	
	/**
	 * 
	 * @param msg to print on screen
	 * @return String value readed from keybord
	 */
	public static final String readLine(String msg) {
		setUpScanner();
		boolean ended = false;
		String valueFromReader = "";
		do {
			System.out.print(msg);
			if(myReader.hasNextLine()) {
				valueFromReader = myReader.nextLine();
				ended = true;
			} else {
				System.out.println(ERROR_FORMAT);
				myReader.next();
			}
		} while(!ended);
		return valueFromReader;
	}
	
	/**
	 * 
	 * @return int value readed from keybord
	 */
	public static final int readInt() {
		return readInt("");
	}
	
	/**
	 * 
	 * @return double value readed from keybord
	 */
	public static final double readDouble() {
		return readDouble("");
	}
	
	/**
	 * 
	 * @return String value readed from keybord
	 */
	public static final String readWord() {
		return readWord("");
	}
	
	/**
	 * 
	 * @return String value readed from keybord
	 */
	public static final String readLine() {
		return readLine("");
	}
}
