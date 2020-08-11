package pacoteprincipal.classes;

import java.io.File;

public class Manga implements Marcador{
    
    private String nome;
    private String status;
    private String genero;
    private String autor;
    private String link;
    private int capLido;
    private File capaEnd;

    public Manga(String nome, String status, String genero, String autor, String link, int capLido, File capaEnd) {
        this.nome = nome;
        this.status = status;
        this.genero = genero;
        this.autor = autor;
        this.link = link;
        this.capLido = capLido;
        this.capaEnd = capaEnd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getCapLido() {
        return capLido;
    }

    public void setCapLido(int capLido) {
        this.capLido = capLido;
    }
    
    public void ultCapLido(){
        this.capLido++;
    }    

    public File getCapaEnd() {
        return capaEnd;
    }

    public void setCapaEnd(File capaEnd) {
        this.capaEnd = capaEnd;
    }
}
