import java.io.*;
class Animal
{
	String color="White";
	void eat()
	{
		System.out.println("Animal is eating ");
	}
}
class Dog extends Animal
{
	String color="Blck";
	void print_color()
	{
		System.out.println("Dog color is:"+color);
		System.out.println("Animal color is:"+super.color);
	}
	void eat()
	{
		System.out.println("Dog is eating");
	}
	void Bark()
	{
		System.out.println("Dog is barking");
	}
	void Work()
	{
		super.eat();
		print_color();
		Bark();
		eat();
	}
}
class Superdemo2
{
	public static void main(String args[])
	{
		Dog D=new Dog();
		D.Work();
	}
}
