package jogoGuerreiro;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class Fogo extends DecoratedArma {
	private int dano = 2;

	public Fogo(IArma referencia) {
		super(referencia);
	}

	public int getDano() {
		return super.getDano() + this.dano;
	}

}