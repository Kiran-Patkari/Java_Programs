import java.awt.*;
import java.applet.*;

public class StatusDemo extends Applet
{
  String str1=null,str2=null,msg=null;
  public void init()
  {
    str1 = getParameter("girl");
    str2 = getParameter("boy");
    msg= str1+str2;
  }
  public void paint(Graphics g)
  {
    showStatus("msg");
  }
}
/*
<applet code="StatusDemo.java" width=600 height=600>
   <param name="girl" value="kiran">
   <param name="boy" value="junkook">
</applet>
*/