package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList <Nematode> nematodes = new ArrayList<Nematode>();
    Table table;

	public void keyPressed(ArrayList <Nematode> nematodes)
	{	
		ArrayList <tode> tode = new ArrayList<tode>();
		tode = nematodes;	
		int i;
		if (keyCode == LEFT)
		{
			tode[i] = tode[i+1]; 
			draw(tode);	
		}
		else if (keyCode == RIGHT)
		{
			tode[i] = tode[i-1]; 
			draw(tode);
		}
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();	
		loadNematodes();			
	}
	

	public void loadNematodes()
    {
        table = loadTable("java/data/nematodes.csv", "header");

        int rowNum = table.getRowCount();
        for(TableRow row:table.rows())
        {
            String name = row.getString("name");
            int length = row.getInt("length");
            int limbs = row.getInt("limbs");
            String gender = row.getString("gender");
            int eyes = row.getInt("eyes");
            Nematode n = new Nematode (name, length, limbs, gender, eyes);
            nematodes.add(n);

            System.out.println(name + " has length " + length + ", has " + limbs + " limbs and " + eyes + " eyes!");
        }
    }


	public void draw(tode)
	{	
		String name, gender;
		int length, limbs, eyes, i;

		int x1 = 224, y1 = 184, x2, y2;

		//name
		System.out.println(name);

		//length
		for(i = 0; i < length + 1; i++)
		{
			circle(x1, y1, 220);
			x1 = x1 + 220;
			y1 = y1 + 220;
		}

		//limbs
		if (limbs != 0)
		{
			line(x1, y1, x2, y2);
		}

		//gender
		if (gender = m)
		{
			line();
		}
		else if (gender = f)
		{
			x1 = x1 - 220;
			y1 = y1 - 220;
			circle(x1, y1, 110);
		}
		else if (gender = h)
		{
			//male
			line();

			//female
			x1 = x1 - 220;
			y1 = y1 - 220;
			circle(x1, y1, 110);
		}

		int x1 = 224, y1 = 184, x2, y2;

		//eyes
		if (lines = 1)
		{
			size(100, 100);
			line();
			size(100, 100);
			line();
		}
	}

}
