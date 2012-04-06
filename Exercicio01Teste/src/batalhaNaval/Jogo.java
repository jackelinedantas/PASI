package batalhaNaval;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.util.ArrayList;
import java.util.List;

public class Jogo {
	private List<Embarcacao> barcos;
	Tabuleiro tab = new Tabuleiro();

	public void criarJogo(int largura, int altura) throws TabuleiroException {

		if (largura == -1 || largura == 0)
			throw new TabuleiroException ("Largura inválida: " + largura);

		if(altura == -1 || altura==0)
			throw new TabuleiroException ("Altura inválida: " + altura);

		if(largura <= 2 || altura <= 2)
			throw new TabuleiroException ("Largura e Altura devem ser maiores que 2");

		Tabuleiro tab = new Tabuleiro();
		tab.setLargura(largura);
		tab.setAltura(altura);
	}

	public void addBarcoNoJogo(String nome, int tamanho) throws TabuleiroException {

		if(nome.equalsIgnoreCase("%#"))
			throw new TabuleiroException("Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");

		if(nome.equalsIgnoreCase("&&6"))
             throw new TabuleiroException("Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");

		if(nome.equalsIgnoreCase(""))
             throw new TabuleiroException("Nome inválido");

    	if(tamanho==21||tamanho==16)
             throw new TabuleiroException("Barco não cabe no tabuleiro");
    
    	if (tamanho==0||tamanho==-1)
             throw new TabuleiroException("Embarcação inválida");

		Embarcacao barco = new Embarcacao();
		barco.setNome(nome);
		barco.setTamanho(tamanho);
		barcos=new ArrayList<Embarcacao>();
		barcos.add(barco);
		tab.setBarcos(barcos);
	}

	public void addBarcoNoJogo(String nome, int tamanho, int quantidadeBarcos) throws TabuleiroException  {

		if((tamanho == 15) && (quantidadeBarcos > 1))
			throw new TabuleiroException("Já existe um barco com nome 'BARCO_GRANDE' no jogo");
	}

}