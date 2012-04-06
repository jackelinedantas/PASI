package jogoGuerreiro;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class Guerreiro {
	private String nome;
	private IArma arma;
	private IArmadura armadura;
	private int energia;

	public Guerreiro(String nome, int energia) {
		this.nome = nome;
		this.energia = energia;
	}

	public String getNome() {
		return this.nome;
	}

	public void setArma(IArma arma) {
		this.arma = arma;
	}

	public IArma getArma() {
		return this.arma;
	}

	public void setArmadura(IArmadura armadura) {
		this.armadura = armadura;
	}

	public IArmadura getArmadura() {
		return this.armadura;
	}

	public int getEnergia() {
		return this.energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public void atacar(Guerreiro guerreiro) {

		int dano = 0;
		if (this.arma.getDano() > guerreiro.armadura.getDefesa()) {
			dano = this.arma.getDano() - guerreiro.armadura.getDefesa();
		}

		System.out.println("\nEnergia de " + guerreiro.getNome() + "antes do ataque : " + guerreiro.getEnergia() + "\n");
		System.out.println("Dano da arma de " + this.nome + ": " + this.arma.getDano());
		System.out.println("Defesa da armadura de " + guerreiro.getNome() + ": "+ guerreiro.getArmadura().getDefesa());
		System.out.println("Dano do ataque sofrido : " + dano);

		guerreiro.setEnergia(guerreiro.getEnergia() - dano);

		System.out.println("\n" + guerreiro.getNome() + "foi atacado e a energia atual é: " + guerreiro.getEnergia() + "\n");
		System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");

	}

	public void changeArma() {
		setArma(arma);
	}

	public void changeArmadura() {
		setArmadura(armadura);
	}

}