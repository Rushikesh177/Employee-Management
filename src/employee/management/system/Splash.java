package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {

    private JLabel heading;

    Splash() {
        getContentPane().setBackground(new Color(240, 240, 240));
        setLayout(null);

       
        JPanel titleBar = new JPanel();
        titleBar.setBackground(new Color(51, 51, 51));
        titleBar.setBounds(0, 0, 500, 30);
        titleBar.setLayout(null);
        add(titleBar);

        JButton closeBtn = new JButton("X");
        closeBtn.setBounds(470, 0, 30, 30);
        closeBtn.setBackground(new Color(51, 51, 51));
        closeBtn.setForeground(Color.WHITE);
        closeBtn.setFocusPainted(false);
        closeBtn.setBorder(null);
        closeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        titleBar.add(closeBtn);

        JButton minimizeBtn = new JButton("-");
        minimizeBtn.setBounds(440, 0, 30, 30);
        minimizeBtn.setBackground(new Color(51, 51, 51));
        minimizeBtn.setForeground(Color.WHITE);
        minimizeBtn.setFocusPainted(false);
        minimizeBtn.setBorder(null);
        minimizeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setState(JFrame.ICONIFIED);
            }
        });
        titleBar.add(minimizeBtn);

        
        heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(50, 40, 460, 30);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 22));
        heading.setForeground(new Color(51, 51, 51));
        add(heading);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 90, 400, 200);
        add(image);

        
        JButton clickHere = new JButton("CLICK HERE TO CONTINUE");
        clickHere.setBounds(150, 310, 200, 40);
        clickHere.setBackground(new Color(59, 89, 182));
        clickHere.setForeground(Color.WHITE);
        clickHere.setFocusPainted(false);
        clickHere.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        clickHere.addActionListener(this);
        add(clickHere);

        setSize(500, 400);
        setLocationRelativeTo(null); 
        setUndecorated(true); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String args[]) {
        new Splash();
    }
}
