package br.com.maison.teste;

import br.com.maison.modelo.Conta;
import br.com.maison.modelo.ContaCorrente;
import br.com.maison.modelo.ContaPoupanca;
import br.com.maison.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

					
		Conta cc = new ContaCorrente(111, 111);
		((ContaCorrente) cc).deposita(100.0);
		
		Conta cp = new ContaPoupanca(222, 222);
		((ContaPoupanca) cp).deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println(cc);
		System.out.println(cp);


	}

}
