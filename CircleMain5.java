import java.io.*;
import java.util.Scanner;
class CircleArea5
{
    double r;
    CircleArea5()
    {
        r=0;
    }
    CircleArea5(double c){
        r=c;
    }
    
    double area(){
        return(22/7.0)*r*r;
    }
    void setCircle(double r)
    {
        this.r=r;
    }
}
    class CircleMain5
    {
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    CircleArea5 ob1=new CircleArea5();
	    CircleArea5 ob2=new CircleArea5(5);
	    System.out.println("Enter redius of two circles:");
	    double radius1=sc.nextDouble();
		ob1.setCircle(radius1);
		System.out.println("Area of 1st circle is"+ob1.area());
		System.out.println("Area of 2nd circle is"+ob2.area());
	}
}
