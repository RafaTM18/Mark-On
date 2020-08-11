package pacoteprincipal.funcoes.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacoteprincipal.classes.Marcador;

/**
 *
 * @author Rafael
 */
public class Load {
    
    public static List<Marcador> listPainel(){
        File arq = new File("./dados/marcadores.dat");
        ArrayList<Marcador> listPainel = new ArrayList<>();
        if(!arq.exists()){
            return listPainel;
        }
        ObjectInputStream in = null;
        
        try {
            in = new ObjectInputStream(new FileInputStream(arq));
            while(true){
                Marcador marcad = (Marcador)in.readObject();
                listPainel.add(marcad);
            }
            
        } catch (EOFException ex){
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Load.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(Load.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listPainel;
    }
    
}
