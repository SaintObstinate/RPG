/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg.view;

import dgnrpg.DAO;
import dgnrpg.Personagem;
import dgnrpg.Stats;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Bruno Balestra
 */
public class TelaLevelUp extends javax.swing.JFrame {

    /**
     * Creates new form TelaLevelUp
     */
    Personagem x = new Personagem();
    int pontos = 5;
    int somatorioStats = 0;
    int somatorioAffect =0;
    SpinnerModel model1 = new SpinnerNumberModel(0, 0, 5, 1);
    SpinnerModel model2 = new SpinnerNumberModel(0, 0, 5, 1);
    SpinnerModel model3 = new SpinnerNumberModel(0, 0, 5, 1);
    SpinnerModel model4 = new SpinnerNumberModel(0, 0, 5, 1);
    SpinnerModel model5 = new SpinnerNumberModel(0, 0, 4, 1);
    SpinnerModel model6 = new SpinnerNumberModel(0, 0, 4, 1);
    SpinnerModel model7 = new SpinnerNumberModel(0, 0, 4, 1);
    SpinnerModel model8 = new SpinnerNumberModel(0, 0, 50, 1);
    SpinnerModel model9 = new SpinnerNumberModel(0, 0, 50, 1);
    DAO aux = DAO.getInstance();
    

