package exercicio7.model;

import java.math.BigDecimal;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, int idade, BigDecimal salario) {
		super(nome, idade, salario);
		
		
	}

	@Override
	public BigDecimal bonificacao() {
		return new BigDecimal("5000").add(this.getSalario());
	}

}
