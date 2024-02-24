
package CertificateGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GetDetails extends JFrame{
    JLabel lbStudentName, lbStudentID, lbStudentCourse;
    JTextField txtStudentName;
    Font font_1;
    
    public GetDetails(){
        font_1 = new Font(Font.SANS_SERIF,Font.PLAIN, 20);
        
        lbStudentName = new JLabel(" Student's Name: ");
        lbStudentName.setFont(font_1);
        
        setSize(500,600);
        setVisible(true);
        setTitle("Certificate Generator - Student Details");
//        setResizable(false);
        
        addComponents();
        
    }
    
    public void addComponents(){
        setLayout(null);
        
        lbStudentName.setBounds(20,2,300,100);
        add(lbStudentName);
        
        txtStudentName.setBounds(50, 2, 150, 25);
        add(txtStudentName);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
