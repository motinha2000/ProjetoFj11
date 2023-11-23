package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo() {
		return super.getTipo() + " Corrente";
	}

	public double getValorImposto() {

		return this.getSaldo() * 0.01;
	}

	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo!");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		} else {
			this.saldo -= (valor);
		}

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
