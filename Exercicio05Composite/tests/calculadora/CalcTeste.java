package calculadora;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTeste {

	@Test
	public void testAvaliacaoDoNumero() {
		Numero num = new Numero(10);
		int resultado;

		resultado = num.avaliar();

		assertEquals(10, resultado);
	}

	@Test
	public void testAvaliacaoDaSoma() {
		Soma som = new Soma();
		Numero n1 = new Numero(1);
		Numero n2 = new Numero(2);

		som.add(n1);
		som.add(n2);

		assertEquals(3, som.avaliar());
	}

	@Test
	public void testAvaliacaoDaSoma3() {
		Soma som = new Soma();
		Numero n1 = new Numero(1);
		Numero n2 = new Numero(2);
		Numero n3 = new Numero(5);

		som.add(n1);
		som.add(n2);
		som.add(n3);

		assertEquals(8, som.avaliar());
	}

	@Test
	public void testAvaliacaoSomaAvancada() throws Exception {
		IExpressao som = new Soma();
		IExpressao n1 = new Numero(1);
		IExpressao n2 = new Numero(2);
		IExpressao n3 = new Numero(5);

		som.add(n1);
		som.add(n2);

		IExpressao som2 = new Soma();

		som2.add(n3);
		som2.add(som);

		assertEquals(8, som2.avaliar());
	}

	@Test
	public void testAvaliacaoDaMultiplicacao() throws Exception {
		IExpressao mult = new Multiplicacao();
		IExpressao n1 = new Numero(2);
		IExpressao n2 = new Numero(5);

		mult.add(n1);
		mult.add(n2);

		assertEquals(10, mult.avaliar());
	}

	@Test
	public void testAvaliacaoMultSom() throws Exception {
		IExpressao mult = new Multiplicacao();
		IExpressao som = new Soma();
		IExpressao n1 = new Numero(2);
		IExpressao n2 = new Numero(5);
		IExpressao n3 = new Numero(3);
		IExpressao n4 = new Numero(7);

		mult.add(n1);
		mult.add(n2);
		som.add(mult);
		som.add(n4);
		som.add(n3);

		assertEquals(20, som.avaliar());
	}

	@Test
	public void testAvaliacaoDaSubtracao() throws Exception {
		IExpressao sub = new Subtracao();
		IExpressao n1 = new Numero(20);
		IExpressao n2 = new Numero(2);

		sub.add(n1);
		sub.add(n2);

		assertEquals(18, sub.avaliar());
	}

	@Test
	public void testAvaliacaoDaSubtracao2() throws Exception {
		IExpressao sub=new Subtracao();
		IExpressao n1 = new Numero(4);
		IExpressao n2 = new Numero(6);
		IExpressao n3 = new Numero(-2);

		sub.add(n1);
		sub.add(n2);
		sub.add(n3);

		assertEquals(0, sub.avaliar());
	}


	@Test
	public void testAvaliacaoSomSub() throws Exception {
		IExpressao som = new Soma();
		IExpressao sub = new Subtracao();
		IExpressao n1 = new Numero(2);
		IExpressao n2 = new Numero(3);
		IExpressao n3 = new Numero(1);

		som.add(n1);
		som.add(n2);
		sub.add(som);
		sub.add(n3);

		assertEquals(4, sub.avaliar());
	}

	@Test
	public void testAvaliacaoMultSub() throws Exception {
		IExpressao sub = new Subtracao();
		IExpressao mul = new Multiplicacao();

		IExpressao n1 = new Numero(4);
		IExpressao n2 = new Numero(6);
		IExpressao n3 = new Numero(-3);

		sub.add(n1);
		sub.add(n2);
		sub.add(n3);

		mul.add(n3);
		mul.add(n1);
		mul.add(n2);
		mul.add(sub);

		assertEquals(-72, mul.avaliar());
	}

	@Test
	public void testAvaliacaoSomSubMult() throws Exception {
		IExpressao som = new Soma();
		IExpressao sub = new Subtracao();
		IExpressao mult = new Multiplicacao();
		IExpressao n1 = new Numero(2);
		IExpressao n2 = new Numero(3);
		IExpressao n3 = new Numero(1);
		IExpressao n4 = new Numero(5);

		som.add(n1);
		som.add(n2);
		sub.add(som);
		sub.add(n3);
		mult.add(sub);
		mult.add(n4);

		assertEquals(20, mult.avaliar());
	}

	@Test
	public void testAvaliacaoDaDivisao() throws Exception {
		IExpressao div = new Divisao();
		IExpressao n1 = new Numero(10);
		IExpressao n2 = new Numero(5);

		div.add(n1);
		div.add(n2);

		assertEquals(2, div.avaliar());
	}

	@Test
	public void testAvaliacaoSomDiv() throws Exception {
		IExpressao som = new Soma();
		IExpressao div = new Divisao();
		IExpressao n1 = new Numero(2);
		IExpressao n2 = new Numero(6);
		IExpressao n3 = new Numero(4);

		som.add(n1);
		som.add(n2);
		div.add(som);
		div.add(n3);

		assertEquals(2, div.avaliar());
	}

	@Test
	public void testAvaliacaoSomDivSub() throws Exception {
		IExpressao som = new Soma();
		IExpressao div = new Divisao();
		IExpressao sub = new Subtracao();
		IExpressao n1 = new Numero(4);
		IExpressao n2 = new Numero(6);
		IExpressao n3 = new Numero(2);
		IExpressao n4 = new Numero(5);

		som.add(n1);
		som.add(n2);
		div.add(som);
		div.add(n3);
		sub.add(div);
		sub.add(n4);

		assertEquals(0, sub.avaliar());
	}

	@Test
	public void testAvaliacaoCalcCompleta() throws Exception {
		IExpressao som = new Soma();
		IExpressao div = new Divisao();
		IExpressao sub = new Subtracao();
		IExpressao mult = new Multiplicacao();
		IExpressao n1 = new Numero(20);
		IExpressao n2 = new Numero(5);
		IExpressao n3 = new Numero(3);
		IExpressao n4 = new Numero(2);
		IExpressao n5 = new Numero(6);

		sub.add(n1);
		sub.add(n2);
		div.add(sub);
		div.add(n3);
		mult.add(div);
		mult.add(n4);
		som.add(mult);
		som.add(n5);

		assertEquals(16, som.avaliar());
	}

	@Test
	public void testAvaliacaoCalcCompleta2() throws Exception {
		IExpressao div = new Divisao();
		IExpressao sub = new Subtracao();
		IExpressao mul = new Multiplicacao();
		IExpressao som = new Soma();
		IExpressao n1 = new Numero(15);
		IExpressao n2 = new Numero(5);
		IExpressao n3 = new Numero(3);

		div.add(n1);
		div.add(n2);
		div.add(n3);

		assertEquals(1, div.avaliar());

		som.add(n1);
		som.add(div);

		assertEquals(16, som.avaliar());

		sub.add(som);
		sub.add(n3);
		sub.add(n3);

		assertEquals(10, sub.avaliar());

		mul.add(sub);
		mul.add(n2);
		mul.add(n3);

		assertEquals(150, mul.avaliar());
	}

}