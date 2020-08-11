package pacoteprincipal.gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import pacoteprincipal.classes.Manga;
import pacoteprincipal.funcoes.Redimensionador;
import pacoteprincipal.gui.modificagui.ModificaManga;

public class PainelManga extends JPanel{

    private Manga info;
    
    public PainelManga(Manga info) {
        this.info = info;
        initComponents();
        lNome.setText(info.getNome());
        lStatus.setText(info.getStatus());
        lGenero.setText(info.getGenero());
        lAutores.setText(info.getAutor());
        lCapLido.setText("Cap." + info.getCapLido());
        bLink.setText(info.getLink());
        lCapa.setIcon(Redimensionador.deImagem(info.getCapaEnd()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lCapa = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bLink = new javax.swing.JButton();
        lGenero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lAutores = new javax.swing.JLabel();
        lCapLido = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        lStatus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bModifica = new javax.swing.JButton();
        bCapLido = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lCapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/no-image-removebg-preview.png"))); // NOI18N
        add(lCapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setText("Autor(es): ");

        jLabel3.setText("Status: ");

        jLabel5.setText("Último capítulo lido: ");

        jLabel1.setText("Gênero:");

        bLink.setForeground(new java.awt.Color(102, 204, 255));
        bLink.setText("jButton1");
        bLink.setBorderPainted(false);
        bLink.setContentAreaFilled(false);
        bLink.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bLink.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bLink.setOpaque(true);
        bLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLinkActionPerformed(evt);
            }
        });

        lGenero.setText("jLabel9");

        jLabel2.setText("Nome: ");

        lAutores.setText("jLabel10");

        lCapLido.setText("jLabel11");

        lNome.setText("jLabel7");

        lStatus.setText("jLabel8");

        jLabel6.setText("Link: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAutores))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lGenero))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lCapLido))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lStatus)
                                    .addComponent(lNome))))
                        .addGap(0, 239, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lAutores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lCapLido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bLink))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 400, 134));

        bModifica.setText("Modificar Info");
        bModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificaActionPerformed(evt);
            }
        });
        add(bModifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        bCapLido.setText("Capítulo Lido");
        bCapLido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCapLidoActionPerformed(evt);
            }
        });
        add(bCapLido, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bCapLidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCapLidoActionPerformed
        info.ultCapLido();
        lCapLido.setText("Cap." + info.getCapLido());
    }//GEN-LAST:event_bCapLidoActionPerformed

    private void bModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificaActionPerformed
        new ModificaManga(info);
        lNome.setText(info.getNome());
        lStatus.setText(info.getStatus());
        lGenero.setText(info.getGenero());
        lAutores.setText(info.getAutor());
        lCapLido.setText("Cap." + info.getCapLido());
        bLink.setText(info.getLink());
        if(lCapa.getIcon() == null){
            lCapa.setIcon(new ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/no-image-removebg-preview.png")));
        }else{
            lCapa.setIcon(Redimensionador.deImagem(info.getCapaEnd()));
        }
        this.revalidate();
    }//GEN-LAST:event_bModificaActionPerformed

    private void bLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLinkActionPerformed
        try {
            Desktop.getDesktop().browse(new URL(bLink.getText()).toURI());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bLinkActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCapLido;
    private javax.swing.JButton bLink;
    private javax.swing.JButton bModifica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAutores;
    private javax.swing.JLabel lCapLido;
    private javax.swing.JLabel lCapa;
    private javax.swing.JLabel lGenero;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lStatus;
    // End of variables declaration//GEN-END:variables
}
