package employee.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{

    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox<String> cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(250, 30, 400, 40);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 30));
        add(heading);
        
        JLabel labelname = new JLabel("Name:");
        labelname.setBounds(50, 100, 100, 30);
        labelname.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(160, 100, 200, 30);
        add(tfname);
        
        JLabel labelfname = new JLabel("Father's Name:");
        labelfname.setBounds(400, 100, 120, 30);
        labelfname.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labelfname);
        
        tffname = new JTextField();
        tffname.setBounds(540, 100, 200, 30);
        add(tffname);
        
        JLabel labeldob = new JLabel("Date of Birth:");
        labeldob.setBounds(50, 150, 120, 30);
        labeldob.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labeldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(160, 150, 200, 30);
        add(dcdob);
        
        JLabel labelsalary = new JLabel("Salary:");
        labelsalary.setBounds(400, 150, 100, 30);
        labelsalary.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(540, 150, 200, 30);
        add(tfsalary);
        
        JLabel labeladdress = new JLabel("Address:");
        labeladdress.setBounds(50, 200, 100, 30);
        labeladdress.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(160, 200, 580, 30);
        add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone:");
        labelphone.setBounds(50, 250, 100, 30);
        labelphone.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(160, 250, 200, 30);
        add(tfphone);
        
        JLabel labelemail = new JLabel("Email:");
        labelemail.setBounds(400, 250, 100, 30);
        labelemail.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(540, 250, 200, 30);
        add(tfemail);
        
        JLabel labeleducation = new JLabel("Education:");
        labeleducation.setBounds(50, 300, 150, 30);
        labeleducation.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labeleducation);
        
        String[] courses = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
        cbeducation = new JComboBox<>(courses);
        cbeducation.setBounds(160, 300, 200, 30);
        add(cbeducation);
        
        JLabel labeldesignation = new JLabel("Designation:");
        labeldesignation.setBounds(400, 300, 100, 30);
        labeldesignation.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(540, 300, 200, 30);
        add(tfdesignation);
        
        JLabel labelaadhar = new JLabel("Aadhar N0. :");
        labelaadhar.setBounds(50, 350, 130, 30);
        labelaadhar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(160, 350, 200, 30);
        add(tfaadhar);
        
        JLabel labelempId = new JLabel("Employee ID:");
        labelempId.setBounds(400, 350, 100, 30);
        labelempId.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(labelempId);
        
        lblempId = new JLabel("" + (int)(Math.random() * 1000000));
        lblempId.setBounds(540, 350, 100, 30);
        lblempId.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(lblempId);
        
        add = new JButton("Add Details");
        add.setBounds(220, 420, 150, 40);
        add.addActionListener(this);
        add.setBackground(new Color(59, 89, 182));
        add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(420, 420, 150, 40);
        back.addActionListener(this);
        back.setBackground(new Color(59, 89, 182));
        back.setForeground(Color.WHITE);
        add(back);
        
        setSize(800, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();
            
            try {
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
