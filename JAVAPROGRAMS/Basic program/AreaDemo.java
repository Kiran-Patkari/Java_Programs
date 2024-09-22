import java.io.*;
class AreaDemo
{
  public static void main(String args[])
 {
   int rad;
   double pi=3.14,area;
   String S1;
   InputStreamReader input=new InputStreamReader(System.in);
   BufferedReader buff=new BufferedReader(input);
   try
   {
     System.out.print("\n\n Enter Radius of circle");
     S1=buff.readLine();
     rad=Integer.parseInt(S1);
     area=pi*rad*rad;
   
     System.out.print("\n\n Radius="+rad);
     System.out.print("\n\n Area="+area);
    }
    catch(Exception e)
    {
    
      System.out.print("\n\n Error:");
    }
  }
}