import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;

/**
 * Created by Konik on 1/16/17.
 */
public class Zad6 extends Canvas implements MouseListener,
        MouseMotionListener {

    Image rock, paper, scissors;//pravim 3 promenlivi za snimkite ni
    int roboChoice; //izborat na kompa
    String text = "Choose one";// teksta koito shte ti kazva kakvo adjeba stava

    int hitCheck(MouseEvent e){// basically e sashtoto kato zad4 no za 3 obekta
        if(e.getX() > 20 && e.getX() < 320 && e.getY() > 20 && e.getY()< 320) return 1;
        else if(e.getX() > 362 && e.getX() < 662 && e.getY() > 20 && e.getY()< 320) return 2;
        else if(e.getX() > 704 && e.getX() < 1004 && e.getY() > 20 && e.getY()< 320) return 3;
        return 0;
    //nqma da obqsnq vse oshte kak raboti zashtoto koito razbere shte polu4i shokolad
    }

    public Zad6() throws IOException {
        rock = ImageIO.read(new File("src/rock.jpg"));//zarejdame 3te snimki
        paper = ImageIO.read(new File("src/paper.jpg"));
        scissors = ImageIO.read(new File("src/scissors.jpg"));
        addMouseListener(this);//see zad1
        addMouseMotionListener(this);

    }

    public void paint(Graphics g) {// namestvame/risuvame 3te snimki
        g.drawImage(rock, 20, 20, 300, 300,  this);
        g.drawImage(scissors, 362, 20, 300, 300,  this);
        g.drawImage(paper, 704, 20, 300, 300,  this);
        g.drawString(text, getWidth()/2 - 45, 340);// info text-a
    }

    public void mousePressed(MouseEvent evt) {//pri natiskane proverqva result-a i pravi text-a na result-a
        if(hitCheck(evt) != 0){
            roboChoice= (int)(Math.random()*2+1);
            if(hitCheck(evt) - roboChoice == -1 || hitCheck(evt) - roboChoice == 2) text = "You Win!";
            else if(hitCheck(evt) - roboChoice == -2 || hitCheck(evt) - roboChoice == 1) text = "You Lose!";
            else text = "It's a Draw!";
        }
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

    public static void main(String[] args) throws IOException {//see zad1
        JFrame win = new JFrame("Sexy Didi");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad6());
        win.setVisible(true);
    }
}
