package pacoteprincipal.funcoes.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacoteprincipal.classes.Marcador;


/**
 *
 * @author Rafael
 */
public class Save {
    
    public static void listPaineis(List<Marcador> listPainel){
        ObjectOutputStream out = null;
        File dir = new File("./dados");
        if(!dir.exists()){
            dir.mkdir();
        }
        
        try{
            out = new ObjectOutputStream(new FileOutputStream(dir + "/marcadores.dat"));
            
            for(int i = 0; i < listPainel.size(); i++){
                out.writeObject(listPainel.get(i));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
