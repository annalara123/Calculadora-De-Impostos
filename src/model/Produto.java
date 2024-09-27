package model;

public class Produto {
    private String nome;
    private double valor;
    private boolean industrial;

    public Produto(String nome, double valor, boolean industrial) {
        this.nome = nome;
        this.valor = valor;
        this.industrial = industrial;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean isIndustrial() {
        return industrial;
    }
}
