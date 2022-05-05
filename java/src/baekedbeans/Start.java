package baekedbeans;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;


public class Start extends Visual {

    Sea sea = new Sea(this);
    Stars stars = new Stars(this);
    int mode = 0;
    Bee bee = new Bee(this);
    Butterfly butt = new Butterfly(this);


    public void keyPressed()
    {
        
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
        if (key == '5')
        {
            mode = 5;
        }
    }

    
    public void setup()
    {
        startMinim();
        loadAudio("ahh.mp3");
        getAudioPlayer().play();
        
        colorMode(HSB);
    }

    public void settings()
    {
        size(1500, 800, P3D);
        
    }

    public void draw()
    {
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        
        
       
        
        switch (mode) 
        {
            //main menu
			case 0:
                background(0);
                fill(135,206,250);
                textAlign(CENTER);
                textSize(width/20.0f);
                text("HULA HOOPS by DPR LIVE", width/2.0f, height/3.0f);
                textSize(width/30.0f);
                text("Press 1: Sea and Sun", width/2.0f, (height/3.0f) + 60);
                text("Press 2: Flower Power", width/2.0f, (height/3.0f) + 120);
                text("Press 3: Anne", width/2.0f, (height/3.0f) + 180);
                text("Press 4: Space", width/2.0f, (height/3.0f) + 240);
                text("Press 5: Butterfly", width/2.0f, (height/3.0f) + 300);

                break;
                
            //sea and sun
            case 1:
                background(0);
                translate(width/2, height/2);
                sea.render();
                
                break;

            //airish's
            case 2:
                background(0);
                bee.render();
                
                break;

            //Anne's
            case 3:
                background(0);
                break;

            //stars and airplane
            case 4:
                background(0);
                stars.render();
                break;

            case 5:
                background(0);
                butt.render();
                break;

        }

    }
  
}

