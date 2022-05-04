package baekedbeans;
import ie.tudublin.Visual;

public class Butterfly extends Visual{
    //Flowers and Buttterfly 1st attempt - (verse 2 of hula hoop)
    Start butt;
    public static float smoothedavg;
    //constructor
    public Butterfly(Start start) {
        this.butt = start;
    }

    //declaring variables 
    int i=1;
    int j=1;
    int n=300;
    int a=1;

    

    void render()
    {

        //calulating average
        float avg = 0;
        for (int i = 0; i < ab.size(); i++)
        {
            avg += abs(ab.get(i));
        }
        avg = avg / ab.size();
        float smoothedavg = 0;
        smoothedavg = lerp(smoothedavg, avg, 0.1f);

        //make colours to music
        float c = map(avg, -1, 1, 0, 255);

        butt.background(0);//black background
        butt.noStroke();
        //fill the middle circles in white
        butt.fill(255,255,255);
        //if a is 1 meaning this will only appear if user presses key that allows to display this drwaing
        if(a==1)
        {
            //we put the centre circle at the start as the petals of flower will overlap it
            //draws the centre white circle of flower
            butt.fill(255,255,255);
            butt.ellipse(250,250,100,100);

            
            butt.fill(253, 47, 96);
            butt.ellipse(175,175,50,50);
            butt.triangle(175,200,250,250,200,175);

            butt.ellipse(250,150,50,50);
            butt.triangle(255,150,250,250,275,150);

            butt.ellipse(325,175,50,50);
            butt.triangle(300,175,250,250,325,200);

            butt.ellipse(150,250,50,50);
            butt.triangle(150,255,250,250,150,275);

            butt.ellipse (350,250,50,50);
            butt.triangle(350,225,250,250,350,275);

            butt.ellipse(175,325,50,50);
            butt.triangle(175,300,250,250,200,325);

            butt.ellipse(250,350,50,50);
            butt.triangle(225,350,250,250,275,350);

            butt.ellipse(325,325,50,50);
            butt.triangle(300,325,250,250,325,300);

        }//end if

        if(a>=3)
        {
            for (int i= -250;i<1400; i+=250)
            {
                for (j=-250;j<700;j+=250)
                {
                    butt.fill(255);
                    butt.ellipse(250+i,250+j,100,100); 
                    butt.fill (c, 100 ,100);
                    butt.ellipse(175+i,175+j,50,50);
                    butt.triangle(175+i,200+j,250+i,250+j,200+i,175+j);
                    butt.ellipse(250+i,150+j,50,50);
                    butt.triangle(225+i,150+j,250+i,250+j,275+i,150+j);

                    butt.ellipse(325+i,175+j,50,50);
                    butt.triangle(300+i,175+j,250+i,250+j,325+i,200+j);

                    butt.ellipse(150+i,250+j,50,50);
                    butt.triangle(150+i,225+j,250+i,250+j,150+i,275+j);

                    butt.ellipse(350+i,250+j,50,50);
                    butt.triangle(350+i,225+j,250+i,250+j,350+i,275+j);

                    butt.ellipse(175+i,325+j,50,50);
                    butt.triangle(175+i,300+j,250+i,250+j,200+i,325+j);

                    butt.ellipse(250+i,350+j,50,50);
                    butt.triangle(225+i,350+j,250+i,250+j,275+i,350+j);

                    butt.ellipse(325+i,325+j,50,50);
                    butt.triangle(300+i,325+j,250+i,250+j,325+i,300+j);

                    butt.fill(0);
                    butt.ellipse(250+i,250+j,n,n);

                }//end for

            }//end for

        }//end if

        if(a>=2)
        {
            for (i=-125;i<1400;i+=250)
            {
                for (j=-125;j<700;j+=250)
                {
                    butt.fill (255);
                    butt.ellipse (250+i,250+j,100,100); 
                    butt.fill(200, 255, 255);

                    butt.ellipse(175+i,175+j,50,50);
                    butt.triangle(175+i,200+j,250+i,250+j,200+i,175+j);

                    butt.ellipse(250+i,150+j,50,50);
                    butt.triangle(225+i,150+j,250+i,250+j,275+i,150+j);

                    butt.ellipse(325+i,175+j,50,50);
                    butt.triangle(300+i,175+j,250+i,250+j,325+i,200+j);

                    butt.ellipse(150+i,250+j,50,50);
                    butt.triangle(150+i,225+j,250+1,250+j,150+1,275+j);

                    butt.ellipse(350+i,250+j,50,50);
                    butt.triangle(350+i,225+j,250+i,250+j,350+i,275+j);

                    butt.ellipse(175+i,325+j,50,50);
                    butt.triangle(175+i,300+j,250+i,250+j,200+i,325+j);

                    butt.ellipse(250+i,350+j,50,50);
                    butt.triangle(225+i,350+j,250+i,250+j,275+i,350+j);

                    butt.ellipse(325+i,325+j,50,50);
                    butt.triangle(300+i,325+j,250+i,250+j,325+i,300+j);

                }//end for

            }//end for

        }//end if


        

       //draw butterfly
        butt.stroke (255) ;
        butt.strokeWeight(2);
    
        butt.stroke (255) ;
        butt.strokeWeight(3);
        butt.fill(c, 255, 255);
        butt.quad (butt.mouseX-60, butt.mouseY-70, butt.mouseX-10, butt.mouseY-50,butt.mouseX,butt.mouseY,butt.mouseX-40,butt.mouseY-10);
        butt.quad (butt.mouseX+60, butt.mouseY-70, butt.mouseX+10, butt.mouseY-50, butt.mouseX, butt.mouseY, butt.mouseX+40, butt.mouseY-10);
        butt.fill (c, 255, 255);
        butt.quad (butt.mouseX-60, butt.mouseY+40, butt.mouseX-40, butt.mouseY, butt.mouseX, butt.mouseY, butt.mouseX-18, butt.mouseY+30);
        butt.quad (butt.mouseX+60, butt.mouseY+40, butt.mouseX+40, butt.mouseY, butt.mouseX, butt.mouseY, butt.mouseX+10,butt.mouseY+30);
        
    

        
        //moving the background 
        n-=0.1f;
        if(n==-0.5f)
        {
            n = 1;

        }//end if
        
        //
        a++;
    }//end render()

    }


