package drawingOfLottery;
import java.util.Arrays;

public class LotteryGenerator {
	
	protected static int[] getDrawnNumbers(){
		
		//Anzahl der Tipps holen
		int numberOfTips = TipSubmits.getNumberOfTips();
		
		//Leeres Integer für die zu ermittelnden  
		int[] drawnNumbers = new int[numberOfTips];
			
		//Schleife für die eigentliche Tipps
		int i = 0; 
		while (i < numberOfTips) {
			  
			int drawnNumber = (int)(Math.random() * 49);
			   
			   if ((!CheckArray.isValueInArray(drawnNumbers, drawnNumber))) {
				   drawnNumbers[i] = drawnNumber;
				   i++;
				    
			   }
			   else {
				   //pass
			   } 
		}
		//Sortieren
		Arrays.sort(drawnNumbers);	
		return drawnNumbers;
	}

}
