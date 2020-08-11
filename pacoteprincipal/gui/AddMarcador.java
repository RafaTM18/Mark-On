package pacoteprincipal.gui;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import pacoteprincipal.classes.Manga;
import pacoteprincipal.classes.Marcador;
import pacoteprincipal.exceptions.TextFieldNaoPreenchidoException;
import pacoteprincipal.funcoes.Redimensionador;
import pacoteprincipal.funcoes.ValidaComponentes;
import pacoteprincipal.gui.tipomarcador.AddPainelPersonalizado;
import pacoteprincipal.gui.tipomarcador.AddPainelApp;
import pacoteprincipal.gui.tipomarcador.AddPainelManga;

public class AddMarcador extends javax.swing.JDialog {
    
    private AddPainelManga pManga;
    private AddPainelPersonalizado pPerson;
    private AddPainelApp pApp;
    private String cardAtual;
    private File imgEscholida;
    private List<Marcador> listMarcador;
    
    
    public AddMarcador(List<Marcador> listMarcador) {
        pManga = new AddPainelManga();
        pPerson = new AddPainelPersonalizado();
        pApp = new AddPainelApp();
        imgEscholida = new File("./src/pacoteprincipal/gui/icons/no-image-removebg-preview.png");
        initComponents();
        cardAtual = rbManga.getText();
        this.listMarcador = listMarcador;
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setVisible(true);
    }

    private class buttonHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            cardAtual = ((JRadioButton)e.getItem()).getText();
            CardLayout pCard = (CardLayout)pAddMarcador.getLayout();
            pCard.show(pAddMarcador, cardAtual);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoMarcador = new javax.swing.ButtonGroup();
        pAddMarcador = new javax.swing.JPanel();
        pSelecionaMarcador = new javax.swing.JPanel();
        rbManga = new javax.swing.JRadioButton();
        rbApp = new javax.swing.JRadioButton();
        rbAnime = new javax.swing.JRadioButton();
        bAddMarcador = new javax.swing.JButton();
        bAddImagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Marcador");

        pAddMarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Info pro Marcador"));
        pAddMarcador.setLayout(new java.awt.CardLayout());
        pAddMarcador.add(pManga, pManga.getName());
        pAddMarcador.add(pApp, pApp.getName());
        pAddMarcador.add(pPerson, pPerson.getName());

        pSelecionaMarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Marcador"));

        rbManga.addItemListener(new buttonHandler());
        bgTipoMarcador.add(rbManga);
        rbManga.setSelected(true);
        rbManga.setText("Marcador pra Manga");
        pSelecionaMarcador.add(rbManga);

        rbApp.addItemListener(new buttonHandler());
        bgTipoMarcador.add(rbApp);
        rbApp.setText("Marcador pra App");
        pSelecionaMarcador.add(rbApp);

        rbAnime.addItemListener(new buttonHandler());
        bgTipoMarcador.add(rbAnime);
        rbAnime.setText("Marcador Personalizado");
        pSelecionaMarcador.add(rbAnime);

        bAddMarcador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/Bookmark-icon.png"))); // NOI18N
        bAddMarcador.setText("Adicionar Marcador");
        bAddMarcador.setMaximumSize(new java.awt.Dimension(180, 41));
        bAddMarcador.setMinimumSize(new java.awt.Dimension(180, 41));
        bAddMarcador.setPreferredSize(new java.awt.Dimension(180, 41));
        bAddMarcador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddMarcadorActionPerformed(evt);
            }
        });

        bAddImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/Add-File-icon.png"))); // NOI18N
        bAddImagem.setText("Adicionar Imagem");
        bAddImagem.setMaximumSize(new java.awt.Dimension(180, 41));
        bAddImagem.setMinimumSize(new java.awt.Dimension(180, 41));
        bAddImagem.setPreferredSize(new java.awt.Dimension(180, 41));
        bAddImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pSelecionaMarcador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pAddMarcador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAddImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAddMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pSelecionaMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pAddMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAddImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddImagemActionPerformed
        File path = new File(FileSystemView.getFileSystemView().getDefaultDirectory().getPath());
        JFileChooser loadImg = new JFileChooser(path.getParent() + "\\Pictures");
        loadImg.setFileSelectionMode(loadImg.FILES_ONLY);
        loadImg.setDialogTitle("Selecione a imagem");
        loadImg.setFileFilter(new FileNameExtensionFilter("Portable Network Graphics/Joint Photographics Experts Group (*.png) (*.jpg)", "png", "jpg", "jpeg"));
        
        int op = loadImg.showOpenDialog(null);
        imgEscholida = loadImg.getSelectedFile();
        
        if(op == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "Não foi selecionada um arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }else if(imgEscholida == null || imgEscholida.getName().equals("")){
            JOptionPane.showMessageDialog(null, "A imagem selecionada é um arquivo inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            bAddImagem.setIcon(new ImageIcon(getClass().getResource("/pacoteprincipal/gui/icons/Very-Basic-Checkmark-icon.png")));
            bAddImagem.setText("Imagem selecionada");
            bAddImagem.setHorizontalTextPosition(SwingConstants.LEFT);
            bAddImagem.setEnabled(false);
        }
    }//GEN-LAST:event_bAddImagemActionPerformed

    private void bAddMarcadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddMarcadorActionPerformed
        for(Component comp : pAddMarcador.getComponents()){
            if(comp.isVisible()){
                try {
                    ValidaComponentes.validaTextField((JPanel)comp);
                    if(comp instanceof AddPainelManga){
                        String nome = ((AddPainelManga) comp).getNome();
                        String autor = ((AddPainelManga) comp).getAutores();
                        String genero = ((AddPainelManga) comp).getGenero();
                        int capLido = ((AddPainelManga) comp).getCap();
                        String link = ((AddPainelManga) comp).getLink();
                        String status = ((AddPainelManga) comp).getStatus();
                        Manga objManga = new Manga(nome, status, genero, autor, link, capLido, imgEscholida);
                        listMarcador.add(objManga);
                        JOptionPane.showMessageDialog(null, "Painel inserido com sucesso!", "Inserção Completa", JOptionPane.INFORMATION_MESSAGE);
                        GUIPrincipal.setAdd(true);
                        this.dispose();
                    }
                } catch (TextFieldNaoPreenchidoException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_bAddMarcadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddImagem;
    private javax.swing.JButton bAddMarcador;
    private javax.swing.ButtonGroup bgTipoMarcador;
    private javax.swing.JPanel pAddMarcador;
    private javax.swing.JPanel pSelecionaMarcador;
    private javax.swing.JRadioButton rbAnime;
    private javax.swing.JRadioButton rbApp;
    private javax.swing.JRadioButton rbManga;
    // End of variables declaration//GEN-END:variables
}
