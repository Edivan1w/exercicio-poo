package exercicio2.model;

import exercicio2.interfaces.Imposto;

public class Livro extends Produto implements Imposto{
	
	private String autor;
	private String tema;
	private int qtdPagina;
	
	public Livro() {
	}
	
	public Livro(String nome, Double preco, int qtd, String autor, String tema, int qtdPagina) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPagina = qtdPagina;
	}
	
	
	

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPagina() {
		return qtdPagina;
	}

	public void setQtdPagina(int qtdPagina) {
		this.qtdPagina = qtdPagina;
	}

	@Override
	public Double calcularImposto() {
		if(this.getTema().equalsIgnoreCase("Educativo")) {
			return 0.0;
		}
		try {
			return this.getPreco() * 0.1;
		} catch (NullPointerException e) {
			return 0.0;
		}
		
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", tema=" + tema + ", qtdPagina=" + qtdPagina + "]";
	}

	

	

}












