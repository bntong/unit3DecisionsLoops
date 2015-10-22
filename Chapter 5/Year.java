import java.util.Scanner;

/**
 * Write a description of class LeapYear here.
 * 
 * @author (Tong) 
 * @version (21 October 2015)
 */
public class Year
{
    public static boolean isLeapYear(int year)
    {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    public static void main( String[] args)
    {
    
        // put your code here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter in a year: ");
        int year = s.nextInt();
        if (Year.isLeapYear(year))
        {
            System.out.println("This year is a leap year. ");
        }
        else
        {
            System.out.println("This year is not a leap year.");
        }
    }
    }

