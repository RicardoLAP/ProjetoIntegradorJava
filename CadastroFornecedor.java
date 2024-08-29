
package Fornecedor;

import javax.swing.JOptionPane;


public class CadastroFornecedor extends javax.swing.JFrame {
    FornecedorDao fctrl = new FornecedorDao();
    
 
    public CadastroFornecedor() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLEmail = new javax.swing.JLabel();
        jBGravar = new javax.swing.JButton();
        jTextNome = new javax.swing.JTextField();
        jBAtuali = new javax.swing.JButton();
        jTextCnpj = new javax.swing.JTextField();
        jBExcluir = new javax.swing.JButton();
        jTextEndereco = new javax.swing.JTextField();
        jTextTelefone = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextContato = new javax.swing.JTextField();
        jTextProdutoServ = new javax.swing.JTextField();
        jTextPagamento = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jLCnpj = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLEntrega = new javax.swing.JLabel();
        jLPagamento = new javax.swing.JLabel();
        jLProdutoServ = new javax.swing.JLabel();
        jTextEntrega = new javax.swing.JTextField();
        jLContato = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jLCod = new javax.swing.JLabel();
        jTextCod = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        SubMenu1 = new javax.swing.JMenu();
        SubMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLEmail.setText("E-mail:");

        jBGravar.setText("Gravar");
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jBAtuali.setText("Atualizar");
        jBAtuali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualiActionPerformed(evt);
            }
        });

        jTextCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCnpjActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jLNome.setText("Nome da Empresa:");

        jLCnpj.setText("Cnpj:");

        jLEndereco.setText("Enereço:");

        jLTelefone.setText("Telefone:");

        jLEntrega.setText("Prazo de Entrega:");

        jLPagamento.setText("Condições de Pagamento:");

        jLProdutoServ.setText("Tipo de Produto/Serviço:");

        jLContato.setText("Nome do Contato:");

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLCod.setText("Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLContato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextContato, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jBLimpar)
                                .addGap(39, 39, 39)
                                .addComponent(jBAtuali)
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBExcluir)
                                        .addGap(43, 43, 43)
                                        .addComponent(jBGravar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLProdutoServ, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextProdutoServ, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(27, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLCod, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCod)
                    .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCnpj)
                    .addComponent(jTextCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEndereco)
                    .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefone)
                    .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLContato)
                    .addComponent(jTextContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProdutoServ)
                    .addComponent(jTextProdutoServ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEntrega)
                    .addComponent(jTextEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPagamento)
                    .addComponent(jTextPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpar)
                    .addComponent(jBAtuali)
                    .addComponent(jBExcluir)
                    .addComponent(jBGravar))
                .addGap(126, 126, 126))
        );

        SubMenu1.setText("Início");
        jMenuBar1.add(SubMenu1);

        SubMenu2.setText("Relatório Completo");
        jMenuBar1.add(SubMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
        Fornecedor f = this.montar();
        if (f != null) {
            CadastroFornecedor Ctrl  = new CadastroFornecedor();
            Ctrl.insets();
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jBAtualiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualiActionPerformed
        Fornecedor f = this.montar();
        if (f != null && !jTextCod.getText().trim().isEmpty()) {
            f.setCod(Integer.parseInt(jTextCod.getText()));
            fctrl.update(f);
        }else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBAtualiActionPerformed

    private void jTextCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCnpjActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if(! jTextCod.getText().trim().isEmpty()) {
            int cod = Integer.parseInt(jTextCod.getText());
            fctrl.delete(cod);
        } else {
            JOptionPane.showMessageDialog(null,"Informe nvamente...");
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

 
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }
    public Fornecedor montar() {
    // Verifica se os campos de texto não estão vazios
    if (jTextCnpj.getText().trim().isEmpty() || jTextContato.getText().trim().isEmpty() || jTextEmail.getText().trim().isEmpty() ||
           jTextEndereco.getText().trim().isEmpty() || jTextEntrega.getText().trim().isEmpty() || jTextEntrega.getText().trim().isEmpty() || 
            jTextNome.getText().trim().isEmpty() || jTextPagamento.getText().trim().isEmpty() || 
            jTextPagamento.getText().trim().isEmpty() || jTextProdutoServ.getText().trim().isEmpty() ||
            jTextTelefone.getText().trim().isEmpty()
            ) {
        // Exibe uma mensagem de erro
        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        return null; // ou pode lançar uma exceção
    }
    
    // Caso os campos estejam preenchidos, monta o objeto Fornecedor
    try {
            Fornecedor f = new Fornecedor();
            f.setCnpj(Long.parseLong(jTextCnpj.getText().trim()));
            f.setCond(jTextPagamento.getText().trim());
            f.setEmail(jTextEmail.getText().trim());
            f.setEndereco(jTextEndereco.getText().trim());
            f.setNome(jTextNome.getText().trim());
            f.setNomeConta(jTextContato.getText().trim());
            f.setPrazo(jTextEntrega.getText().trim());
            f.setTipo(jTextProdutoServ.getText().trim());
        
        return f;
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "CNPJ inválido. Deve ser um número.", "Erro", JOptionPane.ERROR_MESSAGE);
        return null; // ou pode lançar uma exceção
    }
}
    
    public void  Limpar() {
        
        jTextCnpj.setText("");
        jTextContato.setText("");
        jTextEmail.setText("");
        jTextEndereco.setText("");       
        jTextEntrega.setText("");
        jTextNome.setText("");       
        jTextPagamento.setText("");
        jTextProdutoServ.setText(""); 
        jTextTelefone.setText("");   
        jTextCod.setText("");
                
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu SubMenu1;
    private javax.swing.JMenu SubMenu2;
    private javax.swing.JButton jBAtuali;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JLabel jLCnpj;
    private javax.swing.JLabel jLCod;
    private javax.swing.JLabel jLContato;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLEntrega;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPagamento;
    private javax.swing.JLabel jLProdutoServ;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCnpj;
    private javax.swing.JTextField jTextCod;
    private javax.swing.JTextField jTextContato;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextEntrega;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPagamento;
    private javax.swing.JTextField jTextProdutoServ;
    private javax.swing.JTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables
}
