package ing.olympicMedals;

/**
 * @author Tommaso Fanelli
 * @version 1.0
 * @since 1.0
 *
 */

public class Nation {
	
	private final String nation;
	private int gold;
	private int silver;
	private int bronze;
	
	
	/**
	 * 
	 * @param the nation name
	 */
	public Nation (String nation){
		this.nation = nation;
		this.gold = 0;
		this.silver = 0;
		this.bronze = 0;
	}
	
	/**
	 * 
	 * @return the nation name
	 */
	public String getNation(){
		return nation;
	}
	
	/**
	 * increase one gold medal
	 */
	public void addGold() {
		this.gold++;
	}
	
	/**
	 * increase one silver medal
	 */
	public void addSilver() {
		this.silver++;
	}
	
	/**
	 * increase one bronze medal
	 */
	public void addBronze() {
		this.bronze++;
	}
	
	/**
	 * @return the gold
	 */
	public int getGold() {
		return gold;
	}

	/**
	 * @return the silver
	 */
	public int getSilver() {
		return silver;
	}

	/**
	 * @return the bronze
	 */
	public int getBronze() {
		return bronze;
	}
	
	public double getScore() {
		return 0.001*bronze+silver+100*gold;
	}
	
	public boolean medalsBetterThan(Nation n) {
		return getScore()>n.getScore();
	}
	
	@Override
	public String toString() {
		return getNation();
    }

	
	
}