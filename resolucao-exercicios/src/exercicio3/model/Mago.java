package exercicio3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import exercicio3.model.interfaces.HabilidadesEmComum;

public class Mago extends Personagem implements HabilidadesEmComum{
	
	private List<String> magias = new ArrayList<String>();

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	@Override
	public void lvlUp() {
		this.setLevel(this.getLevel() + 1);
        this.setMana(this.getMana() + 2);  
        this.setInteligencia(this.getInteligencia() + 3);
		
	}

	@Override
	public void attack() {
		System.out.println((this.getInteligencia() * this.getLevel()) + new Random().nextInt(301));
	}
	
	public void aprenderMagia(String magia) {
		this.getMagias().add(magia);
	}

	public List<String> getMagias() {
		return magias;
	}

	public void setMagias(List<String> magias) {
		this.magias = magias;
	}

	
}
