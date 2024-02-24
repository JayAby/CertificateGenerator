
package CertificateGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GetDetails extends JFrame{
    JLabel lbStudentName, lbStudentID, lbStudentCourse;
    JTextField txtStudentName, txtStudentID, txtStudentCourse;
    Font font_1, font_2;
    JButton btnGenerate;
    String studentName, studentID, studentCourse;
    
    public GetDetails(){
        font_1 = new Font(Font.SANS_SERIF,Font.PLAIN, 15);
        font_2 = new Font(Font.SERIF, Font.BOLD, 20);
        
        txtStudentName = new JTextField();
        txtStudentID = new JTextField();
        txtStudentCourse = new JTextField();

        lbStudentName = new JLabel(" Student's Name: ");
        lbStudentName.setFont(font_1);
        lbStudentID = new JLabel("Student's ID: ");
        lbStudentID.setFont(font_1);
        lbStudentCourse = new JLabel("Student's Course: ");
        lbStudentCourse.setFont(font_1);
        
        btnGenerate = new JButton("Generate");
        btnGenerate.setFont(font_2);
        btnGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateButtonAction(e);
            }
        });        
        
        setSize(760,600);
        setVisible(true);
        setTitle("Certificate Generator - Student Details");
        setResizable(true);
        
        addComponents();
        
    }
    
    public void addComponents(){
        setLayout(null);
        
        lbStudentName.setBounds(18,2,300,100);
        add(lbStudentName);
        
        txtStudentName.setBounds(150, 40, 250, 25);
        add(txtStudentName);
        
        lbStudentID.setBounds(20,60,300,100);
        add(lbStudentID);
        
        txtStudentID.setBounds(130, 100,250,25);
        add(txtStudentID);
        
        lbStudentCourse.setBounds(20,118,300,100);
        add(lbStudentCourse);
        
        txtStudentCourse.setBounds(160,158,250,25);
        add(txtStudentCourse);
        
        btnGenerate.setBounds(200,200,150,30);
        add(btnGenerate);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnGenerate){
            generateButtonAction(e);
        }
       
    }
    
    public void generateButtonAction(ActionEvent e){
        JOptionPane.showMessageDialog(this, "Saved");
        studentName = txtStudentName.getText();
        studentID = txtStudentID.getText();
        studentCourse = txtStudentCourse.getText();
        
        DisplayDetails.display(studentName, studentID, studentCourse);
        
        
    }
}
