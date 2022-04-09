package baekedbeans;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class Planets extends Visual {
    public void settings()
    {
        size(800, 800, P3D);
        
        //fullScreen(P3D, SPAN);
    }

    public void keyPressed()
    {
        if (key == '1')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }
 
    }

    public void setup()
    {
        colorMode(HSB);
        noCursor();
        
        setFrameSize(256);

        startMinim();
        loadAudio("ahh.mp3");
        getAudioPlayer().play();
        //startListening(); 
        
    }
}
