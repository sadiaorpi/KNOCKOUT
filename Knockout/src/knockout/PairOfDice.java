package knockout;

/**
 * The PairOfDice class creates two die, and the results from
 * a roll of the dice. 
 * 
 * @author Sadia Orpi
 * @version 12/04/2021
 */

public class PairOfDice {
	
	// instance variables - replace the example below with your own
    private Die die1;
    private Die die2;
    private int die1Result;
    private int die2Result;
    
    /**
     * Constructor to instantiate field variables
     */
    public PairOfDice()
    {
       this.die1 = new Die();
       this.die2 = new Die();
       this.die1Result = 1;
       this.die2Result = 1;
       
    }
    
    /**
     * Overloaded constructor to instantiate field variables 
     * @param die1InitVal     Initial value of die 1
     * @param die2InitVal     Initial value of die 2
     */
    public PairOfDice(int die1InitVal, int die2InitVal)
    {
       this.die1 = new Die();
       this.die2 = new Die();

    }
    
    /**
     * Sets the result of the dice to the random
     * number generated after rolling the dice. 
     */
    public void Roll() 
    {
       die1Result = die1.Roll();
       die2Result = die2.Roll();
       
    }
    
    /**
     * Retrieves die 1's result after rolling
     * 
     * @return  Die 1's result
     */
    public int GetDie1()
    {
        return die1Result;
    }
    
    /**
     * Retrieves die 2's result after rolling
     * 
     * @return   Die 2's result
     */
    public int GetDie2()
    {
        return die2Result;
    }
    
    /**
     * Prints the results and total
     * 
     *  @return     Next Round if total is equal to 10
     *  @return     Die1, Die2 results and their total
     */
    @Override
    public String toString()
    {
    	int total = die1Result + die2Result;
    	
    	if (total == 10) {
    		return "Die1: " + die1Result + " Die2: " + die2Result + " Total: " + total + "\n" + "NEXT ROUND";
        }
        else {
        	
        	return "Die1: " + die1Result + " Die2: " + die2Result + " Total: " + total;
        	
        }
        
    }
    
    /**
     * Pass reference variable into method
     */
    public void Display()
    {
        System.out.println(this); 
    }
	
	

}
