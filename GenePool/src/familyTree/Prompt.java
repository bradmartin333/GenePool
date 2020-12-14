package familyTree;
import java.util.Scanner;

/**
 * GenePool
 * @author bradmartin
 * Runs everything together
 */

public class Prompt {

	public static String[] individual = new String[4];
	public static String w = "A0";
	public static String x = "B0";
	public static String y = "C0";
	public static String z = "D0";

	public void express()
	{
		for (int i = 0; i < individual.length; i++)
		{
			if(individual[i].contains("A") == true)
			{
				w = individual[i];

				for (int j = 0; j < individual.length; j++)
				{
					if(individual[i].substring(0, 1) == individual[j].substring(0, 1) && Integer.parseInt((String) individual[i].substring(1, 2)) > Integer.parseInt((String) individual[j].substring(1, 2)))
					{
						w = individual[i];
					}
				}
			}

			if(individual[i].contains("B") == true)
			{
				x = individual[i];

				for (int j = 0; j < individual.length; j++)
				{
					if(individual[i].substring(0, 1) == individual[j].substring(0, 1) && Integer.parseInt((String) individual[i].substring(1, 2)) > Integer.parseInt((String) individual[j].substring(1, 2)))
					{
						x = individual[i];
					}
				}
			}

			if(individual[i].contains("C") == true)
			{
				y = individual[i];

				for (int j = 0; j < individual.length; j++)
				{
					if(individual[i].substring(0, 1) == individual[j].substring(0, 1) && Integer.parseInt((String) individual[i].substring(1, 2)) > Integer.parseInt((String) individual[j].substring(1, 2)))
					{
						y = individual[i];
					}
				}
			}

			if(individual[i].contains("D") == true)
			{
				z = individual[i];

				for (int j = 0; j < individual.length; j++)
				{
					if(individual[i].substring(0, 1) == individual[j].substring(0, 1) && Integer.parseInt((String) individual[i].substring(1, 2)) > Integer.parseInt((String) individual[j].substring(1, 2)))
					{
						z = individual[i];
					}
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Prompt prompt = new Prompt();
		Tree.main(args);
		Scanner keyboard = new Scanner(System.in);

		System.out.println("\n\n\tEnter genes of individual\n\tHit enter after each gene\n\tDo not include *");
		System.out.print("\t      > ");
		individual[0] = keyboard.next();
		System.out.print("\t      > ");
		individual[1] = keyboard.next();
		System.out.print("\t      > ");
		individual[2] = keyboard.next();
		System.out.print("\t      > ");
		individual[3] = keyboard.next();
		prompt.express();
		Display.main(args);
		keyboard.close();
	}
}