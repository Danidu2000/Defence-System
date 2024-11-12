/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defence.system;

import static defence.system.Strength.CLOSED;
import static defence.system.Strength.HIGH;
import static defence.system.Strength.LOW;
import static defence.system.Strength.MEDIUM;
import static defence.system.Strength.STRONG;

/**
 *
 * @author danid
 */
public class Submarine extends javax.swing.JFrame implements Observer {
    private ObservableInterface Observable;
    private Strength strength;
    private int position;
    

    /**
     * Creates new form Submarine
     */
    public Submarine() {
        initComponents();
        setVisible(true);
    }
    Submarine(ObservableInterface Observable){
	this.Observable=Observable;
        initComponents();
        setVisible(true);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
    }
    @Override
    public void update(boolean areaClear,String commanMsg){
	submarineMsg.setText(commanMsg);
        areaClearText.setText(areaClear==true ? "Area Clear":"Area Not Clear");
        
           
    }
        
        
    @Override
    public void update(String[] subInfoArray){
        
    }
    @Override
    public void update(String[] heliInfoArray,int a) {
        
    }
    @Override
    public void update(String[] tankInfoArray,int a,int b){
        
    }
    @Override
    public void update(String subMassage){
        
    }
    @Override
    public void update(String heliMassage,double a){
        
    }
    @Override
    public void update(String tankMassage,double a,double b){
        
    }
    @Override
    public void update(int position){
        this.position = position;
        if(position<=20&&position>=0){
           strength = Strength.LOW; 
        }else if(position<=40&&position>20){
            strength = Strength.MEDIUM; 
        }else if(position<=60&&position>40){
            strength = Strength.HIGH; 
        }else if(position<=80&&position>60){
            strength = Strength.STRONG; 
        }else{
            strength = Strength.CLOSED; 
        }
        
        if(positionCheck.isSelected()){
           switch (strength) {
                case LOW:
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break;
                case MEDIUM:
                    btn1.setEnabled(true);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break;
                case HIGH:
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break;
                case STRONG:
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(false);
                    break;
                case CLOSED:
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(true);
                    break;
                default:
                    break;
            } 
        }else{
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
        }
    }
    @Override
    public void update(String subText,int a,double b){
        submarineMsg.setText(subText);
    }
    @Override
    public void update(String tankText,int a,int c,double b){
        
    }
    
