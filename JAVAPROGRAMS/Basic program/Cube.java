class Cube 
{
  int side;
  Cube(int x)
  {
    side=x;
  }
  void display()
  {
    System.out.print("\n\n Side:"+side);
  }
   void calculate()
   {
     int vol;
     vol=side*side*side;
     System.out.print("\n\n VOLUME:"+vol);
   }
   public static void main(String args[])
   {  
     Cube C=new Cube(15);
     C.display();
     C.calculate();
   }
}