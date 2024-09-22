abstract class Sample
{
  int a,b;
  abstract void display();
}
class Demo extends Sample
{
  void display()
  {
    System.out.print("\n\n A");
    System.out.print("\n\n B");
   }
}
class AbstractSample
{
  public static void main(String args[])
  {
    Demo D =new Demo();
    D.display();
   }
}