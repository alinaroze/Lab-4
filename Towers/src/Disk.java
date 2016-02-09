import java.awt.*;


class Disk { 

    private int radius;
    private int height;
    private Color color;

    public Disk(int r, int h, Color c) { 
	radius = r;
	height = h;
	color = c;
    }

    public void DrawDisk(Graphics g, int x, int  y) {
	// Given (x,y) as a "base reference point", we can draw
	// the disk given its height, width and color on Graphics g
	// (x,y) is the located at the center of the base of the Disk

	g.setColor(color);
	g.fillRect(x-radius, y, 2*radius, height);
    }
  
    public  void OmitDisk(Graphics g, int x, int  y) {
	// Given (x,y) as a "base reference point", we can draw
	// the disk given its height, width and color on Graphics g
	// (x,y) is the located at the center of the base of the Disk
	
	g.clearRect(x-radius, y, 2*radius, height);
    }  

}// end Disk class
