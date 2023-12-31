/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Grade2;

import java.util.ArrayList;


/**
 *
 * @author ckenn
 */
public class FrmPessoa extends javax.swing.JDialog {
    
    private OperacaoCadastro operacaoCadastro;
    private Pessoa pessoa;
    private boolean confirmado;
    private ModeloTabelaPessoa modeloTabelaPessoa = new ModeloTabelaPessoa(new ArrayList<Pessoa> ());
    
    public static boolean executar(java.awt.Frame parent,
                                   OperacaoCadastro operacaoCadastro,
                                   Pessoa pessoa){
        
      FrmPessoa frmPessoa = new FrmPessoa(parent,operacaoCadastro, pessoa);
      frmPessoa.setLocationRelativeTo(null);
      frmPessoa.setVisible(true);
      return frmPessoa.operacaoConfirmada();     
}

    /**
     * Creates new form FrmPessoa
     */
    public FrmPessoa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public FrmPessoa(java.awt.Frame parent,
                     OperacaoCadastro operacaoCadastro,
                     Pessoa pessoa){
        super (parent, true);
        confirmado = false;
        this.operacaoCadastro = operacaoCadastro;
        this.pessoa = pessoa;
        
        initComponents();
        
        if (operacaoCadastro == OperacaoCadastro.ocAlterar ||
            operacaoCadastro == OperacaoCadastro.ocConsultar){
            nameT.setText(pessoa.obterNome());
            phoneT.setText(pessoa.obterTelefone());
        }
        
        buCancelar.setVisible(operacaoCadastro != OperacaoCadastro.ocConsultar);
        nameT.setEnabled(operacaoCadastro != OperacaoCadastro.ocConsultar);
        phoneT.setEnabled(operacaoCadastro != OperacaoCadastro.ocConsultar);
        
        
    }
    
    public boolean operacaoConfirmada(){
        return confirmado;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buCancelar = new javax.swing.JButton();
        nameT = new javax.swing.JTextField();
        phoneT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        patioT = new javax.swing.JTextField();
        numberT = new javax.swing.JTextField();
        complementT = new javax.swing.JTextField();
        districtT = new javax.swing.JTextField();
        cityT = new javax.swing.JTextField();
        stateT = new javax.swing.JComboBox<>();
        cepT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buCancelar.setText("Cancelar");
        buCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buCancelarActionPerformed(evt);
            }
        });

        nameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTActionPerformed(evt);
            }
        });

        jLabel1.setText("nome:");

        jLabel2.setText("telefone:");

        emailT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTActionPerformed(evt);
            }
        });

        jLabel3.setText("e-mail");

        jLabel4.setText("logradouro");

        jLabel5.setText("número");

        jLabel6.setText("complemento");

        jLabel7.setText("bairro");

        jLabel8.setText("cidade");

        patioT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patioTActionPerformed(evt);
            }
        });

        districtT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtTActionPerformed(evt);
            }
        });

        cityT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTActionPerformed(evt);
            }
        });

        stateT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cepT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTActionPerformed(evt);
            }
        });

        jLabel9.setText("cep");

        jLabel10.setText("estado");

        jButton1.setText("confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(stateT, 0, 150, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(districtT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(144, 144, 144)
                                        .addComponent(jLabel6)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(patioT, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(emailT))
                                        .addGap(28, 28, 28)
                                        .addComponent(numberT))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(143, 143, 143))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(cityT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buCancelar)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(complementT, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                .addComponent(jLabel9)
                                                .addComponent(cepT)))))
                                .addGap(0, 16, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complementT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(districtT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buCancelar)
                    .addComponent(jButton1))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buCancelarActionPerformed

    private void emailTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTActionPerformed

    private void patioTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patioTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patioTActionPerformed

    private void cepTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepTActionPerformed

    private void districtTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtTActionPerformed

    private void nameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        
        Pessoa pessoa = new Pessoa();
        pessoa.atualizarNome(nameT.getText());
        pessoa.atualizarTelefone(phoneT.getText());
        pessoa.atualizarEmail(emailT.getText());
        pessoa.atualizarBairro(districtT.getText());
        pessoa.atualizarCEP(cepT.getText());
        pessoa.atualizarCidade(cityT.getText());
        pessoa.atualizarComplemento(complementT.getText());
        pessoa.atualizarLogradouro(patioT.getText());
        
        modeloTabelaPessoa.incluirPessoa(pessoa);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cityTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPessoa dialog = new FrmPessoa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buCancelar;
    private javax.swing.JTextField cepT;
    private javax.swing.JTextField cityT;
    private javax.swing.JTextField complementT;
    private javax.swing.JTextField districtT;
    private javax.swing.JTextField emailT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameT;
    private javax.swing.JTextField numberT;
    private javax.swing.JTextField patioT;
    private javax.swing.JTextField phoneT;
    private javax.swing.JComboBox<String> stateT;
    // End of variables declaration//GEN-END:variables
}
