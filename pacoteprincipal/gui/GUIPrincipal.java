package pacoteprincipal.gui;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pacoteprincipal.classes.Marcador;
import pacoteprincipal.funcoes.Arredonda;
import pacoteprincipal.funcoes.MarcadorFunc;
import pacoteprincipal.funcoes.Separador;
import pacoteprincipal.funcoes.io.Load;
import pacoteprincipal.funcoes.io.Save;

public class GUIPrincipal extends javax.swing.JFrame {

    private List<Marcador> listMarcador;
    private static boolean add;
    
    public GUIPrincipal() {
        initComponents();
        listMarcador = Load.listPainel();
        for(int i = 0; i < listMarcador.size(); i++){
            adicionaPainel(listMarcador.get(i), i);
        }
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bNext = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pCardPaineis = new javax.swing.JPanel();
        pVisivel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bAdd = new javax.swing.JButton();
        bProcurar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        lNumPag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MarkOn by Rafael Tamura");
        setResizable(false);

        bNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/Next-2-2-icon.png"))); // NOI18N
        bNext.setBorderPainted(false);
        bNext.setContentAreaFilled(false);
        bNext.setEnabled(false);
        bNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNextActionPerformed(evt);
            }
        });

        bBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/Back-icon.png"))); // NOI18N
        bBack.setBorderPainted(false);
        bBack.setContentAreaFilled(false);
        bBack.setEnabled(false);
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Marcadores"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pCardPaineis.setLayout(new java.awt.CardLayout());
        pCardPaineis.add(pVisivel, "card2");

        jPanel1.add(pCardPaineis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 670, 440));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        bAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/add-icon.png"))); // NOI18N
        bAdd.setText("Adicionar Marcador");
        bAdd.setBorderPainted(false);
        bAdd.setContentAreaFilled(false);
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });
        jPanel2.add(bAdd);

        bProcurar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/search-icon.png"))); // NOI18N
        bProcurar.setText("Procurar Marcador");
        bProcurar.setBorderPainted(false);
        bProcurar.setContentAreaFilled(false);
        bProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProcurarActionPerformed(evt);
            }
        });
        jPanel2.add(bProcurar);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/garbage.png"))); // NOI18N
        jButton1.setText("Excluir Marcador");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jPanel2.add(jButton1);

        bSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/delete-icon.png"))); // NOI18N
        bSair.setText("Salvar e Sair");
        bSair.setBorderPainted(false);
        bSair.setContentAreaFilled(false);
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });
        jPanel2.add(bSair);

        lNumPag.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lNumPag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNumPag.setText("Página 1/1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNumPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bNext)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNumPag, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void adicionaPainel(Marcador marc, int num){
        JPanel painel = MarcadorFunc.toJPanel(marc);
        if(num % 3 != 0 || num == 0){
            pVisivel.add(painel);
            pVisivel.revalidate();
        }else{
            pVisivel = new JPanel();
            pVisivel.add(painel);
            pCardPaineis.add(pVisivel);
            bBack.setEnabled(true);
        }
        CardLayout cLayout = (CardLayout)pCardPaineis.getLayout();
        cLayout.last(pCardPaineis);
        lNumPag.setText(lNumPag.getText().replaceAll("\\d+\\/\\d+", Arredonda.praCima(listMarcador.size()) + "/" + Arredonda.praCima(listMarcador.size())));
    }
    
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        GUIPrincipal.setAdd(false);
        new AddMarcador(listMarcador);
        if(GUIPrincipal.isAdd()){
            adicionaPainel(listMarcador.get(listMarcador.size()-1), listMarcador.size()-1);
        }else{
            JOptionPane.showMessageDialog(null, "A operação não foi finalizada corretamente.\nNão foi inserido um marcador novo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void bProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProcurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bProcurarActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        Save.listPaineis(listMarcador);
        JOptionPane.showMessageDialog(null, "Finalizando o programa...");
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        int pagAtual = Separador.deNumeradorPagina(lNumPag.getText(), 1);
        CardLayout cLayout = (CardLayout)pCardPaineis.getLayout();
            cLayout.previous(pCardPaineis);
            pagAtual--;
            lNumPag.setText(lNumPag.getText().replaceFirst("\\d+", String.valueOf(pagAtual)));
            if(!bNext.isEnabled())
                bNext.setEnabled(true);
        if(pagAtual <= 1)
            bBack.setEnabled(false);
    }//GEN-LAST:event_bBackActionPerformed

    private void bNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNextActionPerformed
        int pagAtual = Separador.deNumeradorPagina(lNumPag.getText(), 1);
        int pagTotal = Separador.deNumeradorPagina(lNumPag.getText(), 2);
        CardLayout cLayout = (CardLayout)pCardPaineis.getLayout();
            cLayout.next(pCardPaineis);
            pagAtual++;
            lNumPag.setText(lNumPag.getText().replaceFirst("\\d+", String.valueOf(pagAtual)));
            if(!bBack.isEnabled())
                bBack.setEnabled(true);
        if(pagAtual >= pagTotal){
            bNext.setEnabled(false);
        }
    }//GEN-LAST:event_bNextActionPerformed

    public static boolean isAdd() {
        return add;
    }
    
    public static void setAdd(boolean add) {
        GUIPrincipal.add = add;
    } 
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bBack;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bProcurar;
    private javax.swing.JButton bSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lNumPag;
    private javax.swing.JPanel pCardPaineis;
    private javax.swing.JPanel pVisivel;
    // End of variables declaration//GEN-END:variables
}
