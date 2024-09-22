import java.awt.*;
import java.applet.*;

public class FillRect extends Applet
{
   public void paint(Graphics g)
   {
      g. setColor(Color.magenta);
      g.fillRect(200,300,500,350);
   }
}
/*
 <applet code=FillRect.java width=500 height=500></applet>
*/
  