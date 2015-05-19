/**
 * 
 */
package ing.tamazoo;

import ing.Tamagotchi;

/**
 * @author Mauro
 *
 */
public class Tamagordo extends Tamagotchi{

	private final static double RATE_FEED 			= 0.10;			//10%  su tot vedi feed(int)
	private final static double RATE_CARESS 		= 0;			//100% su 1
	private final static double RATE_CARESS_FEED 	= 1.0;			//50%  su 1
	private final static double RATE_FEED_CARESS 	= 0;			//25%  su 1
	
	final static int DEFAULT_SATIETY 		= 50;
	final static int DEFAULT_EMOTIVITY 		= 100;
	final static String DEFAULT_NAME 		= "tamagordo";
	
	public Tamagordo() {
		super(DEFAULT_NAME,DEFAULT_SATIETY,DEFAULT_EMOTIVITY);
	}
	
	public Tamagordo(String name) {
		super(name,DEFAULT_SATIETY,DEFAULT_EMOTIVITY);
	}
	
	@Override
	public void feed(int f) {
		super.feed(f, RATE_FEED, RATE_FEED_CARESS);
	}

	@Override
	public void caress(int c) {
		super.caress(c,RATE_CARESS, RATE_CARESS_FEED);
	}
	
	//TODO:: fai un tostring decente
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tamagordo [name=" + getName() + ", satiety=" + getSatiety() + ", emotivity=" + getEmotivity() + "]";
	}
}
