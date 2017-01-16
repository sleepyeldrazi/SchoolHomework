/**
 * Created by Konik on 1/16/17.
 */
import java.awt.*;

import javax.swing.JFrame;

import java.awt.event.*;

public class Zad2 extends Canvas implements MouseListener,
        MouseMotionListener {
    int x = -100, y = -100;
    int xOld, yOld;


    public Zad2() {
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(xOld, yOld, x, y);

    }

    public void mousePressed(MouseEvent evt) {
        xOld = evt.getX();
        yOld = evt.getY();
        x = evt.getX();
        y = evt.getY();
    }

    public void mouseClicked(MouseEvent evt) {
    }

    public void mouseReleased(MouseEvent evt) {

    }

    public void mouseEntered(MouseEvent evt) {

    }

    public void mouseExited(MouseEvent evt) {

    }

    public void mouseDragged(MouseEvent evt) {
        xOld = x;
        yOld = y;
        x = evt.getX();
        y = evt.getY();

        repaint();
    }

    public void mouseMoved(MouseEvent evt) {
    }

    public void update(Graphics g){
        paint(g);
    }
    public static void main(String[] args) {
        JFrame win = new JFrame("Sexy Roni");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad2());
        win.setVisible(true);
    }
}