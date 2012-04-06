package jogoGuerreiro;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class Espada implements IArma {
	private int dano = 10;
	
	public Espada() {
	}
	
	public int getDano() {
		return dano;
	}
	
	public IArma changeArma() {
		return new Lanca();
	}

}