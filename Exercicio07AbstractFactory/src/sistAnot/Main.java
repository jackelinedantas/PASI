package sistAnot;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class Main {

	public static void main(String[] args) {

		AbstractFactory fabBr = new BrasilFactory();
		AbstractTelefone telBr = fabBr.exibirTelefone("(55)8839-8478");
		AbstractEndereco endBr = fabBr.checarCepZipCode("Humberto Maul", "João Pessoa", "58062-729");

		AbstractFactory fabEUA = new EUAFactory();
		AbstractTelefone telEUA = fabEUA.exibirTelefone("(1)1234-5678");
		AbstractEndereco endEUA = fabEUA.checarCepZipCode("5ª AV", "NY", "12345-6789");

		telBr.exibir();
		endBr.exibir();
		System.out.println("\n");
		telEUA.exibir();
		endEUA.exibir();
	}

}