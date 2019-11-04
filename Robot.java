public class Robot
{
   private int x;
   private int y;
   private Picture pic;
  
   public Robot()
   {
      x = 0;
      y = 0;
      pic = new Picture("myrobot.jpeg");
      pic.draw();
   }
  
   public Robot(int theX, int theY)
   {
      x = theX;
      y = theY;
      pic = new Picture("myrobot.jpeg");
      pic.translate(x,y);
      pic.draw();
   } 
    
   public void moveRight()
   {
   //pic.translate(pic.getWidth(),3);
   //x = pic.getWidth();
      moveHorizontal(1);
   }
  
   public void moveDown()
   {
      moveVertical(1);
   }
  
   public void moveHorizontal(int units)
   {
      pic.translate(pic.getWidth() * units, y);
      x = x + pic.getWidth() * units;     
     
   }
  
   public void moveVertical(int units)
   {
      pic.translate(x, pic.getHeight() * units);
      y = y + pic.getHeight() * units;
   }
  
       
   public int getX()
   {
      return pic.getX()/pic.getWidth();
   }
  
   public int getY()
   {
      return pic.getY()/pic.getHeight();
   }


  
}

