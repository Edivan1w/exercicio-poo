package exercicio2.model;

import exercicio2.interfaces.Imposto;

public class Videogame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;
	
	
	
	public Videogame() {
		super();
	}
	public Videogame(String nome, Double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	@Override
	public Double calcularImposto() {
		try {
			if(this.isUsado == true) {
				return this.getPreco() * 0.25;
			}
			
			return this.getPreco() * 0.45;
		} catch (NullPointerException e) {
			return 0.0;
		}
		
	}
	@Override
	public String toString() {
		return "Videogame [marca=" + marca + ", modelo=" + modelo + ", isUsado=" + isUsado + "]";
	}
	
	
	

}
