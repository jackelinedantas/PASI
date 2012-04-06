package jogoGuerreiro;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class ArmaduraCouro implements IArmadura {
	private int defesa=2;
	
	public ArmaduraCouro() {
	
	}
	
	public int getDefesa() {
		return defesa;
	}

	public IArmadura changeArmadura() {
		return new ArmaduraMetal();
	}

}