package baekedbeans;

import ie.tudublin.Visual;

public class Sea extends Visual {

    Start sea;
    float wavy = 0;
    
    //constructor
    public Sea(Start sea) 
    {
        this.sea = sea;
    }

    //function to draw visualiser
    public void render()
    {
        
        sea.translate(sea.width/2, sea.height/2);
        sea.strokeWeight(1);

        //background colour
        sea.colorMode(RGB);        
        sea.background(0);

        //initialising varaibles for sea
        wavy -= 0.01;
        int cols, rows, w, h, triangleSize;
        w = 1500;
        h = 200;
        cols = w/ 20;
        rows = h / 20;
        triangleSize = 30;

        //calculating the average amplitude
        float avg = 0;
        for (int i = 0; i < ab.size(); i++)
        {
            avg += abs(ab.get(i));
        }
        avg = avg / ab.size();

        //smoothed average amplitude
        float smoothedavg = 0;
        smoothedavg = lerp(smoothedavg, avg, 0.1f);

        
        //initialising array storing z coordinates to be make the sea move
        float[][] z;
        z = new float[cols][rows];

        //variable to make the sea waves
        float yoff = wavy;
        
        for(int y = 0; y < rows; y++)
        {
            float xoff = 0;
            for(int x = 0; x < cols; x++)
            {
                z[x][y] = map(noise(xoff, yoff), 0, 1, -50, 50);
                xoff += 0.1;
            }
            yoff += 0.1;
            
        } 
        
        // push matrix to rotate the sea and not affect the sun
        sea.pushMatrix();
        sea.translate(-width*10, height*3);
        sea.rotateX(PI/3);
        sea.stroke(255);

        //loops to draw the sea
        for(int y = 0; y < rows-1; y++)
        {
            //colour the sea
            sea.colorMode(HSB);
            float c = map(smoothedavg, -1, 1, 0, 255);
            sea.fill(c, 255, 255);

            sea.beginShape(TRIANGLE_STRIP);
            for(int x = 0; x < cols; x++)
            {
                //vertices of triangles in strip
                sea.vertex(x*triangleSize, y*triangleSize, z[x][y]);
                sea.vertex(x*triangleSize, (y+1)*triangleSize, z[x][y+1]);

            }//end for
            sea.endShape();
        }//end for
        sea.popMatrix();
    
        
    
        //creating the sun       
        sea.pushMatrix();
        sea.colorMode(RGB);

        //positioning it in the centre
        sea.translate(width/3, -height);

        //colouring the sun
        sea.stroke(255, 215, 0);
        sea.noFill();
        
        sea.sphere(150+(smoothedavg*100));
        
        //radius of  blank circle inside strokes
        int rad = 180;


        //creating the strokes
        for(int ang = 0; ang < 362; ang+= 2)
        {
            float col = map(ang, 0, 362, 0, 255);

            //points on the blank circle
            float x = rad * cos(ang);
            float y = rad * sin(ang);
            
            //creating second x and y variables from audio buffer
            float linelen = map(ab.get(ang), -1, 1, 0, 150);
            float rad2 = rad + linelen;

            float x2 = rad2 * cos(ang);
            float y2 = rad2 * sin(ang);
            
            sea.colorMode(HSB);
            sea.stroke(col, 255, 255);
            sea.strokeWeight(5);
            sea.line(x, y, x2, y2);
        }
        
        sea.popMatrix();
    }//end render
    
}

