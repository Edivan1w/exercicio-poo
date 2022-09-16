package exercicio1;

import exercicio1.exception.CapacidadeExcedidaException;
import exercicio1.exception.PartidaException;
import exercicio1.exception.VelocidadeException;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;
	
	
	
	public void acelerar() {
		this.velocidade += 20; 
	}
	
	public void abastecer(int combustivel) {
		if(this.litrosCombustivel + combustivel >= 60 ) {
			throw new CapacidadeExcedidaException("Você deve abastecer até o limite de 60 litros");
		}
		this.litrosCombustivel += combustivel;
	}
	
	public void frear() {
		if(this.velocidade == 0) {
			throw new VelocidadeException("Você não pode frear se o veiculo encontra-se parado"); 
		}
		this.velocidade -= 20;
	}
	
	public void pintar(String cor) {
		this.cor = cor;
	}
	
	public void ligar() {
		if(this.isLigado == true) {
			throw new PartidaException("Verifique se o carro ja se encontra ligado");
		}
		this.isLigado = true;
	}
	
	public void desligar() {
		if(this.isLigado == false || this.velocidade > 0) {
			throw new PartidaException("Verifique se o carro ja se encontra desligado e também se está em movimento");
		}
		
		this.isLigado = false;
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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	
}
