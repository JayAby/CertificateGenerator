
package CertificateGenerator;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Image;
import java.awt.BorderLayout;
//import java.awt.Image;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ViewCertificates extends javax.swing.JFrame {

    public ViewCertificates() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblViewTemplates = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fileList = new javax.swing.JList<>();
        txtSearchField = new javax.swing.JTextField();
        displayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lblViewTemplates.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblViewTemplates.setText("View Templates");

        lblSearch.setText("Search :");

        //Get the files in a folder
        File folder = new File("/Users/joel/Desktop/ARU/1/SoftwarePrinciples/Assessment/CertificateGenerator/CertificateGeneratorGUI/CertificatesPNG");
        File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".png"));

        //Populate the list model with file names
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for(File file : files){
            listModel.addElement(file.getName());
        }
        fileList.setModel(listModel);
        jScrollPane1.setViewportView(fileList);

        txtSearchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e){
                filterList(files);
            }

            @Override
            public void removeUpdate(DocumentEvent e){
                filterList(files);
            }

            @Override
            public void changedUpdate(DocumentEvent e){
                filterList(files);
            }
        });
        // Adding a selection listener to get the selected image from the list and display in the displayLabel below it
        fileList.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if(!e.getValueIsAdjusting()){
                    String selectedItem = fileList.getSelectedValue();
                    if(selectedItem != null){
                        String filePath = "/Users/joel/Desktop/ARU/1/SoftwarePrinciples/Assessment/CertificateGenerator/CertificateGeneratorGUI/CertificatesPNG/" + selectedItem;
                        ImageIcon originalIcon = new ImageIcon(filePath);

                        //Resize the Image
                        java.awt.Image originalImage = originalIcon.getImage();
                        java.awt.Image resizedImage = originalImage.getScaledInstance(800,516,java.awt.Image.SCALE_SMOOTH);
                        ImageIcon resizedIcon = new ImageIcon(resizedImage);

                        displayLabel.setIcon(resizedIcon);
                    }
                }
            }
        });
        jScrollPane1.setViewportView(fileList);

        txtSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchFieldActionPerformed(evt);
            }
        });

        displayLabel.setText("");
        displayLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(lblViewTemplates, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblViewTemplates, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblViewTemplates.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchFieldActionPerformed

    private void displayLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayLabelMouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to download as PDF?", "Confirmation", JOptionPane.YES_NO_OPTION);

        //Check user choice
        if (choice == JOptionPane.YES_OPTION){
            //Get selected item from the list
            String selectedItem = fileList.getSelectedValue();
            
            if(selectedItem != null){
                try{
                    String output = "output.pdf";
                    PdfWriter writer = new PdfWriter(output);
                    PdfDocument pdfDoc = new PdfDocument(writer);
                    Document document = new Document(pdfDoc);
                    
                    String imagePath = "/Users/joel/Desktop/ARU/1/SoftwarePrinciples/Assessment/CertificateGenerator/CertificateGeneratorGUI/CertificatesPNG/" + selectedItem;
                    ImageData data = ImageDataFactory.create(imagePath);
                    Image img = new Image(data);
                    img.setBorder(Border.NO_BORDER);
                    
                    document.add(img);
                    document.close();
                    JOptionPane.showMessageDialog(this, "PNG image converted to PDF successfully"); 

                }catch(Exception e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                }
            }
            
        }else if(choice == JOptionPane.NO_OPTION){
            
        }
    }//GEN-LAST:event_displayLabelMouseClicked

    private void filterList(File[] files){
        DefaultListModel<String> model = (DefaultListModel<String>) fileList.getModel();
        String searchText = txtSearchField.getText().toLowerCase();
        model.clear();
        for(File file : files){
            String fileName = file.getName();
            if (fileName.toLowerCase().contains(searchText)){
                model.addElement(fileName);
            }
        }
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCertificates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel displayLabel;
    private javax.swing.JList<String> fileList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblViewTemplates;
    private javax.swing.JTextField txtSearchField;
    // End of variables declaration//GEN-END:variables

}
