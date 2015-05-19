package ing;

/**
 * 
 * @author Mauro Conte
 * @version 1.3
 * @since 	1.0
 *
 */
public class Tamagotchi {
 
	protected final static int MAX_VALUE = 100;
	protected final static int MIN_VALUE = 0;
	
	private static double RATE_FEED = 0.10;			//10%  su tot vedi feed(int)
	private static double RATE_CARESS = 1.0;			//100% su 1
	private static double RATE_CARESS_FEED = 0.5;		//50%  su 1
	private static double RATE_FEED_CARESS = 0.25;	//25%  su 1
	
	static int DEFAULT_SATIETY 		= 50;
	static int DEFAULT_EMOTIVITY 	= 50;
	static String DEFAULT_NAME 		= "tama";
	
	final static int MIN_SATIETY_HAPPY		= MAX_VALUE * 3 / 10;
	final static int MAX_SATIETY_HAPPY		= MAX_VALUE * 9 / 10;
	final static int MIN_EMOTIVITY_HAPPY	= MAX_VALUE * 9 / 10;
	
	
	private String name;
	private double satiety;
	private double emotivity;
	
	/**
	 * Tamagotchi
	 */
	public Tamagotchi() {
		this.name = DEFAULT_NAME;
		this.emotivity = DEFAULT_EMOTIVITY;	//qui dovrebbe esserci una conversione implicita
		this.satiety = DEFAULT_SATIETY;		//anche qui
	}
	
	/**
	 * Tamagotchi
	 * @param name
	 */
	public Tamagotchi(String name) {
		this.name = name.toLowerCase();
		this.emotivity = DEFAULT_EMOTIVITY;	//anche qui
		this.satiety = DEFAULT_SATIETY;		//anche qui
	}
	
	/**
	 * Tamagotchi
	 * @param name
	 * @param s
	 * @param e
	 */
	public Tamagotchi(String name, int s, int e) {
		this.name = name.toLowerCase();
		if(s>=MAX_VALUE || s<=MIN_VALUE || e>=MAX_VALUE || e<=MIN_VALUE) new Exception("");
		this.emotivity = e;					//anche qui
		this.satiety = s;					//anche qui
	}
	
	
	/**
	 * @return the sastiety
	 */
	public double getSatiety() {
		return satiety;
	}
	
	/**
	 * @return the emotivity
	 */
	public double getEmotivity() {
		return emotivity;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @param f 
	 */
	public void feed(int f) {
		feed(f,RATE_FEED,RATE_FEED_CARESS);
	}
	
	/**
	 * 
	 * @param f
	 * @param _rate_feed
	 * @param _rate_feed_caress
	 */
	public void feed(int f, double _rate_feed, double _rate_feed_caress) {
		
		double rate_feed = _rate_feed;
		double rate_feed_caress = _rate_feed_caress;
		
		int i;
		// per gni biscottino
		// incrementa la sazietà del 10%
		for (i = 0; i < f; i++) {

			this.satiety += this.satiety * rate_feed;
			if (this.satiety >= MAX_VALUE) {
				this.satiety = MAX_VALUE;
				// interrompo perchè muore e fa booooom
				// non serve a nulla continuare a dargli biscottini
				break;
			}

			this.emotivity -= rate_feed_caress;
			if (this.emotivity <= MIN_VALUE) {
				this.emotivity = MIN_VALUE;
				// interrompo perchè muore di solitudine
				// non serve a nulla continuare a dargli biscottini
				break;
			}
		}
	}
	
	/**
	 * 
	 * @param c
	 */
	public void caress(int c) {
		caress(c, RATE_CARESS, RATE_CARESS_FEED);
	}
	
	public void caress(int c, double _rate_caress, double _rate_caress_feed) {
		
		double rate_caress = _rate_caress;
		double rate_caress_feed = _rate_caress_feed;
		
		int i;
		// per gni biscottino
		// incrementa la sazietà del 10%
		for (i = 0; i < c; i++) {

			this.emotivity += rate_caress;
			if (this.emotivity >= MAX_VALUE) {
				this.emotivity = MAX_VALUE;
				// interrompo perchè muore
				// non serve a nulla continuare
			}

			this.satiety -= rate_caress_feed;
			if (this.satiety <= MIN_VALUE) {
				this.satiety = MIN_VALUE;
				// interrompo perchè muore
				// non serve a nulla continuare
				break;
			}
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isAlive() {
		if(this.satiety>MIN_VALUE && this.satiety<MAX_VALUE && this.emotivity>MIN_VALUE ) {
			return true;
		} else return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isHappy() {
		if(isAlive()) {
			if(!feelHungry() && !feelSick() && !feelAlone()) return true;
				else return false;
		} else {
			return false;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	private boolean feelAlone() {
		if(this.satiety <= MIN_SATIETY_HAPPY) return true;
		else return false;
		
	}
	
	/**
	 * 
	 * @return
	 */
	private boolean feelHungry() {
		if(this.satiety <= MIN_SATIETY_HAPPY) return true;
		else return false;
		
	}
	
	/**
	 * 
	 * @return
	 */
	private boolean feelSick() {
		if(this.satiety >= MAX_SATIETY_HAPPY) return true;
		else return false;
	}
	
	//TODO:: fai un tostring decente
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tamagotchi [name=" + name + ", satiety=" + satiety + ", emotivity=" + emotivity + "]";
	}
}
