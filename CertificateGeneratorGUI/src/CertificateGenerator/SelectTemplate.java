
package CertificateGenerator;

import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.FileOutputStream;

public class SelectTemplate extends javax.swing.JFrame {
    
    private String[] studentDetails;
    private String[] awardeeDetails;
    private static final String OUTPUT_FOLDER = "CertificatesPNG"; //Creating a new folder called Certifcates
   

    public SelectTemplate(String[] studentDetails, String[] awardeeDetails) {
        initComponents();
        this.studentDetails = studentDetails;
        this.awardeeDetails = awardeeDetails;
    }

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTemplate1 = new javax.swing.JLabel();
        lblTemplate2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setText("Select Template");

        lblTemplate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CertificateGenerator/CertificatesTemplate/Certificate Design Template (1).png"))); // NOI18N
        lblTemplate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTemplate1MouseClicked(evt);
            }
        });

        lblTemplate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CertificateGenerator/CertificatesTemplate/ResizedCertificateDesignTemplate2.png"))); // NOI18N
        lblTemplate2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTemplate2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTemplate1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTemplate2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1063, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTemplate1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemplate2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1006, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTemplate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTemplate1MouseClicked
        try{
            //Load the certificate template
            BufferedImage certificate = ImageIO.read(new File("/Users/joel/Desktop/ARU/1/SoftwarePrinciples/Assessment/CertificateGenerator/CertificateGeneratorGUI/src/CertificateGenerator/CertificatesTemplate/CertificateDesignTemplate.png"));
                        
            //Create a graphic object from the image
            Graphics2D g = certificate.createGraphics();
            Graphics2D f = certificate.createGraphics();
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial",Font.BOLD,40));
            f.setColor(Color.BLACK);
            f.setFont(new Font("Times New Roman", Font.ITALIC, 50));
            
            //Draw the recipients name
            String name = studentDetails[0] ;
            String dept = studentDetails[1];
            String id = studentDetails[2];
            String startYear = studentDetails[3];
            String endYear = studentDetails[4];
            String awardDate = studentDetails[5];
            String reasonForAward = studentDetails[6];
            f.drawString(name, 900, 540);
            g.drawString(dept,850,1100);
            g.drawString(id,290,1100);
            g.drawString(startYear +  " - " + endYear ,1400,1100);
            g.drawString(awardDate, 900, 932); 
            g.drawString(reasonForAward, 863,760);
                        
            // Draw the awardee details
            String fName = awardeeDetails[0];
            String lName = awardeeDetails[1];
            g.drawString(fName, 1270, 1340);
            f.drawString(fName + "."+ lName.charAt(0), 240, 1340);
            
            g.dispose();
            f.dispose();

            
            //Create the output folder if it doesn't exist
            File folder = new File(OUTPUT_FOLDER);
            if(!folder.exists()){
                folder.mkdir();
            }
            
            //Save the certificate as a PNG file
            File pngOutputFile = new File(OUTPUT_FOLDER + File.separator + "certificate_" + name + "_" + id + ".png");
            ImageIO.write(certificate, "png", pngOutputFile);

            JOptionPane.showMessageDialog(this, "Certificate saved as PNG");
           
            
        }catch(IOException e){
            e.printStackTrace();
            
        }
        

    }//GEN-LAST:event_lblTemplate1MouseClicked

    private void lblTemplate2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTemplate2MouseClicked
        // TODO add your handling code here:
                try{
            //Load the certificate template
            BufferedImage certificate = ImageIO.read(new File("/Users/joel/Desktop/ARU/1/SoftwarePrinciples/Assessment/CertificateGenerator/CertificateGeneratorGUI/src/CertificateGenerator/CertificatesTemplate/CertificateDesignTemplate2.png"));
            
//            //Create a new Image with dimensions
//            BufferedImage resizedImage = new BufferedImage(801,518,BufferedImage.TYPE_INT_ARGB);
//            Graphics2D j = resizedImage.createGraphics();
//            
//            //draw the original image onto the resized image
//            j.drawImage(certificate,0,0,801,518,null);
//            j.dispose();
            
            //Create a graphic object from the image
            Graphics2D g = certificate.createGraphics();
            Graphics2D f = certificate.createGraphics();
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial",Font.BOLD,40));
            f.setColor(Color.BLACK);
            f.setFont(new Font("Times New Roman", Font.ITALIC, 50));
            
            //Draw the recipients name
            String name = studentDetails[0] ;
            String dept = studentDetails[1];
            String id = studentDetails[2];
            String startYear = studentDetails[3];
            String endYear = studentDetails[4];
            String awardDate = studentDetails[5];
            String reasonForAward = studentDetails[6];
            f.drawString(name, 900, 540);
            //g.drawString(dept,850,1100);
            FontMetrics metrics = g.getFontMetrics();
            int x = (certificate.getWidth() - metrics.stringWidth(name)) / 2;
            int y = certificate.getHeight()/2;
            g.drawString(dept, x, y);
            g.drawString(id,290,1100);
            g.drawString(startYear +  " - " + endYear ,1400,1100);
            g.drawString(awardDate, 900, 932); 
            //g.drawString(reasonForAward, 900,760); 
            g.drawString(reasonForAward, x, y);
            
            g.dispose();
            f.dispose();

            
            //Create the output folder if it doesn't exist
            File folder = new File(OUTPUT_FOLDER);
            if(!folder.exists()){
                folder.mkdir();
            }
            
            //Save the certificate as a PNG file
            File pngOutputFile = new File(OUTPUT_FOLDER + File.separator + "certificate_" + name + "_" + id + ".png");
            ImageIO.write(certificate, "png", pngOutputFile);

            JOptionPane.showMessageDialog(this, "Certificate saved as PNG");
           
            
        }catch(IOException e){
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_lblTemplate2MouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SelectTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SelectTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SelectTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SelectTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SelectTemplate().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTemplate1;
    private javax.swing.JLabel lblTemplate2;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
