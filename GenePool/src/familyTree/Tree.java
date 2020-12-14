package familyTree;

/**
 * GenePool
 * @author bradmartin
 * Generates and outputs family tree
 */

public class Tree
{
	static String[] grandParentL1 = Organism.grandParentL1;
	static String[] grandParentR1 = Organism.grandParentR1;
	static String[] grandParents1 = new String[8];
	static String[] grandParentL2 = Organism.grandParentL2;
	static String[] grandParentR2 = Organism.grandParentR2;
	static String[] grandParents2 = new String[8];
	static String[]        domGP1 = new String[4];
	static String[]        domGP2 = new String[4];
	static int         numParentL = (int)(Math.random()*4) + 1;
	static int         numParentR = (int)(Math.random()*4) + 1;
	static String[][]     parentL = new String[numParentL][4];
	static String[][]     parentR = new String[numParentR][4];
	static int	   choose, hybrid = 0;
	static int            numKids = (int)(Math.random()*4) + 1;
	static String[][]        kids = new String[numKids][10]; //used 10 to cheat an array out of bounds error
	static int numGenesL, betweenL, numGenesR, betweenR, middle, numKidGenes, betweenKids;

	public void houseKeeping()
	{
		for (int i = 0; i < grandParents1.length; i++)
		{
			if (i < 4)
			{
				grandParents1[i] = grandParentL1[i];
			}
			else
			{
				grandParents1[i] = grandParentR1[i-(i-1)];
			}
		}

		for (int i = 0; i < grandParents2.length; i++)
		{
			if (i < 4)
			{
				grandParents2[i] = grandParentL2[i];
			}
			else
			{
				grandParents2[i] = grandParentR2[i-4];
			}
		}
	}

	public void printGrandParents()
	{
		System.out.println();

		for (int i = 0; i < 20; i++)
		{
			System.out.print(" ");
		}

		for (int i = 0; i < grandParentL1.length; i++)
		{
			if (i == grandParentL1.length - 1)
			{
				System.out.print(grandParentL1[i]);
			}
			else
			{
				System.out.print(grandParentL1[i] + " ");
			}
		}

		System.out.print(" ------ ");

		for (int i = 0; i < grandParentR1.length; i++)
		{
			if (i == grandParentR1.length - 1)
			{
				System.out.print(grandParentR1[i]);
			}
			else
			{
				System.out.print(grandParentR1[i] + " ");
			}
		}

		for (int i = 0; i < 40; i++)
		{
			System.out.print(" ");
		}

		for (int i = 0; i < grandParentL2.length; i++)
		{
			if (i == grandParentL2.length - 1)
			{
				System.out.print(grandParentL2[i]);
			}
			else
			{
				System.out.print(grandParentL2[i] + " ");
			}
		}

		System.out.print(" ------ ");

		for (int i = 0; i < grandParentR2.length; i++)
		{
			if (i == grandParentR2.length - 1)
			{
				System.out.print(grandParentR2[i]);
			}
			else
			{
				System.out.print(grandParentR2[i] + " ");
			}
		}
	}

	public void domGP()
	{
		int fill1 = 0;
		for (int i = 0; i < grandParentL1.length; i++)
		{
			if (grandParentL1[i].length() == 3)
			{
				domGP1[fill1] = grandParentL1[i];
				fill1++;
			}
		}

		for (int i = 0; i < grandParentR1.length; i++)
		{
			if (grandParentR1[i].length() == 3)
			{
				domGP1[fill1] = grandParentR1[i];
				fill1++;
			}
		}

		int fill2 = 0;
		for (int i = 0; i < grandParentL2.length; i++)
		{
			if (grandParentL2[i].length() == 3)
			{
				domGP2[fill2] = grandParentL2[i];
				fill2++;
			}
		}

		for (int i = 0; i < grandParentR2.length; i++)
		{
			if (grandParentR2[i].length() == 3)
			{
				domGP2[fill2] = grandParentR2[i];
				fill2++;
			}
		}
	}

	public void makeParents()
	{
		for (int i = 0; i < numParentL; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if (domGP1[j] != null)
				{
					parentL[i][j] = domGP1[j];
				}
				else
				{
					choose = (int)(Math.random()*8);
					for (int k = 0; k < domGP1.length; k++)
					{
						if (grandParents1[choose] == domGP1[k])
						{
							while (grandParents1[choose] == domGP1[k])
							{
								choose = (int)(Math.random()*8);
							}
						}
					}
					parentL[i][j] = grandParents1[choose];
				}
			}
		}

