package exercicio2.model;

import java.util.ArrayList;
import java.util.List;

import exercicio2.util.LojaUtil;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros = new ArrayList<>();
	private List<Videogame> videoGames = new ArrayList<>();
	
	private LojaUtil lojaUtil = new LojaUtil();
	

	public Loja() {
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<Videogame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<Videogame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<Videogame> videoGames) {
		this.videoGames = videoGames;
	}

	public void listarLivros() {
		if(!this.getLivros().isEmpty()) {
			this.getLivros().forEach(l -> System.out.println(l));
		}else {
			System.out.println("A loja não tem livros em seu estoque");
		}
	}

	public void listarVideoGames() {
		if(!this.getVideoGames().isEmpty()) {
			this.getVideoGames().forEach(v -> System.out.println(v));
		}else {
			System.out.println("A loja não tem video games em seu estoque");
		}
	}
	
	public Double calculaPatrimonio(){
		return lojaUtil.calculaPatrimonio(this);
	}
}
