package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {

    private double valor;
    private String titular;
    private int apolice;

    public String getTipo() {
        return " Seguro de Vida";
    }

    public double getValorImposto() {
        return 42+(getValor()*0.02);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroApolice() {
        return apolice;
    }

    public void setNumeroApolice(int apolice) {
        this.apolice = apolice;
    }
}
