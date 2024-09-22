import java.awt.*;
import java.applet.*;

public class ColorApplet extends Applet
{
  String str=null;
  public void init()
  {
    str="my color applet";
    setBackground(Color.blue);
    setForeground(Color.orange);
  }
  public void paint(Graphics g)
  {
    g.drawString(str,200,200);
  }
}
/*
<applet code=ColorApplet.java width=500 height=500></applet>
*/