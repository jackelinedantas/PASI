package banco;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.io.IOException;
import persistencia.*;

public class Conta {
	private double saldo;
	private PersistenciaFacade persistencia;
	private String numeroConta;

	public  Conta() {
		persistencia = new PersistenciaFacade();
	}

	public Conta(String numerConta) {
		persistencia = new PersistenciaFacade();
		this.numeroConta = numerConta;
	}

	public double getSaldo() throws BancoException, PersistenciaException, IOException, ClassNotFoundException {
		try {
			saldo = this.persistencia.selecionarSaldo(this.numeroConta);
		} catch(BancoException e) {
			throw new BancoException("Conta não existente");
		} catch(PersistenciaException e) {
			throw new PersistenciaException("Arquivo não encontrado");
		}

		return saldo;
	}

}