package jogoGuerreiro;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class Veneno extends DecoratedArma {
	private int dano = 5;

	public Veneno(IArma referencia) {
		super(referencia);
	}

	public int getDano() {
		return super.getDano() + this.dano;
	}

}