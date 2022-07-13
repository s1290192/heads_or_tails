import java.util.Scanner;
import java.util.Random;

public class HeadsOrTails
{
    public static void main(String[] args)
    {
	String name;
	int coin, count_h = 0, count_t = 0;
	Random ran = new Random();

	System.out.println("Who are you?");
        System.out.print(">");
        Scanner sc = new Scanner(System.in);
	name = sc.next();
	System.out.println("Hello," + name + "!");
	
	    System.out.println("Tossing coin...");
	for(int i = 1; i <= 3; i++)
	    {
		System.out.print("Round " + i + ": ");
		coin = ran.nextInt(2);

		if(coin == 0)
		    {
			System.out.println("Tails");
			count_t++;
		    }
		else
		    {
			System.out.println("Heads");
			count_h++;
		    }
	    }
	System.out.println("Heads: " + count_h + ", Tails: " + count_t);
    }
}
