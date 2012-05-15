package sistAnot;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public abstract class AbstractFactory {

	abstract AbstractEndereco checarCepZipCode(String rua, String cidade, String cepZipCode);
	abstract AbstractTelefone exibirTelefone(String telefone);

}
