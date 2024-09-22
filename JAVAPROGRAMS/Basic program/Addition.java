class Addition
{
  int a,b,sum;

  Addition(int x,int y)
  {
   a=x;
   b=y;
  }
  void display()
  {
    System.out.print("\n\n A:"+a);
    System.out.print("\n\n B:"+b);
  }
  void calculate()
  {
   sum=a+b;
   System.out.print("\n\n SUM:"+sum);
  }
  public static void main(String args[])
  {
    Addition A=new Addition(10,20);
    A.display();
    A.calculate();
  }
}
