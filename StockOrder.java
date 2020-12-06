
package silverline;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author aliya
 */


// problem in class that it will check after every sale, so even if it has notified u before , 
// it will notify u again and again till new stock arrives

public class StockOrder
{
    private int maxArrivalTime , ArrivalTime ,maxDailySales , avgDailySales , Stock ,leadTimeDemand , safetyStock;
    
    String order ;
    
    // the item name given in the method reorder (String item), will be used to look for the product in the data base
    void reorder(String item)
    {
        
        // Arrival time  is hard coded, we can also write it in data base for each item and import it from there
        maxArrivalTime = 4 ;
        ArrivalTime = 2 ;
        
        
        // for example if the delivery takes 2 days , the stock present is calculated and if it falls less than the 
        // safety stock then order more
        
        
        // get the max Daily sales and average daily sales from the data basee for the items.
        
        leadTimeDemand = ArrivalTime * avgDailySales ;                       // the normal demand of item during delivery time
        
        // the extra stock present in inventory in case of late delivery
        safetyStock = (maxArrivalTime * maxDailySales ) - (leadTimeDemand) ;      
        
        // the actuall stock present in the inventory
        Stock = leadTimeDemand + safetyStock ;
        
       if ( Stock <= safetyStock)
        {
            // then order more stock
            // String for order
            order = "Order more items for " + item ;
        }
       
       else
       {
           order = "Inventory is sufficient for " + item ;
       }
      
        
    }
    
    // make JOption pane 
    void JOPreOrder(String item)
    {
        reorder(item) ;
        
          // condition to check if the stock is equal to or has fallen below the safety stock
        if ( Stock <= safetyStock)
        {
            // then order more stock
            // shows a dialogue box 
           
            
            JOptionPane.showMessageDialog(null, order , "ReOrder",  JOptionPane.OK_OPTION);
            
        }
    }
    
    // Panel to be shown in the Stock Order button 
    
    JPanel panelStock , panelPic , basePanel;
    JLabel StockLabel , cakeLabel , pancakeLabel ,muffinLabel ,coffeeLabel ,pieLabel ,tartLabel ,donutLabel ,cookieLabel ,crepeLabel   ;
    
    JPanel buildPanel()
    {
        // label for stock
        StockLabel = new JLabel("Stock Order") ;
        StockLabel.setFont(new Font ("Verdana", Font.BOLD, 22));         // changes font of the stock label
        StockLabel.setBorder(new EmptyBorder(0,20,0,0));
        
        //JPanels
        panelStock = new JPanel(new GridLayout(12, 1)) ;
        panelStock.setBackground(new Color(157,217,209)) ;          // color of the stock panel
        
        panelPic = new JPanel() ;
        panelPic.setBackground(new Color(157,217,209)) ;          // color 
        
        basePanel = new JPanel(new BorderLayout());
        
        // image
        ImageIcon image = new ImageIcon("src/Pictures/main1.jpg");              // Import image
        
        
        // to reorder or not data in jlabels
        reorder("cake") ;
        cakeLabel = new JLabel(order) ;
        cakeLabel.setBorder(new EmptyBorder(0,40,0,0));
        cakeLabel.setFont(new Font ("Verdana", Font.PLAIN, 16)); 
        
        reorder("muffin") ;
        muffinLabel = new JLabel(order) ;
        muffinLabel.setBorder(new EmptyBorder(0,40,0,0));
        muffinLabel.setFont(new Font ("Verdana", Font.PLAIN, 16)); 
        
        reorder("crepe") ;
        crepeLabel = new JLabel(order) ;
        crepeLabel.setBorder(new EmptyBorder(0,40,0,0));
        crepeLabel.setFont(new Font ("Verdana", Font.PLAIN, 16)); 
        
        reorder("donut") ;
        donutLabel = new JLabel(order) ;
        donutLabel.setBorder(new EmptyBorder(0,40,0,0));
        donutLabel.setFont(new Font ("Verdana", Font.PLAIN, 16)); 
        
        reorder("pancake") ;
        pancakeLabel = new JLabel(order) ;
        pancakeLabel.setBorder(new EmptyBorder(0,40,0,0));
        pancakeLabel.setFont(new Font ("Verdana", Font.PLAIN, 16)); 
        
        reorder("cookie") ;
        cookieLabel = new JLabel(order) ;
        cookieLabel.setBorder(new EmptyBorder(0,40,0,0));
        cookieLabel.setFont(new Font ("Verdana", Font.PLAIN, 16)); 
        
        reorder("pie") ;
        pieLabel = new JLabel(order) ;
        pieLabel.setBorder(new EmptyBorder(0,40,0,0));
        pieLabel.setFont(new Font ("Verdana", Font.PLAIN, 16)); 
        
        reorder("coffee") ;
        coffeeLabel = new JLabel(order) ;
        coffeeLabel.setBorder(new EmptyBorder(0,40,0,0));
        coffeeLabel.setFont(new Font ("Verdana", Font.PLAIN, 16)); 
        
        reorder("tart") ;
        tartLabel = new JLabel(order) ;
        tartLabel.setBorder(new EmptyBorder(0,40,0,0));
        tartLabel.setFont(new Font ("Verdana", Font.PLAIN, 16)); 
        
        
        // add contents to stock panel
        panelStock.add(StockLabel);
        panelStock.add(cakeLabel);
        panelStock.add(muffinLabel);
        panelStock.add(crepeLabel);
        panelStock.add(donutLabel);
        panelStock.add(pancakeLabel);
        panelStock.add(cookieLabel);
        panelStock.add(pieLabel);
        panelStock.add(coffeeLabel);
        panelStock.add(tartLabel);
        
        // add components to pic panel
        panelPic.add(new JLabel(image) , BorderLayout.CENTER ) ;  
        
        // add panels to base Panel
        basePanel.add(panelStock , BorderLayout.CENTER) ;
        basePanel.add(panelPic , BorderLayout.EAST) ;
        
        
        
        return basePanel ;
        
    }
    
    
}
