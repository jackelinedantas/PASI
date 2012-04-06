package persistencia;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.imageio.stream.*;

import banco.Banco;
import banco.Conta;

public class PersistenciaFacade {
	private File arquivo;

	public PersistenciaFacade() {
		arquivo = new File("File.txt");		
	}

	public double selecionarSaldo(String conta) throws PersistenciaException, IOException, ClassNotFoundException {
		if(!arquivo.exists())
			throw new PersistenciaException("Arquivo não encontrado!");

		ObjectInputStream obterFile = new ObjectInputStream(new FileInputStream(arquivo));
		Banco b = new Banco();
		b = (Banco)obterFile.readObject();
		Conta c = b.getConta(conta);
		return  c.getSaldo();
	}

}