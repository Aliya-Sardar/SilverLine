
package silverline;

import javax.swing.* ;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.* ;
import java.awt.Font ;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout ;
import java.awt.Insets;

/**
 *
 * @author aliya
 */
public class Sales 
{
    GridBagConstraints gridRestraint   ;
    
    JPanel panelTotal , panelProduct , basePanel ;
    JLabel  SalesLabel , noItems;
    JButton  buttonTotal ;                 // for the total panel
    // for items
    JButton product1 , product2 , product3 , product4 , product5 , product6 , product7, product8 , product9;
    JLabel item1 , item2 , item3 , item4 , item5 ,  item6 , item7, item8 , item9 ;
    
    
    
   // BUILD PANELS TO THE JFRAME
   JPanel buildPanel()
    {
        // gridRestraint for Product panel 
        GridBagConstraints gridRestraint = new GridBagConstraints() ;
        
        
        //3 JPanels, one for Pictures , the other for the calculation of chosen products and 3rd to carry both of them
        basePanel = new JPanel( new BorderLayout()) ;
        basePanel.setBackground(new Color(255, 0, 102)); 
        
        panelTotal = new JPanel(new GridLayout(20,1));                   // grid layout added
        panelTotal.setBackground(new Color(255, 102, 153));                             // color of panel
        
        panelProduct = new JPanel(new GridBagLayout());     
        panelProduct.setBackground(new Color(255, 128, 170));                             // color of panel
        

        //Buttons for base panel 
        buttonTotal = new JButton("Total") ;
        buttonTotal.addActionListener(new buttonActions());
        
        
        // labels for the items
        //products are cake, muffin , pancake, coffee, cookie, crepe , tart, pie, donut
        item1 = new JLabel( new ImageIcon("src/Pictures/cake.jpg")) ;
        item2 = new JLabel( new ImageIcon("src/Pictures/muffin.jpg")) ;
        item3 = new JLabel( new ImageIcon("src/Pictures/crepe.jpg")) ;
        item4 = new JLabel( new ImageIcon("src/Pictures/donut.jpg")) ;
        item5 = new JLabel( new ImageIcon("src/Pictures/pancake.jpg")) ;
        item6 = new JLabel( new ImageIcon("src/Pictures/cookie.jpg")) ;
        item7= new JLabel( new ImageIcon("src/Pictures/pie.jpg")) ;
        item8 = new JLabel( new ImageIcon("src/Pictures/coffee.jpg")) ;
        item9 = new JLabel( new ImageIcon("src/Pictures/tart.jpg")) ;
        
        //Buttons for the product Panel and import images for the buttons
         //products are cake, muffin , pancake, coffee, cookie, crepe , tart, pie, donut
        product1 = new JButton("cake");
        product1.setBackground(new Color(255, 0, 102));                             // color of button
        product1.setSize(10,10) ;
        product1.addActionListener(new Sales.buttonActions());        // action performed by button
        
        product2 = new JButton("muffin");
        product2.setBackground(new Color(255, 0, 102));                             // color of button
        product2.setSize(10,10) ;
        product2.addActionListener(new Sales.buttonActions());        // action performed by button
        
        product3 = new JButton("crepe");
        product3.setBackground(new Color(255, 0, 102));                             // color of button
        product3.setSize(10,10) ;
        product3.addActionListener(new Sales.buttonActions());        // action performed by button
        
        product4 = new JButton("donut");
        product4.setBackground(new Color(255, 0, 102));                             // color of button
        product4.addActionListener(new Sales.buttonActions());        // action performed by button
        
        product5 = new JButton("pancake");
        product5.setBackground(new Color(255, 0, 102));                             // color of button
        product5.addActionListener(new Sales.buttonActions());        // action performed by button
        
        product6 = new JButton("cookie");
        product6.setBackground(new Color(255, 0, 102));                             // color of button
        product6.addActionListener(new Sales.buttonActions());        // action performed by button
        
        product7 = new JButton("pie");
        product7.setBackground(new Color(255, 0, 102));                             // color of button
        product7.addActionListener(new Sales.buttonActions());        // action performed by button
        
        product8 = new JButton("coffee");
        product8.setBackground(new Color(255, 0, 102));                             // color of button
        product8.addActionListener(new Sales.buttonActions());        // action performed by button
        
        product9 = new JButton("tart");
        product9.setBackground(new Color(255, 0, 102));                             // color of button
        product9.addActionListener(new Sales.buttonActions());        // action performed by button
        
        // Sales JLabel 
        SalesLabel = new JLabel("Sales") ;
        SalesLabel.setFont(new Font ("Verdana", Font.PLAIN, 20));         // changes font of the main label
        
        // jlabel
        noItems = new JLabel("No item selected") ;
        
        
        
          
         
         
          //add components to product panel
          
         gridRestraint.fill = GridBagConstraints.HORIZONTAL;
         gridRestraint.fill = GridBagConstraints.VERTICAL;
         gridRestraint.insets = new Insets(10,10,10,10) ;
         
         gridRestraint.weightx = 1 ;
         gridRestraint.weighty = 1 ;
         gridRestraint.gridx = 0 ;
         gridRestraint.gridy = 0;
         panelProduct.add(item1 , gridRestraint);
         
         gridRestraint.gridx = 1 ;
         gridRestraint.gridy = 0;
         panelProduct.add(item2 , gridRestraint );
         
         gridRestraint.gridx = 2 ;
         gridRestraint.gridy = 0;
         panelProduct.add(item3 , gridRestraint);
         
         gridRestraint.weightx = 0.5 ;
         gridRestraint.weighty = 0.5 ;
         gridRestraint.gridx = 0 ;
         gridRestraint.gridy = 1;
         panelProduct.add(product1 , gridRestraint);
   
         gridRestraint.gridx = 1 ;
         gridRestraint.gridy = 1;
         panelProduct.add(product2 , gridRestraint);

         gridRestraint.gridx = 2 ;
         gridRestraint.gridy = 1;
         panelProduct.add(product3 , gridRestraint);
         
         gridRestraint.weightx = 1 ;
         gridRestraint.weighty = 1 ;
         gridRestraint.gridx = 0 ;
         gridRestraint.gridy = 2;
         panelProduct.add(item4 , gridRestraint);
         
         gridRestraint.gridx = 1 ;
         gridRestraint.gridy = 2;
         panelProduct.add(item5 , gridRestraint);
         
         gridRestraint.gridx = 2 ;
         gridRestraint.gridy = 2;
         panelProduct.add(item6 , gridRestraint);
         
         gridRestraint.weightx = 0.5 ;
         gridRestraint.weighty = 0.5 ;
         gridRestraint.gridx = 0 ;
         gridRestraint.gridy = 3;
         panelProduct.add(product4 , gridRestraint);
         
         gridRestraint.gridx = 1 ;
         gridRestraint.gridy = 3;
         panelProduct.add(product5 , gridRestraint);
         
         gridRestraint.gridx = 2 ;
         gridRestraint.gridy = 3;
         panelProduct.add(product6 , gridRestraint);
         
         gridRestraint.weightx = 1 ;
         gridRestraint.weighty = 1 ;
         gridRestraint.gridx = 0 ;
         gridRestraint.gridy = 4;
         panelProduct.add(item7 , gridRestraint);
         
         gridRestraint.gridx = 1 ;
         gridRestraint.gridy = 4;
         panelProduct.add(item8 , gridRestraint);
         
         gridRestraint.gridx = 2 ;
         gridRestraint.gridy = 4;
         panelProduct.add(item9 , gridRestraint);
         
         gridRestraint.weightx = 0.5 ;
         gridRestraint.weighty = 0.5 ;
         gridRestraint.gridx = 0 ;
         gridRestraint.gridy = 5;
         panelProduct.add(product7 , gridRestraint);
         
         gridRestraint.gridx = 1 ;
         gridRestraint.gridy = 5;
         panelProduct.add(product8 , gridRestraint);
         
         gridRestraint.gridx = 2 ;
         gridRestraint.gridy = 5;
         panelProduct.add(product9 , gridRestraint);
       
         
         //add components to total panel
         panelTotal.add(noItems) ;
         
         
         //add both JPanels to basePanel
         basePanel.add(SalesLabel , BorderLayout.NORTH ) ;
         basePanel.add(buttonTotal , BorderLayout.SOUTH);
         basePanel.add(panelTotal , BorderLayout.WEST) ;
         basePanel.add(panelProduct , BorderLayout.CENTER);
         
        return basePanel ;
        
    }
    
    
    private class buttonActions implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
           //  Get the action command.
            String actionCommand = e.getActionCommand();

