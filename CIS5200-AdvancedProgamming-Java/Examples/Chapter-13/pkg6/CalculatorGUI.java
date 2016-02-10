/*
 Provide a solution for 12.9.  
The solution requires nesting panels 
(i.e., JPanel w/ GridLayout for buttons; 
JFrame w/ BorderLayout for the JPanel and JLabel). 
The following describes the suggested layout managers and placement of the controls.

Create a JPanel
Set JPanel layout manager to GridLayout, add the buttons to this panel
Add the JPanel to the center of the JFrame (i.e., JFrames use BorderLayout)
Add a JLabel control to the "North" of the JFrame
 */
package project.pkg6;

// import Java core packages
import java.awt.*;
import javax.swing.*;


// CalculatorGUI class extends JFrame (superclass that provides the basic attributes of a window
// (title bar, buttons to minimize, max & close the window
public class CalculatorGUI extends JFrame
{ 
    private JButton buttons[];
    private String names[] = { "7","8", "9", "/","4","5", "6","*","1","2", "3","-","0",".","=","+"};
    private GridLayout grid1; // grid for buttons
    private Container container;
    private BorderLayout layout;
    private final JTextField textField1; // text field with set size


    //set up GUI
    public CalculatorGUI()
    {
        super( "Calculator");
        
        // GridLayout with 4 rows & 4 columns
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
                    
        // create and add buttons
        buttons = new JButton[ names.length ];
        
        for (int count = 0; count < names.length; count++)
        {
            buttons[count] = new JButton(names[count]);
            buttonPanel.add(buttons[count]);
        }
        
        textField1 = new JTextField(20);
        
        JPanel content = new JPanel();
        
        
        content.setLayout(new BorderLayout(2, 2));
        content.add( textField1, BorderLayout.NORTH );
        content.add( buttonPanel, BorderLayout.CENTER);
        
        content.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        //... Finish building the window (JFrame)
        this.setContentPane(content);
        this.pack();
        this.setTitle("Calculator");
        this.setResizable(false);
 
        // construct textfield with default text
        setSize(300, 300);
        setVisible(true);

    }
}

