package jogoGuerreiro;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class Faca implements IArma {
	private int dano = 5;
	
	public Faca() {
	}
	
	public int getDano() {
		return dano;
	}
	
	public IArma changeArma() {
		return new Espada();
	}

}