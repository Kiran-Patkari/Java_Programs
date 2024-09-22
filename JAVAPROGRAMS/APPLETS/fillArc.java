import java.awt.*;
import java.applet.*;

public class fillArc extends Applet
{
   public void paint(Graphics g)
   {
      g. setColor(Color.yellow);
      g.fillArc(200,200,400,300,180,270);
   }
}
/*
 <applet code=fillArc.java width=500 height=500></applet>
*/
  