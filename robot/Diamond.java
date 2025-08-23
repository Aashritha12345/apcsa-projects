package robot;
import kareltherobot.*;


public class Diamond implements Directions{

    public static void main(String[] args) {

        World.setVisible(true);// allows us to see the run output
        // the bigger the street, the farther north
        World.setSize(20,20);


        // The line below creates a Robot that we will refer to as rob
        // Find out what the numbers and direction do!
        // Put rob in a better location for your initials.
        Robot rob = new Robot(20,11,South,90);
        World.setDelay(1);
        // Want a second robot?  No prob.  They are cheap :)
        //Robot dude = new Robot(7,5,West,9);
        // examples of commands you can invoke on a Robot
       { 
        for(int num=1; num <= 8; num++) 
        {
       rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.putBeeper();
        rob.turnLeft();
        }
      for (int num=1; num <= 7; num++) 
      {
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.putBeeper();
      }

      {rob.turnLeft();}
       for (int num= 1; num <= 7; num++) 
       { 
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.putBeeper();
        
       }
      {rob.turnLeft();
    }

    for(int num= 1; num <= 6; num++)
    {
      rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.putBeeper();

    }
        
    {
      rob.turnLeft();
      rob.turnLeft();
    }

      for(int num= 1; num <= 3; num++) 
      {
        rob.move();

      }
       {
         rob.turnLeft();
         rob.move();
         rob.turnLeft();
         rob.turnLeft();

         for(int num= 1; num<=4; num++) 
         { 
            rob.putBeeper();
            rob.move();

         }
          
         {
        rob.putBeeper();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        

    }
       for(int num= 1; num <= 2; num++)
        {
        rob.move();
        rob.putBeeper();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
    

       }

       {rob.turnLeft();
        rob.turnLeft();
    
    }
       
       }

      for(int num= 1; num <= 4; num++ ){

        rob.move();
        rob.putBeeper();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();        
      }

      {
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();

      }

      for(int num= 1; num <= 4; num++) 
      {
         rob.turnLeft();
         rob.move();
         rob.turnLeft();
         rob.turnLeft();
         rob.turnLeft();
         rob.move();
         rob.putBeeper();

      }


      {
         rob.turnLeft();
         rob.turnLeft();
         rob.move();
         rob.turnLeft();
         rob.turnLeft();
         rob.turnLeft();
         rob.move();
         rob.putBeeper();
         rob.move();
         rob.move();
         rob.move();

      }

    }

        


    
    




        // done with the line, now on the curve
        // rob.turnLeft();

    }
}
