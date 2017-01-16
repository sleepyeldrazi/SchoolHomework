import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by Konik on 1/16/17.
 */
public class Zad5 extends Canvas implements MouseListener,
        MouseMotionListener {




    public Zad5() {
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paint(Graphics g) {


    }

    public void mousePressed(MouseEvent evt) {

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

    }

    public void mouseMoved(MouseEvent evt) {
    }

    //public void update(Graphics g){paint(g);}
    public static void main(String[] args) {
        JFrame win = new JFrame("Sexy Sky");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad5());
        win.setVisible(true);
    }
}
