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
    Point hit;
    int x=-100;
    int y= -100;
    int cX = (int)(Math.random()*999 +25);
    int cY = (int)(Math.random()*999 +25);
    int rangeX = x;
    int rangeY = y;
    static int counter = 0;

//invis circle r50 miss counter, range, hitPoint
    public Zad4() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    boolean hitCheck(MouseEvent e){
        if(e.getX() > cX-25 && e.getX() < cX+25 && e.getY() > cY-25 && e.getY() < cY+25) return true;
        return false;

    }

    public void paint(Graphics g) {
        g.setColor(new Color(0,0,0,0));
        g.drawOval(cX, cY,25,25 );
        g.setColor(Color.black);
        g.drawString("Missed Hits: " + counter, 20, 20);
        g.fillOval(hit.x-3,hit.y-3,6,6);
        g.drawString("Distance to Point: " + (int)hit.distance(cX, cY), hit.x, hit.y - 10);
    }

    public void mousePressed(MouseEvent evt) {
        hit = evt.getPoint().getLocation();
        if(!hitCheck(evt)) counter++;
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

    //public void update(Graphics g){paint(g);}
    public static void main(String[] args) {
        JFrame win = new JFrame("Sexy Tso");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad4());
        win.setVisible(true);
    }
}
