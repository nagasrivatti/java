import java.io.*;
import java.util.*;
public class Main
{
    int x,y,z;
    int add(int x,int y)
    {
    z = x+y;
    return z;
    }
public static void main(String args[])
    {
        int x,y,z;
    Main a=new Main();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a two integers for addition:");
    x=sc.nextInt();
   y=sc.nextInt();
   z=a.add(x,y);
    System.out.println("sum of "+x+" and "+y+" is "+z);
    }
}
