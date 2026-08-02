package praticas.pratica5;

public abstract class publicacao {
    protected String titulo;
    protected String autor;
    protected int ano_publicacao;

    // getters e setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setAnoPublicacao(int ano_publicacao){
        this.ano_publicacao = ano_publicacao;
    }
    public int getAnoPublicacao(){
        return ano_publicacao;
    }

    // métodos
    public abstract String obterTipo();
}
