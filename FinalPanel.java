import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class FinalPanel extends JPanel
{
   private static final int FRAME = 400;
   private static final int RANDOM = (int)(Math.random() * FRAME + 1);
   private static final Color BACKGROUND = new Color(204, 204, 204);

   private BufferedImage myImage;
   private Graphics myBuffer;
   private PlayerObject player;
   private CollisionObject[] objects;
   private Timer timer;    
   
   public FinalPanel()
   {
      //myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      objects = new CollisionObject[5];
      //myBuffer = myImage.getGraphics();
      //myBuffer.setColor(BACKGROUND);
      //myBuffer.fillRect(0, 0, FRAME,FRAME);
      player = new PlayerObject();
      for (int i = 0; i < objects.length; i++)
         objects[i] = new CollisionObject(10, 10, 10, 10, "obstacle.jpg");
         
      
      timer = new Timer(10, new Listener());
      timer.start();
      setFocusable(true);
   }
  
   
   
      
   public void paintComponent(Graphics g)
   {
   
      for ( int i = 0 ; i != 5 ; i++ )
         objects[i].drawImage( g );
         
      
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         //myBuffer.setColor(BACKGROUND);
         //myBuffer.fillRect(0, 0, FRAME, FRAME);
           
         //ball.move(FRAME, FRAME);
         //collide(ball, pd);
           
         //ball.draw(myBuffer);
         //pd.draw(myBuffer);
         //player.draw(myBuffer);
           
         //myBuffer.setColor(Color.BLACK);
         //myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         //myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
         //repaint();
         
      }
   }   
}