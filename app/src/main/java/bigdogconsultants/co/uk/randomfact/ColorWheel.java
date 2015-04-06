package bigdogconsultants.co.uk.randomfact;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by stevehunter on 22/02/15.
 */
public class ColorWheel{

    // Member variable (properties about the object)
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    // Method (abilities : things the object can do)
    public int getColor(){

        String color = "";

        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        return Color.parseColor(color);

        // return colorAsInt;
    }
}