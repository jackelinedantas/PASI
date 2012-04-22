package calculadora;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.util.ArrayList;
import java.util.List;

public class Subtracao implements IExpressao {
	private List <IExpressao> num = new ArrayList<IExpressao>();

	public Subtracao() {
		
	}

	public void add(IExpressao n) {
		num.add(n);
	}

	public int avaliar() {
		int result = num.get(0).avaliar();
		for(int i = 1; i < num.size(); i++)
			result -= num.get(i).avaliar();
		return result;
	}

}