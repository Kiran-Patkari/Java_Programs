import java.awt.*;
import java.applet.*;

public class NameDemo extends Applet
{
  String str=null;
  public void init()
  {
   str=getParameter("User");
  }
  public void paint(Graphics g)
  {
    g.drawString("Hello "  +str,200,200);
  }
}
/*
<applet code=NameDemo.java width=600 height=600>
   <param name="User" value="jay">
</applet>
*/