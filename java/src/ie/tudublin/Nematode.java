package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;


public class Nematode {
    
    private static final String println = null;

    //Parts of the Nematode
    String name, gender;
    int length, limbs, eyes;

    //Class Constructor for Nematode
    public Nematode(String name, int length, int limbs, String gender, int eyes){
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }
}
