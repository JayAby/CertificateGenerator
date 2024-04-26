//SID: 2258796
package CertificateGenerator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
// Used to get the current date
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EnterStudentDetails extends javax.swing.JFrame {
    String studentName, studentDepartment, studentID, startYear, endYear, dateOfAward, reasonForAward;
    
    //Getting the current date
    LocalDate currentDate = LocalDate.now();
    
    //Formatting the date as a string
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = currentDate.format(formatter);
    

    public EnterStudentDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    public String[] getStudentDetails(){
//        Create an array to store the student details
        return new String[] {
            studentName,studentDepartment,studentID,startYear,endYear,dateOfAward,reasonForAward 
        };
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topicLabel = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        lblStudentID = new javax.swing.JLabel();
        lblStudentDept = new javax.swing.JLabel();
        lblStartYear = new javax.swing.JLabel();
        lblEndYear = new javax.swing.JLabel();
        lblDOC = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtStartYear = new javax.swing.JTextField();
        txtEndYear = new javax.swing.JTextField();
        txtDateofAward = new javax.swing.JTextField();
        btnGenerateCert = new javax.swing.JButton();
        lblReasonForAward = new javax.swing.JLabel();
        txtReasonForAward = new javax.swing.JTextField();
        comboBoxDept = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        topicLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        topicLabel.setText("Enter Student Details");

        lblStudentName.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        lblStudentName.setText("Student Name :");

        lblStudentID.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        lblStudentID.setText("Student ID:");

        lblStudentDept.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        lblStudentDept.setText("Student Department:");

        lblStartYear.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        lblStartYear.setText("Start year:");

        lblEndYear.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        lblEndYear.setText("End year:");

        lblDOC.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        lblDOC.setText("Date: ");

        btnGenerateCert.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        btnGenerateCert.setText("Generate Certificate");
        btnGenerateCert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateCertActionPerformed(evt);
            }
        });

        lblReasonForAward.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        lblReasonForAward.setText("Reason for Award: ");

        comboBoxDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ","Accounting and Finance", "Drama and Theatre", "Animal and Environment", "Architecture", "Art and Design", "Business", "Computer Games", "Computer Science", "Crime and Investigation", "Data Science", "Education", "Engineering", "Film and Media", "Health Science", "Law", "Language and Writing", "Management", "Marketing", "Medicine", "Midwifery", "Music Technology", "Nursing", "Policing", "Psychology", "Social Care", "Social Sciences", "Social Work", "Sport" }));

        btnBack.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/joel/Desktop/ARU/1/SoftwarePrinciples/Assessment/CertificateGenerator/CertificateGeneratorGUI/Screen_Shot_2024-04-23_at_12.55.37_60-removebg-preview (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStudentDept)
                                    .addComponent(lblReasonForAward)
                                    .addComponent(lblStartYear)
                                    .addComponent(lblDOC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDateofAward, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addComponent(lblEndYear)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtReasonForAward)
                                        .addComponent(comboBoxDept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudentID))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                    .addComponent(txtStudentName))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(81, 81, 81)
                        .addComponent(btnGenerateCert)
                        .addGap(145, 145, 145)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(topicLabel)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(topicLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentID)
                            .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentDept)
                            .addComponent(comboBoxDept, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReasonForAward)
                            .addComponent(txtReasonForAward, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStartYear)
                            .addComponent(txtStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEndYear)
                            .addComponent(txtEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDOC)
                            .addComponent(txtDateofAward, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenerateCert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        comboBoxDept.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Retrieve selected item
                String selectedItem = (String) comboBoxDept.getSelectedItem();
                studentDepartment = selectedItem;
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateCertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateCertActionPerformed
        // Gets the details entered by the user
        studentName = txtStudentName.getText();
        studentID = txtStudentID.getText();
        startYear = txtStartYear.getText();
        endYear = txtEndYear.getText();
        txtDateofAward.setText(formattedDate);
        dateOfAward = txtDateofAward.getText();
        reasonForAward = txtReasonForAward.getText();
        
        // Converts the startyear and end year from strings to integers
        int start = Integer.parseInt(startYear);
        int end = Integer.parseInt(endYear);
        
       // Checks if there are any empty spaces and returns an error if any
        if("".equals(studentName) || "".equals(studentDepartment) || "".equals(studentID) || "".equals(startYear) || "".equals(endYear) || "".equals(dateOfAward) || "".equals(reasonForAward)){
            JOptionPane.showMessageDialog(this, "Empty Spaces are not allowed");
        }else{
            // Checks if the end year is less than the start year and returns an error
            if(end < start){
                JOptionPane.showMessageDialog(this, "End date cannot be Less than Start date");
            }else{
                //If all textfields are field and end year is greater than start year, then proceed to the awardee details form and close current page
                String[] studentDetails = {studentName, studentDepartment, studentID, startYear, endYear, dateOfAward, reasonForAward};
                AwardeeDetails awardeeDetails = new AwardeeDetails(studentDetails);
                awardeeDetails.setVisible(true);
                this.dispose();
            }

            
        }
    }//GEN-LAST:event_btnGenerateCertActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Closes the current page and returns you to the admin menu
        this.dispose();
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateCert;
    private javax.swing.JComboBox<String> comboBoxDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDOC;
    private javax.swing.JLabel lblEndYear;
    private javax.swing.JLabel lblReasonForAward;
    private javax.swing.JLabel lblStartYear;
    private javax.swing.JLabel lblStudentDept;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JTextField txtDateofAward;
    private javax.swing.JTextField txtEndYear;
    private javax.swing.JTextField txtReasonForAward;
    private javax.swing.JTextField txtStartYear;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}
