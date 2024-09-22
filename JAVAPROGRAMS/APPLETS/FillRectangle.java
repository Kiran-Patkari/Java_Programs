import java.awt.*;
import java.applet.*;

public class FillRectangle extends Applet
{
  public void paint(Graphics g)
  {
    g.setColor(Color.red);
    g.fillRect(50,50,200,150);
  }
}
/*<applet code=FillRectangle width=500 height=500>
</applet>
*/