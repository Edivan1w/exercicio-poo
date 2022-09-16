package exercicio3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import exercicio3.model.interfaces.HabilidadesEmComum;

public class Guerreiro extends Personagem implements HabilidadesEmComum {
	

	private List<String> habilidades = new ArrayList<String>();

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	@Override
	public void lvlUp() {
		this.setLevel(this.getLevel() + 1);
		this.setVida(this.getVida() + 5);
        this.setForca(this.getForca() + 3);  
	}

	@Override
	public void attack() {
		System.out.println((this.getForca() * this.getLevel()) + new Random().nextInt(301));
	}
	
	public void aprenderHabilidade(String hbilidade) {
		this.getHabilidades().add(hbilidade);
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
	
	

}
