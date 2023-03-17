# Music Visualiser Project

Name: Justine Langridge C20333476
Mena Nguyen C20418324
Airish Reyes C20477044
Mary Anne Flores C20461582

Please click below image to see a video of our visualizers in action


[![YouTube](https://img.youtube.com/vi/WhHTdqHiOvs/default.jpg)](https://youtu.be/WhHTdqHiOvs)


# Description of the assignment
Our assignment was based on the theme "Something beautiful to enjoy while listening to music".  

The song we included was “Hula Hoops” - by DPR Live (ft. Beenzino and Hwasa). We wanted users who listen to the music to have fun, vibe, and dance with the song and by the end of it to feel cheered up. As it is an upbeat song, we wanted to make our visualizers something summery, vibrant, and upbeat to uplift your spirit while listening to music.  

To achieve our goal, we included pleasing aesthetics like for option 1 the sea moving like a wave and the sun which will be pulsating with the music. Option 2 multiple flowers will be appearing repeatedly, option 3 clouds with a pyramid rotating and a rainbow shine, option 4 spaceship moving up with stars everywhere and moon at the top left of the screen. Finally, last option which consists of a flower background pattern and a butterfly which moves with the cursor. All these sceneries we aim to create a joyful atmosphere for our users while listening to the song. 

# Instructions
The user will be presented with a menu containing options 1-5. This will allow the user to enter a key from 1-5 to choose which type of scenery they would like to see. To be able to go back to the menu user must press 0 key.  

Press 1 – shows waves in sea moving and sun beating 

Press 2 – shows Flower Power explosion while holding a key 

Press 3 – shows a dynamic Pink Floyd album cover with pyramid, clouds, and rainbow 

Press 4 – shows spaceship up to the moon and stars 

Press 5 – shows flowers with butterfly moving around with cursor. 
# How it works
To be able to run this project you will need Visual Studio Code, and have the relevant Java Libraries and Processing Libraries installed. To start the project, you will need to hit FN-f5 to run the program. This will open the main screen with the list of visualisers for you to watch and start playing the song. 

To begin we made a folder called 'baeked beans' inside the src folder. We decided not to include our student numbers there as we weren't sure of whose to use. Inside this folder, we made java files for each visualiser.We then made a file called Start.java which contains a switch statement. This is the file that we called in Main.java and is the backbone to our code. To run Start from Main.java we had to import the files from baekedbeans and put the statement below at the top of Main.java.

```Java
import baekedbeans.*;

```

Start.java is a subclass of Visual.java meaning that we were able to use the minim libraries called in Visual.java to play our song.

We made instaces of each visualiser object in Start.java to be able to call the render methods in each visualiser. These render methods are the ones that draw the shapes in each visualiser.

```Java
public class Start extends Visual {

    Sea sea = new Sea(this);
    Stars stars = new Stars(this);
    Bee bee = new Bee(this);
    Butterfly butt = new Butterfly(this);
    Hwasa hwasa = new Hwasa(this);

```

In the setup() method below, we call the song to start playing.
```Java
public void setup()
{
	//start playing song
	startMinim();
	loadAudio("ahh.mp3");
	getAudioPlayer().play();
	
	colorMode(HSB);
}

```

We used the keyPressed to move through the switch statement in Start.java. The integer variable mode is the one storing what number is pressed by the user. Below is a sample of our keyPressed method.
```Java
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
```

Then inside the switch statement, we called each render() method to draw each particular visualiser. For example below:

```Java
     
            //sea and sun
            case 1:
                background(0);
                sea.render();
                break;

            //Flowers
            case 2:
                background(0);
                bee.render();
                break;

```

# What I am most proud of in the assignment

We were most proud of the 'sea and sun' visualiser. It was difficult to figure out how to properly contruct the sun to how we wanted it to be. The maths involved with finding points on a circle and turning those into pulses to music was challenging but we were able to relearn the maths involved and managed to make a funky visualiser. 

Also rotating the triangle in the Pink Floyd album cover was quite challenging as we struggled trying to make it rotate according to the music but we persisted and are proud of how it turned out.

Our goal was to make visualisers with summer to match the vibe of the song and we are proud to see it all come together. 

We were also proud of being able to work in a team as working in a team enabled us to improve our teamwork and communication skills. We were able to overcome obstacles by bouncing ideas off of each other. It was an enjoyable assignment to do. We also managed to learn a lot about object oriented programming and processing while doing this assignment and we are proud of our improved programming skills.
