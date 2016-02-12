// TowersApp.java
// TOWER of Hanoi Applet
// Author: Roger Wainwright 4/9/98

import java.applet.*;
import java.awt.*;


public class TowersApp extends Applet {
  
    public void init() {
	 // repaint();
    }

    public void paint(Graphics g) {  
	int rings     =  7;
	Pole[] pole   =  new Pole[3];
	Color[] color =  {Color.red, Color.blue, Color.green,
			  Color.orange, Color.white, Color.cyan,
			  Color.magenta, Color.black,
			  new Color(255,0,255), // Violet
			  new Color(0,255,255) // Blue-Green
	                 };
   
	pole[0] = new Pole(75,450, 75,1,20);
	pole[1] = new Pole(75,450,250,1,20);
	pole[2] = new Pole(75,450,425,1,20);
   
	pole[0].DrawPole(g);
        pole[1].DrawPole(g);
        pole[2].DrawPole(g);
 
	for (int i=0; i<rings; i++) {
            Disk d = new Disk(70-5*i,20,color[i]);
	    pole[0].AddDisk(d,g);
	}

	Towers(rings, 0, 1, 2, pole, g);
    }// end paint

    public void Towers(int rings, int Source, int Dest,
	           int Spare, Pole[] pole, Graphics g) {
	if (rings == 1) {
	    // Move one disk from Source to Dest
	    Disk d = pole[Source].RemoveDisk(g);
	    pole[Dest].AddDisk(d,g);
	}
	else {
	    Towers(rings-1, Source, Spare, Dest, pole, g); 
	    Towers(1, Source, Dest, Spare, pole, g);      
	    try {
		Thread.sleep(1000);
	    }
	    catch(InterruptedException x) {
		System.out.println("Problem sleeping!");
	    }
	    Towers(rings-1, Spare, Dest, Source, pole, g); 
	}  // end if
    }  // end Towers

}// end TowersApp class 
