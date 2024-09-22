import java.awt.*;
import java.applet.*;

public class FontDemo extends Applet
{
  String str=null;
  Font F;
  public void init()
  {
    str="I LIKE BUTTERFLY";
    F=new Font("ELEPHANT",0,20);
    setFont(F);
  }
  public void paint(Graphics g)
  {
    g.drawString(str,100,200);
  }
}
/*<applet code="FontDemo.java" width=500 height=500>
</applet>
*/