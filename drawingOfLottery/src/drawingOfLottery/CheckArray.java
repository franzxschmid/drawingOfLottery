package drawingOfLottery;

import java.util.Arrays;

public class CheckArray {
	
	//Durchsucht Array, ob Zahl schon getippt/gezogen wurde
	protected static boolean isValueInArray(int[] arr, int newValue) {	
		
        //Array klonen damit keine Referenz ensteht
		int[] helpArray = arr.clone();
		
		// Für Binäre Suche muss Array sortiert sein
	    Arrays.sort(helpArray);
		
	    //Binäre Suche
		int a = Arrays.binarySearch(helpArray, newValue);
		if(a > 0)
			return true;
		else
			return false;
	}

}
