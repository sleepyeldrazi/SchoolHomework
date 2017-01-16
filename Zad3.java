import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

/**
 * Created by Konik on 1/16/17.
 */
public class Zad3 extends Canvas implements MouseListener,
        MouseMotionListener {
    Color colorSq = Color.blue;
    Color colorBg = Color.yellow;
    int x= -30;
    int y= -30;



    public Zad3() {
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paint(Graphics g) {
        g.setColor(colorSq);
        setBackground(colorBg);
        g.fillRect(x - 20, y - 20, 40, 40);

    }

    public void mousePressed(MouseEvent evt) {
    x = evt.getX();
    y = evt.getY();
    }

    public void mouseClicked(MouseEvent evt) {
        if(colorSq == Color.blue){
        colorSq = Color.yellow;
        colorBg = Color.blue;
        }
        else {
            colorSq = Color.blue;
            colorBg = Color.yellow;
        }
        repaint();
    }

    public void mouseReleased(MouseEvent evt) {
    }

    public void mouseEntered(MouseEvent evt) {
    }

    public void mouseExited(MouseEvent evt) {
    }

    public void mouseDragged(MouseEvent evt) {
        x = evt.getX();
        y = evt.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent evt) {
    }

    //public void update(Graphics g){paint(g);}
    public static void main(String[] args) {
        JFrame win = new JFrame("Sexy Sky");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad3());
        win.setVisible(true);
    }
}
