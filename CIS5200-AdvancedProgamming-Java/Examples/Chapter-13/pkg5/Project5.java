/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg5;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Bernice
 */
public class Project5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create frame for LinesRectsOvalsJPanel
      JFrame frame = 
         new JFrame("Drawing 5 by 5 Grid");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      Grid_5X5 grid = 
         new Grid_5X5(); 
      grid.setBackground(Color.WHITE); 
      frame.add(grid); 
      frame.setSize(240,240);
      frame.setVisible(true);
    }
    
}
