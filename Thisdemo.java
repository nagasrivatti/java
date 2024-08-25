import java.io.*;
public class Main {
    private int a;
    public void Set_Number(int a)
    {
        this.a=a;
        System.out.println("a value is "+a);
    }
    public static void main(String args[])
    {
        Main td=new Main();
        td.Set_Number(60);
    }
}
