/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copervinte;

import CTR.ctrColaborador;
import DTO.dtoColaborador;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marconesio
 */
public class JFormPrinciipal1 extends javax.swing.JFrame {

    /**
     * Creates new form JFormPrinciipal
     */
    DTO.dtoColaborador dtocolaborador;
    CTR.ctrColaborador ctrcolaborador;
    public JFormPrinciipal1() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("CoperVinte Controle gerencial MAVO 2020");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jPanelColaboradorCad.setVisible(false);
        if(ctrcolaborador==null){
            ctrcolaborador = new ctrColaborador();
        }  
        if(dtocolaborador==null){
            dtocolaborador = new dtoColaborador();
        }  
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(jTFColabCadMatricula.getWidth());
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(jTFColabCadNome.getWidth());
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(jFTFColabCadCPF.getWidth());
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(jBCColabCadBarracao.getWidth());
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(jBCColabCadStatus.getWidth());  
        dtocolaborador.setTabelaColaborador((DefaultTableModel) jTable1.getModel());
        ctrcolaborador.listarColaborador(jTable1,dtocolaborador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelColaboradorCad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFColabCadMatricula = new javax.swing.JTextField();
        jTFColabCadNome = new javax.swing.JTextField();
        jFTFColabCadCPF = new javax.swing.JFormattedTextField();
        jBCColabCadBarracao = new javax.swing.JComboBox<>();
        jBCColabCadStatus = new javax.swing.JComboBox<>();
        jBColabCadGravar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBColabCadGravar1 = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuColaboradores = new javax.swing.JMenu();
        jMenuIColaboradoresCad = new javax.swing.JMenuItem();
        jMenuCompradores = new javax.swing.JMenu();
        jMenuICompradoresCad = new javax.swing.JMenuItem();
        jMenuCtrlFinanceiro = new javax.swing.JMenu();
        jMenuIFluxoCaixa = new javax.swing.JMenuItem();
        jMenuEstoque = new javax.swing.JMenu();
        jMenuIMaterialCad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("Matrícula");

        jLabel3.setText("Nome ");

        jLabel4.setText("CPF");

        jLabel5.setText("Barracão");

        jLabel6.setText("Ativo");

        try {
            jFTFColabCadCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBCColabCadBarracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambos", "Norte", "Sul" }));

        jBCColabCadStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jBColabCadGravar.setText("Gravar");
        jBColabCadGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBColabCadGravarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MATRICULA", "NOME", "CPF", "BARRACÃO", "ATIVO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBColabCadGravar1.setText("Remover");
        jBColabCadGravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBColabCadGravar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelColaboradorCadLayout = new javax.swing.GroupLayout(jPanelColaboradorCad);
        jPanelColaboradorCad.setLayout(jPanelColaboradorCadLayout);
        jPanelColaboradorCadLayout.setHorizontalGroup(
            jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanelColaboradorCadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanelColaboradorCadLayout.createSequentialGroup()
                        .addGroup(jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTFColabCadMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTFColabCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jFTFColabCadCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jBCColabCadBarracao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelColaboradorCadLayout.createSequentialGroup()
                                .addComponent(jBCColabCadStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jBColabCadGravar))
                            .addComponent(jLabel6)))
                    .addGroup(jPanelColaboradorCadLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBColabCadGravar1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelColaboradorCadLayout.setVerticalGroup(
            jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColaboradorCadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFColabCadMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFColabCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFColabCadCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCColabCadBarracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCColabCadStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBColabCadGravar))
                .addGap(18, 18, 18)
                .addGroup(jPanelColaboradorCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(jPanelColaboradorCadLayout.createSequentialGroup()
                        .addComponent(jBColabCadGravar1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanelColaboradorCad);

        jMenuColaboradores.setText("Colaboradores ");

        jMenuIColaboradoresCad.setText("Cadastrar ");
        jMenuIColaboradoresCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIColaboradoresCadActionPerformed(evt);
            }
        });
        jMenuColaboradores.add(jMenuIColaboradoresCad);

        jMenuBar.add(jMenuColaboradores);

        jMenuCompradores.setText("Compradores ");

