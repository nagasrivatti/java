import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class CircleArea1
{
	double r;
	double area()
	{
		return (22/7.0)*r*r;
	}
}
public class CircleMain1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CircleArea1 ca1 = new CircleArea1();
		CircleArea1 ca2 = new CircleArea1();
		System.out.print("Enter Radius of the circle-1 : ");
		ca1.r=sc.nextDouble();
		System.out.print("Enter Radius of the circle-2 : ");
		ca2.r=sc.nextDouble();
		System.out.println("Area of Circle-1 is : "+ca1.area());	
		System.out.println("Area of Circle-2 is : "+ca2.area());
	}
}
