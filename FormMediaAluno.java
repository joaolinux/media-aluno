/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import modelo.Aluno;

/**
 *
 * @author sala303b
 */
public class FormMediaAluno extends javax.swing.JFrame {

    private Object txtDigiteanota1;
    private Object txtDigiteanota2;
    
    

    /**
     * Creates new form FormMediaAluno
     */
    public FormMediaAluno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDigiteanota1 = new javax.swing.JLabel();
        txtDigiteanota1 = new javax.swing.JTextField();
        lblDigiteanota2 = new javax.swing.JLabel();
        txtDigiteanota2 = new javax.swing.JTextField();
        lblDigiteanota3 = new javax.swing.JLabel();
        txtDigiteanota3 = new javax.swing.JTextField();
        lblDigiteanota4 = new javax.swing.JLabel();
        txtDigiteanota4 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblSuamaiornotaé = new javax.swing.JLabel();
        lblSuamenornotaé = new javax.swing.JLabel();
        lblSuamédiaé = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDigiteanota1.setText("Digite a nota 1:");

        txtDigiteanota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigiteanota1ActionPerformed(evt);
            }
        });

        lblDigiteanota2.setText("Digite a nota 2:");

        txtDigiteanota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigiteanota2ActionPerformed(evt);
            }
        });

        lblDigiteanota3.setText("Digite a nota 3:");

        txtDigiteanota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigiteanota3ActionPerformed(evt);
            }
        });

        lblDigiteanota4.setText("Digite a nota 4:");

        txtDigiteanota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigiteanota4ActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setText("limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblSuamaiornotaé.setText("Sua maior nota e:");

        lblSuamenornotaé.setText("Sua menor nota e:");

        lblSuamédiaé.setText("Sua media e:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblDigiteanota1)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDigiteanota2)
                                        .addGap(20, 20, 20)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDigiteanota2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(txtDigiteanota1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDigiteanota3)
                                .addGap(20, 20, 20)
                                .addComponent(txtDigiteanota3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDigiteanota4)
                                .addGap(20, 20, 20)
                                .addComponent(txtDigiteanota4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(lblSuamenornotaé)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSuamaiornotaé, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblSuamédiaé)
                                        .addGap(18, 18, 18))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)))
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDigiteanota1)
                    .addComponent(txtDigiteanota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSuamaiornotaé))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDigiteanota2)
                    .addComponent(txtDigiteanota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSuamenornotaé))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDigiteanota3)
                    .addComponent(txtDigiteanota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSuamédiaé))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDigiteanota4)
                    .addComponent(txtDigiteanota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnLimpar)
                    .addComponent(btnCalcular))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDigiteanota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigiteanota1ActionPerformed
        // TODO add your handling code here:
         lblDigiteanota1.setText("Digite a primeira nota: ");
    }//GEN-LAST:event_txtDigiteanota1ActionPerformed

    private void txtDigiteanota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigiteanota2ActionPerformed
        // TODO add your handling code here:
        lblDigiteanota2.setText("digite a segunda nota: ");
    }//GEN-LAST:event_txtDigiteanota2ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        btnCalcular.setText("Calcular");
        
         Aluno a = new Aluno();
        
        a.setN1(Double.parseDouble(txtDigiteanota1.getText()));
        a.setN2(Double.parseDouble(txtDigiteanota2.getText()));
        a.setN3(Double.parseDouble(txtDigiteanota3.getText()));
        a.setN4(Double.parseDouble(txtDigiteanota4.getText()));
        
         if (a.getN1() > a.getN4()) {
            lblSuamaiornotaé.setText(String.valueOf("Maior nota é: " + a.getN1()));
        } else{
                 lblSuamenornotaé.setText(String.valueOf("Menor nota é: " + a.getN1()));
        } if (a.getN2() > a.getN1()){
            lblSuamaiornotaé.setText(String.valueOf("Maior nota é: " + a.getN2()));
        } else {
             lblSuamenornotaé.setText(String.valueOf("Menor nota é: " + a.getN2()));
        }if(a.getN3() > a.getN2()){
            lblSuamaiornotaé.setText(String.valueOf("Maior nota é: " + a.getN4()));
        } else {
            lblSuamenornotaé.setText(String.valueOf("Menor nota é: " + a.getN4()));
        }
        
        
        double media = (a.getN1() + a.getN2() + a.getN3() + a.getN4()) / 4;
        lblSuamédiaé.setText("Media da nota é: " + (String.valueOf(media)));
      
         
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
         btnSair.setText("Sair");
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        btnLimpar.setText("Limpar");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtDigiteanota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigiteanota3ActionPerformed
        // TODO add your handling code here:
        lblDigiteanota3.setText("digite a terceira nota: ");
        
    }//GEN-LAST:event_txtDigiteanota3ActionPerformed

    private void txtDigiteanota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigiteanota4ActionPerformed
        // TODO add your handling code here:
         lblDigiteanota4.setText("digite a quarta nota: ");
        
    }//GEN-LAST:event_txtDigiteanota4ActionPerformed

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
            java.util.logging.Logger.getLogger(FormMediaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMediaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMediaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMediaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMediaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblDigiteanota1;
    private javax.swing.JLabel lblDigiteanota2;
    private javax.swing.JLabel lblDigiteanota3;
    private javax.swing.JLabel lblDigiteanota4;
    private javax.swing.JLabel lblSuamaiornotaé;
    private javax.swing.JLabel lblSuamenornotaé;
    private javax.swing.JLabel lblSuamédiaé;
    private javax.swing.JTextField txtDigiteanota1;
    private javax.swing.JTextField txtDigiteanota2;
    private javax.swing.JTextField txtDigiteanota3;
    private javax.swing.JTextField txtDigiteanota4;
    // End of variables declaration//GEN-END:variables
}

