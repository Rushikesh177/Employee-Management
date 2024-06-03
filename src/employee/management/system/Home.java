package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove;
    
    Home() {
        setLayout(null);
        
        
        ImageIcon backgroundIcon = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image backgroundImage = backgroundIcon.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT); // Adjusted size
        ImageIcon background = new ImageIcon(backgroundImage);
        JLabel backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, 800, 500); 
        add(backgroundLabel);
        
        // Heading
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(150, 20, 500, 40); 
        heading.setFont(new Font("Segoe UI", Font.BOLD, 25)); 
        heading.setForeground(Color.WHITE);
        backgroundLabel.add(heading);
        
        // Buttons
        add = new JButton("Add Employee");
        add.setBounds(120, 100, 200, 40); 
        add.setFont(new Font("Segoe UI", Font.BOLD, 18));
        add.setBackground(new Color(59, 89, 182));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        backgroundLabel.add(add);
        
        view = new JButton("View Employees");
        view.setBounds(320, 100, 200, 40); 
        view.setFont(new Font("Segoe UI", Font.BOLD, 18));
        view.setBackground(new Color(59, 89, 182));
        view.setForeground(Color.WHITE);
        view.addActionListener(this);
        backgroundLabel.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(120, 160, 200, 40); 
        update.setFont(new Font("Segoe UI", Font.BOLD, 18));
        update.setBackground(new Color(59, 89, 182));
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        backgroundLabel.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(320, 160, 200, 40); 
        remove.setFont(new Font("Segoe UI", Font.BOLD, 18));
        remove.setBackground(new Color(59, 89, 182));
        remove.setForeground(Color.WHITE);
        remove.addActionListener(this);
        backgroundLabel.add(remove);
        
        setSize(800, 500); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee(); 
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
