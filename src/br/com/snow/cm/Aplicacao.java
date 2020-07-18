package br.com.snow.cm;

import br.com.snow.cm.modelo.Tabuleiro;
import br.com.snow.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);

	}
	
}