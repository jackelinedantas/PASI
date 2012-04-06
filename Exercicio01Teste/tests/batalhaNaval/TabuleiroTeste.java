package batalhaNaval;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import batalhaNaval.Jogo;
import batalhaNaval.Tabuleiro;
import batalhaNaval.TabuleiroException;

public class TabuleiroTeste {
	private Jogo j;
	private Tabuleiro tab;
//	private Embarcacao barco;

	@Before
	public void setUp() throws Exception {
		tab = new Tabuleiro();
//		barco = new Embarcacao();
	}

	@Test
	public void testeTabuleiro() throws TabuleiroException {

		j = new Jogo();

		try {
			j.criarJogo(2,3);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Largura e Altura devem ser maiores que 2", e.getMessage());
		}

		try {
			j.criarJogo(3,2);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Largura e Altura devem ser maiores que 2", e.getMessage());
		}

		try {
			j.criarJogo(-1,15);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Largura inválida: " + -1, e.getMessage());
		}

		try {
			j.criarJogo(0,15);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Largura inválida: " + 0, e.getMessage());
		}

		try {
			j.criarJogo(15,-1);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Altura inválida: " + -1, e.getMessage());
		}

		try {
			j.criarJogo(15,0);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Altura inválida: " + 0, e.getMessage());
		}

		try {
			j.criarJogo(-1,-1);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Largura inválida: " + -1, e.getMessage());
		}

//		try {
//			j = new Jogo();
//			Tabuleiro tab = new Tabuleiro();
//			j.criarJogo(20,10);
//			assertEquals(20,tab.getLargura());
//			assertEquals(10,tab.getAltura());
//			assertEquals(0,tab.getQuantidadeBarcos());
//		} catch (TabuleiroException e) {
//			e.printStackTrace();
//		}

		try {
			j.addBarcoNoJogo("%#",3);
			fail("Deveria ter lançado exceção");
		} catch(TabuleiroException e) {
			assertEquals("Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)", e.getMessage());
		}

		try {
			j.addBarcoNoJogo("&&6",3);
			fail("Deveria ter lançado exceção");
		} catch(TabuleiroException e) {
			assertEquals("Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)", e.getMessage());
		}

		try {
			j.addBarcoNoJogo("",3);
			fail("Deveria ter lançado exceção");
		} catch(TabuleiroException e) {
			assertEquals("Nome inválido", e.getMessage());
		}

		try {
			j.addBarcoNoJogo("BARCO_GRANDE",21);
			fail("Deveria ter lançado exceção");
		} catch(TabuleiroException e) {
			assertEquals("Barco não cabe no tabuleiro", e.getMessage());
		}

//		j = new Jogo();
//		try {
//			j.addBarcoNoJogo("Barco_Grande", 15);
//			assertEquals(1, tab.getBarcos().size());
//		} catch (TabuleiroException e) {
//			e.printStackTrace();
//		}

//		try {
//			j = new Jogo();
//			Tabuleiro tab = new Tabuleiro();
//			j.criarJogo(15,15);
//			assertEquals(15,tab.getLargura());
//			assertEquals(15,tab.getAltura());
//			assertEquals(1,tab.getQuantidadeBarcos());
//		} catch (TabuleiroException e) {
//			e.printStackTrace();
//		}

		try {
			j.addBarcoNoJogo("BARCO_GRANDE", 15, 2);
			fail("Deveria ter lançado exceção");
		} catch(TabuleiroException e) {
			assertEquals("Já existe um barco com nome 'BARCO_GRANDE' no jogo", e.getMessage());
		}

		try {
			tab.addBarcoNoTabuleiro("BARCO_GRANDE", 1, 1, 15, 1);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posição inválida: fora do tabuleiro linha=15 coluna=1", e.getMessage());
		}

		try {
			tab.addBarcoNoTabuleiro("BARCO_GRANDE", 1, 1, 1, 16);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posição inválida: maior que barco (16 > 15)", e.getMessage());
		}

		try {
			tab.addBarcoNoTabuleiro("BARCO_GRANDE", 1, 1, 1, 14);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posição inválida: menor que barco (14 < 15)", e.getMessage());
		}

		try {
			tab.addBarcoNoTabuleiro("BARCO_GRANDE", 1,1,2,15);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posição inválida: barco deve estar na vertical ou horizontal", e.getMessage());
		}

		try {
			tab.addBarcoNoTabuleiro("BARCO_GRANDE", 1,1,1,15);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posição inválida: barco deve estar na vertical ou horizontal", e.getMessage());
		}

//		try {
//			tab.addBarcoNoTabuleiro(1,"PORTA_AVIOES",7,4,11,4);
//			tab.addBarcoNoTabuleiro(1,"DESTROYER",5,7,5,10);
//			tab.addBarcoNoTabuleiro(1,"CRUZADOR",11, 9, 11, 12);
//			tab.addBarcoNoTabuleiro(1,"SUBMARINO",2,2,4,2);
//		} catch(TabuleiroException e) {
//			e.printStackTrace();
//		}

		try {
			tab.addBarcoNoTabuleiro(1, "LANCHA", 1, 3, 3, 3);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posição inválida: conflito de coordenada com barco 'BARCO_GRANDE'", e.getMessage());
		}

		try {
			tab.addBarcoNoTabuleiro(1, "LANCHA", 1, 1, 3, 1);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posição inválida: conflito de coordenada com barco 'BARCO_GRANDE'", e.getMessage());
		}

		try {
			tab.addBarcoNoTabuleiro(1, "LANCHA", 1, 15, 3, 15);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posição inválida: conflito de coordenada com barco 'BARCO_GRANDE'", e.getMessage());
		}

		try {
			tab.addBarcoNoTabuleiro(1, "LANCHA", 1, 16, 4, 16);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posicao invalida: maior que barco (4 > 3)", e.getMessage());
		}

		try {
			tab.addBarcoNoTabuleiro(1, "LANCHA", 1, 16, 2, 16);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posicao invalida: menor que barco (2 < 3)", e.getMessage());
		}

		try {
			tab.addBarcoNoTabuleiro(1, "LANCHA", 2, 1, 4, 4);
			fail("Deveria ter lançado exceção");
		} catch (TabuleiroException e) {
			assertEquals("Posicao invalida: barco deve estar na vertical ou horizontal", e.getMessage());
		}

		try {
			j.addBarcoNoJogo("LANCHA",0);
			fail("Deveria Lançar uma exceção");
		} catch(TabuleiroException e) {
			assertEquals("Embarcação inválida", e.getMessage());
		}

		try {
			j.addBarcoNoJogo("LANCHA",-1);
			fail("Deveria Lançar uma exceção");
		} catch(TabuleiroException e) {
			assertEquals("Embarcação inválida", e.getMessage());
		}

		try {
			j.addBarcoNoJogo("LANCHA",16);
			fail("Deveria Lançar uma exceção");
		} catch(TabuleiroException e) {
			assertEquals("Barco não cabe no tabuleiro", e.getMessage());
		}

		try{
			j = new Jogo();
			j.addBarcoNoJogo("PORTA_AVIOES",5);
			j.addBarcoNoJogo("DESTROYER" ,4);
			j.addBarcoNoJogo("CRUZADOR" ,4);
			j.addBarcoNoJogo("SUBMARINO" ,3);
			j.addBarcoNoJogo("PATRULHA" ,2);
		} catch(TabuleiroException e) {
			e.printStackTrace();
		}

		try{
			tab.addBarcoNoTabuleiro(1,"PORTA_AVIOES",7,4,11,4);
			tab.addBarcoNoTabuleiro(1,"DESTROYER",5,7,5,10);
			tab.addBarcoNoTabuleiro(1,"CRUZADOR",11, 9, 11, 12);
			tab.addBarcoNoTabuleiro(1,"SUBMARINO",2,2,4,2);
			tab.addBarcoNoTabuleiro(1,"PATRULHA" ,14 ,6,14,7);
		} catch(TabuleiroException e) {
			e.printStackTrace();
		}

		try {
			tab.addBarcoNoTabuleiro(2,"PORTA_AVIOES",6,6,6,10);
			tab.addBarcoNoTabuleiro(2,"DESTROYER",12,5 ,12 ,8);
			tab.addBarcoNoTabuleiro(2,"CRUZADOR",2,3,2,6);
			tab.addBarcoNoTabuleiro(2,"SUBMARINO",7 ,3 ,9 ,3);
			tab.addBarcoNoTabuleiro(2,"PATRULHA" ,10,13,11,13);
		} catch(TabuleiroException e) {
			e.printStackTrace();
		}
	}

}