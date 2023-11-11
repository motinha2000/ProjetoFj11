package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {

    private double total;

    public double getTotal() {
        return total;
    }

    public void calculaImpostos(Evento evento) {

       

        int i = 0;
        i = evento.getTamanhoDaLista("listaTributaveis");

      

        for (int x = 0; x < i; x++) {
            Tributavel t = evento.getTributavel("listaTributaveis", x);
            total += t.getValorImposto();
        }

       

    }
}
