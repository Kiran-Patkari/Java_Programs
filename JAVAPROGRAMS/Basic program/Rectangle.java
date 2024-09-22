import java.util.Scanner;
class Rectangle extends Thread
{
  int l,b;
  int area;
  int perimeter;
  Scanner scan =new Scanner();
  
  public void run()
  {
    System.out.print("\n\n Enter length:");
    l=scan.nextInt();
    
    
    System.out.print("\n\n Enter breath:");
    b=scan.nextInt();
    
     void areaCalculate()
    {
     area=l*b;
     System.out.print("\n\n AREA:"+area);
    }
   }void periCalculate()
    {
      perimeter=2*(l+b);
      System.out.print("\n\n PERIMETER:"+perimeter);
    }
  } 
}
class RectangleDemo
{
  public static void main(String args[])
  {
    Rectangle R=new Rectangle();
    R.start();
  }
}
     
    