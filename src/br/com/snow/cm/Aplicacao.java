package br.com.snow.cm;

import br.com.snow.cm.modelo.Tabuleiro;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		tabuleiro.abrir(1, 2);
		tabuleiro.alternarMarcacao(4, 4);
		//tabuleiro.alternarMarcacao(4, 5);
		
		System.out.println(tabuleiro);
	}

}
