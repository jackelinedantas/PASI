package sistAnot;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class TelefoneBrasil extends AbstractTelefone {
	private String telefone;

	public TelefoneBrasil(String telefone) {
		this.telefone = telefone;
	}

	public void exibir() {
		if(telefone.substring(0,4).equals("(55)"))
			System.out.println(telefone+" - "+telefone.substring(1,3)+ " é o código do Brasil");
		else
			System.out.println("DDD inválido");
	}

}