package ie.tudublin;

import example.AudioBandsVisual;
import example.CubeVisual;
import example.CubeVisual1;
import example.MyVisual;
import example.RotatingAudioBands;
import example.WaveForm;
import baekedbeans.*;

public class Main
{	//is pretty

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new RotatingAudioBands());		
	}

	/*public void planets()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Planets());		
	}*/

	public void start()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Start());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.start();			
	}
	//hello 
}