import java.io.*;
import java.util.Scanner;
class Circlearea7
{
    double r;
    Circlearea7()
    {
        r=0;
    }
    Circlearea7(double r){
        this.r=r;
    }
    
    double area(){
        return(22/7.0)*r*r;
    }
    double area(double x){
        return(22/7.0)*x*x;
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
	    Circlearea7 c1=new Circlearea7();
	    Circlearea7 c2=new Circlearea7(3.6);
	    Circlearea7 c3=new Circlearea7(5);
	    System.out.println("Area of 1st circle is "+c1.area());
	    System.out.println("Area of 1st circle updated is "+c1.area(8));
	    System.out.println("Enter redius of  circles to find the area:");
	    double radius=sc.nextDouble();
	    Circlearea7 c4=new Circlearea7();
	    c4.setCircle(radius);
	    System.out.println("Area of  circle is"+c4.area());
		System.out.println("Area of 2nd circle is"+c2.area());
		System.out.println("Area of 3rd circle is"+c3.area());
	}
}
