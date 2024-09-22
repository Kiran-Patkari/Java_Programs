import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet
{
  String str=null;
  public void init()
  {
   str="WELCOME TO MY APPLET:";
  }
  public void paint(Graphics g)
  {
    g.drawString(str,100,100);
  }
}
/*
 <Applet code=MyApplet.java width=500 height=500></Applet>
*/