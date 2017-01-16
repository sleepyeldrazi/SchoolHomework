import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by Konik on 1/16/17.
 */
public class Zad4 extends Canvas implements MouseListener,
        MouseMotionListener {
    Point hit;//see zad1
    int x=-100;//see zad2
    int y= -100;
    int cX = (int)(Math.random()*999 +25);//cX = x na kraga
    int cY = (int)(Math.random()*999 +25);//cY = y na kraga
    static int counter = 0; // broi propusnati opiti

    public Zad4() {//see zad1
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    boolean hitCheck(MouseEvent e){
        if(e.getX() > cX-25 && e.getX() < cX+25 && e.getY() > cY-25 && e.getY() < cY+25) return true;
        return false;
        // funkciq/method koito proverqva dali mishkata e v granicite na kraga, t.e. x i y na mishkata dali sa
        // mejdu na4alnite i krainite x i y (kraga ne e 1px a obhvashta mnogo pixeli)

    }

    public void paint(Graphics g) {
        g.setColor(new Color(0,0,0,0));//pravq nov cvqt s 4ta stoinotst - alpha - koqto e "vidimost"
        g.drawOval(cX, cY,50,50 );// krag4e
        g.setColor(Color.black);//see zad1
        g.drawString("Missed Hits: " + counter, 20, 20);//pravim string koito da izliza gore v lqvo
        g.fillOval(hit.x-3,hit.y-3,6,6); // mqsto na "udar"
        g.drawString("Distance to Point: " + (int)hit.distance(cX, cY), hit.x, hit.y - 10);
        //raztoqnite do centara na kraga #pitagor
    }

    public void mousePressed(MouseEvent evt) {
        hit = evt.getPoint().getLocation();//see zad1
        if(!hitCheck(evt)) counter++;//ako ne sme v kraga dobavi to4ka kam "missed hits"
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

    }

    public void mouseMoved(MouseEvent evt) {
    }

    public static void main(String[] args) { //see zad1
        JFrame win = new JFrame("Sexy Tso");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad4());
        win.setVisible(true);
    }
}
