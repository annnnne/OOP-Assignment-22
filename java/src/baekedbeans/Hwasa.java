package baekedbeans;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;


public class Hwasa extends Visual{ //Start of Main

    //Start of settings
    public void settings()
    
    {
        size(800, 800, P3D);

    }//End of settings


    //Start of setup
    public void setup()
    {
        colorMode(HSB);
        noCursor();
        setFrameSize(256);

    }//End of Setup


    //Start of Draw
    public void draw()
    {
        background(HSB);
        fill(255);
        noStroke();
        lights();
        

        float wave = sin(radians(frameCount));
        ellipse(width/2+wave* 300, height/2,100,100);
    }





    
}//End of Main
