package jogoGuerreiro;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public abstract class DecoratedArma implements IArma {
	private IArma referencia = null;

	public DecoratedArma(IArma referencia) {
		this.referencia = referencia;
	}

	public int getDano() {
		return referencia.getDano();
	}

}