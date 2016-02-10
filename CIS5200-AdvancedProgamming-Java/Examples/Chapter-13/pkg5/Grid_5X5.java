/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg5;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author Bernice
 */
class Grid_5X5 extends JPanel
{
    @Override 
    public void paintComponent(Graphics g)
    {
      super.paintComponent(g); 
      this.setBackground(Color.WHITE);

      g.setColor(Color.RED);
      g.drawLine(30, 30, 180, 30);
      g.drawLine(30, 60, 180, 60);
      g.drawLine(30, 90, 180, 90);
      g.drawLine(30, 120, 180, 120);
      g.drawLine(30, 150, 180, 150);
      g.drawLine(30, 180, 180, 180);
      
      g.drawLine(30, 30, 30, 180);
      g.drawLine(60, 30, 60, 180);
      g.drawLine(90, 30, 90, 180);
      g.drawLine(120, 30, 120, 180);
      g.drawLine(150, 30, 150, 180);
      g.drawLine(180, 30, 180, 180);


    }
}
