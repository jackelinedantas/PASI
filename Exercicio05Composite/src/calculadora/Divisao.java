package calculadora;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.util.ArrayList;
import java.util.List;

public class Divisao implements IExpressao {
	private List <IExpressao> num = new ArrayList<IExpressao>();

	public Divisao() {
		
	}

	public void add(IExpressao n) {
		num.add(n);
	}

	@Override
	public int avaliar() {
		int result = num.get(0).avaliar();
		for(int i = 1; i < num.size(); i++)
			if(!(num.get(i).avaliar() == 0))
				result /= num.get(i).avaliar();
		return result;
	}

}