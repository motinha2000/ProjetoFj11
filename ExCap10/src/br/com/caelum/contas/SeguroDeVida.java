package br.com.caelum.contas;

import br.com.caelum.contas.itfc.Tributavel;

public class SeguroDeVida implements Tributavel{
    
    public double calculaTributos(){
        return 42;
    }
}
