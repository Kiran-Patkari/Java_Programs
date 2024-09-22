interface A
{
  int x=10;
  void display();
}
interface B extends A
{
  void display2();
}
interface C extends A
{
  void show();
}
class D implements B,C
{
    public void display()
    {
      System.out.print("\n\n Interface A- X:"+x);
    }
    public void display2()
    {
      System.out.print("\n\n Interface B- X:"+x);
    }
    public void show()
    {
      System.out.print("\n\n Interface C DISPLAY");
    }
}
class HybridInterface
{
  public static void main(String args[])
  {
    D obj=new D();
    obj.display();
    obj.display2();
    obj.show();
  }
} 