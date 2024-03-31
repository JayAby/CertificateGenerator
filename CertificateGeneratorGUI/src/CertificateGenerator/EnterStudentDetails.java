
package CertificateGenerator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        topicLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        topicLabel.setText("Enter Student Details");

        lblStudentName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblStudentName.setText("Student Name :");

        lblStudentID.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblStudentID.setText("Student ID:");

        lblStudentDept.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblStudentDept.setText("Student Department:");

        lblStartYear.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblStartYear.setText("Start year:");

        lblEndYear.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblEndYear.setText("End year:");

        lblDOC.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblDOC.setText("Date of Certificate Awarded:");

        btnGenerateCert.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnGenerateCert.setText("Generate Certificate");
        btnGenerateCert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateCertActionPerformed(evt);
            }
        });

        lblReasonForAward.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblReasonForAward.setText("Reason for Award: ");

        comboBoxDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accounting and Finance", "Drama and Theatre", "Animal and Environment", "Architecture", "Art and Design", "Business", "Computer Games", "Computer Science", "Crime and Investigation", "Data Science", "Education", "Engineering", "Film and Media", "Health Science", "Law", "Language and Writing", "Management", "Marketing", "Medicine", "Midwifery", "Music Technology", "Nursing", "Policing", "Psychology", "Social Care", "Social Sciences", "Social Work", "Sport" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDOC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateofAward, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblReasonForAward)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtReasonForAward, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblStudentDept)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBoxDept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblStudentID)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(topicLabel)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblStartYear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(lblEndYear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btnGenerateCert)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(topicLabel)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentID)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudentDept)
                    .addComponent(comboBoxDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReasonForAward)
                    .addComponent(txtReasonForAward, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartYear)
                    .addComponent(lblEndYear)
                    .addComponent(txtStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOC)
                    .addComponent(txtDateofAward, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnGenerateCert, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateCertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateCertActionPerformed
        // TODO add your handling code here:
        
        studentName = txtStudentName.getText();
        studentID = txtStudentID.getText();
        startYear = txtStartYear.getText();
        endYear = txtEndYear.getText();
        txtDateofAward.setText(formattedDate);
        dateOfAward = txtDateofAward.getText();
        reasonForAward = txtReasonForAward.getText();
                
        if("".equals(studentName) || "".equals(studentDepartment) || "".equals(studentID) || "".equals(startYear) || "".equals(endYear) || "".equals(dateOfAward) || "".equals(reasonForAward)){
            JOptionPane.showMessageDialog(this, "Empty Spaces are not allowed");
        }else{
            //If all fields are field, proceed to the template selection form
            String[] studentDetails = {studentName, studentDepartment, studentID, startYear, endYear, dateOfAward, reasonForAward};
            AwardeeDetails awardeeDetails = new AwardeeDetails(studentDetails);
            awardeeDetails.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnGenerateCertActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerateCert;
    private javax.swing.JComboBox<String> comboBoxDept;
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