             //Determine which button was clicked and display a message.
            if (actionCommand.equals("cake"))
            {
                panelTotal.remove(noItems) ;
                panelTotal.add(new JLabel("Cake                 x1") ) ;
                panelTotal.setVisible(false) ;
                panelTotal.setVisible(true) ;
            }
            else if (actionCommand.equals("muffin"))
            {
                panelTotal.remove(noItems) ;
                panelTotal.add(new JLabel("Muffin                x1")) ;
                panelTotal.setVisible(false) ;
                panelTotal.setVisible(true) ;
            }
            else if (actionCommand.equals("pancake"))
            {
                panelTotal.remove(noItems) ;
                panelTotal.add(new JLabel("Pancake          x1")) ;
                panelTotal.setVisible(false) ;
                panelTotal.setVisible(true) ;
            }
            else if (actionCommand.equals("crepe"))
            {
                panelTotal.remove(noItems) ;
                panelTotal.add(new JLabel("Crepe                x1")) ;
                panelTotal.setVisible(false) ;
                panelTotal.setVisible(true) ;
            }
            else if (actionCommand.equals("donut"))
            {
                panelTotal.remove(noItems) ;
                panelTotal.add(new JLabel("Donut                x1")) ;
                panelTotal.setVisible(false) ;
                panelTotal.setVisible(true) ;
            }
            else if (actionCommand.equals("cookie"))
            {
                panelTotal.remove(noItems) ;
                panelTotal.add(new JLabel("Cookie              x1")) ;
                panelTotal.setVisible(false) ;
                panelTotal.setVisible(true) ;
            }
            else if (actionCommand.equals("coffee"))
            {
                panelTotal.remove(noItems) ;
                panelTotal.add(new JLabel("Coffee               x1")) ;
                panelTotal.setVisible(false) ;
                panelTotal.setVisible(true) ;
            }
            else if (actionCommand.equals("pie"))
            {
                panelTotal.remove(noItems) ;
                panelTotal.add(new JLabel("Pie                    x1")) ;
                panelTotal.setVisible(false) ;
                panelTotal.setVisible(true) ;
            }
            else if (actionCommand.equals("tart"))
            {
                panelTotal.remove(noItems) ;
                panelTotal.add(new JLabel("Tart                   x1")) ;
                panelTotal.setVisible(false) ;
                panelTotal.setVisible(true) ;
            }
            else if(actionCommand.equals("Total"))
            {
                int total = 0 ;
                panelTotal.removeAll();
                panelTotal.add(noItems) ;
                panelTotal.repaint() ;
                JOptionPane.showMessageDialog(null,"Your Total is " + total, "Total",  JOptionPane.PLAIN_MESSAGE);
                
                
                // code added for checking inventory, if we should restock or not
                StockOrder checkStock = new StockOrder() ;
                checkStock.JOPreOrder("cake") ;
                checkStock.JOPreOrder("muffin") ;
                checkStock.JOPreOrder("pancake") ;
                checkStock.JOPreOrder("cookie") ;
                checkStock.JOPreOrder("pie") ;
                checkStock.JOPreOrder("crepe") ;
                checkStock.JOPreOrder("coffee") ;
                checkStock.JOPreOrder("tart") ;
                checkStock.JOPreOrder("donut") ;
                
                
            }
            

        }
    }
}







