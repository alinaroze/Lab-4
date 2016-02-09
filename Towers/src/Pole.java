import java.awt.*;

class Pole {
 
    private int radius;
    private int height;
    private int x;
    private int y;
    private int num_disks;
    private int delta;
    private Disk[] disk;

    public Pole(int r, int h, int px, int py, int dist) { 
	radius = r;
	height = h;
	x = px;
	y = py;
	delta = dist;
	num_disks = -1; // Disks numbered 0..9,  So -1 means empty
	disk = new Disk[10];
	//Disk[] disk = new Disk[10];  Note this compiles OK, but
	//causes a run time array problem
    }

    public void DrawPole(Graphics g) {
	// (x,y) is the center of the Pole location
	// along with radius and height we can draw the Pole

	g.setColor(Color.black);
	g.fillRect(x-radius, y, 2*radius, 4);
	g.fillRect(x-2, y, 4, height);
    }
  
    public void AddDisk(Disk d, Graphics g) {
	num_disks ++;
	disk[num_disks] = d;
	d.DrawDisk(g,x,10 + 22*num_disks);
    }

    public Disk RemoveDisk(Graphics g) { 
	Disk d = disk[num_disks];
	d.OmitDisk(g,x,10 + 22*num_disks);
	num_disks --;
	return d;
    }

}// end Pole class

