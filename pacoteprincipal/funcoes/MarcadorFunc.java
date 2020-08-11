package pacoteprincipal.funcoes;

import javax.swing.JPanel;
import pacoteprincipal.classes.App;
import pacoteprincipal.classes.Manga;
import pacoteprincipal.classes.Marcador;
import pacoteprincipal.gui.PainelManga;

/**
 *
 * @author Rafael
 */
public class MarcadorFunc {
    
    public static JPanel toJPanel(Marcador marc){
        JPanel painel = new JPanel();
        
        if(marc instanceof Manga){
            painel = new PainelManga((Manga) marc);
        }
        if(marc instanceof App){
            //painel = new PainelApp((App) marc);
        }
        if(marc instanceof Manga){
            //painel = new PainelPerso((Manga) marc);
        }
        return painel;
    }
    
}