		for (int i = 0; i < numParentR; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if (domGP2[j] != null)
				{
					parentR[i][j] = domGP2[j];
				}
				else
				{
					choose = (int)(Math.random()*8);
					for (int k = 0; k < domGP2.length; k++)
					{
						if (grandParents2[choose] == domGP2[k])
						{
							while (grandParents2[choose] == domGP2[k])
							{
								choose = (int)(Math.random()*8);
							}
						}
					}
					parentR[i][j] = grandParents2[choose];
				}
			}
		}
	}

	public void printParents()
	{
		for (int i = 0; i < 3; i++)
		{
			System.out.print("\n\t\t\t\t   |\t\t\t\t\t\t\t\t\t |");
		}
		System.out.println();

		numGenesL = 13 * numParentL;
		betweenL = (70 - numGenesL)/numParentL;

		for (int i = 0; i < betweenL/2; i++)
		{
			System.out.print(" ");
		}

		for (int i = 0; i < numParentL; i++)
		{
			if (i == numParentL - 1)
			{
				for (int j = 0; j < 4; j++)
				{
					System.out.print(parentL[i][j] + " ");
				}
			}
			else
			{
				for (int j = 0; j < 4; j++)
				{
					System.out.print(parentL[i][j] + " ");
				}
				for (int j = 0; j < betweenL; j++)
				{
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}

		numGenesR = 13 * numParentR;
		betweenR = (70 - numGenesR)/numParentR;
		middle = 70 - ((betweenL/2) + numGenesL + (betweenL * (numParentL - 1)));

		for (int i = 0; i < (middle + (betweenR/2)); i++)
		{
			System.out.print(" ");
		}
		for (int i = 0; i < numParentR; i++)
		{
			if (i == numParentR - 1)
			{
				for (int j = 0; j < 4; j++)
				{
					System.out.print(parentR[i][j] + " ");
				}
			}
			else
			{
				for (int j = 0; j < 4; j++)
				{
					System.out.print(parentR[i][j] + " ");
				}
				for (int j = 0; j < betweenR; j++)
				{
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public void makeKids()
	{
		int count = 0;

		for (int i = 0; i < numKids; i++)
		{
			while(count < 4)
			{
				for (int k = 0; k < 4; k++)
				{
					if(parentL[numParentL - 1][k].length() == 3)
					{
						kids[i][count] = parentL[numParentL - 1][k];
						count++;
					}
				}

				for (int k = 0; k < 4; k++)
				{
					if(parentR[0][k].length() == 3)
					{
						kids[i][count] = parentR[0][k];
						count++;
					}
				}

				for (int k = 0; k < 4; k++)
				{
					hybrid = (int)(Math.random());
					choose = (int)(Math.random()*4);
					if(hybrid == 0)
					{
						if (parentL[numParentL - 1][choose].length() == 3)
						{
							while (parentL[numParentL - 1][choose].length() == 3)
							{
								choose = (int)(Math.random()*4);
							}
						}

						kids[i][count] = parentL[numParentL - 1][choose];
						count++;
					}
					else
					{
						if (parentR[0][choose].length() == 3)
						{
							while (parentR[0][choose].length() == 3)
							{
								choose = (int)(Math.random()*4);
							}
						}

						kids[i][count] = parentR[0][choose];
						count++;
					}
				}
			}
			count = 0;
		}
	}

	public void printKids()
	{
		for (int j = 0; j < 3; j++)
		{
			if(numParentL == 1)
			{
				System.out.print("                                   ");
			}
			else
			{
				for (int i = 0; i < numGenesL + betweenL + 5; i++)
				{
					System.out.print(" ");
				}
			}

			if(j != 2)
			{
				System.out.print("|");
			}

			if(j == 2)
			{
				if(numParentR == 1)
				{
					for (int i = 0; i < 14 + middle + betweenR/2; i++)
					{
						System.out.print("-");
					}
				}
				else
				{
					for (int i = 0; i < middle + (betweenR)/numParentR + 14; i++)
					{
						System.out.print("-");
					}
				}
			}

			if(numParentR == 1)
			{
				for (int i = 0; i < 12 + middle + betweenR/2; i++)
				{
					System.out.print(" ");
				}
			}
			else
			{
				for (int i = 0; i < middle + (betweenR)/numParentR + 12; i++)
				{
					System.out.print(" ");
				}
			}

			if(j != 2)
			{
				System.out.println("|");
			}
		}

		System.out.println();
		for (int k = 0; k < (70) - 1; k++)
		{
			System.out.print(" ");
		}
		System.out.println("|");

		numKidGenes = 13 * numKids;
		betweenKids = (140 - numKidGenes)/numKids;

		for (int i = 0; i < betweenKids/2; i++)
		{
			System.out.print(" ");
		}

		for (int i = 0; i < numKids; i++)
		{
			if (i == numKids - 1)
			{
				for (int j = 0; j < 4; j++)
				{
					System.out.print(kids[i][j] + " ");
				}
			}
			else
			{
				for (int j = 0; j < 4; j++)
				{
					System.out.print(kids[i][j] + " ");
				}
				for (int j = 0; j < betweenKids; j++)
				{
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}
	}

	public static void main(String[] args)
	{
		Combinations.main(args);
		Tree tree = new Tree();
		tree.houseKeeping();
		tree.printGrandParents();
		tree.domGP();
		tree.makeParents();
		tree.printParents();
		tree.makeKids();
		tree.printKids();
	}
}