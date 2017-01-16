/**
 * Created by Konik on 1/16/17.
 */
/**
 * Created by Konik on 1/16/17.
 */
import java.awt.*;

import javax.swing.JFrame;

import java.awt.event.*;

public class Zad1 extends Canvas implements MouseListener,
        MouseMotionListener {
    int x,y;
    int r=0;
    Point p;

    // boolean clear=false;

    public Zad1() {
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x-3,y-3,6,6);
        g.drawOval(p.x-r, p.y-r, 2*r, 2*r);

    }

    public void mousePressed(MouseEvent evt) {
       p= evt.getPoint();
       x=p.x;
       y=p.y;
       r=0;
       repaint();

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
        r = (int) Math.round(evt.getPoint().distance(p));
        repaint();

        repaint();
    }

    public void mouseMoved(MouseEvent evt) {
    }

    //public void update(Graphics g){paint(g);}
    public static void main(String[] args) {
        JFrame win = new JFrame("Sexy Gabi");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad1());
        win.setVisible(true);
    }
}