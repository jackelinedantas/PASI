package sistAnot;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class TelefoneEUA extends AbstractTelefone {
	private String telefone;

	public TelefoneEUA(String telefone) {
		this.telefone = telefone;
	}

	public void exibir() {
		if(telefone.substring(0,3).equals("(1)"))
			System.out.println(telefone+" - "+telefone.substring(1,2)+ " � o c�digo dos EUA");
		else
			System.out.println("DDD inv�lido");
	}

}