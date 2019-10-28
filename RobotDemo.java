public class RobotDemo
{
   public static void main(String[] args)  
   {
      Robot robbie = new Robot(5,6);
      //robbie.moveRight();
      //robbie.moveLeft();
     
      Robot robo0 = new Robot();
      //robo0.moveHorizontal(5);
      //robo0.moveHorizontal(-5);
      robo0.moveHorizontal(5);
      robo0.moveHorizontal(-3);
      System.out.println("Expected: 2");
      System.out.println("Actual: " + robo0.getX());
     
      Robot robo1 = new Robot();
      //robo1.moveVertical(5);
      //robo1.moveVertical(-5);
      robo1.moveVertical(8);
      robo1.moveVertical(-6);
      System.out.println("Expected: 2");
      System.out.println("Actual: " + robo1.getY());
     
      Robot robo2 = new Robot();
      robo2.moveHorizontal(6);
      robo2.moveHorizontal(-5);
      robo2.moveVertical(7);
      System.out.println("X: " + robo2.getX());
      System.out.println("Y: " + robo2.getY());

     
     
   }
  
}