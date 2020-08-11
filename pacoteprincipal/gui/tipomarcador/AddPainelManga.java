package pacoteprincipal.gui.tipomarcador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AddPainelManga extends JPanel{

    private String strStatus;
    
    public AddPainelManga() {
        super();
        initComponents();
        this.setName("Marcador pra Manga");
        strStatus = rbLancamento.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgStatus = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbCompleto = new javax.swing.JRadioButton();
        rbLancamento = new javax.swing.JRadioButton();
        rbHiato = new javax.swing.JRadioButton();
        tNome = new javax.swing.JTextField();
        tGenero = new javax.swing.JTextField();
        tAutores = new javax.swing.JTextField();
        sCap = new javax.swing.JSpinner();
        tLink = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.setText("Nome:");
        add(jLabel2);
        jLabel2.setBounds(10, 14, 31, 14);

        jLabel3.setText("Status: ");
        add(jLabel3);
        jLabel3.setBounds(245, 14, 38, 14);

        jLabel4.setText("Autor(es):");
        add(jLabel4);
        jLabel4.setBounds(10, 76, 50, 14);

        jLabel5.setText("Último capítulo lido: ");
        add(jLabel5);
        jLabel5.setBounds(10, 107, 95, 14);

        jLabel6.setText("Link:");
        add(jLabel6);
        jLabel6.setBounds(10, 138, 22, 14);

        rbCompleto.addItemListener(new buttonHandler());
        bgStatus.add(rbCompleto);
        rbCompleto.setText("Completo");
        add(rbCompleto);
        rbCompleto.setBounds(250, 40, 71, 23);

        rbLancamento.addItemListener(new buttonHandler());
        bgStatus.add(rbLancamento);
        rbLancamento.setSelected(true);
        rbLancamento.setText("Em Lançamento");
        add(rbLancamento);
        rbLancamento.setBounds(250, 80, 101, 23);

        rbHiato.addItemListener(new buttonHandler());
        bgStatus.add(rbHiato);
        rbHiato.setText("Em Hiato");
        add(rbHiato);
        rbHiato.setBounds(250, 120, 67, 23);
        add(tNome);
        tNome.setBounds(45, 11, 182, 20);
        add(tGenero);
        tGenero.setBounds(53, 42, 174, 20);
        add(tAutores);
        tAutores.setBounds(64, 73, 163, 20);

        sCap.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(sCap);
        sCap.setBounds(167, 104, 60, 20);
        add(tLink);
        tLink.setBounds(36, 135, 191, 20);

        jLabel1.setText("Gênero:");
        add(jLabel1);
        jLabel1.setBounds(10, 45, 39, 14);
    }// </editor-fold>//GEN-END:initComponents

    public String getNome(){
        return tNome.getText();
    }
    
    public String getAutores(){
        return tAutores.getText();
    }
    
    public String getGenero(){
        return tGenero.getText();
    }
    
    public String getLink(){
        return tLink.getText();
    }

    public int getCap(){
        return (Integer)sCap.getValue();
    }
    
    public String getStatus(){
        return strStatus;
    }
    
    private class buttonHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            strStatus = ((JRadioButton)e.getSource()).getText();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
