//Name: Anudeep
//Date: 4/13/18
//Final project--Display class.
//Description--used to show the object that goes past the obstacles in the game. 

//import statements
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

public abstract class Display
{

   private int x;
   private int y;
   private int STDWIDTH = 60; //default
   private ImageIcon image;
   
   String imageLocation;
   
//default constructor
   public Display()
   {
      x=1100;
      y=400;
      image = new ImageIcon("obstacle.jpg");
      //image is used to show the square, NOT the color. 
      //default image is used to show square.
   
   }
   
   //2 arg constructor
   public Display(int x, int y, String imageLocation)
   {
      this.x = x;
      this.y = y;
      image = new ImageIcon(imageLocation);
      this.imageLocation = imageLocation;
      
   }
   
   //method drawImage--draws an image over the specified Display constuctor paramaters
   //called by panel, updates
   public void drawImage( Graphics g )
   {
   
      x += 5;
      

      //ImageIcon image = new ImageIcon ( imageLocation );
      
      g.drawImage( image.getImage() , x , y , STDWIDTH , STDWIDTH , null );
      
   }


}
