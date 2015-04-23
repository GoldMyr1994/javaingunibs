package ing.myUtil;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void testCountDecimalPositionA() {
		//TEST WITH 0,1,2,3 DECIMAL DIGITS
		double [] listNum = new double[]{1,1.0,1.1,1.11,1.111};
		int [] listValue = new int[5];
		int [] listExpected = new int[]{0,0,1,2,3};
		int i = 0;
		for(double n : listNum) {
			listValue[i] = Math.countDecimalPosition(n);
			i++;
		}
		assertArrayEquals(listExpected, listValue);
	}

}
