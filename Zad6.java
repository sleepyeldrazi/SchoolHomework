import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Konik on 1/16/17.
 */
public class Zad6 extends Canvas implements MouseListener,
        MouseMotionListener {

    BufferedImage rock = ImageIO.read(new File("rock.png"));
    BufferedImage paper = ImageIO.read(new File("paper.jpg"));
    BufferedImage scisscors = ImageIO.read(new File("scissors.jpg"));


    public Zad6() throws IOException {
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paint(Graphics g) {
    g.drawImage(rock, 20, 20, 320, 320, null, null);

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
    public static void main(String[] args) throws IOException {
        JFrame win = new JFrame("Sexy Sky");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad6());
        win.setVisible(true);
    }
}
