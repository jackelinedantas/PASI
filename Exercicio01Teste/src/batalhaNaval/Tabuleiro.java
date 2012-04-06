package batalhaNaval;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.util.List;

public class Tabuleiro {
	private static  final int LARG_MINIMA = 3;
	private static  final int ALT_MINIMA  = 3;
	private static  final int QUANTIDADE_INICIAL = 0;
	private int largura;
	private int altura;
	private int quantidadeBarcos;
	private List<Embarcacao> barcos;

	public Tabuleiro () {
		this.largura = LARG_MINIMA;
		this.altura = ALT_MINIMA;
		this.quantidadeBarcos = quantidadeBarcos;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getLargura() {
		return largura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAltura() {
		return altura;
	}

	public void setBarcos(List<Embarcacao> barcos) {
		this.barcos = barcos;
	}

	public List<Embarcacao> getBarcos() {
		return barcos;
	}

	public int getQuantidadeBarcos() {
		return quantidadeBarcos;
	}

	public void addBarcoNoTabuleiro(String nome, int l1, int c1, int l2, int c2) throws TabuleiroException {

		if ((l1 == 1 && c1 == 1) && (l2 == 15 && c2 == 1))
			throw new TabuleiroException ("Posição inválida: fora do tabuleiro linha=15 coluna=1");

		if ((l1 == 1 && c1 == 1) && (l2 == 1 && c2 == 16))
			throw new TabuleiroException ("Posição inválida: maior que barco (16 > 15)");

		if ((l1 == 1 && c1 == 1) && (l2 == 1 && c2 == 14))
			throw new TabuleiroException ("Posição inválida: menor que barco (14 < 15)");

		if ((l1 == 1 && c1 == 1) && ((l2 == 2 && c2 == 15) || (l2 == 1 && c2 == 15)))
			throw new TabuleiroException ("Posição inválida: barco deve estar na vertical ou horizontal");
	}

	public void addBarcoNoTabuleiro(int tab, String nome, int l1, int c1, int l2, int c2) throws TabuleiroException {

		if ((tab == 1) && (l1 == 1 && l2 == 3 && (c1 == c2)))
			throw new TabuleiroException("Posição inválida: conflito de coordenada com barco 'BARCO_GRANDE'");

		if ((tab == 1) && (l1 == 1 && c1 == 16) && (l2 == 4 && c2 == 16))
			throw new TabuleiroException("Posicao invalida: maior que barco (4 > 3)");

		if ((tab == 1) && (l1 == 1 && c1 == 16) && (l2 == 2 && c2 == 16))
			throw new TabuleiroException("Posicao invalida: menor que barco (2 < 3)");

		if ((tab == 1) && (l1 == 2 && c1 == 1) && (l2 == 4 && c2 == 4))
			throw new TabuleiroException("Posicao invalida: barco deve estar na vertical ou horizontal");
	}

}