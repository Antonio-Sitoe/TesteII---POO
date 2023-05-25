/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testeii.View;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import testeii.Controller.ContagemDeVotos;
import testeii.Model.Municipio;

/**
 *
 * @author antoniositoe
 */
public class Estatistica extends javax.swing.JFrame {
    
    ContagemDeVotos Contagem = new ContagemDeVotos();

    /**
     * Creates new form Estatistica
     */
    public Estatistica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        numerodad = new javax.swing.JLabel();
        VotosNao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        VotosNao1 = new javax.swing.JButton();
        numeroBranco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("O número de candidatos que não votaram");

        jButton1.setText("Ver ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        numerodad.setFont(new java.awt.Font("Fira Sans", 2, 18)); // NOI18N
        numerodad.setText("0");

        VotosNao.setText("Ver ");
        VotosNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VotosNaoActionPerformed(evt);
            }
        });

        jLabel3.setText("O número de municípios que recebeu mais votos do que devia");

        VotosNao1.setText("Total de votos branco");
        VotosNao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VotosNao1ActionPerformed(evt);
            }
        });

        numeroBranco.setFont(new java.awt.Font("Fira Sans", 2, 18)); // NOI18N
        numeroBranco.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VotosNao1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numeroBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VotosNao, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numerodad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VotosNao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numerodad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VotosNao1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroBranco))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VotosNao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VotosNao1ActionPerformed
        // TODO add your handling code here:
        numeroBranco.setText(Double.toString(Contagem.totaldevotosbranco()));
    }//GEN-LAST:event_VotosNao1ActionPerformed
    
    private void VotosNaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_VotosNaoActionPerformed
        // TODO add your handling code here:
        Municipio cidadeMaputo = new Municipio();
        Municipio matola = new Municipio();
        Municipio Marracuene = new Municipio();
        Municipio Manhiça = new Municipio();
        Municipio boane = new Municipio();
        int conta = 0;
        
        cidadeMaputo.setNome("Cidade de Maputo");
        cidadeMaputo.setQuantidadeDeRecenciado(60);
        
        matola.setNome("Matola");
        matola.setQuantidadeDeRecenciado(70);
        
        Marracuene.setNome("Marracuene");
        Marracuene.setQuantidadeDeRecenciado(20);
        
        Manhiça.setNome("Manhiça");
        Manhiça.setQuantidadeDeRecenciado(25);
        
        boane.setNome("Boane");
        boane.setQuantidadeDeRecenciado(60);
        
        var totalvotoscidaddemaputo = cidadeMaputo.getQuantidadeDeRecenciado()
                - Contagem.totaldevotosSegundoUmMunicipio(cidadeMaputo.getNome());
        
        var totalmatola = matola.getQuantidadeDeRecenciado()
                - Contagem.totaldevotosSegundoUmMunicipio(matola.getNome());
        
        var totalvotosmaracuene = Marracuene.getQuantidadeDeRecenciado()
                - Contagem.totaldevotosSegundoUmMunicipio(Marracuene.getNome());
        
        var totalVotosManhica = Manhiça.getQuantidadeDeRecenciado()
                - Contagem.totaldevotosSegundoUmMunicipio(Manhiça.getNome());
        
        var totalvotosboane = boane.getQuantidadeDeRecenciado()
                - Contagem.totaldevotosSegundoUmMunicipio(boane.getNome());
        
        if (totalvotoscidaddemaputo < 0) {
            conta = conta + 1;
        }
        if (totalmatola < 0) {
            conta = conta + 1;
        }
        if (totalvotosmaracuene < 0) {
            conta = conta + 1;
        }
        if (totalVotosManhica < 0) {
            conta = conta + 1;
        }
        if (totalvotosboane < 0) {
            conta = conta + 1;
        }
        
        numerodad.setText(Integer.toString(conta));
        //
    }// GEN-LAST:event_VotosNaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        Municipio cidadeMaputo = new Municipio();
        Municipio matola = new Municipio();
        Municipio Marracuene = new Municipio();
        Municipio Manhiça = new Municipio();
        Municipio boane = new Municipio();
        
        cidadeMaputo.setNome("Cidade de Maputo");
        cidadeMaputo.setQuantidadeDeRecenciado(60);
        
        matola.setNome("Matola");
        matola.setQuantidadeDeRecenciado(70);
        
        Marracuene.setNome("Marracuene");
        Marracuene.setQuantidadeDeRecenciado(20);
        
        Manhiça.setNome("Manhiça");
        Manhiça.setQuantidadeDeRecenciado(25);
        
        boane.setNome("Boane");
        boane.setQuantidadeDeRecenciado(60);
        
        var totalvotoscidaddemaputo = cidadeMaputo.getQuantidadeDeRecenciado()
                - Contagem.totaldevotosSegundoUmMunicipio(cidadeMaputo.getNome());
        
        var totalmatola = matola.getQuantidadeDeRecenciado()
                - Contagem.totaldevotosSegundoUmMunicipio(matola.getNome());
        
        var totalvotosmaracuene = Marracuene.getQuantidadeDeRecenciado()
                - Contagem.totaldevotosSegundoUmMunicipio(Marracuene.getNome());
        
        var totalVotosManhica = Manhiça.getQuantidadeDeRecenciado()
                - Contagem.totaldevotosSegundoUmMunicipio(Manhiça.getNome());
        
        var totalvotosboane = boane.getQuantidadeDeRecenciado()
                - Contagem.totaldevotosSegundoUmMunicipio(boane.getNome());
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cidade de Maputo");
        model.addColumn("Matola");
        model.addColumn("Marracuene");
        model.addColumn("Manhiça");
        model.addColumn("Boane");
        model.setRowCount(0);
        
        model.addRow(new Object[]{totalvotoscidaddemaputo, totalmatola, totalvotosmaracuene, totalVotosManhica,
            totalvotosboane});
        
        JTable table = new JTable(model);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(new JScrollPane(table));
        frame.pack();
        frame.setVisible(true);
        
    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estatistica.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estatistica.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estatistica.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estatistica.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estatistica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VotosNao;
    private javax.swing.JButton VotosNao1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel numeroBranco;
    private javax.swing.JLabel numerodad;
    // End of variables declaration//GEN-END:variables
}
