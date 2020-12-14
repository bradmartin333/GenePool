package familyTree;

/**
 * GenePool
 * @author bradmartin
 * Method for solving gene combinations
 */

public class Mutate
{
	int w1, w2, x1, x2, y1, y2, z1, z2;

	public String flipWZ(String wIn, String zIn)
	{
		int process1;
		int process2;
		String go1 = null;
		String go2 = null;
		String WZ;

		w1 = Integer.parseInt(wIn.substring(0, 1));
		w2 = Integer.parseInt(wIn.substring(1, 2));
		z1 = Integer.parseInt(zIn.substring(0, 1));
		z2 = Integer.parseInt(zIn.substring(1, 2));

		process1 = w1 + z1;
		process2 = w2 + z2;

		if(process1 % 4 == 1)
		{
			go1 = "1";
		}
		if(process1 % 4 == 2)
		{
			go1 = "2";
		}
		if(process1 % 4 == 3)
		{
			go1 = "3";
		}
		if(process1 % 4 == 0)
		{
			go1 = "4";
		}

		if(process2 % 4 == 1)
		{
			go2 = "1";
		}
		if(process2 % 4 == 2)
		{
			go2 = "2";
		}
		if(process2 % 4 == 3)
		{
			go2 = "3";
		}
		if(process2 % 4 == 0)
		{
			go2 = "4";
		}

		WZ = go1 + go2;
		return WZ;
	}

	public String flipXY(String xIn, String yIn)
	{
		int process1;
		int process2;
		String go1 = null;
		String go2 = null;
		String XY;

		x1 = Integer.parseInt(xIn.substring(0, 1));
		x2 = Integer.parseInt(xIn.substring(1, 2));
		y1 = Integer.parseInt(yIn.substring(0, 1));
		y2 = Integer.parseInt(yIn.substring(1, 2));

		process1 = x1 + y1;
		process2 = x2 + y2;

		if(process1 % 4 == 1)
		{
			go1 = "1";
		}
		if(process1 % 4 == 2)
		{
			go1 = "2";
		}
		if(process1 % 4 == 3)
		{
			go1 = "3";
		}
		if(process1 % 4 == 0)
		{
			go1 = "4";
		}

		if(process2 % 4 == 1)
		{
			go2 = "1";
		}
		if(process2 % 4 == 2)
		{
			go2 = "2";
		}
		if(process2 % 4 == 3)
		{
			go2 = "3";
		}
		if(process2 % 4 == 0)
		{
			go2 = "4";
		}

		XY = go1 + go2;
		return XY;
	}

	public String invertWX(String wIn, String xIn)
	{
		int process1;
		int process2;
		String go1 = null;
		String go2 = null;
		String WX;

		w1 = Integer.parseInt(wIn.substring(0, 1));
		w2 = Integer.parseInt(wIn.substring(1, 2));
		x1 = Integer.parseInt(xIn.substring(0, 1));
		x2 = Integer.parseInt(xIn.substring(1, 2));

		process1 = w1 + x1;
		process2 = w2 + x2;

		if(process1 % 4 == 1)
		{
			go1 = "1";
		}
		if(process1 % 4 == 2)
		{
			go1 = "2";
		}
		if(process1 % 4 == 3)
		{
			go1 = "3";
		}
		if(process1 % 4 == 0)
		{
			go1 = "4";
		}

		if(process2 % 4 == 1)
		{
			go2 = "1";
		}
		if(process2 % 4 == 2)
		{
			go2 = "2";
		}
		if(process2 % 4 == 3)
		{
			go2 = "3";
		}
		if(process2 % 4 == 0)
		{
			go2 = "4";
		}

		WX = go1 + go2;
		return WX;
	}

	public String invertYZ(String yIn, String zIn)
	{
		int process1;
		int process2;
		String go1 = null;
		String go2 = null;
		String YZ;

		y1 = Integer.parseInt(yIn.substring(0, 1));
		y2 = Integer.parseInt(yIn.substring(1, 2));
		z1 = Integer.parseInt(zIn.substring(0, 1));
		z2 = Integer.parseInt(zIn.substring(1, 2));

		process1 = y1 + z1;
		process2 = y2 + z2;

		if(process1 % 4 == 1)
		{
			go1 = "1";
		}
		if(process1 % 4 == 2)
		{
			go1 = "2";
		}
		if(process1 % 4 == 3)
		{
			go1 = "3";
		}
		if(process1 % 4 == 0)
		{
			go1 = "4";
		}

		if(process2 % 4 == 1)
		{
			go2 = "1";
		}
		if(process2 % 4 == 2)
		{
			go2 = "2";
		}
		if(process2 % 4 == 3)
		{
			go2 = "3";
		}
		if(process2 % 4 == 0)
		{
			go2 = "4";
		}

		YZ = go1 + go2;
		return YZ;
	}
}