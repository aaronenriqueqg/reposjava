/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author aaron
 */
public class Panel1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Panel1 pan = new Panel1();
        pan.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton btn = new JButton("Click me");
        JButton btn2 = new JButton("Dont click me");
        JButton btn3 = new JButton("Dude");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);
        frame.getContentPane().add(BorderLayout.EAST,panel);
        //frame.setContentPane(panel);
        
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
