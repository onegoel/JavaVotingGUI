import javax.swing.*;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.*;

public class Vote {
    String hero;
    JFrame f = new JFrame("Java Voting System");
    JRadioButton[] cand = new JRadioButton[4];
    JLabel[] l = new JLabel[4];
    JButton[] btn = new JButton[2];
    public Vote() {
        
        l[0] = new JLabel("The clubs: ");
        l[0].setBounds(100, 45, 300, 60);
        l[1] = new JLabel();
        l[1].setBounds(100, 275, 275, 40);
        l[2] = new JLabel();
        l[2].setText("Click the ``Vote`` button once you've selected your club.");
        l[2].setBounds(0, 0, 500, 40);
        btn[0] = new JButton("VOTE");
        btn[1] = new JButton("EXIT");
        btn[0].setBackground(Color.black);
        btn[0].setForeground(Color.white);
        btn[0].setBounds(100, 275, 75, 40);
        btn[1].setBackground(Color.black);
        btn[1].setForeground(Color.white);
        btn[1].setBounds(100, 320, 75, 40);

        btn[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                btn[0].setVisible(false);
                l[1].setText("You voted - " + hero);
            }
        });

        btn[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(1);
            }
        });

        cand[0] = new JRadioButton("Man Utd");
        cand[1] = new JRadioButton("Juventus");
        cand[2] = new JRadioButton("Real Madrid");
        cand[3] = new JRadioButton("Bayern Munich");

        cand[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                hero = cand[0].getText();
            }
        });

        cand[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                hero = cand[1].getText();
            }
        });

        cand[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                hero = cand[2].getText();
            }
        });

        cand[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                hero = cand[3].getText();
            }
        });
        
        cand[0].setForeground(Color.red);
        cand[1].setForeground(Color.blue);
        cand[2].setForeground(Color.green);
        cand[3].setForeground(Color.orange);
        
        cand[0].setBounds(100, 100, 300, 40);
        cand[1].setBounds(100, 140, 300, 40);
        cand[2].setBounds(100, 180, 300, 40);
        cand[3].setBounds(100, 220, 300, 40);

        f.add(btn[0]);
        f.add(btn[1]);
        f.add(l[0]);
        f.add(l[1]);
        f.add(l[2]);
        f.add(cand[0]);
        f.add(cand[1]);
        f.add(cand[2]);
        f.add(cand[3]);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Vote v = new Vote();
    }
}
