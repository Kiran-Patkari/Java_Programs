import java.util.*;
class Student
{
  String name;
  int rollno;
  float m1,m2,m3;

  Scanner scan =new Scanner(System.in);
  
  void getData1()
  {
    System.out.print("\n\n Enter Name:");
    name=scan.next();
   
    System.out.print("\n\n Enter Rollno:");
    rollno=scan.nextInt();

    System.out.print("\n\n Enter marks of 3 subject :");
    m1=scan.nextFloat();
    m2=scan.nextFloat();
    m3=scan.nextFloat();
   
  }
   void putData1()
   {
     System.out.print("\n\n NAME:"+name);
     System.out.print("\n\n ROLLNO:"+rollno);
     System.out.print("\n\n M1:"+m1);
     System.out.print("\n\n M2:"+m2);
     System.out.print("\n\n M3:"+m3);
  }
}
class Sports extends Student
{
 float score;
 void getData2()
 {
   System.out.print("\n\n Enter Score:");
   score=scan.nextFloat();
 }
 void putData2()
 {
   
   System.out.print("\n\n Score:"+score);
 }
}
class Result extends Sports
{
  float total,avg;
  void calculate()
  {
    total=m1+m2+m3+score;
    avg=(m1+m2+m3)/3;
    System.out.print("\n\n TOTAL:"+total);
    System.out.print("\n\n AVG:"+avg);
  }
}
class MultiDemo
{
  public static void main(String args[])
  {
    Result R =new Result();
    R.getData1();
    R.getData2();
    R.putData1();
    R.putData2();
    R.calculate();
  }
}
    

  
     
  
  