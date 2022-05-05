package baekedbeans;

import ie.tudublin.Visual;


public class Hwasa extends Visual{ //Start of Main

    Start hwasa;
    float theta = 0;

    public Hwasa(Start hwasa) {
        this.hwasa = hwasa;
    }

    //function to draw clouds
    public void cloud(int a, int b, int c, float d)
    {
        hwasa.noStroke();
        hwasa.fill(255);
        hwasa.ellipse(a+530, b+295, c+40, d+30);
        hwasa.ellipse(a+510, b+305, c+40, d+30);
        hwasa.ellipse(a+460, b+295, c+40, d+30);
        hwasa.ellipse(a+480, b+305, c+40, d+30);
        hwasa.ellipse (a+470, b+285, c+40, d+30);
        hwasa.ellipse (a+510, b+285, c+40, d+30);
        hwasa.ellipse (a+490, b+280, c+40, d+30);
    }



    //Start of Draw
    void render()
    {
        //calculating the average amplitude
        float avg = 0;
        for (int i = 0; i < ab.size(); i++)
        {
            avg += abs(ab.get(i));
        }
        avg = avg / ab.size();
        float smoothedavg = 0;
        smoothedavg = lerp(smoothedavg, avg, 0.1f);

        hwasa.colorMode(HSB);

        //The bigger the fill number the faster it goes
        hwasa.fill(0,5);
        hwasa.fill(255);
        hwasa.noStroke();


        //Making the stars/circle bigger representing height and width
        if( hwasa.frameCount % 10 ==  00)
        {

            hwasa.ellipse(random(hwasa.width), random(hwasa.height), 5, 5);

        }
        //put 0,0 at centre
        hwasa.translate(hwasa.width/2, hwasa.height/2, 0);

        //rainbow triangles
        for(int i = 0; i <= 350; i+= 50)
        {
            float c = hwasa.map(i, 0, 700, 0, 255);
            hwasa.fill(c, 255, 255);
            hwasa.triangle(0, 0, 1000, -i, 1000, -i+50);
        }

        //clouds
        cloud(-600, -544, 10, 10* smoothedavg*10);
        cloud(-800, -644, 10, 10* smoothedavg*10);
        cloud(-1000, -644, 10, 10* smoothedavg*10);
        cloud(-100, -544, 10, 10* smoothedavg*10);
        cloud(-300, -600, 10, 10* smoothedavg*10);
        cloud(0, -644, 10, 10* smoothedavg*10);
       
       
                
        //rotate triangle without affecting others
        hwasa.pushMatrix();
        
        //rotate triangle to song
        theta += 0.01 + smoothedavg;
        hwasa.rotateY(theta);

        hwasa.strokeWeight(7);
        hwasa.stroke(255);
        hwasa.rotateX(PI/2);
        hwasa.noFill();

        //begin drawing pyramid
        hwasa.beginShape();
        hwasa.vertex(-100, -100, -100);
        hwasa.vertex( 100, -100, -100);
        hwasa.vertex(   0,    0,  100);

        hwasa.vertex( 100, -100, -100);
        hwasa.vertex( 100,  100, -100);
        hwasa.vertex(   0,    0,  100);

        hwasa.vertex( 100, 100, -100);
        hwasa.vertex(-100, 100, -100);
        hwasa.vertex(   0,   0,  100);

        hwasa.vertex(-100,  100, -100);
        hwasa.vertex(-100, -100, -100);
        hwasa.vertex(   0,    0,  100);
        hwasa.endShape();

        hwasa.popMatrix();

    }//end of render
 
}
