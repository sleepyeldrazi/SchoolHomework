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
    Color colorSq = Color.blue;//see zad3
    Color colorBg = Color.yellow;//see zad3
    int x= -30;//see zad3
    int y= -30;



    public Zad5() {//see zad3
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paint(Graphics g) {//see zad3
        g.setColor(colorSq);
        setBackground(colorBg);
        g.fillRect(x - 20, y - 20, 40, 40);

    }

    public void mousePressed(MouseEvent evt) {//see zad3
        x = evt.getX();
        y = evt.getY();
    }

    public void mouseClicked(MouseEvent evt) {
        //razlikata s 3ta e 4e imame cikal ot 3 a ne 2 cvqta, toest ako e sin obekta stava jalt, ako e jalt red
        //ako e red sin
        //blue>yellow>red>blue>yellow>......
        if(colorSq == Color.blue){
            colorSq = Color.yellow;
            colorBg = Color.red;
        }
        else if(colorSq == Color.yellow) {
            colorSq = Color.red;
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

    public void mouseDragged(MouseEvent evt) {//see zad3
        x = evt.getX();
        y = evt.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent evt) {
    }

    public static void main(String[] args) {//see zad3
        JFrame win = new JFrame("Sexy Darko");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad5());
        win.setVisible(true);
    }
}
