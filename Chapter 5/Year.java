import java.util.Scanner;

/**
 * Write a description of class LeapYear here.
 * 
 * @author (Tong) 
 * @version (21 October 2015)
 */
public class Year
{
    public static void main( String[] args)
    {
    
        // put your code here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter in a year: ");
        int year = s.nextInt();
        int num = year % 4;
        if (num == 0)
        {
            System.out.println("This year is a leap year. ");
        }
        else
        {
            System.out.println("This year is not a leap year.");
        }
    }
    }

