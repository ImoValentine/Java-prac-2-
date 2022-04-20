import java.util.Scanner;
import java.util.Random;

public class Mul
{
    public void run()
    {
        Random rnd = new Random();
        int a = 2;
        int b = 5;
        for (int i = 0; i < 10; i++)
        {    int no1 = (int) (a + rnd.nextDouble()*(b - a + 1));
             System.out.println(no1);
    int no2 = (int) (a + rnd.nextDouble()*(b - a + 1));
    System.out.println(no2);
 //   anser = no1 * no2;
    System.out.println("what is the product of these two numbers?");
    Scanner ans= new Scanner(System.in);
    System.out.println(ans.nextLine());
    
            
        }
    }
    public static void  main (String[] args)
    {
    Mul obj =  new Mul ();
    obj.run();
    }
}
