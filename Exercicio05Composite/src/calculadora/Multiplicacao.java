package calculadora;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.util.ArrayList;
import java.util.List;

public class Multiplicacao implements IExpressao {
	private List <IExpressao> num = new ArrayList<IExpressao>();

	public Multiplicacao() {
		
	}

	public void add(IExpressao n) {
		num.add(n);
	}

	public int avaliar() {
		int result = 1;
		for(int i = 0; i < num.size(); i++)
			result *= num.get(i).avaliar();
		return result;
	}

}