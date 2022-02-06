package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    protected String titulo;
    protected String descricao;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXP();

    @Override
    public String toString() {
        return "\n=== Informações do Conteúdo ===" +
                "\n" +
                "Título: " +
                this.getTitulo() +
                "\n" +
                "Descrição: " +
                this.getDescricao() +
                "\n";
    }
}
