        import java.io.*;
		class Bike
		{
			void run()
			{
				System.out.println("Bike is running");
			}
		}
		class Honda extends Bike{
			void run(){
				System.out.println("Honda is running");
			}
		}
		class DMDdemo
		{
			public static void main(String args[])
			{
				Bike B1=new Bike();
				B1.run();
				Honda H=new Honda();
				H.run();
				Bike B2=new Honda();
				B2.run();
			}
		}
