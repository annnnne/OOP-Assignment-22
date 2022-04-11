package baekedbeans;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class Planets extends Visual {


    Start start;

    //radius of planet
    float rad;

   

    //constructor 
    public Planets(float rad, Start start) 
    {
        this.rad = rad;
        this.start = start;
    }

    /*public void keyPressed()
    {
        if (key == '1')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }
 
    }*/

    public void render()
    {
        start.ellipse(300, 300, rad, rad);
    }

    public void setup()
    {
        colorMode(HSB);
        noCursor();
        
        setFrameSize(256);

        startMinim();
        loadAudio("ahh.mp3");
        getAudioPlayer().play();
        startListening(); 
    }

    
}
