// Tashfin Hassan
// April 2018
//
import javax.swing.JFrame;

public class FinalDriver
{
   public static void main(String[] args)
   { 
      JFrame frame = new JFrame("Final Project");
      frame.setSize(408, 438);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      FinalPanel p = new FinalPanel();
      frame.setContentPane(p);
      p.requestFocus();
      frame.setVisible(true);
   }
}
