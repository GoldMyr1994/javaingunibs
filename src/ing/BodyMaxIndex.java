package ing;

import ing.myUtil.ReaderInput;

/**
 * 
 * @author Mauro Conte
 * @see ReaderInput
 *
 */
public class BodyMaxIndex {
	
	static double KG_TO_LIB = 2.20462262185;
	static int LIB_TO_DAILY_CAL = 19;
	
	private int weight;
	private double height;
	
	public BodyMaxIndex (int w, double h) {
		this.weight = w;
		this.height = h;
	}
	
	public double getBodyMaxIndex() {
		return (double)this.weight/Math.pow(this.height, 2);
	}
	
	public double getDalyCalories() {
		return this.weight*BodyMaxIndex.KG_TO_LIB*BodyMaxIndex.LIB_TO_DAILY_CAL;
	}
	
	public static void main(String [] args) {
		
		int w = ReaderInput.readInt("Inserire il proprio peso in chilogrammi ");
		double h = ReaderInput.readDouble("Inserire la propria altezza in metri ");
		
		BodyMaxIndex me = new BodyMaxIndex(w, h); 
		
		System.out.println(String.format("Il tuo indice di massa corporea vale %3.2f", me.getBodyMaxIndex()));
		System.out.println(String.format("Calorie giornaliere %3.2f", me.getDalyCalories()));
	}
}
