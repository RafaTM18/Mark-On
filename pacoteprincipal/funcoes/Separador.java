package pacoteprincipal.funcoes;

public class Separador {
    public static int deNumeradorPagina (String str, int num){
        str = str.split("\\s")[1];
        str = str.split("\\/")[num-1];
        return Integer.parseInt(str);
    }
}
