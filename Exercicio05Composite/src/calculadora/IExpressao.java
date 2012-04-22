package calculadora;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public interface IExpressao {
	public int avaliar();
	public void add(IExpressao e) throws Exception;
}