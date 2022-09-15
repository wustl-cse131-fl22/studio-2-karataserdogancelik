package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner in = new Scanner(System.in);
			
			System.out.println ("Start Amount: ");
			double startAmount = in.nextDouble();
			System.out.println ("Win Chance: ");
			double winChance = in.nextDouble();
			System.out.println ("Win Limit: ");
			double winLimit = in.nextDouble();
			System.out.println ("totalSimulations: ");
			int totalSimulations = in.nextInt();
			int totalRuin = 0;
			double initialStartAmount = startAmount;
			int triesInADay = 0;
			
			for (int i = 0; i < totalSimulations; i++) {
				while ((startAmount > 0)  && (startAmount < winLimit) ) {
			
					double randomInt = Math.random();
					if (randomInt <= winChance) {
						startAmount = startAmount + 1;
					} else {
							startAmount = startAmount - 1;
					
					} 
					//System.out.println(startAmount);	
					triesInADay = triesInADay + 1;
			
			}
				boolean WinOrLoss = !(startAmount == 0);
				
				if (startAmount == 0){
					totalRuin = totalRuin + 1;	
				}
				
				System.out.println("Simulation " + i + ": " + triesInADay + " " + WinOrLoss);
				
				startAmount = initialStartAmount;
				triesInADay = 0;
				
				
			}
				System.out.println("Losses: " + totalRuin + " Simulations: " + totalSimulations);
				double RuinRate = (totalRuin/totalSimulations);
				double ExpectedRuinRate = ((1-winChance)/totalSimulations) ;
				System.out.println("Ruin rate from Simulation: " + RuinRate + " Expected Ruin Rate: " + ExpectedRuinRate);

			
			
	}
	

}
