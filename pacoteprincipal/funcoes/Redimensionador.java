package pacoteprincipal.funcoes;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Redimensionador {
    
    public static Icon deImagem(File endImagem){
        BufferedImage buffImg = null;
        Icon img;
        try {
            buffImg = ImageIO.read(endImagem);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro Inesperado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        img = new ImageIcon(buffImg.getScaledInstance(96, 117, Image.SCALE_SMOOTH));
        return img;
    }
    
}
