package br.com.snow.cm.visao;

import java.util.Scanner;

import br.com.snow.cm.excecao.ExplosaoException;
import br.com.snow.cm.excecao.SairExeception;
import br.com.snow.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner sc = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;

		execultarJogo();
	}

	private void execultarJogo() {
		try {
			boolean continuar = true;

			while (continuar) {
				cicloDoJogo();

				System.out.println("Outra Partida? (S/n) ");
				String resposta = sc.nextLine();

				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}

		} catch (SairExeception e) {
			System.out.println("Tchau!!!");
		} finally {
			sc.close();
		}
	}

	private void cicloDoJogo() {
		try {
			
			while(!tabuleiro.objetivosAlcancados()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (x, y): ");
			}
			
			System.out.println("Você ganhou!!");
		}catch(ExplosaoException e){
			System.out.println("Você Perdeu!!");
		}
		
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado  = sc.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairExeception();
		}
		return digitado;
	}
}
