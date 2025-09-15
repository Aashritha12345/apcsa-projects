package robot;

import kareltherobot.*;

public class Roomba implements Directions {

	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/finalTestWorld2024.wld";
		//String worldName = "robot/basicRoom.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 26, 101);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");

	}

	// declared here so it is visible in all the methods!
	private Robot roomba = new Robot(26, 101, East, 10);

	// You will need to add many variables!!

	public int cleanRoom(String worldName, int startX, int startY) {
		int totalBeepers = 0; // Need to move this somewhere else.

		// A new Robot should be constructed and assigned to the global (instance)
		// variable named roomba that is declared above.
		// Make sure it starts at startX and startY location.

		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(0);
		double totalSpaces=1;
       int largestPile = 0;
	   int pileSize= 0;
	   int pileLocationX = 0;
	   int pileLocationY= 0;
	   int numberpiles=0;
	   double answer  =0;
	   double avgpileSize = 0;
		/**
		 * This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

		// the line below causes a null pointer exception

		// what is that and why are we getting it?
		
		boolean isDestinationReached=false;
        while (isDestinationReached==false)
		{
		while (roomba.frontIsClear()) {
			pileSize=0;
			while (roomba.nextToABeeper()) {
				roomba.pickBeeper();
				pileSize+= 1;
				
				totalBeepers+=1;
				// System.out.println();
			}
			if (pileSize>0) {
			numberpiles ++;
			}
			
            
			if (pileSize > largestPile)
			{
				largestPile = pileSize;
				pileLocationX=roomba.avenue();
				pileLocationY = roomba.street();
			}
			roomba.move();
			totalSpaces++;
		}
		if (roomba.facingEast()) {
			roomba.turnLeft();
			if (roomba.frontIsClear()) {
				roomba.move();
				totalSpaces++;
				roomba.turnLeft();
			}
			else
			{
				isDestinationReached= true;
			}
		}
		else
		{
			roomba.turnLeft();
			roomba.turnLeft();
			roomba.turnLeft();
			if (roomba.frontIsClear()) {
				
			roomba.move();
			totalSpaces++;

			roomba.turnLeft();
			roomba.turnLeft();
			roomba.turnLeft();
	
			}
			else
			{

				isDestinationReached= true;
			}
			
		}
		 answer  = (double) numberpiles/ (double) totalSpaces;
	}
       if (numberpiles > 0) {
		 
		avgpileSize = (double) totalBeepers/numberpiles;
		  
	   } 
	   
			pileSize=0;
			while (roomba.nextToABeeper()) {
				roomba.pickBeeper();
				pileSize+= 1;
				
				totalBeepers+=1;
				// System.out.println();
			}
			if (pileSize>0) {
			numberpiles ++;
			}
			
            
			if (pileSize > largestPile)
			{
				largestPile = pileSize;
				pileLocationX=roomba.avenue();
				pileLocationY = roomba.street();

			}
if (numberpiles > 0) {
		 
		avgpileSize = (double) totalBeepers/numberpiles;
		
		  answer  = (double) numberpiles/ (double) totalSpaces;
	
	   } 
	   
		System.out.println("The total number of beepers picked up is " + totalBeepers);
		System.out.println("The total area covered by roomba is " +(int) totalSpaces);
		System.out.println("The largest beeper pile has " + largestPile);
		System.out.println("The largest pile is located at " + pileLocationY +" , " + pileLocationX );
		System.out.println("The average pile size is " + avgpileSize);
		System.out.println("The percent dirty is " + answer);
		System.out.println("The total number of piles is " + numberpiles);
	


		/*
		 * this is previous code
		 * int a=1;
		 * 
		 * while (a<=5)
		 * {
		 * int i = 1;
		 * while (i <= 7) {
		 * while (roomba.nextToABeeper()) {
		 * 
		 * roomba.pickBeeper();
		 * totalBeepers++;
		 * 
		 * 
		 * }
		 * 
		 * roomba.move();
		 * i++;
		 * System.err.print("running in loop no");
		 * System.err.println(i);
		 * }
		 * 
		 * if (a % 2 == 0)
		 * {
		 * roomba.turnLeft();
		 * roomba.turnLeft();
		 * roomba.turnLeft();
		 * roomba.move();
		 * roomba.turnLeft();
		 * roomba.turnLeft();
		 * roomba.turnLeft();
		 * }
		 * else
		 * {
		 * roomba.turnLeft();
		 * roomba.move();
		 * roomba.turnLeft();
		 * }
		 * 
		 * 
		 * a++;
		 * 
		 * }
		 */

		// This method should return the total number of beepers cleaned up.

	
	return totalBeepers;
	}
}

