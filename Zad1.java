/**
 * Created by Konik on 1/16/17.
 */
import java.awt.*;

import javax.swing.JFrame;

import java.awt.event.*;

public class Zad1 extends Canvas implements MouseListener,
        MouseMotionListener {
    int r=0; //radius
    Point p; // polzvam p za segashnata poziciq na mishkata (po kratko otkolkoto oshte 2 promenlivi xy)

    public Zad1() { // konstruktora si e qsen smsl trqbva da se add-nat 2ta listener-i
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red); // i like red
        g.fillOval(p.x-3,p.y-3,6,6); // pravi "to4kata" kadeto si natisnal kato e s radius 3
        g.drawOval(p.x-r, p.y-r, 2*r, 2*r);
        //4ertae ot p(mishka) - radius  do 2* radiusa t.e. diametar zashtoto trqbva ppc da se vavejda
        // "shiro4inata" i "viso4inata" na kraga (diametri = 2*r)
        //poneje mishkata vinagi e na r raztoqnie ot centara zatova se vadi r ot x i y na mishkata
    }

    public void mousePressed(MouseEvent evt) { // evt darji vsi4ko info za input na mishkata, ot nego vzimash position
       p= evt.getPoint(); // p= lokaciqta na mishkata
       r=0; // na4alen radius
       repaint(); // risuvame

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
        r = (int) Math.round(evt.getPoint().distance(p)); // radiusa e raven na raztoqnieto ot tam kadeto e bilo
        // natisnato(p) do segashnoto mqsto (evt.getPoint())
        repaint();

        repaint();
    }

    public void mouseMoved(MouseEvent evt) {
    }

    //public void update(Graphics g){paint(g);}
    public static void main(String[] args) {
        JFrame win = new JFrame("Sexy Gabi"); // setup na frame
        win.setSize(1024, 768);//size na frame
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // bullshit
        win.add(new Zad1()); // dobavqne na canvas-a v frame-a
        win.setVisible(true); // let it shine
    }
}