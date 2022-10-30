/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kirby;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mhmmd
 */
public class Kirby extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Kirby");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Kirby();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public void init() {
        JPanel panel = new Panel2D ();
        getContentPane().add(panel);
    }
    
    class Panel2D extends JPanel {
        
        public Panel2D() {
            setPreferredSize(new Dimension(600, 600)); 
            setBackground(new Color(247, 101, 132)); 
        }
        
        public void paintComponent (Graphics g) {
            super.paintComponent(g);

            // kaki kiri
            g.setColor(Color.black);
            g.fillOval(90,320,220,120);
            
            g.setColor(new Color(198, 22, 84));
            g.fillOval(100,330,200,100);
            
            g.setColor(new Color(233, 106, 111));
            g.fillOval(130,350,20,20);
            
            
            // kaki kanan
            g.setColor(Color.black);
            g.fillOval(270,320,220,120);
            
            g.setColor(new Color(198, 22, 84));
            g.fillOval(280,330,200,100);
            
            g.setColor(new Color(233, 106, 111));
            g.fillOval(430,350,20,20);
            
            
            // tepi wajah
            g.setColor(Color.black);
            g.fillOval(140,90,320,320);
            
            
            // lengan kiri
            g.setColor(Color.black);
            g.fillArc(130,90,80,90,45,180);
            g.fillArc(135,95,80,90,45,180);
            g.fillArc(140,100,80,90,45,180);
            g.fillArc(145,105,80,90,45,180);
            g.fillArc(150,110,80,90,45,180);
            g.fillArc(155,115,80,90,45,180);
            
            g.setColor(new Color(246, 152, 176));
            g.fillArc(140,100,60,70,45,180);
            g.fillArc(145,105,60,70,45,180);
            g.fillArc(150,110,60,70,45,180);
            g.fillArc(155,115,60,70,45,180);
            g.fillArc(160,120,60,70,45,180);
            g.fillArc(165,125,60,70,45,180);
            
            
            // lengan kanan
            g.setColor(Color.black);
            g.fillArc(425,236,80,90,255,180);
            g.fillArc(420,234,80,90,255,180);
            g.fillArc(415,232,80,90,255,180);
            g.fillArc(410,230,80,90,255,180);
            g.fillArc(405,228,80,90,255,180);
            g.fillArc(400,226,80,90,255,180);
            
            g.setColor(new Color(246, 152, 176));
            g.fillArc(435,246,60,70,255,180);
            g.fillArc(430,244,60,70,255,180);
            g.fillArc(425,242,60,70,255,180);
            g.fillArc(420,240,60,70,255,180);
            g.fillArc(415,238,60,70,255,180);
            g.fillArc(410,236,60,70,255,180);
            
            
            // wajah
            g.setColor(new Color(246, 152, 176));
            g.fillOval(150,100,300,300);
            
            
            // blush pipi
            g.setColor(new Color(240, 115, 127));
            g.fillOval(200,200,50,30);
            g.fillOval(350,200,50,30);
            
            
            // mata kiri
            g.setColor(Color.black);
            g.fillOval(250,130,40,100);
            
            g.setColor(new Color(2, 81, 156));
            g.fillOval(255,135,30,90);
            
            g.setColor(Color.black);
            g.fillOval(255,130,30,80);
            
            g.setColor(Color.white);
            g.fillOval(260,135,20,40);
            
            
            // mata kanan
            g.setColor(Color.black);
            g.fillOval(310,130,40,100);
            
            g.setColor(new Color(2, 81, 156));
            g.fillOval(315,135,30,90);
            
            g.setColor(Color.black);
            g.fillOval(315,130,30,80);
            
            g.setColor(Color.white);
            g.fillOval(320,135,20,40);
            
            
            // mulut
            g.setColor(Color.black);
            g.fillOval(283,255,40,50);
            
            
            g.setColor(new Color(133, 48, 85));
            g.fillOval(288,260,30,40);
            
            
            // lidah
            g.setColor(Color.black);
            g.fillOval(285,268,35,30);
            
            g.setColor(new Color(236, 106, 101));
            g.fillOval(288,273,30,25);
            
        }
    }
    
}