    @Override
    public void update(String heliText,int a,int c,int d,double b){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        subEnergyCount = new javax.swing.JSlider();
        subOxygenCount = new javax.swing.JSlider();
        subFuelCount = new javax.swing.JSlider();
        positionCheck = new javax.swing.JCheckBox();
        subMassage = new javax.swing.JTextField();
        subMassagebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        subsSoldierCount = new javax.swing.JSpinner();
        subAmmoCount = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        areaClearText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        submarineMsg = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defence/system/images/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 76, -1));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Submarine Defence System");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 6, 580, 76));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defence/system/images/Blue radar.gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 88, 209, -1));

        btn1.setBackground(new java.awt.Color(204, 0, 0));
        btn1.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btn1.setText("Shoot");
        btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 88, 249, 34));

        btn2.setBackground(new java.awt.Color(204, 0, 0));
        btn2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btn2.setText("Sonar Operation");
        btn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 128, 249, 34));

        btn3.setBackground(new java.awt.Color(204, 0, 0));
        btn3.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btn3.setText("Tomahawk Missile");
        btn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 168, 249, 34));

        btn4.setBackground(new java.awt.Color(204, 0, 0));
        btn4.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btn4.setText("Trident-2 Missile");
        btn4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 208, 249, 40));

        subEnergyCount.setBackground(new java.awt.Color(0, 0, 0));
        subEnergyCount.setForeground(new java.awt.Color(204, 204, 204));
        subEnergyCount.setMajorTickSpacing(20);
        subEnergyCount.setMinorTickSpacing(10);
        subEnergyCount.setOrientation(javax.swing.JSlider.VERTICAL);
        subEnergyCount.setPaintLabels(true);
        subEnergyCount.setPaintTicks(true);
        subEnergyCount.setSnapToTicks(true);
        subEnergyCount.setValue(0);
        subEnergyCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                subEnergyCountStateChanged(evt);
            }
        });
        getContentPane().add(subEnergyCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 110, -1, 440));

        subOxygenCount.setBackground(new java.awt.Color(0, 0, 0));
        subOxygenCount.setForeground(new java.awt.Color(204, 204, 204));
        subOxygenCount.setMajorTickSpacing(20);
        subOxygenCount.setMinorTickSpacing(10);
        subOxygenCount.setOrientation(javax.swing.JSlider.VERTICAL);
        subOxygenCount.setPaintLabels(true);
        subOxygenCount.setPaintTicks(true);
        subOxygenCount.setSnapToTicks(true);
        subOxygenCount.setValue(0);
        subOxygenCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                subOxygenCountStateChanged(evt);
            }
        });
        getContentPane().add(subOxygenCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 110, -1, 440));

        subFuelCount.setBackground(new java.awt.Color(0, 0, 0));
        subFuelCount.setForeground(new java.awt.Color(204, 204, 204));
        subFuelCount.setMajorTickSpacing(20);
        subFuelCount.setMinorTickSpacing(10);
        subFuelCount.setOrientation(javax.swing.JSlider.VERTICAL);
        subFuelCount.setPaintLabels(true);
        subFuelCount.setPaintTicks(true);
        subFuelCount.setSnapToTicks(true);
        subFuelCount.setValue(0);
        subFuelCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                subFuelCountStateChanged(evt);
            }
        });
        getContentPane().add(subFuelCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 110, -1, 440));

        positionCheck.setBackground(new java.awt.Color(0, 0, 0));
        positionCheck.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        positionCheck.setForeground(new java.awt.Color(204, 204, 204));
        positionCheck.setText("Position");
        positionCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionCheckActionPerformed(evt);
            }
        });
        getContentPane().add(positionCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 254, 80, 39));

        subMassage.setBackground(new java.awt.Color(0, 0, 0));
        subMassage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subMassage.setForeground(new java.awt.Color(0, 153, 0));
        subMassage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        getContentPane().add(subMassage, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 560, 470, 40));

        subMassagebtn.setBackground(new java.awt.Color(0, 153, 0));
        subMassagebtn.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        subMassagebtn.setText("Send");
        subMassagebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        subMassagebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMassagebtnActionPerformed(evt);
            }
        });
        getContentPane().add(subMassagebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 168, 40));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Energy");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 88, 50, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Oxygen");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 88, 46, 16));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Fuel");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 88, 37, 16));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Soldier Count");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 488, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Ammo Count");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 525, 90, -1));

        subsSoldierCount.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        subsSoldierCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                subsSoldierCountStateChanged(evt);
            }
        });
        getContentPane().add(subsSoldierCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 485, 90, -1));

        subAmmoCount.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        subAmmoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                subAmmoCountStateChanged(evt);
            }
        });
        getContentPane().add(subAmmoCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 522, 90, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        areaClearText.setBackground(new java.awt.Color(0, 0, 0));
        areaClearText.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        areaClearText.setForeground(new java.awt.Color(0, 153, 0));
        areaClearText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaClearText.setText("Area Not Clear");
        areaClearText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaClearText, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaClearText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 485, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        submarineMsg.setBackground(new java.awt.Color(0, 0, 0));
        submarineMsg.setColumns(20);
        submarineMsg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineMsg.setForeground(new java.awt.Color(0, 153, 0));
        submarineMsg.setRows(5);
        jScrollPane1.setViewportView(submarineMsg);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("main consile");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 304, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defence/system/images/Background.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subsSoldierCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_subsSoldierCountStateChanged
        String[] subInfoarray = {
            ""+subsSoldierCount.getValue(),
            ""+subAmmoCount.getValue(),
            ""+subFuelCount.getValue()+"%",
            ""+subEnergyCount.getValue()+"%",
            ""+subOxygenCount.getValue()+"%"};
        Observable.setSubInfo(subInfoarray);
    }//GEN-LAST:event_subsSoldierCountStateChanged

    private void subMassagebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMassagebtnActionPerformed
        String Massage = "SUBMARINE : "+subMassage.getText();
        Observable.setsubMassage(Massage);   // TODO add your handling code here:
    }//GEN-LAST:event_subMassagebtnActionPerformed

    private void positionCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionCheckActionPerformed
        boolean isSelected = positionCheck.isSelected();
            if(isSelected==false){
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
            }else{
                update(this.position);
            }// TODO add your handling code here:
    }//GEN-LAST:event_positionCheckActionPerformed

    private void subAmmoCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_subAmmoCountStateChanged
        String[] subInfoarray = {
            ""+subsSoldierCount.getValue(),
            ""+subAmmoCount.getValue(),
            ""+subFuelCount.getValue()+"%",
            ""+subEnergyCount.getValue()+"%",
            ""+subOxygenCount.getValue()+"%"};
        Observable.setSubInfo(subInfoarray);// TODO add your handling code here:
    }//GEN-LAST:event_subAmmoCountStateChanged

    private void subEnergyCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_subEnergyCountStateChanged
        String[] subInfoarray = {
            ""+subsSoldierCount.getValue(),
            ""+subAmmoCount.getValue(),
            ""+subFuelCount.getValue()+"%",
            ""+subEnergyCount.getValue()+"%",
            ""+subOxygenCount.getValue()+"%"};
        Observable.setSubInfo(subInfoarray);// TODO add your handling code here:
    }//GEN-LAST:event_subEnergyCountStateChanged

    private void subOxygenCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_subOxygenCountStateChanged
        String[] subInfoarray = {
            ""+subsSoldierCount.getValue(),
            ""+subAmmoCount.getValue(),
            ""+subFuelCount.getValue()+"%",
            ""+subEnergyCount.getValue()+"%",
            ""+subOxygenCount.getValue()+"%"};
        Observable.setSubInfo(subInfoarray);// TODO add your handling code here:
    }//GEN-LAST:event_subOxygenCountStateChanged

    private void subFuelCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_subFuelCountStateChanged
        String[] subInfoarray = {
            ""+subsSoldierCount.getValue(),
            ""+subAmmoCount.getValue(),
            ""+subFuelCount.getValue()+"%",
            ""+subEnergyCount.getValue()+"%",
            ""+subOxygenCount.getValue()+"%"};
        Observable.setSubInfo(subInfoarray);// TODO add your handling code here:
    }//GEN-LAST:event_subFuelCountStateChanged

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        int ammo = (int) subAmmoCount.getValue();
        if(ammo<=0){
           submarineMsg.setText("WARNING : Ammo count is empty...");
        }else{
            ammo--;
            subAmmoCount.setValue(ammo);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Submarine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaClearText;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox positionCheck;
    private javax.swing.JSpinner subAmmoCount;
    private javax.swing.JSlider subEnergyCount;
    private javax.swing.JSlider subFuelCount;
    private javax.swing.JTextField subMassage;
    private javax.swing.JButton subMassagebtn;
    private javax.swing.JSlider subOxygenCount;
    private javax.swing.JTextArea submarineMsg;
    private javax.swing.JSpinner subsSoldierCount;
    // End of variables declaration//GEN-END:variables
}
