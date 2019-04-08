package drawingOfLottery;
import java.util.*;

public class TipSubmits {
	
	//Statische Klassenvariable
	private static int numberOfTips = 6;
	
	//Konstruktor
	public TipSubmits() {
		//pass;
	}
	
	//Getter
	protected static int getNumberOfTips() {
		return numberOfTips;
	}
	
	//Setter
	protected static void setNumberOfTips(int newNumberOfTips) {
		numberOfTips = newNumberOfTips;
	}
	
    //Main
	public static void main(String[] args) {
		
       //Scanner instanzieren 
	   Scanner scanner = new Scanner(System.in);
	   
	   //Leeres Array für die Tipps
	   int[] tips = new int[getNumberOfTips()];
	   
	   //Schleife für die eigentliche Tippabgabe
	   int i = 0; 
	   while (i < getNumberOfTips()) {
		   System.out.println("Please, submit Tip Number " + (i + 1) + ":");
		   int tip = scanner.nextInt();
		   
		   //Check ob Wert bereits vorhanden
		   if ((tip > 0) && (tip < 50 && !CheckArray.isValueInArray(tips, tip))) {
			   tips[i] = tip;
			   i++;	 
		   } else {
			   System.out.println("Please submit a Number beetween 1 and 49 that hasn't been submitted before: ");
		   } 
	   }
	   
	   //Scanner schließen
	   scanner.close();
	   
	   //Sortiert die Zahlen und bedankt sich
	   Arrays.sort(tips);
	   System.out.println("You have submitted your Tips. Thank you!");
	   
	   //Pausiert Programmm für die Spannung
	   try
	   {
	       Thread.sleep(4000);
	   }
	   catch(InterruptedException ex)
	   {
	       Thread.currentThread().interrupt();
	   }
	   
	   //Aufruf der Ziehung
	   int[] drawnNumbers = LotteryGenerator.getDrawnNumbers();
		
	   //Auflösung
	   if (tips == drawnNumbers) {
		   System.out.println("You won!");	
	   } else {
		   System.out.println("Unfortunatly you haven't won the Jackpot. :-(");
	   }
	   
	   // Anzahl der Richtigen Funktionsaufrufe
	   int[] correctOnes = NumberOfCorrectOnes.intersection(tips, drawnNumbers);
	   int numberOfCorrectOnes = correctOnes.length;
	   String tallyOfCorrectOnes = NumberOfCorrectOnes.numberAsWord(numberOfCorrectOnes);
	   
	   // Anzahl der Richtigen Print Ausgabe
	   if(numberOfCorrectOnes == 0 || numberOfCorrectOnes == 1) {
		   System.out.println("You have " + tallyOfCorrectOnes + " correct Tip!");
	   }else {
		   System.out.println("You have " + tallyOfCorrectOnes + " correct Tips!");
	   }
		   

	   // Prinout Zahlen zur Kontrolle
	   System.out.println("Your Tip: " + tips[0] + ", " 
	                                   + tips[1] + ", "
			                           + tips[2] + ", " 
	                                   + tips[3] + ", "
			                           + tips[4] + ", "  
	                                   + tips[5]);
	   
	   System.out.println("Draw of the Lottery: "  + drawnNumbers[0] + ", " 
	                                               + drawnNumbers[1] + ", "  
			                                       + drawnNumbers[2] + ", "  
	                                               + drawnNumbers[3] + ", "  
			                                       + drawnNumbers[4] + ", "  
	                                               + drawnNumbers[5]);
	} 
	

	
}
