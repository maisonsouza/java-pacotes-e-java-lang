package br.com.maison.especial;

import br.com.maison.modelo.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {

    }
}
