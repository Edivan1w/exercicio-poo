package exercicio7.model;

import java.math.BigDecimal;

public abstract class Funcionario {

	
	private String nome;
	private int idade;
	private BigDecimal salario;
	
	public Funcionario(String nome, int idade, BigDecimal salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	public abstract BigDecimal bonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	
}
