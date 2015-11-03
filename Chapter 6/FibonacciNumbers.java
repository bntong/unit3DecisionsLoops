import java.util.Scanner;

public class FibonacciNumbers
{
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter in a number 'n' that prints the nth Fibonacci number: ");  
        int num = scan.nextInt();
        
        int fold1 = 1;
        int fold2 = 1;
        System.out.println(fold1);
        System.out.println(fold2);
        for(int x = 0; x < num-2; x++)
        {
            int fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
            System.out.println(fnew);
        }
    }
}