// Tashfin Hassan
// April 2018

import java.awt.*;

public class PlayerObject extends Display
{
   // Variables
   private int myXo;
   private int myYo;
   private int myX;
   private int myY;
   private int dy;
   private int myWidth;
   private Color myColor;
   
   // Constructors
   public PlayerObject()
   {
      myXo = 50;
      myYo = 50;
      myX = myXo;
      myY = myYo;
      dy = 0;
      myWidth = 10;
      myColor = Color.BLACK;
   }
   public PlayerObject(int x, int y, int d, int w, Color c)
   {
      myX = x;
      myY = y;
      dy = d;
      myWidth = w;
      myColor = c;
   }
   
   // Accessor Methods
   public int getX()
   {
      return myX;
   }
   public int getY()
   {
      return myY;
   }
   public int getDy()
   {
      return dy;
   }
   public int getWidth()
   {
      return myWidth;
   }
   public Color getColor()
   {
      return myColor;
   }
   
   // Set Methods
   public void setX(int x)
   {
      myX = x;
   }
   public void setY(int y)
   {
      myY = y;
   }
   public void setDy(int d)
   {
      dy = d;
   }
   public void setWidth(int w)
   {
      myWidth = w;
   }
   public void setColor(Color c)
   {
      myColor = c;
   }
   
   
   // Searches array of CollisionObjects and returns type of hit if any hit
   public int scan(CollisionObject[] o)
   {
      int temp = 0;
      int count = 0;
      while (temp == 0)
      {
         temp = o[count].hit();
         count++;
      }
      return temp;
   }
   
   // Makes changes on type of hit
   public void react(CollisionObject[] o)
   {
      int temp = scan(o);
      if (temp == 1)
      {
         dy = 0;
      }
      if (temp == 2)
      {
         myX = myXo;
         myY = myYo;
      }
   }
// public void jump(int v)
//    {
//       while (v > 0)
//       {
//          myY += v;
//          v -= myGravity * 2;
//       }
//    }
//    public void gravity()
//    {
//       myY -= myGravity * 2;
//    }
}