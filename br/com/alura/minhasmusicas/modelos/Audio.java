package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeRerpoducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        //teste
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeRerpoducoes() {
        return totalDeRerpoducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.curtidas++;
    }

    public void reproduz() {
        this.totalDeRerpoducoes++;
    }
}


