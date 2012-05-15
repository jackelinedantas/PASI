package sistAnot;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class BrasilFactory extends AbstractFactory {

	public AbstractEndereco checarCepZipCode(String rua, String cidade, String cepZipCode) {
		return new EnderecoBrasil(rua, cidade, cepZipCode);
	}

	public AbstractTelefone exibirTelefone(String telefone) {
		return new TelefoneBrasil(telefone);
	}

}