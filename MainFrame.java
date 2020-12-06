
package silverline;


import javax.swing.* ;
import java.awt.Color;
import java.awt.event.* ;
import java.awt.Font ;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author aliya
 */
public class MainFrame 
{
    
    // constructor
    public MainFrame()
    {
        setProperties() ;
    }
    
    // Instance Variables for JFrame
    final static int WINDOW_WIDTH = 1000;                                               // Window width in pixels
    final static int WINDOW_HEIGHT =650;                                              // Window height in pixels
    
    JLabel SilverLabel ;                                                                    // Main Label of SilverLine
    JButton exitButton ;                                                                   // Exit Button
    JButton buttonMain ;                                                                  // button to access mainpanel
    JButton buttonData ;                                                                  //button to access data panel
    JButton buttonSales ;                                                                 //button to access sales panel
    JButton buttonStockOrder ;                                                         //button to access Stovk Order panel
    JPanel basicPanel ;                                                                  // Basic Panel on which other panels are shown
    JPanel buttonPanel ;                                                                    // Panel for buttons
    
    CardLayout card ;                                                                      // Card Layout for JPanel change
    
    
    // set properties for JFrame
    void setProperties()
    {
        JFrame window = new JFrame("SilverLine");
        window.setTitle("SilverLine");                                                                  // Set this window's title.
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);                            // Set the size of this window.
        
        // look of the frame
        window.getContentPane().setBackground(new Color(255, 153, 153)) ;          // color of the JFrame
        
        // icon for title bar from relative path
        Image icon = Toolkit.getDefaultToolkit().getImage("src/Pictures/cashbox.png") ;
        window.setIconImage(icon);
        
        //main Label
        SilverLabel = new JLabel("Welcome to SilverLine!");
        SilverLabel.setFont(new Font (Font.SANS_SERIF, Font.BOLD, 24));         // changes font of the main label
        SilverLabel.setBorder(new EmptyBorder(10,10,20,0));
        SilverLabel.setForeground(new Color (153, 0, 61));  
        
        //Main Button
        buttonMain = new JButton("Main") ;
        buttonMain.addActionListener(new buttonActions());
        buttonMain.setBackground(new Color(255, 153, 153)) ;          // color 
        buttonMain.setFont(new Font ("Verdana", Font.PLAIN, 16));         // changes font 
        
        //Sales Button
        buttonSales = new JButton("Sales") ;
        buttonSales.addActionListener(new buttonActions());
        buttonSales.setBackground(new Color(255, 153, 153)) ;          // color
        buttonSales.setFont(new Font ("Verdana", Font.PLAIN, 16));         // changes font
        
        //Data Button
        buttonData = new JButton("Data") ;
        buttonData.addActionListener(new buttonActions());
        buttonData.setBackground(new Color(255, 153, 153)) ;          // color
        buttonData.setFont(new Font ("Verdana", Font.PLAIN, 16));         // changes font
        
        //Stock Order Button
        buttonStockOrder = new JButton("Stock Order") ;
        buttonStockOrder.addActionListener(new buttonActions());
        buttonStockOrder.setBackground(new Color(255, 153, 153)) ;          // color 
        buttonStockOrder.setFont(new Font ("Verdana", Font.PLAIN, 16));         // changes font
        
        // Exit Button
        exitButton = new JButton("Exit");
        exitButton.addActionListener((event) -> System.exit(0));
        exitButton.setBackground(new Color(255, 0, 0)); 
        exitButton.setFont(new Font ("Verdana", Font.PLAIN, 16));         // changes font
        
        // Button Panel
        buttonPanel = new JPanel(new GridLayout(5,1)) ;
        
        // add buttons to button Panel
        buttonPanel.add(buttonMain) ;
        buttonPanel.add(buttonSales ) ;
        buttonPanel.add(buttonData) ;
        buttonPanel.add(buttonStockOrder ) ;
        buttonPanel.add(exitButton ) ;
         
        // Basic Panel and CardLayout to interchange panels
        basicPanel = new JPanel() ;
        card = new CardLayout() ;
        basicPanel.setLayout(card);
        
        // adding ablity to shows other panels in basic panel
        Sales sales = new Sales();                                              // object for sales class
        Data data = new Data() ;                                                  // object for data class
        StockOrder stockOrder = new StockOrder() ;                  // object for stock order class
        
        basicPanel.add(this.buildPanel() , "1") ;                                                     // show main frame panel 
        basicPanel.add(sales.buildPanel() , "2") ;                                                     // show main frame panel 
        basicPanel.add(data.buildPanel() , "3") ;                                                     // show main frame panel 
        basicPanel.add(stockOrder.buildPanel() , "4") ;                                                     // show main frame panel 
        
        // add COmponents to JFrame
        window.add(SilverLabel , BorderLayout.NORTH) ;
        window.add(buttonPanel , BorderLayout.WEST ) ;
        window.add(basicPanel) ;
        
       
        // Specify what happens when the close button is clicked.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);                                                                            // Display the window.
   }
    
    
    // Instance variables for MainFrame
    JPanel mainPanel ;
    JLabel mainLabel ;
    
    // MainFrame Panel 
    
    JPanel buildPanel()
    {
        
        // Main Panel
        mainPanel = new JPanel(new BorderLayout()) ;
        mainPanel.setBackground(new Color(252,243,238)) ;                      // color of the main Panel
        
        // for Image
        ImageIcon image = new ImageIcon("src/Pictures/girl.jpg");              // Import image
        
        
        // for label
        mainLabel = new JLabel("There is a silverlining to every happy sale") ;
        mainLabel.setBackground(new Color(252,243,238)) ;                      // color of the main label
        mainLabel.setFont(new Font (Font.SANS_SERIF, Font.ITALIC, 24));         // changes font of the main label
        mainLabel.setForeground(new Color(245,147,136)) ;
        
        // add components to main panel
        mainPanel.add(new JLabel(image) , BorderLayout.CENTER ) ;  
        mainPanel.add(mainLabel , BorderLayout.SOUTH ) ;  
        
        
        
        return mainPanel ;
    }
    
    
    
    // Action Listener for buttons
    private class buttonActions implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // Get the action command.
            String actionCommand = e.getActionCommand();

            // Determine which button was clicked and display a message.
            if (actionCommand.equals("Sales"))
            {
                card.show(basicPanel ,"2");
            }
            else if (actionCommand.equals("Data"))
            {
                card.show(basicPanel ,"3");
            }
            else if (actionCommand.equals("Stock Order"))
            {
                card.show(basicPanel , "4") ;
            }
            
            else if (actionCommand.equals("Main"))
            {
                card.show(basicPanel , "1") ;
            }
            

        }
    }
    
    
    
}


