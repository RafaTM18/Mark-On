package pacoteprincipal.funcoes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import pacoteprincipal.exceptions.TextFieldNaoPreenchidoException;

public class ValidaComponentes {
    
    public static void validaTextField(JPanel panel) throws TextFieldNaoPreenchidoException{
        Border bErro = BorderFactory.createLineBorder(Color.RED);
        Border bPadrao = new JTextField().getBorder();
        for(Component comp : panel.getComponents()){
            if(comp instanceof  JTextField){
                ((JTextField) comp).setBorder(bPadrao);
                if(((JTextField) comp).getText().equals("")){
                    ((JTextField) comp).setBorder(bErro);
                    throw new TextFieldNaoPreenchidoException();
                }
            }
        }
    }
    
}
