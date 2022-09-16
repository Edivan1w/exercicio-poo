package exercicio3.main;
import exercicio3.model.Guerreiro;
import exercicio3.model.Mago;
import exercicio3.model.Personagem;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("==Testando o mago==");
		Mago mago = new Mago("joao Mago", 3, 10, 350, 2, 15, 1);
		mago.lvlUp();
		System.out.println("Nivel = " + mago.getLevel() + "\n" + 
		"Mana =" + mago.getMana() + "\n" + "Integencia = " + mago.getInteligencia());
		mago.attack();
		mago.aprenderMagia("Bolas de fogo");
		mago.getMagias().forEach(m -> System.err.println("Tipo de magia = " +m));
		
		System.out.println();
		System.out.println("==Testando o mago==");
		Guerreiro guerreiro = new Guerreiro("Guerreiro das Montanhas", 3, 10, 450, 2, 15, 1);
		guerreiro.lvlUp();
		System.out.println("Nivel = " + guerreiro.getLevel() + "\n" + 
				"Força = " + guerreiro.getForca() + "\n" + "Vida = " + guerreiro.getVida());
				mago.attack();
		guerreiro.attack();
		guerreiro.aprenderHabilidade("Controle da água");
		guerreiro.getHabilidades().forEach(h -> System.err.println("Tipo de habilidade = " +h));
		
		System.out.println("==Testando o numero de persogens==");
		System.out.println("Numero de personagens no jogo = " + Personagem.getQtdPersogens());
	}

}
