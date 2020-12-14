package familyTree;

/**
 * GenePool
 * @author bradmartin
 * Generates grandParent genes
 */

public class Combinations
{
	static String[] combos = {"11", "12", "13", "14", "21", "22", "23", "24", "31", "32", "33", "34", "41", "42", "43", "44"};
	static String      set = "";

	//make organisms with 4 random genes
	static void makeOrganism()
	{
		set = combos[(int)(Math.random()*16)] + combos[(int)(Math.random()*16)] + combos[(int)(Math.random()*16)] + combos[(int)(Math.random()*16)];
		@SuppressWarnings("unused")
		Organism org = new Organism(set.substring(0, 2), set.substring(2, 4), set.substring(4, 6), set.substring(6, 8));
	}

	//essentially making 4 greatGrandParents
	public static void main(String[] args)
	{
		for (int i = 0; i < 16; i++)
		{
			Combinations.makeOrganism();
		}
	}
}