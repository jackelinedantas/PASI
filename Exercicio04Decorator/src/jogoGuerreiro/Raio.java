package jogoGuerreiro;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class Raio extends DecoratedArma {
	private int dano = 10;

	public Raio(IArma referencia) {
		super(referencia);
	}

	public int getDano() {
		return super.getDano() + this.dano;
	}

}