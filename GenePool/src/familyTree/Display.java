package familyTree;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * GenePool
 * @author bradmartin
 * Display organisms of choice via scanner input
 */

@SuppressWarnings("serial")
public class Display extends JFrame
{
	public Display()
	{
		setVisible(true);
		setResizable(false);
		setSize(750,750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		validate();
	}

	public static void main(String[] args)
	{
		new Display();
	}

	String w = Prompt.w;
	String x = Prompt.x;
	String y = Prompt.y;
	String z = Prompt.z;
	static int width = 25;
	static int height = 25;

	public void paint(Graphics g)
    {
		//white background
		g.setColor(Color.white);
		g.fillRect(0, 0, 750, 750);

		//A gene color
    	if(w.contains("0"))
    	{
    		g.setColor(Color.gray);
    	}
    	if(w.contains("1"))
    	{
    		g.setColor(Color.red);
    	}
    	if(w.contains("2"))
    	{
    		g.setColor(Color.green);
    	}
    	if(w.contains("3"))
    	{
    		g.setColor(Color.blue);
    	}
    	if(w.contains("4"))
    	{
    		g.setColor(Color.black);
    	}

    	//B gene size
		if(x.contains("1"))
		{
			width *= 2;
			height *= 2;
		}
		if(x.contains("2"))
		{
			width *= 3;
			height *= 3;
		}
		if(x.contains("3"))
		{
			width *= 4;
			height *= 4;
		}
		if(x.contains("4"))
		{
			width *= 5;
			height *= 5;
		}

		//C gene fill
		int [] xPointsDia = {50, 50+(width/2), 50+width, 50+(width/2)};
		int [] yPointsDia = {50+(height/2), 50, 50+(height/2), 50+height};
		int [] xPointsTri = {50, 50+(width/2), 50+width};
		int [] yPointsTri = {50, 50+height, 50};
		int [] xPointsRay = {50, 50+(width/2), 50+width, 50+(width/2)};
		int [] yPointsRay = {50+(height/3), 50, 50+(height/3), 50+height};
		if(y.contains("0"))
		{
	    	g.fillPolygon(xPointsDia, yPointsDia, 4);
		}
		if(y.contains("1"))
		{
	    	g.fillOval(50, 50, width, height);
		}
		if(y.contains("2"))
		{
			g.fillPolygon(xPointsTri, yPointsTri, 3);
		}
		if(y.contains("3"))
		{
			g.fillRect(50, 50, width, height);
		}
		if(y.contains("4"))
		{
			g.fillPolygon(xPointsRay, yPointsRay, 4);
		}

		//D gene texture
		BufferedImage img = null;
		if(z.contains("1"))
		{
			try {
				img = ImageIO.read(new File("images/cracks.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(z.contains("2"))
		{
			try {
				img = ImageIO.read(new File("images/zebra.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(z.contains("3"))
		{
			try {
				img = ImageIO.read(new File("images/spiral.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(z.contains("4"))
		{
			try {
				img = ImageIO.read(new File("images/whispy.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		g.drawImage(img, 50, 50, height, width, this);

		//C gene outline
		if(y.contains("0"))
		{
			g.drawPolygon(xPointsDia, yPointsDia, 4);
		}
		if(y.contains("1"))
		{
			g.drawOval(50, 50, width, height);
		}
		if(y.contains("2"))
		{
			g.drawPolygon(xPointsTri, yPointsTri, 3);
		}
		if(y.contains("3"))
		{
			g.drawRect(50, 50, width, height);
		}
		if(y.contains("4"))
		{
			g.drawPolygon(xPointsRay, yPointsRay, 4);
		}

		g.setColor(Color.black);
		int spacer = 0;
		for (int i = 0; i < 4; i++)
		{
			g.drawString(Prompt.individual[i], 10 + (width/2) + spacer, height + 88);
			spacer += 23;
		}
    }
}