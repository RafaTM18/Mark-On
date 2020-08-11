package pacoteprincipal.gui.modificagui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import pacoteprincipal.classes.Manga;
import pacoteprincipal.funcoes.Redimensionador;

public class ModificaManga extends javax.swing.JDialog {
    
    private Manga info;
    private String strStatus;
    private boolean infoModificada = false;
    
    public ModificaManga(Manga info) {
        initComponents();
        this.info = info;
        tNome.setText(info.getNome());
        tAutores.setText(info.getAutor());
        tGenero.setText(info.getGenero());
        tLink.setText(info.getLink());
        sCap.setValue(info.getCapLido());
        lCapa.setIcon(Redimensionador.deImagem(info.getCapaEnd()));
        strStatus = info.getStatus();
        if(strStatus.equals(rbCompleto.getText()))
            rbCompleto.setSelected(true);
        if(strStatus.equals(rbLancamento.getText()))
            rbLancamento.setSelected(true);
        if(strStatus.equals(rbHiato.getText()))
            rbHiato.setSelected(true);
        if(lCapa == null)
            bRemoveCapa.setEnabled(false);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tGenero = new javax.swing.JTextField();
        rbCompleto = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        tAutores = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rbLancamento = new javax.swing.JRadioButton();
        rbHiato = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tLink = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sCap = new javax.swing.JSpinner();
        lCapa = new javax.swing.JLabel();
        bAtualizar = new javax.swing.JButton();
        bRemoveCapa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Info"));

        tGenero.addKeyListener(new keyHandler());

        rbCompleto.addItemListener(new buttonHandler());
        bgStatus.add(rbCompleto);
        rbCompleto.setText("Completo");

        jLabel6.setText("Link:");

        tAutores.addKeyListener(new keyHandler());

        jLabel5.setText("Último capítulo lido: ");

        jLabel1.setText("Gênero:");

        rbLancamento.addItemListener(new buttonHandler());
        bgStatus.add(rbLancamento);
        rbLancamento.setSelected(true);
        rbLancamento.setText("Em Lançamento");

        rbHiato.addItemListener(new buttonHandler());
        bgStatus.add(rbHiato);
        rbHiato.setText("Em Hiato");

        jLabel2.setText("Nome:");

        tNome.addKeyListener(new keyHandler());

        jLabel3.setText("Status: ");

        tLink.addKeyListener(new keyHandler());
        tLink.setForeground(new java.awt.Color(102, 204, 255));

        jLabel4.setText("Autor(es):");

        sCap.addChangeListener(new spinnerHandler());
        sCap.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lCapa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lCapa, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(tGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(rbCompleto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(tAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(rbLancamento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(62, 62, 62)
                                .addComponent(sCap, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(4, 4, 4)
                                .addComponent(tLink, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addComponent(rbHiato)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(tGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbCompleto))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(tAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(rbLancamento)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel5))
                                    .addComponent(sCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel6))
                                    .addComponent(tLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(rbHiato))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lCapa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/update.png"))); // NOI18N
        bAtualizar.setText("Atualizar Marcador");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        bRemoveCapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/remove-camera-icon.png"))); // NOI18N
        bRemoveCapa.setText("Remover Capa");
        bRemoveCapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoveCapaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bRemoveCapa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRemoveCapa)
                    .addComponent(bAtualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRemoveCapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoveCapaActionPerformed
        try {
            if(!info.getCapaEnd().getCanonicalPath().contains("no-image-removebg-preview.png")){
                lCapa.setIcon(new ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/no-image-removebg-preview.png")));
                info.setCapaEnd(new File("./src/pacoteprincipal/gui/icons/no-image-removebg-preview.png"));
                bRemoveCapa.setEnabled(false);
                this.revalidate();
            }else{
                JOptionPane.showMessageDialog(null, "Esse marcador já não tem nenhuma imagem!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro Inesperado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bRemoveCapaActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        if(tNome.getText().equals(info.getNome()) &&
        tGenero.getText().equals(info.getGenero()) &&
        tAutores.getText().equals(info.getAutor()) &&     
        tLink.getText().equals(info.getLink()) &&    
        strStatus.equals(info.getStatus()) &&    
        ((Integer)sCap.getValue() == info.getCapLido())){
            infoModificada = false;            
        }
        
        try {
            if(infoModificada || info.getCapaEnd().getCanonicalPath().contains("no-image-removebg-preview.png")){
                info.setNome(tNome.getText());
                info.setGenero(tGenero.getText());
                info.setAutor(tAutores.getText());
                info.setLink(tLink.getText());
                info.setStatus(strStatus);
                info.setCapLido((Integer)sCap.getValue());
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum item foi modificado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro Inesperado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bAtualizarActionPerformed

    private class keyHandler extends KeyAdapter{
        
        @Override
        public void keyTyped(KeyEvent e){
            infoModificada = true;
        }
    }
    
    private class buttonHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            strStatus = ((JRadioButton)e.getSource()).getText();
            infoModificada = true;
        }  
    }
    
    private class spinnerHandler implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            infoModificada = true;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bRemoveCapa;
    private javax.swing.ButtonGroup bgStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lCapa;
    private javax.swing.JRadioButton rbCompleto;
    private javax.swing.JRadioButton rbHiato;
    private javax.swing.JRadioButton rbLancamento;
    private javax.swing.JSpinner sCap;
    private javax.swing.JTextField tAutores;
    private javax.swing.JTextField tGenero;
    private javax.swing.JTextField tLink;
    private javax.swing.JTextField tNome;
    // End of variables declaration//GEN-END:variables
}
