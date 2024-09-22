interface Sample
{
  int x=10;
  void display();
}
class Demo implements Sample
{
 public void display()
 {
   System.out.print("\n\n X:"+x);
 }
}
class InterfaceDemo
{
  public static void main(String args[])
  {
    Demo D=new Demo();
    D.display();
  }
}