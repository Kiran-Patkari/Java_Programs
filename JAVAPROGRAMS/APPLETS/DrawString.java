import java.awt.*;
import java.applet.*;

public class DrawString extends Applet
{
  String str=null;
   public void init()
   {
     str="my strings";
   }
   public void paint(Graphics g)
   {
     g.setColor(Color.red);
     g.drawString(str,100,100);
   }
}
/*
 <applet code=DrawString.java width=500 height=500></applet>
*/
  