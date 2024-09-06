import java.io.*;
import java.util.Scanner;
class Circlearea8
{
    double r;
    Circlearea8()
    {
        r=0;
    }
    Circlearea8(double r){
        this.r=r;
    }
    Circlearea8(Circlearea8 c){
        this.r=c.r;
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
	    Circlearea8 c1=new Circlearea8();
	    System.out.println("Initially area of 1st circle is "+c1.area());
	    Circlearea8 c2=new Circlearea8(7.0);
	    System.out.println("Area of circle with radius 7.0 is "+c2.area());
	    System.out.println("Area of circle with radius 5.5 is "+c2.area(5.5));
	    Circlearea8 c3=new Circlearea8(c2);
	    System.out.println("After copy constructor area of 3rd circle is "+c3.area());
	    c1.setCircle(8.8);
	    System.out.println("After set circle area of first circle is "+c1.area());
	}
}
