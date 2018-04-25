// Tashfin Hassan
// April 2018

import java.awt.*;

public class CollisionObject extends Display implements Collision
{
   private int myX;
   private int myY;
   private int width;
   private int height;
   private Color myColor;
   
   public CollisionObject()
   {
   
      super();
      width = 30;
      height = 10;
   }
   public CollisionObject(int x, int y, int w, int h, String s)
   {
      super(x, y, s);
      width = w;
      height = h;
   }
   public int getX()
   {
      return myX;
   }
   public int getY()
   {
      return myY;
   }
   public Color getColor()
   {
      return myColor;
   }
   public void setX(int x)
   {
      myX = x;
   }
   public void setY(int y)
   {
      myY = y;
   }
   public void setColor(Color c)
   {
      myColor = c;
   }
   public int hit()
   {
      return 1;
   }
   
   
   
}