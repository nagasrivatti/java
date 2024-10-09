import java.io.*;
import java.util.*;
class Factrec
{
	int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*factorial(n-1));
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Factrec ob=new Factrec();
		System.out.println("Enter a number to find factorial :");
		int n=sc.nextInt();
		System.out.println("Factorial of number " +n+" is"+ob.factorial(n));
	}
}
