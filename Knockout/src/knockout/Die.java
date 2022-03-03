package knockout;

import static java.lang.Math.*;

/**
 * The Die class creates a die object with 6 sides
 * and a generates a random number when rolled.
 * 
 * @author     sadiaorpi
 * @version    12/04/2021
 */
public class Die {
	
	private RandNumInInterval  numGenerator;
    private int nRolls;              // number of rolls so far
    
    /**
     *  Constructs a default, 6 sided die object
    */
    public Die() {
        numGenerator = new RandNumInInterval(1,6);
        nRolls = 0;
    }
    
    /**
     * Constructs a die object
     *  @param sides number of die sides
    */
    public Die(int sides) {
        nRolls = 0;
    }
    
    /**
     *  Rolls the die, updating the number of rolls.
     *   @return random number between 1 and getNumSides()
     */
    public int Roll() {
       return numGenerator.GenerateNum();
    }
    
    /**
     * Reports the number of times the die has been rolled.
     * @return number of die rolls so far
     */
    public int GetNumRolls() 
    {
        return nRolls;
    }
    
    /**
     * Prints statement of number of rolls so far
     */
    @Override
    public String toString()
    {
        return("Die rolled " + nRolls);
    }

}
