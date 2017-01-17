/**
 * Created by Konik on 1/16/17.
 */
import java.awt.*;

import javax.swing.JFrame;

import java.awt.event.*;

public class Zad2 extends Canvas implements MouseListener,
        MouseMotionListener {
    int x = -100, y = -100; // nastroivam neshtata da izlqzat izvan frame-a
    int xOld, yOld; // starata lokaciq na x i y (she poqsnq po natatak)
    boolean clear = false;


    public Zad2() { // see zad1
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(xOld, yOld, x, y); // ideqta kato cqlo e kogato natisnesh da zapomni kade si i kogato mradnesh da
        //drasne ot tam kadeto si bil do novoto mqsto, i poneje se refreshva vsqka millisecond or sth stava kriva
        if(clear) g.clearRect(0,0, getWidth(), getHeight());

    }

    public void mousePressed(MouseEvent evt) {
        xOld = evt.getX(); // zapomnq ot kade po4va
        yOld = evt.getY();
        x = evt.getX();
        y = evt.getY();
    }

    public void mouseClicked(MouseEvent evt) {
    }

    public void mouseReleased(MouseEvent evt) {

    }

    public void mouseEntered(MouseEvent evt) {
        clear = false;
    }

    public void mouseExited(MouseEvent evt) {
        clear = true;
    }

    public void mouseDragged(MouseEvent evt) {
        xOld = x; // na premestvane 4ertae i zapomnq novite xy kato stari priema movement koito smenq xy
        yOld = y;
        x = evt.getX();
        y = evt.getY();

        repaint();
    }

    public void mouseMoved(MouseEvent evt) {
    }

    public void update(Graphics g){//trqbva da ostavq tova koeto si napravil za da stane "risuvaneto"
        paint(g);
    }
    public static void main(String[] args) { //see zad1
        JFrame win = new JFrame("Sexy Roni");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad2());
        win.setVisible(true);
    }
}