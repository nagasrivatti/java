import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to check if the integer is even or odd: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even integer");
        else
            System.out.println(num + " is odd integer");
    }
}
