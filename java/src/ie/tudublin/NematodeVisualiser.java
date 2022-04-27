package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList <Nematode> nematodes = new ArrayList<Nematode>();
    Table table;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
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


	public void draw()
	{	

	}
}
