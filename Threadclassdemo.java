import java.io.*;
import java.lang.*;
class Threadclassdemo extends Thread{
	public static void main (String[] args) {
		Thread t1=new Thread("my thread");
		Threadclassdemo t2=new Threadclassdemo();
		t1.start();
		t2.start();
		String str=t1.getName();
		System.out.println("Thread name is:"+str);
	}
	public void run(){
		System.out.println("thread is created and executed");
	}
}
