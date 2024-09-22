class A
{
  int a=10;
  void display1()
  {
    System.out.print("\n\n A="+a);
  }
}
class B extends A
{
  int b=20;
  void display2()
  {
    System.out.print("\n\n B="+b);
   }
}
class C extends A
{
  int c=30;
  void display()
  {
    System.out.print("\n\n C="+c);
   }

}
class Hirachical
{
  public static void main(String arge[])
  {
    B obj1=new B();
    C obj2=new C();
    
    obj1.display1();
    obj1.display2();
    
    obj2.display1();
    obj2.display();
  }
}
    