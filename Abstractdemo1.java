import java.io.*;
import java.util.*;
abstract class Base
{
	abstract void fun();
}
class Derived extends Base
{
	void fun()
	{
		System.out.println("derived fun is invoked");
	}
}
class Abstractdemo1
{
	public static void main(String args[])
	{
		Derived D=new Derived();
		D.fun();
		Base B=new Derived();
		B.fun();
	}
}
