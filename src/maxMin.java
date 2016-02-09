import java.util.Scanner;
import java.util.Vector;
import java.io.*;


public class maxMin 
{
	
	/**stores the data retrieved from the file */
    Vector <Double> doubleVector;
	
	
	public void readFile() 
			throws IOException
	{			
		Scanner console = new Scanner(System.in);
		
		System.out.printf("Enter file name to read: " );
		String inputFile = console.next();
		
		Scanner input = new Scanner(inputFile);
		doubleVector = new Vector<Double>();
		double max, elt; 
		int count = 0;
   
		// store all elements in a vector
   
		while (input.hasNextDouble()) {
			elt = input.nextDouble();
			count++;
			doubleVector.addElement(elt);
		}//end while
			
		 // print on the terminal each elements of intVector
		 System.out.printf("There are %d numbers in the input file:\n",
		       count);
		for (double value: doubleVector){
		   	System.out.printf("%f ",value);
		}
	
	}//end readFile
	
	/** main : creates an Object output */
    public class MinMaxObject
    	{
    		private double max, min;
    		private int maxPos, minPos;
    		
    		public MinMaxObject(double maximum,double minimum,
    				int maxPosition, int minPosition)
    		{
    			max = maximum;
    			min = minimum;
    			maxPos = maxPosition;
    			minPos = minPosition;
    			
    		}
    		
    		MinMaxObject output = new MinMaxObject(min, max, minPos, maxPos);
    		
    	}
	

    private Double findMaxMin(Vector<Double> doubleVector, int length)
	{	
    	length = doubleVector.size();
    	if(length == 0)
    	{
    		System.out.println("There are zero objects in the list and therefore no max or min.");
    	}
    	else
    	{
    		if( length == 1)
    			//base-case
    			return doubleVector.get(0);
    		else
    			//not base-case
    			return output(Math.min(doubleVector.get(length-1),findMaxMin(doubleVector, length-1)),
    					Math.max(doubleVector.get(length-1), findMaxMin(doubleVector, length-1)),  , ) ;
    	}
	
}
	    
	   