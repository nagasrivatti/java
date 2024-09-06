import java.io.*;
import java.util.Scanner;
class Circlearea6
{
    double r;
    Circlearea6()
    {
        r=0;
    }
    Circlearea6(double c){
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
    class Main
    {
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Circlearea6 ob1=new Circlearea6();
	    Circlearea6 ob2=new Circlearea6(5);
	    System.out.println("Enter redius of two circles:");
	    double radius1=sc.nextDouble();
	    double radius2=sc.nextDouble();
		ob1.setCircle(radius1);
		ob2.setCircle(radius2);
		System.out.println("Area of 1st circle is"+ob1.area());
		System.out.println("Area of 2nd circle is"+ob2.area());
	}
}
