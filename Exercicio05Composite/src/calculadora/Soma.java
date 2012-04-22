package calculadora;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.util.ArrayList;
import java.util.List;

public class Soma implements IExpressao {
	private List <IExpressao> num = new ArrayList<IExpressao>();

	public Soma() {
		
	}

	public void add(IExpressao n) {
		num.add(n);
	}

	public int avaliar() {
		int result = 0;
		for(int i = 0; i < num.size(); i++)
			result += num.get(i).avaliar();
		return result;
	}

}