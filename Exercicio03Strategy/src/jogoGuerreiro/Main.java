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

		g1.setArma(new Espada());
		g1.setArmadura(new ArmaduraMetal());

		g2.setArma(new Faca());
		g2.setArmadura(new ArmaduraCouro());

		g1.atacar(g2);

		g2.atacar(g1);

		g1.changeArma();
		g1.changeArmadura();

		g1.atacar(g2);
		g1.atacar(g2);

		g2.atacar(g1);
	}

}