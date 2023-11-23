package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	public String getTipo() {
		return super.getTipo() + " Poupança";
	}

	@Override
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo!");
		} else {
			this.saldo += valor;
		}
	}
}
