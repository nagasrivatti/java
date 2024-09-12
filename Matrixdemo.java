import java.io.*;
import java.util.*;
class Matrixdemo
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of the matrix:");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("Enter "+(r*c)+" elements into the matrix:");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("the elements of the matrix:");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j< c; j++) {
            System.out.println(arr[i][j]+"");
        }
        System.out.println();
    }
}
}
