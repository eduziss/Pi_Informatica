/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto.pi.basepi;

import javax.swing.JOptionPane;

/**
 *
 * @author athyla
 */
public class DetalhePedido extends javax.swing.JFrame {

    /**
     * Creates new form DetalhePedido
     */
    public DetalhePedido() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlDpPedido = new javax.swing.JPanel();
        lblDpPedido = new javax.swing.JLabel();
        lblDpVendedor = new javax.swing.JLabel();
        lblDpCliente = new javax.swing.JLabel();
        txtDpDtPedido = new javax.swing.JFormattedTextField();
        lblDpCpfCliente = new javax.swing.JLabel();
        lblDpDtPedido = new javax.swing.JLabel();
        lblDpValorTotal = new javax.swing.JLabel();
        txtDpVendedor = new javax.swing.JTextField();
        txtDpCliente = new javax.swing.JTextField();
        txtDpCpfCliente = new javax.swing.JFormattedTextField();
        txtDpValorTotal = new javax.swing.JFormattedTextField();
        lblDpValorTotal1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDpProduto = new javax.swing.JTable();
        btnDpVoltar = new javax.swing.JButton();
        btnDpExcluir = new javax.swing.JButton();
        btnDpAtualizar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlDpPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDpPedido.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblDpPedido.setText("Pedido N°: ");

        javax.swing.GroupLayout pnlDpPedidoLayout = new javax.swing.GroupLayout(pnlDpPedido);
        pnlDpPedido.setLayout(pnlDpPedidoLayout);
        pnlDpPedidoLayout.setHorizontalGroup(
            pnlDpPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDpPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDpPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(199, 199, 199))
        );
        pnlDpPedidoLayout.setVerticalGroup(
            pnlDpPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDpPedidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDpPedido)
                .addContainerGap())
        );

        lblDpVendedor.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblDpVendedor.setText("Vendedor:");

        lblDpCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblDpCliente.setText("Cliente:");

        try {
            txtDpDtPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDpCpfCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblDpCpfCliente.setText("CPF Cliente:");

        lblDpDtPedido.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblDpDtPedido.setText("Dt do Pedido:");

        lblDpValorTotal.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblDpValorTotal.setText("Valor Total:");

        try {
            txtDpCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDpValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$###.###,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDpValorTotal1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblDpValorTotal1.setText("Produtos:");

        tblDpProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod", "Marca", "Produto", "Qtd", "Preço Unitário"
            }
        ));
        jScrollPane2.setViewportView(tblDpProduto);

        btnDpVoltar.setText("Voltar");
        btnDpVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDpVoltarActionPerformed(evt);
            }
        });

        btnDpExcluir.setText("Excluir");
        btnDpExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDpExcluirActionPerformed(evt);
            }
        });

        btnDpAtualizar.setText("Atualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDpPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDpCpfCliente)
                            .addComponent(lblDpDtPedido)
                            .addComponent(lblDpCliente)
                            .addComponent(lblDpVendedor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lblDpValorTotal1))
                                .addComponent(lblDpValorTotal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDpDtPedido)
                            .addComponent(txtDpVendedor)
                            .addComponent(txtDpCliente)
                            .addComponent(txtDpCpfCliente)
                            .addComponent(txtDpValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDpVoltar)
                .addGap(18, 18, 18)
                .addComponent(btnDpAtualizar)
                .addGap(18, 18, 18)
                .addComponent(btnDpExcluir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDpPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDpVendedor)
                    .addComponent(txtDpVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDpCliente)
                    .addComponent(txtDpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDpCpfCliente)
                    .addComponent(txtDpCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDpDtPedido)
                    .addComponent(txtDpDtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDpValorTotal)
                    .addComponent(txtDpValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDpValorTotal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDpVoltar)
                    .addComponent(btnDpExcluir)
                    .addComponent(btnDpAtualizar))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDpVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDpVoltarActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btnDpVoltarActionPerformed

    private void btnDpExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDpExcluirActionPerformed
        JOptionPane.showConfirmDialog(rootPane, "Você tem Certeza que deseja excluir o Pedido de n° tal ?");
    }//GEN-LAST:event_btnDpExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(DetalhePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalhePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalhePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalhePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalhePedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDpAtualizar;
    private javax.swing.JButton btnDpExcluir;
    private javax.swing.JButton btnDpVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDpCliente;
    private javax.swing.JLabel lblDpCpfCliente;
    private javax.swing.JLabel lblDpDtPedido;
    private javax.swing.JLabel lblDpPedido;
    private javax.swing.JLabel lblDpValorTotal;
    private javax.swing.JLabel lblDpValorTotal1;
    private javax.swing.JLabel lblDpVendedor;
    private javax.swing.JPanel pnlDpPedido;
    private javax.swing.JTable tblDpProduto;
    private javax.swing.JTextField txtDpCliente;
    private javax.swing.JFormattedTextField txtDpCpfCliente;
    private javax.swing.JFormattedTextField txtDpDtPedido;
    private javax.swing.JFormattedTextField txtDpValorTotal;
    private javax.swing.JTextField txtDpVendedor;
    // End of variables declaration//GEN-END:variables
}
