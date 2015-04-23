/**
 * 
 */
package ing.myUtil;
import ing.myUtil.Math;

/**
 * @author Mauro
 *
 */
public class ReaderInputDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Main of ReaderInputDriver");
		int i = ReaderInput.readInt("Inserire un numero intero");
		System.out.printf("Hai inserito il numero %d.", i);
		System.out.println();
		double d = ReaderInput.readDouble("Inserire un numero decimale");
		System.out.printf("Hai inserito il numero %3."+Math.countDecimalPosition(d)+"f.", d);
		System.out.println();
		String w = ReaderInput.readWord("Inserire una parola seguita dal tasto SPAZIO");
		System.out.println("Hai inserito la parola "+w);
		String s = ReaderInput.readLine("Inserire un mini testo seguito dal tasto INVIO");
		System.out.println("Hai inserito il testo "+s);

	}
}
