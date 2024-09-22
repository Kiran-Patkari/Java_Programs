abstract class RoundShape
{
  final float PI=3.14f;
  int rad=5;
  
  abstract void findArea();
  abstract void findVolume();
}
class Sphere extends RoundShape
{
  float area;
  float vol;
  void findArea()
  {
   area = PI*rad*rad;
   System.out.print("\n\n Area of circle="+area);
  }
  void findVolume()
  {
    vol=4/3*PI*rad*rad*rad;
    System.out.print("\n\n Volume of Sphere ="+vol);
  }
}
class AbstractDemo
{
  public static void main(String args[])
  {
    Sphere S=new Sphere();
    S.findArea();
    S.findVolume();
  }
}  
    
 