        jMenuICompradoresCad.setText("Cadastrar ");
        jMenuICompradoresCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuICompradoresCadActionPerformed(evt);
            }
        });
        jMenuCompradores.add(jMenuICompradoresCad);

        jMenuBar.add(jMenuCompradores);

        jMenuCtrlFinanceiro.setText("Controle Financeiro ");

        jMenuIFluxoCaixa.setText("Fluxo Caixa");
        jMenuIFluxoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIFluxoCaixaActionPerformed(evt);
            }
        });
        jMenuCtrlFinanceiro.add(jMenuIFluxoCaixa);

        jMenuBar.add(jMenuCtrlFinanceiro);

        jMenuEstoque.setText("Estoque");

        jMenuIMaterialCad.setText("Cadastrar Material ");
        jMenuIMaterialCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIMaterialCadActionPerformed(evt);
            }
        });
        jMenuEstoque.add(jMenuIMaterialCad);

        jMenuBar.add(jMenuEstoque);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(768, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
 Object[] options = {"Sair","Voltar"};
       this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
       int opcao = JOptionPane.showOptionDialog(null, "Deseja Sair?", "Fechar", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);        
       if(opcao==0){
       this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);        // TODO add your handling code here:
       }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuIColaboradoresCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIColaboradoresCadActionPerformed
        jPanelColaboradorCad.setVisible(true);
        jLabel1.setText(jMenuColaboradores.getText()+" / "+jMenuIColaboradoresCad.getText());
    }//GEN-LAST:event_jMenuIColaboradoresCadActionPerformed

    private void jMenuIMaterialCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIMaterialCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuIMaterialCadActionPerformed

    private void jMenuICompradoresCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuICompradoresCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuICompradoresCadActionPerformed

    private void jMenuIFluxoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIFluxoCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuIFluxoCaixaActionPerformed

    private void jBColabCadGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBColabCadGravarActionPerformed
        if(dtocolaborador==null){
            dtocolaborador = new dtoColaborador();
        }
        if(ctrcolaborador==null){
            ctrcolaborador = new ctrColaborador();
        }
        dtocolaborador.setMatricula(jTFColabCadMatricula.getText());
        dtocolaborador.setNome(jTFColabCadNome.getText());
        dtocolaborador.setCPF(jFTFColabCadCPF.getText());
        dtocolaborador.setBarracao(jBCColabCadBarracao.getSelectedItem().toString());
        dtocolaborador.setStatus(jBCColabCadStatus.getSelectedItem().toString());
        dtocolaborador.setTabelaColaborador((DefaultTableModel) jTable1.getModel());

        if("Gravar".equals(jBColabCadGravar.getText())){
            if(ctrcolaborador.inserirColaborador(dtocolaborador)){
                JOptionPane.showMessageDialog(null, "Colaborador Cadastrado com Sucesso", "Colaborador", JOptionPane.INFORMATION_MESSAGE);
                ctrcolaborador.listarColaborador(jTable1,dtocolaborador);

            }else{
                JOptionPane.showMessageDialog(null, "Falha ao Cadastrar Colaborador", "Colaborador", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            dtocolaborador.setID(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            jBColabCadGravar.setText("Gravar");
            if(ctrcolaborador.atualizarColaborador(dtocolaborador)){
                JOptionPane.showMessageDialog(null, "Colaborador Atualizado com Sucesso", "Colaborador", JOptionPane.INFORMATION_MESSAGE);
                ctrcolaborador.listarColaborador(jTable1,dtocolaborador);

            }else{
                jBColabCadGravar.setText("Atualizar");
                JOptionPane.showMessageDialog(null, "Falha ao Atualizar Colaborador", "Colaborador", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBColabCadGravarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jBColabCadGravar.setText("Atualizar");
        jTFColabCadMatricula.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTFColabCadNome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jFTFColabCadCPF.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jBCColabCadBarracao.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        jBCColabCadStatus.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jBColabCadGravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBColabCadGravar1ActionPerformed
        jBColabCadGravar.setText("Gravar");
        if(jTable1.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Nenhum item selecionado","Excluir",JOptionPane.WARNING_MESSAGE);
        }else{
            if(dtocolaborador==null){
                dtocolaborador = new dtoColaborador();
            }
            if(ctrcolaborador==null){
                ctrcolaborador = new ctrColaborador();
            }
            dtocolaborador.setID(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            if(ctrcolaborador.excluirColaborador(dtocolaborador)){
                JOptionPane.showMessageDialog(null, "Colaborador Excluído com Sucesso", "Colaborador", JOptionPane.INFORMATION_MESSAGE);
                ctrcolaborador.listarColaborador(jTable1,dtocolaborador);

            }else{
                JOptionPane.showMessageDialog(null, "Falha ao Excluir Colaborador", "Colaborador", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jBColabCadGravar1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFormPrinciipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFormPrinciipal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBCColabCadBarracao;
    private javax.swing.JComboBox<String> jBCColabCadStatus;
    private javax.swing.JButton jBColabCadGravar;
    private javax.swing.JButton jBColabCadGravar1;
    private javax.swing.JFormattedTextField jFTFColabCadCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuColaboradores;
    private javax.swing.JMenu jMenuCompradores;
    private javax.swing.JMenu jMenuCtrlFinanceiro;
    private javax.swing.JMenu jMenuEstoque;
    private javax.swing.JMenuItem jMenuIColaboradoresCad;
    private javax.swing.JMenuItem jMenuICompradoresCad;
    private javax.swing.JMenuItem jMenuIFluxoCaixa;
    private javax.swing.JMenuItem jMenuIMaterialCad;
    private javax.swing.JPanel jPanelColaboradorCad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFColabCadMatricula;
    private javax.swing.JTextField jTFColabCadNome;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
