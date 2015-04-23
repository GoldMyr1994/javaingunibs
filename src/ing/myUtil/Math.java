package ing.myUtil;

public class Math {
	
	public static int countDecimalPosition(double d) {
		int i=0,j=0;
		String s = new Double(d).toString();
		for(i=s.length()-1; i>=0; i-- ) {
			if(s.charAt(i) == '0') j++;
			else break;
		}
		
	    int index = s.indexOf('.');
	    if (index < 0) {
	        return 0;
	    } else return s.length() - 1 - index - j;
	}
}
