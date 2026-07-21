package pratica5;

public class revista extends publicacao {
    //construtor
    public revista(String titulo, String autor, int ano_publicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
    }

    @Override
    public String obterTipo() {
        return "Revista";
    }
}
