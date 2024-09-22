import java.util.*;
class Student
{
  String name;
  int rollno;
  float m1,m2,m3;

  Scanner scan=new Scanner(System.in);
  
  void getData()
  {
    System.out.print("\n\n Enter name:");
    name=scan.next();

    System.out.print("\n\n Enter Rollno:");
    rollno=scan.nextInt();

    System.out.print("\n\n Enter Marks:");
    m1=scan.nextFloat();
    m2=scan.nextFloat();
    m3=scan.nextFloat();
  }
  void putData()
  {
    System.out.println("\n\n Namr:"+name);
    System.out.println("\n\n Rollno:"+rollno);
    System.out.print("\n\n M1:"+m1);
    System.out.print("\n\n M2:"+m2);
    System.out.println("\n\n M3:"+m3);
  }
}

class Result extends Student
{
  float total,avg;
  void calculate()
  {
    total=m1+m2+m3;
    avg=total/3;
  }
  void display()
  {
    System.out.print(" TOTAL:"+total);  
    System.out.print(" AVG:"+avg);
  }
}
class StudentInfo
{
  public static void main(String args[])
  {
    Result R =new Result();
    R.getData();
    R.putData();
    R.calculate();
    R.display();
 }
}
   



    
  