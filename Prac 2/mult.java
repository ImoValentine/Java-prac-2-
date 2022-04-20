import java.util.Random; 
import java.util.Scanner; 

public class mult {
	
	int max; 
	int min; 
	int points; 
	int num; 
	int level; 
	
public boolean mastered(int num, int min, int max)
	{
		Random rnd = new Random();
		for (int i=0; i<num; i++)
		{
			int no1 = (int) (min + rnd.nextDouble() * (max - min +1));
			int no2 = (int) (min + rnd.nextDouble() * (max - min +1));
			Scanner input1 = new Scanner(System.in);
			System.out.println(no1 + " * " + no2 + ": ");
			int no = input1.nextInt();
		
			
			if(no == no1*no2)
			{
				points = 1+points;
				System.out.println("The answer is CORRECT!");
			}
			else
			{
				points = points + 0; 
				System.out.println("INCORRECT Answer!");
			}
		}	
		if (((points/num)*100) > 80)
		{
			return true; //  If score is more than 80% in a level
		}
		else
		{
			return false; // If score is less than 80% in a level
		}
	}
	

public void run()
	{
		
		points = 0;
		level = 1;
		
		
		while(true)
		{
			if (level == 1)
			{
				min = 2;
				max = 5;
				num = 10;
			}
			if (level == 2)
			{
				min = 6;
				max = 9;
				num = 13;
			}
			if(level == 3)
			{
				min = 10;
				max = 13;
				num = 18;
			}
			if (mastered(num, min, max))
			{
				System.out.println("Now stepping up to the next level...");
				level = level+1;
				
			}
			else
				if (level >1)
				{
					System.out.println("Now stepping down a level...");
					level = level-1;
				}
			if (level > 3)
			{
				System.out.println("Thats the end of the multiplication session. You have mastered all three levels!");
				System.out.println("Thank you for Playing");
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		mult m = new mult();
		m.run();
						
	}

}

