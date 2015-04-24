package ing;

/**
 * 
 * @author Mauro
 *
 */
public class Tamagotchi {
 
	final static int MAX_VALUE = 100;
	
	final static int RATE_FEED = 1;
	final static int RATE_CARESS = 1;
	final static int RATE_CARESS_FEED = 1;
	final static int RATE_FEED_CARESS = 1;
	
	final static int START_SATIETY = 50;
	final static int START_EMOTIVITY = 50;
	
	//TODO:: impostali come n%MAX_VALUE
	final static int MIN_SATIETY_HAPPY= 10;
	final static int MAX_SATIETY_HAPPY= 90;
	final static int MIN_EMOTIVITY_HAPPY= 10;
	
	
	private String name;
	private int satiety;
	private int emotivity;
	
	public Tamagotchi() {
		this.name = "tama";
		this.emotivity = START_EMOTIVITY;
		this.satiety = START_SATIETY;
	}
	
	/**
	 * 
	 * @param name
	 * @param s
	 * @param e
	 */
	public Tamagotchi(String name, int s, int e) {
		this.name = name.toLowerCase();
		this.emotivity = e;
		this.satiety = s;
	}
	
	/**
	 * @return the sastiety
	 */
	public int getSatiety() {
		return satiety;
	}
	
	/**
	 * @return the emotivity
	 */
	public int getEmotivity() {
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
	
	public void feed(int f) {
		this.satiety += f*RATE_FEED;
		this.emotivity -= f*RATE_FEED_CARESS;
	}
	
	public void caress(int c) {
		this.emotivity += c*RATE_CARESS;
		this.satiety -= c*RATE_CARESS_FEED;
	}
	
	public boolean isAlive() {
		if(this.satiety<=0 || this.emotivity<=0 || this.satiety>=MAX_VALUE) {
			return false;
		} else return true;
	}
	
	public boolean isHappy() {
		if(!isAlive()) {
			return false;
		} else {
			if(	this.satiety >= MIN_SATIETY_HAPPY && 
				this.satiety <= MAX_SATIETY_HAPPY && 
				this.emotivity >= MIN_EMOTIVITY_HAPPY)
			return true;
			else return false;
		}
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
