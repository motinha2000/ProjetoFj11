package br.com.caelum.contas.modelo;

import br.com.caelum.contas.itfc.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo() {
		return super.getTipo() + " Corrente";
	}

	public double calculaTributos(){
		
		return this.getSaldo() * 0.01;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= (valor);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += (valor);
	}
}
