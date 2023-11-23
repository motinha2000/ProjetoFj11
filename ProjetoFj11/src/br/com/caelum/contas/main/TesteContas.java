package br.com.caelum.contas.main;

//import br.com.caelum.contas.itfc.Tributavel;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.javafx.api.main.SistemaBancario;

public class TesteContas {
	public static void main(String[] args) {
		SistemaBancario.mostraTela(true);
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(-100);
		//System.out.println(cc.getValorImposto());
		//Tributavel t = (Tributavel) cc;
		//t.getSaldo(); t é uma interface e não pode se comportar como objeto
		//System.out.println(t.calculaTributos());
		
	}
}
