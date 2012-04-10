package jogoGuerreiro;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class Main {

	public static void main(String[] args) {

		Guerreiro g1 = new Guerreiro("Heron ", 100);
		Guerreiro g2 = new Guerreiro("Harvey ", 100);

		IArma arma1 = new Faca();
		arma1.getDano();
		arma1 = new Veneno(arma1);
		
		IArma arma2 = new Espada();
		arma2.getDano();
		arma2 = new Fogo(arma2);
		
		g1.setArma(arma1);
		g1.setArmadura(new ArmaduraMetal());

		g2.setArma(arma2);
		g2.setArmadura(new ArmaduraCouro());
		
		g1.atacar(g2);
		g2.atacar(g1);
		g1.atacar(g2);
		g1.atacar(g2);
		g2.atacar(g1);
	}

}