    public TelaLevelUp() {
        initComponents();
        spFor.setModel(model1);
        spAgi.setModel(model2);
        spInt.setModel(model3);
        spVit.setModel(model4);
        spCar.setModel(model5);
        spSab.setModel(model6);
        spDex.setModel(model7);
        new Thread() {
            public void run() {
                try {
                    
                    do {
                        somatorioStats = (int) spFor.getValue() + (int) spAgi.getValue() + (int) spInt.getValue() + (int) spVit.getValue();

                    if (somatorioStats > 5) {
                        JOptionPane.showMessageDialog(null, "Max SPs = 5");
                        spFor.setValue(0);
                        spInt.setValue(0);
                        spAgi.setValue(0);
                        spVit.setValue(0);
                        somatorioStats =0;
                        }
                    } while (somatorioStats <= 5);
                    somatorioStats = 5;
                    
                     do {
                        somatorioAffect = (int) spDex.getValue() + (int) spCar.getValue() + (int) spSab.getValue();

                    if (somatorioAffect > 4) {
                        JOptionPane.showMessageDialog(null, "Max SPs = 4");
                        spCar.setValue(0);
                        spSab.setValue(0);
                        spDex.setValue(0);
                    
                        somatorioAffect =0;
                        }
                    } while (somatorioAffect <= 4);
                     somatorioAffect = 4;
                    sleep(10);
                } catch (InterruptedException ex) {
                    
                }
            }
        }.start();
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        strTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        levelTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        intTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        agiTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        vitTxt = new javax.swing.JTextField();
        spInt = new javax.swing.JSpinner();
        spAgi = new javax.swing.JSpinner();
        spVit = new javax.swing.JSpinner();
        spFor = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        carTxt = new javax.swing.JTextField();
        spCar = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        dexTxt = new javax.swing.JTextField();
        spDex = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        sabTxt = new javax.swing.JTextField();
        spSab = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        levelTxt1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LEVEL UP!");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel4.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel4.setText("for:");

        strTxt.setEditable(false);
        strTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        strTxt.setText("jTextField1");
        strTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Orator Std", 0, 24)); // NOI18N
        jLabel5.setText("LEVEL UP");

        jLabel6.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel6.setText("lEVEL:");

        levelTxt.setEditable(false);
        levelTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        levelTxt.setText("jTextField1");
        levelTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel8.setText("INT:");

        intTxt.setEditable(false);
        intTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        intTxt.setText("jTextField1");
        intTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intTxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel9.setText("agi:");

        agiTxt.setEditable(false);
        agiTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agiTxt.setText("jTextField1");
        agiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agiTxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel10.setText("vit:");

        vitTxt.setEditable(false);
        vitTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vitTxt.setText("jTextField1");
        vitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitTxtActionPerformed(evt);
            }
        });

        spInt.setMaximumSize(new java.awt.Dimension(0, 5));
        spInt.setMinimumSize(new java.awt.Dimension(0, 0));

        spAgi.setMaximumSize(new java.awt.Dimension(0, 5));
        spAgi.setMinimumSize(new java.awt.Dimension(0, 0));

        spVit.setMaximumSize(new java.awt.Dimension(0, 5));
        spVit.setMinimumSize(new java.awt.Dimension(0, 0));

        spFor.setMaximumSize(new java.awt.Dimension(0, 5));
        spFor.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel11.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel11.setText("Car:");

        carTxt.setEditable(false);
        carTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carTxt.setText("jTextField1");
        carTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carTxtActionPerformed(evt);
            }
        });

        spCar.setMaximumSize(new java.awt.Dimension(0, 5));
        spCar.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel12.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel12.setText("Dex:");

        dexTxt.setEditable(false);
        dexTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dexTxt.setText("jTextField1");
        dexTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexTxtActionPerformed(evt);
            }
        });

        spDex.setMaximumSize(new java.awt.Dimension(0, 5));
        spDex.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel13.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel13.setText("Sab:");

        sabTxt.setEditable(false);
        sabTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sabTxt.setText("jTextField1");
        sabTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabTxtActionPerformed(evt);
            }
        });

        spSab.setMaximumSize(new java.awt.Dimension(0, 5));
        spSab.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel14.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel14.setText("->");

        levelTxt1.setEditable(false);
        levelTxt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        levelTxt1.setText("jTextField1");
        levelTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelTxt1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(levelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(levelTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spAgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spVit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(intTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(strTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(carTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spDex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spSab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(levelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(levelTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(strTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spDex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(intTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spSab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spAgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spVit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void strTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_strTxtActionPerformed

    private void levelTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelTxtActionPerformed

    private void intTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intTxtActionPerformed

    private void agiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agiTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agiTxtActionPerformed

    private void vitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vitTxtActionPerformed

    private void carTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carTxtActionPerformed

    private void dexTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dexTxtActionPerformed

    private void sabTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sabTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Personagem teste = new Personagem();
        Stats status = new Stats();
        teste = x;
        teste.setStr(x.getStr()+(int)spFor.getValue());
        teste.setInte(x.getInte()+(int)spInt.getValue());
        teste.setAgi(x.getAgi()+(int)spAgi.getValue());
        teste.setVit(x.getVit()+(int)spVit.getValue());
        teste.setCar(x.getCar()+(int)spCar.getValue());
        teste.setDex(x.getDex()+(int)spDex.getValue());
        teste.setSab(x.getSab()+(int)spSab.getValue());
        teste.setArm(x.getArm());
 
        teste.setNome(x.getNome());
        teste.setRaca(x.getRaca());
        teste.setClasse(x.getClasse());
        if(somatorioStats ==0){
            teste.setLevel(x.getLevel());
        }else{
            teste.setLevel(x.getLevel()+1);
        }
            teste.setModSab(status.mods(teste.getSab()));
            teste.setMP(status.mana(teste.getLevel(), teste.getModSab()));
            teste.setHP(status.vida(teste.getVit()));
            teste.setDef(status.def(teste.getAgi(), teste.getArm(), teste.getDex()));
            teste.setCrit(status.crit(teste.getStr(), teste.getAgi(), teste.getInte(),teste.getLevel()));
            teste.setFatk(status.fatk(teste.getStr(),teste.getAgi(), teste.getMainWeapon(), teste.getSecWeapon(), teste.getAcc()));
            teste.setMatk(status.matk(teste.getInte(),teste.getAgi(), teste.getMainWeapon(), teste.getSecWeapon(), teste.getAcc()));                    
            teste.setHpAtual(teste.getHP());
            teste.setMpAtual(teste.getMP());
            aux.EditarChar(x.getId(), teste);
            aux.berta = teste;
            
        this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void levelTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelTxt1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agiTxt;
    private javax.swing.JTextField carTxt;
    private javax.swing.JTextField dexTxt;
    private javax.swing.JTextField intTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField levelTxt;
    private javax.swing.JTextField levelTxt1;
    private javax.swing.JTextField sabTxt;
    private javax.swing.JSpinner spAgi;
    private javax.swing.JSpinner spCar;
    private javax.swing.JSpinner spDex;
    private javax.swing.JSpinner spFor;
    private javax.swing.JSpinner spInt;
    private javax.swing.JSpinner spSab;
    private javax.swing.JSpinner spVit;
    private javax.swing.JTextField strTxt;
    private javax.swing.JTextField vitTxt;
    // End of variables declaration//GEN-END:variables

    public void stats(Personagem a) {
          x = a;
        strTxt.setText(Integer.toString(x.getStr()));
        agiTxt.setText(Integer.toString(x.getAgi()));
        intTxt.setText(Integer.toString(x.getInte()));
        vitTxt.setText(Integer.toString(x.getVit()));
        levelTxt.setText(Integer.toString(x.getLevel()));
        carTxt.setText(Integer.toString(x.getCar()));
        sabTxt.setText(Integer.toString(x.getSab()));
        dexTxt.setText(Integer.toString(x.getDex()));
        levelTxt1.setText(Integer.toString(x.getLevel()+1));
        if(x.getLevel()%5 !=0){
            spCar.setEnabled(false);
            spDex.setEnabled(false);
            spSab.setEnabled(false);
        }
        
    }

}
