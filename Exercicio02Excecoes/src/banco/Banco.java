package banco;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.util.HashMap;
import java.util.Map;

public class Banco {
	private Conta conta;
	private Map<String,Conta> contasMap;

	public Banco() {
		this.contasMap = new HashMap<String,Conta>();
	}

	public Conta getConta(String numero) throws BancoException {
		if(!contasMap.containsKey(numero))
			throw new  BancoException("Conta não existe com esse numero.:"+numero);

		conta=contasMap.get(numero);
		return conta;
	}

}