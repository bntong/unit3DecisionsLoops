import java.util.Scanner;

public class Spectrum
{
    public static void main( String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter in a wavelength value: ");
        double wavelength = s.nextDouble();
        
        if (wavelength > 1e-1)
        {
            System.out.println("This is a radio wave, and its frequency is < 3e9");
        } 
        else if (1e-3 <= wavelength && wavelength <= 1e-1)
        {
            System.out.println("This is a microwave, and its frequency is from 3e9 to 3e11");
        }
        else if (7e-7 <= wavelength && wavelength < 1e-3)
        {
            System.out.println("This is an Infared wave and its frequency is from 3e11 to 4e14");
        }
        else if (4e-7 <= wavelength && wavelength < 7e-7)
        {
            System.out.println("This is a visible light wave and its frequency is from 4e14 to 3e16");
        }
        else if (1e-8 <= wavelength && wavelength < 1e-7)
        {
            System.out.println("This is an ultraviolet wave and its frequency is from 7.5e14 to 3e16");
        }
        else if (1e-11 <= wavelength && wavelength < 1e-8)
        {
            System.out.println("This is an x-ray wave and its frequency is from 3e16 to 3e19");
        }
        else if (wavelength < 1e-11)
        {
            System.out.println("This is a gamma ray wave and its frequency is > 3e19");
        }
    }
}