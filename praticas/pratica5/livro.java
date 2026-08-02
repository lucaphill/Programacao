package praticas.pratica5;

public class livro extends publicacao {
    //construtor
    public livro(String titulo, String autor, int ano_publicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
    }

    @Override
    public String obterTipo() {
        return "Livro";
    }
    
}
