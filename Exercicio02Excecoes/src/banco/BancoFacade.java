package banco;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.io.IOException;
import persistencia.PersistenciaException;

public class BancoFacade {
	private Banco banco;

	public BancoFacade() {
		banco = new Banco();
	}

	public double getSaldo(String numero) throws BancoException, PersistenciaException, IOException, ClassNotFoundException {
		return banco.getConta(numero).getSaldo();
	}

}