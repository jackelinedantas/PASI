package jogoGuerreiro;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class ArmaduraMetal implements IArmadura {
	private int defesa = 5;
	
	public ArmaduraMetal() {
	}
	
	public int getDefesa() {
		return defesa;
	}
	
	public IArmadura changeArmadura() {
		return new ArmaduraCompleta();
	}

}