class A
{
  void display1()
  {
    System.out.print("\n\n DISPLAY OF A CLASS");
   }
}
class B extends A
{
  void display2()
  {
    System.out.print("\n\n DISPLAY OF B CLASS");
   }
}
class C extends B
{
  void display3()
  {
    System.out.print("\n\n DISPLAY OF C CLASS");
  }
}
class MultilevelDemo
{
  public static void main(String arge[])
  {
    C obj=new C();
    obj.display1();
    obj.display2();
    obj.display3();
  }
}