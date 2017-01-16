import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by Konik on 1/16/17.
 */
public class Zad3 extends Canvas implements MouseListener,
        MouseMotionListener {
    Color colorSq = Color.blue;//na4alni cvetove ot zada4ata, colorSq= color Square (tova koeto ostava kato nartisnesh)
    Color colorBg = Color.yellow;//colorBg = color background
    int x= -30;//see zad2
    int y= -30;



    public Zad3() { //see zad1
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paint(Graphics g) {
        g.setColor(colorSq);// set-vam cvetovete
        setBackground(colorBg);// note: nqma g. na setBackground
        g.fillRect(x - 20, y - 20, 40, 40); // kvadrat4eto koeto e na x i y na mishkata

    }

    public void mousePressed(MouseEvent evt) {
    x = evt.getX();//namira kade si natisnal x i y
    y = evt.getY();
    }

    public void mouseClicked(MouseEvent evt) {//pri click (natiskane i puskane barzo bez mestene)
        if(colorSq == Color.blue){//ako e sin kvadrata, smeni cvetovete
        colorSq = Color.yellow;
        colorBg = Color.blue;
        }
        else {// ako ne e sin (toest sa razmeneni) gi varni po staro mu
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
        x = evt.getX();//prenastroiva x i y postoqnno dokato se dviji mishkata
        y = evt.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent evt) {
    }

    public static void main(String[] args) { // see zad1
        JFrame win = new JFrame("Sexy Sky");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Zad3());
        win.setVisible(true);
    }
}
