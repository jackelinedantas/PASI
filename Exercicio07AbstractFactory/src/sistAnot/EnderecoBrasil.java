package sistAnot;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class EnderecoBrasil extends AbstractEndereco {
	private String rua;
	private String cidade;
	private String cepZipCode;

	public EnderecoBrasil(String rua, String cidade, String cepZipCode) {
		this.cidade = cidade;
		this.rua = rua;
		this.cepZipCode = cepZipCode;
	}

	public void exibir() {
		if((cepZipCode.substring(6,9).length() == 3))
			System.out.println("Endereço EUA: \n"+"Cidade: "+cidade+"\nRua: "+rua+"\nCEP: "+cepZipCode.substring(0,5) + "-" + cepZipCode.substring(6,9));
		else
			System.out.println(" CEP inválido!");
	}

}