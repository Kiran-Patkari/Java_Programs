class A
{
  int x=10;
  void display1()
  {
    System.out.print("\n\n X"+x);
  }
}
class B extends A
{
  int y=20;
  void display2()
  {
   System.out.print("\n\n Y"+y);
  }
}
class SingleDemo
{
  public static void main (String args[])
  {
    B obj =new B();
    obj.display1();
    obj.display2();
  }
}
