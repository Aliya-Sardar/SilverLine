
package silverline;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author aliya
 */
public class Data 
{
    GridBagLayout mainLayout , innerLayout1 , innerLayout2 ;
    GridBagConstraints gridRestraint , gridRestraint1 , gridRestraint2 ,gridRestraint3 , gridRestraint4  ;
    
    final int WINDOW_WIDTH = 1000;                                               // Window width in pixels
    final int WINDOW_HEIGHT =650;                                              // Window height in pixels
    
    JPanel panelTotal ;
    JLabel mainLabel ;
    JButton buttonTotal, buttonReciept, buttonBack ;
    
    JPanel buildPanel()
    {
        //ImageIcon image = new ImageIcon("src/Pictures/main1.jpg");
        
        mainLabel = new JLabel("Sales") ;
        
        gridRestraint = new GridBagConstraints() ;               // alots the grid space to a component for the JFrame
        
        
        gridRestraint1 = new GridBagConstraints() ;
        gridRestraint2 = new GridBagConstraints() ;
        gridRestraint3 = new GridBagConstraints() ;
        gridRestraint4 = new GridBagConstraints() ; 
        
        
        //JPanels
        panelTotal = new JPanel();
        JPanel panelPictures = new JPanel();
        
        // GRIDS for the panels
        innerLayout1 = new GridBagLayout();                                 // Grid for the total JPanel Total
        panelTotal.setLayout(innerLayout1) ;                   
        
        innerLayout2 = new GridBagLayout();                                 // Grid for the total JPanel Pictures
        panelPictures.setLayout(innerLayout2) ;                   
        
        
//        //main Label
//        mainLabel = new JLabel("SALES");
//        mainLabel.setFont(new Font ("Verdana", Font.PLAIN, 20));         // changes font of the main label

        //Buttons for different functions
        buttonTotal = new JButton("Hello") ;

        // add all components to JPanels 
        
        
        


    
        // for Sale Button
        gridRestraint1.fill = GridBagConstraints.HORIZONTAL;
        gridRestraint1.fill = GridBagConstraints.VERTICAL;
        gridRestraint1.ipady = 100 ;
        gridRestraint1.ipadx = 100 ;
        gridRestraint1.insets = new Insets(0,10,10,10) ;
        gridRestraint1.gridx = 0 ;
        gridRestraint1.gridy = 2 ;
        gridRestraint1.anchor =  GridBagConstraints.LINE_START;
        
        panelTotal.add(buttonTotal ,gridRestraint1) ;                                  // add Sales Button to window
        buttonTotal.addActionListener(new buttonActions());
        
        
        
        
        
        // add all JPanels to JFrame
       
        return panelTotal ;
        
    }
    
    private class buttonActions implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // Get the action command.
            String actionCommand = e.getActionCommand();

            // Determine which button was clicked and display a message.
            if (actionCommand.equals("Hello"))
            {
                //dispose() ;
                panelTotal.add(new JLabel("heyyyyy")) ;
                //window.setVisible(true);
            } 
        }
        
    }
    
}
