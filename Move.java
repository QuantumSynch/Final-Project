//Victor Etili
//4.13.2018
//ver. 4
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Move extends PlayerObject implements Keylistener
{

   int JUMPHEIGHT;
   
   //constructor
   public Move( int JUMPHEIGHT, int x, int y, int d, int w, Color c )
   {
   
      super( int x, int y, int d, int w, Color c );
      this.JUMPHEIGHT = JUMPHEIGHT;
      
   }
   
   //handles when up is pressed, which then sets dy to the jumpheight constant
   public void keyPressed(KeyEvent e)
   {

      int key = e.getKeyCode();

      if (key == KeyEvent.VK_UP)
      {
        
         setDy( JUMPHEIGHT );
        
      }

   }

}

 