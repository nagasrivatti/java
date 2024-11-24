import java.io.*;
import java.util.*;
class PrimitiveDataType
{
static Byte n;
static short x;
static int a;
static long l;
static float b;
static double c;
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Byte Value");
n=sc.nextByte();
System.out.print("Short Value");
x=sc.nextShort();
System.out.print("Int Value");
a=sc.nextInt();
System.out.print("long Value");
l=sc.nextLong();
System.out.print("float Value");
b=sc.nextFloat();
System.out.print("double Value");
c=sc.nextDouble();
System.out.println("Byte Var"+n);
System.out.println("Short Var"+x);
System.out.println("Int Var"+a);
System.out.println("long Var"+l);
System.out.println("float Var"+b);
System.out.println("double Var"+c);
}
}
o/p:
Byte Value 100
Short Value 1000
Int Value 10000
long Value 100000
float Value 1000000.000
double Value 9876.543
Byte Var 100
Short Var 1000
Int Var 10000
long Var 100000
float Var 1000000.0
double Var1 9846.543
