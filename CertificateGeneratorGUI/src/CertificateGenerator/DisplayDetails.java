
package CertificateGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayDetails {
    public static void display(String studentName, String studentID, String studentCourse){
        JFrame frame = new JFrame("Saved Information");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
        
        JLabel nameLabel = new JLabel("Student's Name: " + studentName);
        JLabel idLabel = new JLabel("Student's ID: " + studentID);
        JLabel courseLabel = new JLabel("Student's Course: " + studentCourse);    
    
        panel.add(nameLabel);
        panel.add(idLabel);
        panel.add(courseLabel);
        
        frame.add(panel);
        frame.setVisible(true);

    }
}


