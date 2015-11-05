import java.util.Random;

public class DrunkardsWalk
{
    public static void main(String[] args)
    {
        int i = 0;
        int x = 0;
        int y = 0;
        while(i < 100)
        {
            Random rn = new Random();
            int answer = rn.nextInt(4) + 1;
            int way1 = 1;
            int way2 = 2;
            int way3 = 3;
            int way4 = 4;
            if(answer == way1)
            {
               x += 10;
               y += 10;
            }
            if(answer == way2)
            {
               x += 10 ;
            }
            if(answer == way3)
            {
                x -= 10;
                y -= 10;
            }
            if(answer == way4)
            {
                x -= 10;
            }
            i++;
        }
        System.out.print(x + "," + y);
    }
}