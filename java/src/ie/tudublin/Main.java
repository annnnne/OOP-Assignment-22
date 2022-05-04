package ie.tudublin;
import baekedbeans.*;

public class Main
{	
	//call Start.java
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