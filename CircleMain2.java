import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class CircleArea2
{
	double x,y,r;
	double area()
	{
		return (22/7.0)*r*r;
	}
	void setCircle(double a,double b,double c)
	{
		x=a;
		y=b;
		r=c;
	} 

}
public class CircleMain2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CircleArea2 ob1 = new CircleArea2();
		CircleArea2 ob2 = new CircleArea2();
		ob1.setCircle(3.0,4.0,5.0);
		ob2.setCircle(6.0,8.0,10.0);
		System.out.println("Area of Circle 1 is : "+ob1.area());	
		System.out.println("Area of Circle 2 is : "+ob2.area());
	}
}