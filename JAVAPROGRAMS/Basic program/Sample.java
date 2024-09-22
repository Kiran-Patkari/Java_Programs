import java.io.*;
class Sample
{
  public static void main(String args[])
 {
   String name;
   int rollno;
   float percentage;
   String S1,S2,S3;

   InputStreamReader input=new InputStreamReader(System.in);
   BufferedReader buff=new BufferedReader(input);
   
   try
   {																																																											   {
     System.out.print("\n\n Enter name:");
     S1=buff.readLine();

     System.out.print("\n\n Enter Rollno:");
     S2=buff.readLine();
     rollno=Integer.parseInt(S2);
     
     System.out.print("\n\n Enter percentage:");
     S3=buff.readLine();
     percentage=Integer.parseFloat(S2);
     
     System.out.print("\n\n NAME:"+name);
     System.out.print("\n\n Rollno:"+rollno);
     System.out.print("\n\n Percentage:"+percentage);
   }
    catch(Exception e)
    {
    
      System.out.print("\n\n Error:");
    }
  }
}