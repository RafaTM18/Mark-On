package pacoteprincipal.exceptions;

public class TextFieldNaoPreenchidoException extends Exception{

    public TextFieldNaoPreenchidoException() {
        super("Por favor, preencha os campos obrigatórios!");
    }   
}
