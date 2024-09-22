import java.awt.*;
import java.applet.*;

public class ParaDemo extends Applet
{
  String str=null;
  public void init()
  {
   str=getParameter("msg");
   setBackground(Color.blue);
   setForeground(Color.white);
  }
  public void paint(Graphics g)
  {
    g.drawString(str,100,100);
  }
}
/*
<applet code=ParaDemo.java width=500 height=500>
  <param name="msg" value="WELCOME TO PARAM TAG">
</applet>
*/