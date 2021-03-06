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
public class TelaEquipamentos extends javax.swing.JFrame {

    /**
     * Creates new form TelaLevelUp
     */
    Personagem x = new Personagem();
    int pontos = 5;
    int somatorioStats = 0;
    int somatorioAffect =0;
    SpinnerModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
    SpinnerModel model2 = new SpinnerNumberModel(0, 0, 50, 1);
    SpinnerModel model3 = new SpinnerNumberModel(0, 0, 50, 1);
    SpinnerModel model4 = new SpinnerNumberModel(0, 0, 50, 1);

    DAO aux = DAO.getInstance();
    

    public TelaEquipamentos() {
        initComponents();
        spMain.setModel(model1);
        spAcc.setModel(model2);
        spSec.setModel(model3);
        spArm.setModel(model4);
      
        new Thread() {
            public void run() {
                try {
                    
                    do {
                        somatorioStats = (int) spMain.getValue() + (int) spAcc.getValue() + (int) spSec.getValue() + (int) spArm.getValue();

                    if (somatorioStats > 50) {
                        JOptionPane.showMessageDialog(null, "Max SPs = 50");
                        spMain.setValue(0);
                        spSec.setValue(0);
                        spAcc.setValue(0);
                        spArm.setValue(0);
                        somatorioStats =0;
                        }
                    } while (somatorioStats <= 50);
                    somatorioStats = 5;
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
        mainWeaTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        secWeaTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        accTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        armTxt = new javax.swing.JTextField();
        spSec = new javax.swing.JSpinner();
        spAcc = new javax.swing.JSpinner();
        spArm = new javax.swing.JSpinner();
        spMain = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LEVEL UP!");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel4.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel4.setText("Main Weapon");

        mainWeaTxt.setEditable(false);
        mainWeaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mainWeaTxt.setText("jTextField1");
        mainWeaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainWeaTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Orator Std", 0, 24)); // NOI18N
        jLabel5.setText("Equipamentos");

        jLabel8.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel8.setText("Secondary Weapon");

        secWeaTxt.setEditable(false);
        secWeaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        secWeaTxt.setText("jTextField1");
        secWeaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secWeaTxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel9.setText("acessório");

        accTxt.setEditable(false);
        accTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accTxt.setText("jTextField1");
        accTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accTxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Orator Std", 0, 18)); // NOI18N
        jLabel10.setText("Armadura:");

        armTxt.setEditable(false);
        armTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        armTxt.setText("jTextField1");
        armTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armTxtActionPerformed(evt);
            }
        });

        spSec.setMaximumSize(new java.awt.Dimension(0, 5));
        spSec.setMinimumSize(new java.awt.Dimension(0, 0));

        spAcc.setMaximumSize(new java.awt.Dimension(0, 5));
        spAcc.setMinimumSize(new java.awt.Dimension(0, 0));

        spArm.setMaximumSize(new java.awt.Dimension(0, 5));
        spArm.setMinimumSize(new java.awt.Dimension(0, 0));

        spMain.setMaximumSize(new java.awt.Dimension(0, 5));
        spMain.setMinimumSize(new java.awt.Dimension(0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(armTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secWeaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainWeaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainWeaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secWeaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(armTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainWeaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainWeaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainWeaTxtActionPerformed

    private void secWeaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secWeaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secWeaTxtActionPerformed

    private void armTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_armTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Personagem teste = new Personagem();
        Stats status = new Stats();
        
        teste = x;
  
   
        teste.setMainWeapon(x.getMainWeapon()+(int)spMain.getValue());
        teste.setSecWeapon(x.getSecWeapon()+(int)spSec.getValue());
        teste.setAcc(x.getAcc()+(int)spAcc.getValue());
        teste.setArm(x.getArm()+(int)spArm.getValue());

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

    private void accTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accTxtActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accTxt;
    private javax.swing.JTextField armTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mainWeaTxt;
    private javax.swing.JTextField secWeaTxt;
    private javax.swing.JSpinner spAcc;
    private javax.swing.JSpinner spArm;
    private javax.swing.JSpinner spMain;
    private javax.swing.JSpinner spSec;
    // End of variables declaration//GEN-END:variables

    public void stats(Personagem a) {
        System.out.println("-------------------------------------- "+a.getId());
        System.out.println("+++++++++++++++++++++"+aux.getPersonagem(a.getId()).getArm());
        System.out.println("OUTRO ATRIBUTO: "+ aux.getPersonagem(a.getId()).getDex());
        x = a;
        System.out.println("QQQQQQQQQQQQQQQQQQQQQQ "+a.getArm());
        mainWeaTxt.setText(Integer.toString(x.getMainWeapon()));
        accTxt.setText(Integer.toString(x.getAcc()));
        secWeaTxt.setText(Integer.toString(x.getSecWeapon()));
        armTxt.setText(Integer.toString(x.getArm()));
 
    }

}
