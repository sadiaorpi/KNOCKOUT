package knockout;

import java.util.Random;

/**
 * Random number generator class
 * 
 * @author   Sadia Orpi
 * @version  12/04/2021
 */
public class RandNumInInterval {
	
	private final int a;
    private final int range;
    private Random rand = new Random();
    
    /**
     * Constructor to instantiate fields
     * 
     * @param a
     * @param b
     */
    public RandNumInInterval(int a, int b)
    
    {
        this.a = a;
        this.range = (b - a) + 1;
    }
    
    /**
     * Generate a number within the range
     * 
     * @return    Random number
     */
    public int GenerateNum()
    {
        return rand.nextInt(range) + a;
    }
       
	

}
