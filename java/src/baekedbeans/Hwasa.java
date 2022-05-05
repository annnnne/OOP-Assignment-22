package baekedbeans;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;


public class Hwasa extends Visual{ //Start of Main

    //Start of settings
    public void settings()
    
    {
        size(1400, 800, P3D);

    }//End of settings


    //Start of setup

    //Goal is to make stars or circles that shine with planets in the middle 
    //going in circles maybe ??
    public void setup()
    {

        //size(500,500);
        colorMode(RGB);
        noCursor();
        setFrameSize(256);

    }//End of Setup


    //Start of Draw
    public void draw()
    {
        //The bigger the fill number the faster it goes
        fill(0,5);
        rect(0, 0, width, height);
        fill(255);
        noStroke();

        //Making the stars/circle bigger representing height and width
        ellipse(random(width), random(height), 2, 2);


        //for the floating circle thingy that suppose to be a planet
        float move = sin(radians(frameCount));
        circle(224, 184, 250);
        ellipse(width/2 + move * 360, height/2,100,100);



    }


    

    
}//End of Main
