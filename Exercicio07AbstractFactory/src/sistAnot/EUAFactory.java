package sistAnot;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class EUAFactory extends AbstractFactory {

	public AbstractEndereco checarCepZipCode(String rua, String cidade, String cepZipCode) {
		return new EnderecoEUA(rua, cidade, cepZipCode);
	}

	public AbstractTelefone exibirTelefone(String telefone) {
		return new TelefoneEUA(telefone);
	}

}