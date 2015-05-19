package ing.tamazoo;

import ing.Tamagotchi;

public class Tamatriste extends Tamagotchi  {
	
	
	final static int MAX_VALUE = 100;
	final static int MIN_VALUE = 0;
	
	final static double RATE_FEED = 0.10;			//10%  su tot vedi feed(int)
	final static double RATE_CARESS = 0;			//non cambia emotivity
	final static double RATE_CARESS_FEED = 0.5;    //50%  su 1
	final static double RATE_FEED_CARESS = 0;	    //non cambia emotivity
	
	final static int DEFAULT_SATIETY 		= 50;
	final static int DEFAULT_EMOTIVITY 		= 0;
	final static String DEFAULT_NAME 		= "tamatriste";
	
	final static int MIN_SATIETY_HAPPY		= MAX_VALUE * 3 / 10;
	final static int MAX_SATIETY_HAPPY		= MAX_VALUE * 9 / 10;
	final static int MIN_EMOTIVITY_HAPPY	= MAX_VALUE * 9 / 10;

	
	
	public Tamatriste() {
		super(DEFAULT_NAME,DEFAULT_SATIETY,DEFAULT_EMOTIVITY);
	}
	
	
	
	public Tamatriste(String name){
		super(name,DEFAULT_SATIETY,DEFAULT_EMOTIVITY );
	}
	
	
	
	@Override
	public void feed(int f) {
		super.feed(f,RATE_FEED,RATE_FEED_CARESS);
	}

    @Override
	public void caress(int c) {
	   super.caress(c, RATE_CARESS, RATE_CARESS_FEED);
       }
    
    
    

	@Override
	public boolean isAlive() {
		if(getSatiety()>MIN_VALUE && getSatiety()<MAX_VALUE) {
			return true;
		} else return false;
	}



	@Override
	public String toString() {
		return "Tamatriste [name=" + getName() + ", satiety=" + getSatiety() + ", emotivity=" + getEmotivity() + "]";
	  }
	

}

	

	
	
	
	
	




	
	
	
	


