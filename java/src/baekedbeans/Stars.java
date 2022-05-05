package baekedbeans;

import ie.tudublin.Visual;

public class Stars extends Visual{

    Start stars;
    float smoothedBoxSize = 0;
    @Override
    public void calculateAverageAmplitude() {
        // TODO Auto-generated method stub
        super.calculateAverageAmplitude();
    }

    //contructor
    public Stars(Start stars){
        
        this.stars = stars;
    }

        int y = 700;
        
    public void render(){
        
        //calulating average
        float avg = 0;
        for (int i = 0; i < ab.size(); i++)
        {
            avg += abs(ab.get(i));
        }
        avg = avg / ab.size();
        float smoothedavg = 0;
        smoothedavg = lerp(smoothedavg, avg, 0.1f);

        int w = 1500;
        int h = 800;
        

        stars.strokeWeight(4);

        //background colour
        //stars.background(0);

        //Creating Stars
        stars.fill(0, 10);
        stars.rect(0, 0 ,w , h);
        //representing the stars
        stars.fill(255);
        stars.noStroke();
        stars.ellipse(random(w), random(h), 5, 5);

        //Drawing a rocket
        stars.translate(CENTER, CENTER);
        stars.fill(255);
        //an oval shape of the rocket and moving the rocket up
        stars.ellipse(w/2, y,100,200);
        stars.fill(175, 100, 220);
        //two circle windows on the rocket and moving the rocket up
        stars.ellipse(w/2, y+10, 50,50);
        stars.ellipse(w/2, y-50, 40,40);
        stars.fill(0);
        stars.ellipse(w/2, y+10, 40,40);
        stars.ellipse(w/2, y-50, 30,30);

        // moving the rocket
        y--;
        
        if(y < 0){
            y = 700;
        }

        // Drawing the moon
        // float boxSize = 50 + (getSmoothedAmplitude() * 300);//map(average, 0, 1, 100, 400); 
        // smoothedBoxSize = lerp(smoothedBoxSize, boxSize, 0.2f);  
        stars.fill(255);
        stars.ellipse( 60 , 70,100 + (smoothedavg*300), 100 + (smoothedavg*300));
        stars.noFill();


    }



     
    
}
