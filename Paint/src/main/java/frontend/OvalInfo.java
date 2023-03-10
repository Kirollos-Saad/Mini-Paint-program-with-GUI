
package frontend;

import backend.Oval;
import backend.MyPanel;
import backend.Shape;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class OvalInfo extends javax.swing.JFrame implements Node{

    Node parentNode;
    MyPanel myPanel;
    
    private int horizontalRadius;
    private int verticalRadius;
    private Point coordinates;
    private Color color;
    private Color fillColor;
    private String name;
    
    JComboBox<String> jComboBox1;
    
    public OvalInfo(MyPanel myPanel, JComboBox<String> jComboBox1) {
        initComponents();
        this.myPanel = myPanel;
        this.jComboBox1 = jComboBox1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xCoordinateTextField = new javax.swing.JTextField();
        yCoordinateTextField = new javax.swing.JTextField();
        horizontalRadiusTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        setColorButton = new javax.swing.JButton();
        setFillColorButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        verticalRadiusTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("X Coordinate");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Horizontal Diameter");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Y Coordinate");

        xCoordinateTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        yCoordinateTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        horizontalRadiusTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setText("Add Oval");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        setColorButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setColorButton.setText("Set Color");
        setColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setColorButtonActionPerformed(evt);
            }
        });

        setFillColorButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setFillColorButton.setText("Set Fill Color");
        setFillColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFillColorButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Vertical Diameter");

        verticalRadiusTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(xCoordinateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horizontalRadiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yCoordinateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verticalRadiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(setFillColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(setColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(xCoordinateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yCoordinateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(horizontalRadiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(verticalRadiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(setColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(setFillColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        closeWindow();
    }//GEN-LAST:event_formWindowClosing

    private void setColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setColorButtonActionPerformed
        JColorChooser colorChooser = new JColorChooser();
        color = JColorChooser.showDialog(null, "Pick a color....", Color.black);
    }//GEN-LAST:event_setColorButtonActionPerformed

    private void setFillColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setFillColorButtonActionPerformed
        JColorChooser colorChooser = new JColorChooser();
        fillColor = JColorChooser.showDialog(null, "Pick a fill color....", Color.white);
    }//GEN-LAST:event_setFillColorButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       try{
        if(horizontalRadiusTextField.getText().equals("")||verticalRadiusTextField.getText().equals("")||xCoordinateTextField.getText().equals("")||yCoordinateTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Some fields are empty");
             horizontalRadiusTextField.setText("");
            xCoordinateTextField.setText("");
            yCoordinateTextField.setText("");
        }
        else if(Integer.parseInt(xCoordinateTextField.getText())<0 || Integer.parseInt(yCoordinateTextField.getText())<0){
            JOptionPane.showMessageDialog(null,"Coordinates can't be negative");
            xCoordinateTextField.setText("");
            yCoordinateTextField.setText("");
        }
        else if(Integer.parseInt(horizontalRadiusTextField.getText())<0 || Integer.parseInt(verticalRadiusTextField.getText())<0){
            JOptionPane.showMessageDialog(null,"Radii must be bigger than 0");
             horizontalRadiusTextField.setText("");
           
        }
        else{
            horizontalRadius = Integer.parseInt(horizontalRadiusTextField.getText());
            verticalRadius = Integer.parseInt(verticalRadiusTextField.getText());
            coordinates = new Point(Integer.parseInt(xCoordinateTextField.getText()), Integer.parseInt(yCoordinateTextField.getText()));
            if(color == null){
                color = Color.black ;
            }
            if(fillColor == null){
                fillColor = Color.WHITE;
            }
            myPanel.increaseCircles();
            name = "Oval_"+myPanel.getNumberOfCircles();
            
            Oval oval = new Oval(coordinates, horizontalRadius, verticalRadius);
            oval.setColor(color);
            oval.setFillColor(fillColor);
            oval.setName(name);
            myPanel.addShape(oval);
            myPanel.refresh(null);
            
            horizontalRadiusTextField.setText("");
            verticalRadiusTextField.setText("");
            xCoordinateTextField.setText("");
            yCoordinateTextField.setText("");
            
            closeWindow();
        }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You should enter numeric values in all fields");
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OvalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OvalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OvalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OvalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OvalInfo(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField horizontalRadiusTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton setColorButton;
    private javax.swing.JButton setFillColorButton;
    private javax.swing.JTextField verticalRadiusTextField;
    private javax.swing.JTextField xCoordinateTextField;
    private javax.swing.JTextField yCoordinateTextField;
    // End of variables declaration//GEN-END:variables

    public void updateComboBox(){
        jComboBox1.removeAllItems();
        
        Shape[] shapes = myPanel.getShapes();
        for(int i=0; i<shapes.length; i++){
            jComboBox1.addItem(shapes[i].getName());
        }
    }
    
    public void closeWindow(){
        updateComboBox();
        
        this.setVisible(false);
        ((JFrame)this.getParentNode()).setVisible(true);   
    }
     
    @Override
    public void setParentNode(Node n) {
        this.parentNode = n;
    }

    @Override
    public Node getParentNode() {
        return parentNode;
    }
}
