package br.com.caelum.contas.modelo;

public abstract class Conta {
	protected String titular;
	protected int numero;
	protected String agencia;
	protected double saldo;
	protected String dataDeAbertura;

	// public abstract String getTipo();

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public String getTipo() {
		return "Conta";
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException();
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public String getDataDeAbertura() {
		return this.dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

}
