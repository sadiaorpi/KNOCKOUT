package knockout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * GPairOfDice simulates the game Knockout where both dice totaled 
 * cannot equal 10. Points are added to the score for each total number
 * and resets to back to 0 if the total is 10.  
 * 
 * @author Sadia Orpi
 * @version 12/04/2021
 */
public class GPairOfDice extends PairOfDice {
	
	   private JFrame     frame;
	   private JPanel     panel;
	   private JPanel     dicePanel;
	   private JPanel     buttonPanel;
	   private JPanel     totalPanel;
	   private JPanel     scorePanel;
	   private JButton    push;
	   private ImageIcon  one, two, three, four, five, six;
	   private JLabel     iconLabelOne, iconLabelTwo, iconLabelThree;
	   private JLabel     totalLabel, scoreLabel;
	   private String     Match = "Dice cannot add up to 10! You're Out. Next Round!";
	   private int        total, score;
	   
	   /**
	    * Constructor to instantiate field variables
	    * 
	    * @param die1InitVal       Initial value of die1
	    * @param die2InitVal       Initial value of die2
	    */
	   public GPairOfDice(int die1InitVal, int die2InitVal)
	   {
	      super(die1InitVal, die2InitVal);
	      total = 0;
	      score = 0;
	      
	      frame = new JFrame("KNOCKOUT!");
	      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	      one          = new ImageIcon("one.jpg");
	      two          = new ImageIcon("two.jpg");
	      three        = new ImageIcon("three.jpg");
	      four         = new ImageIcon("four.jpg");
	      five         = new ImageIcon("five.jpg");
	      six          = new ImageIcon("six.jpg");
	      
	      iconLabelOne = new JLabel (null, one, SwingConstants.CENTER);
	      iconLabelTwo = new JLabel (null, two, SwingConstants.CENTER);
	      iconLabelThree = new JLabel (Match);
	      
	      SetDieLabel(die1InitVal, iconLabelOne);
	      SetDieLabel(die2InitVal, iconLabelTwo);
	      
	      push = new JButton("Roll Dice");
	      push.addActionListener (new ButtonListener());
	      
	      totalLabel = new JLabel("Total: 0");
	      scoreLabel = new JLabel("Score: 0");
	      
	      panel = new JPanel();
	      panel.setBackground(Color.cyan);
	      
	     // panel.setPreferredSize (new Dimension(350, 275));
	      
	      panel.setLayout(new GridLayout(4, 1));
	      
	      dicePanel = new JPanel();
	      dicePanel.setBackground(Color.black);
	      dicePanel.add(iconLabelOne);
	      dicePanel.add(iconLabelTwo);
	      
	      buttonPanel = new JPanel();
	      totalPanel = new JPanel();
	      scorePanel = new JPanel();
	      
	      buttonPanel.setBackground(Color.black);
	      totalPanel.setBackground(Color.white);
	      scorePanel.setBackground(Color.white);
	      
	      buttonPanel.setPreferredSize (new Dimension(350, 50));
	      totalPanel.setPreferredSize (new Dimension(350, 50));
	      scorePanel.setPreferredSize (new Dimension(350, 50));
	      
	      
	      buttonPanel.add(push);
	      totalPanel.add(totalLabel);
	      scorePanel.add(scoreLabel);
	      
	      panel.add(dicePanel);
	      panel.add(buttonPanel);
	      panel.add(totalPanel);
	      panel.add(scorePanel);
	      
	      frame.getContentPane().add(panel);
	      frame.pack();
	      frame.setVisible(true);  
	   }
	   
	   /**
	    * Sets the die labels to the images of the dice
	    * 
	    * @param die         Die number
	    * @param label       Label for the die
	    */
	   public void SetDieLabel(int die, JLabel label)
	   {
	      if (die == 1) {
	         label.setIcon(one);
	      }  
	      else if (die == 2) {
	         label.setIcon(two);
	      }
	      else if (die == 3) {
	         label.setIcon(three);
	      }
	      else if (die == 4) {
	         label.setIcon(four);
	      }
	      else if (die == 5) {
	         label.setIcon(five);
	      }
	      else if (die == 6) {
	         label.setIcon(six);
	      }
	    }
	   
	   /**
	    * Calls the roll method and displays 
	    */
	   @Override
	   public void Roll() 
	   {
	      super.Roll();
	      
	      super.Display();
	      this.Display();
	   }
	   
	   /**
	    * Displays images and dialog box of the dice, total, and score
	    */
	   @Override
	   public void Display() 
	   {    
	      int die1 = super.GetDie1();
	      int die2 = super.GetDie2();
	      
	      SetDieLabel(die1, iconLabelOne);
	      SetDieLabel(die2, iconLabelTwo);
	      
	      total = die1 + die2;
	      totalLabel.setText("Total: " + total);
	     
	      if(total == 10) {
	    	  
	    	  total = 0;
	    	  score = 0;
	    	  JOptionPane.showMessageDialog(null, Match);
	    	  
	      }
	      
	      else {
	    	  
	    	  score += total;
		      scoreLabel.setText("Score: " + score);
	    	  
	      }
	      
	   }
	   
	   private class ButtonListener implements ActionListener
	   {
	     
	      public void actionPerformed (ActionEvent event)
	      {
	         Roll();
	      }
	   }
	   
	
	

}
