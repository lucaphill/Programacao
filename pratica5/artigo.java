package pratica5;

public class artigo extends publicacao {
    // construtor
    public artigo(String titulo, String autor, int ano_publicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
    }

    @Override
    public String obterTipo() {
        return "Artigo";
    }
}
