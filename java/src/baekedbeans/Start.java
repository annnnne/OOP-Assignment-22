package baekedbeans;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import baekedbeans.Planets;

import processing.core.PApplet;

public class Start extends Visual {


    int mode = 0;

    public void settings()
    {
        size(1000, 1000, P3D);
        //fullScreen(P3D, SPAN);
    }


    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }
        if (key == '0')
        {
            mode = 0;
        }
        if (key == '1')
        {
            mode = 1;
        }
        if (key == '2')
        {
            mode = 2;
        }
        if (key == '3')
        {
            mode = 3;
        }
        if (key == '4')
        {
            mode = 4;
        }
    }

    

    public void setup()
    {
        startMinim();
        loadAudio("ahh.mp3");
        getAudioPlayer().play();
        startListening(); 
        colorMode(HSB);
    }

    public void draw()
    {
        
        Planets plan1 = new Planets(400, this);

        switch (mode) 
        {
			case 0:
                background(0);
                fill(230);
                stroke(255);
                plan1.render();
                break;
            //justine's
            case 1:

                background(0);
                fill(130);
                stroke(255);
                rect(200, 200, 300, 20);
                break;

            //airish's
            case 2:
                background(0);
                break;

            //Anne's
            case 3:
                background(0);
                break;

            //Mena's
            case 4:
                background(0);
                break;

        }

    }
}

