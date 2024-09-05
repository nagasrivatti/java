import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of the array:");
        int pos=-1;
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+n+"values into the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter search element:");
        int key=sc.nextInt();
    
        for(int i=0;i<n;i++)
        {
            if( arr[i]==key)
            {
                pos=i+1;
                break;
            }
        }
        if(pos==-1)
        {
        System.out.println(key+ "not found in the array, search unsuccessfull");
        }
        else
        System.out.println("found at "+pos+" position in the array " +key);
    }
}






