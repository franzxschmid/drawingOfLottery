package drawingOfLottery;
import java.util.*;

public class NumberOfCorrectOnes {
	
	//Schaut welche Zahlen richtig getippt wurden
	protected static int[] intersection(int[] a, int[] b) {
	    return Arrays.stream(a)
	                 .distinct()
	                 .filter(x -> Arrays.stream(b).anyMatch(y -> y == x))
	                 .toArray();
	}
	
	//Gibt Zahl als Wort an
	protected static String numberAsWord(int zahl) {
		
		String zahlAlsWort = new String();
		
		switch(zahl) {
		
		case 0:
			zahlAlsWort = "no";
			break;
		case 1:
			zahlAlsWort = "one";
			break;	
		case 2:
			zahlAlsWort = "two";
			break;
		case 3:
			zahlAlsWort = "three";
			break;
		case 4:
			zahlAlsWort = "four";
			break;
		case 5:
			zahlAlsWort = "five";
			break;		
		case 6:
			zahlAlsWort = "six";
			break;
			
		}
		return zahlAlsWort;
	}
	

}
