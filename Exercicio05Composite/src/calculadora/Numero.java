package calculadora;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class Numero implements IExpressao {
	private int n;

	public Numero(int n) {
		this.n = n;
	}

	public int avaliar() {
		return n;
	}

	public void add(IExpressao e) throws Exception {
		throw new Exception();
	}

}