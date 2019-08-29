package pis.view;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pis.controller.SingleMaltController;
import pis.model.ViewState;

/**
 *
 * @author milan
 */
public class SingleMaltView extends javax.swing.JFrame implements IView, Observer {

    private final SingleMaltController controller;
    private String display = null;

    public SingleMaltView(SingleMaltController p) {

        controller = p;

        initComponents();
        btnNext.setEnabled(false);
        btnPrevious.setEnabled(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDistillery = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtfieldRegion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFieldAge1 = new javax.swing.JTextField();
        txtFieldAge2 = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAllMalts = new javax.swing.JButton();
        btnMaltFromRegion = new javax.swing.JButton();
        btnMaltInRange = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jTxtAreaResult = new java.awt.TextArea();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SingleMalt App");

        jLabel1.setText("Input");

        jLabel2.setText("Output");

        jLabel3.setText("Distillery");

        jLabel4.setText("Age");

        jLabel5.setText("Region");

        txtfieldRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldRegionActionPerformed(evt);
            }
        });

        jLabel6.setText("Price");

        jLabel7.setText("Age Eange");

        txtFieldAge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAge2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Queries");

        btnAllMalts.setText("All Malts");
        btnAllMalts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllMaltsActionPerformed(evt);
            }
        });

        btnMaltFromRegion.setText("Malts from Region ");
        btnMaltFromRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaltFromRegionActionPerformed(evt);
            }
        });

        btnMaltInRange.setText("Malts in Age Range");
        btnMaltInRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaltInRangeActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Price");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAllMalts)
                            .addComponent(btnMaltFromRegion)
                            .addComponent(btnMaltInRange)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNext)
                                .addGap(76, 76, 76)
                                .addComponent(btnPrevious))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfieldRegion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDistillery, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(307, 307, 307))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClear)
                                    .addComponent(btnExit)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7)
                                .addGap(56, 56, 56)
                                .addComponent(txtFieldAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(txtFieldAge2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTxtAreaResult, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDistillery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtfieldRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTxtAreaResult, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtFieldAge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldAge2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNext)
                            .addComponent(btnPrevious))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)))
                .addComponent(btnAllMalts)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnMaltFromRegion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnClear)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMaltInRange)
                    .addComponent(btnExit))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        try {

            int age = Integer.parseInt(txtage.getText());
            int price = Integer.parseInt(txtPrice.getText());
            String distillery = txtDistillery.getText();

            controller.updatePrice(distillery, age, price); //passing values to Singlemaltcontroller class
            btnNext.setEnabled(false);  
            btnPrevious.setEnabled(false);
            clear();
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Input is not valid \nInput can not be blank", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAllMaltsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllMaltsActionPerformed
        controller.AllMalts();

    }//GEN-LAST:event_btnAllMaltsActionPerformed

    private void btnMaltFromRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaltFromRegionActionPerformed
        try {
            String region = txtfieldRegion.getText();
            controller.maltsFromRegion(region);
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Input Region is not valid! \nInput can not be blank", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaltFromRegionActionPerformed

    private void txtfieldRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldRegionActionPerformed

    private void txtFieldAge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAge2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAge2ActionPerformed

    private void btnMaltInRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaltInRangeActionPerformed
        try {
            String age1 = txtFieldAge1.getText();
            String age2 = txtFieldAge2.getText();
            controller.maltsInAgeRange(age1, age2);
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Input range format notify error! \nInput can not be blank", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaltInRangeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        controller.closeConnection();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        controller.clear();
        jTxtAreaResult.setText("");


    }//GEN-LAST:event_btnClearActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        controller.next();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        controller.previous();        // TODO add your handling code here:
    }//GEN-LAST:event_btnPreviousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllMalts;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMaltFromRegion;
    private javax.swing.JButton btnMaltInRange;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private java.awt.TextArea jTxtAreaResult;
    private javax.swing.JTextField txtDistillery;
    private javax.swing.JTextField txtFieldAge1;
    private javax.swing.JTextField txtFieldAge2;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtfieldRegion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void display(String display) {
        display = display;
        jTxtAreaResult.setText(display);

    }

    @Override
    public void browsing(boolean on) {
        btnNext.setEnabled(on);
        btnPrevious.setEnabled(on);
    }

    @Override
    public void update(Observable observer, Object arg) {

        if (arg == null) {

            browsing(false); //if the objcet is null next and previous button remain disabled 
            clear(); 

        } else {

            ViewState updateObj = (ViewState) arg;  //creating an  viewstate object
            browsing(true);
            txtDistillery.setText(updateObj.getRecord().getDistillery()); //Display each data on the txtfield.
            txtage.setText((updateObj.getRecord().getAge()) + "");
            txtfieldRegion.setText(updateObj.getRecord().getRegion() + "");
            txtPrice.setText(updateObj.getRecord().getPrice() + "");
            display(updateObj.getMessage());

        }

    }

    private void clear() {
        txtDistillery.setText("");
        txtage.setText("");
        txtfieldRegion.setText("");
        txtPrice.setText("");
        txtFieldAge1.setText("");
        txtFieldAge2.setText("");

    }

}
