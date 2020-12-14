package familyTree;

/**
 * GenePool
 * @author bradmartin
 * Conducts mutations and creates grandParents array
 */

public class Organism extends Mutate
{
	private String w, x, y, z;
	int 				   choice = (int)(Math.random()); //can either flip or invert first
	static String[]        combos = {"11", "12", "13", "14", "21", "22", "23", "24", "31", "32", "33", "34", "41", "42", "43", "44"};
	static String[]        genes  = {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4", "C1", "C2", "C3", "C4", "D1", "D2", "D3", "D4"};
	static String          single = ""; //to indicate single solutions that become dominant genes
	static String[] grandParentL1 = new String[4];
	static String[] grandParentR1 = new String[4];
	static String[] grandParentL2 = new String[4];
	static String[] grandParentR2 = new String[4];
	static int     grandCounterL1 = 0;
	static int     grandCounterR1 = 0;
	static int     grandCounterL2 = 0;
	static int     grandCounterR2 = 0;

	public Organism(String wIn, String xIn, String yIn, String zIn)
	{
		this.w = wIn;
		this.x = xIn;
		this.y = yIn;
		this.z = zIn;
		mutate1(w, x, y, z);
		mutate2(w, x, y, z);
		fill();
	}

	void mutate1(String wOut, String xOut, String yOut, String zOut)
	{
		if(choice == 0)
		{
			w = super.flipWZ(wOut, zOut);
			x = super.flipXY(xOut, yOut);
			y = super.flipXY(xOut, yOut);
			z = super.flipWZ(wOut, zOut);
		}
		else
		{
			w = super.invertWX(wOut, xOut);
			x = super.invertWX(wOut, xOut);
			y = super.invertYZ(yOut, zOut);
			z = super.invertYZ(yOut, zOut);
		}

		if(w.equals(x) && x.equals(y) && y.equals(z))
		{
			single = w + "*";
		}
	}

	void mutate2(String wOut, String xOut, String yOut, String zOut)
	{
		if(w.equals(x) && x.equals(y) && y.equals(z))
		{
			return;
		}

		if(choice == 0)
		{
			w = super.invertWX(wOut, xOut);
			x = super.invertWX(wOut, xOut);
			y = super.invertYZ(yOut, zOut);
			z = super.invertYZ(yOut, zOut);
		}
		else
		{
			w = super.flipWZ(wOut, zOut);
			x = super.flipXY(xOut, yOut);
			y = super.flipXY(xOut, yOut);
			z = super.flipWZ(wOut, zOut);
		}
	}

	//fill grandParent array
	void fill()
	{
		if (grandCounterL1 < 4)
		{
			grandParentL1[grandCounterL1] = w;

			for (int i = 0; i < combos.length; i++)
			{
				if (combos[i].equals(grandParentL1[grandCounterL1]))
				{
					grandParentL1[grandCounterL1] = genes[i];
				}
			}

			if (single.length() == 3)
			{
				grandParentL1[grandCounterL1] += "*";
			}

			single = "";
			grandCounterL1++;
		}

		if (grandCounterL1 == 4 && grandCounterR1 < 4)
		{
			grandParentR1[grandCounterR1] = w;

			for (int i = 0; i < combos.length; i++)
			{
				if (combos[i].equals(grandParentR1[grandCounterR1]))
				{
					grandParentR1[grandCounterR1] = genes[i];
				}
			}

			if (single.length() == 3)
			{
				grandParentR1[grandCounterR1] += "*";
			}

			single = "";
			grandCounterR1++;
		}

		if (grandCounterL1 == 4 && grandCounterR1 == 4 && grandCounterL2 < 4)
		{
			grandParentL2[grandCounterL2] = w;

			for (int i = 0; i < combos.length; i++)
			{
				if (combos[i].equals(grandParentL2[grandCounterL2]))
				{
					grandParentL2[grandCounterL2] = genes[i];
				}
			}

			if (single.length() == 3)
			{
				grandParentL2[grandCounterL2] += "*";
			}

			single = "";
			grandCounterL2++;
		}

		if (grandCounterL1 == 4 && grandCounterR1 == 4 && grandCounterL2 == 4 && grandCounterR2 < 4)
		{
			grandParentR2[grandCounterR2] = w;

			for (int i = 0; i < combos.length; i++)
			{
				if (combos[i].equals(grandParentR2[grandCounterR2]))
				{
					grandParentR2[grandCounterR2] = genes[i];
				}
			}

			if (single.length() == 3)
			{
				grandParentR2[grandCounterR2] += "*";
			}

			single = "";
			grandCounterR2++;
		}
	}
}