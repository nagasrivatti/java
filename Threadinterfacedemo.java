import java.io.*;
import java.lang.*;
class Threadinterfacedemo implements Runnable{
    public void run(){
    System.out.println("thread is created and is running ");
    }
    public static void main (String[] args) {
        
     Threadinterfacedemo ob1=new Threadinterfacedemo();
	 Thread t=new Thread(ob1);
	 t.start();
    }
}
