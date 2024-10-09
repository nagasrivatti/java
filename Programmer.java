class Employee
{
	float salary=500;
}
class Programmer extends Employee
{
int bonos;
public static void main(String args[])
	{
Employee e=new Employee();
Programmer p=new Programmer();
e.salary=500;
p.bonos=100;
System.out.println("salary of the employee is:"+e.salary);
System.out.println("Bonos for the programmer is:"+p.bonos);
	}	
}
