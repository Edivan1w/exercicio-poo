package exercicio7.model;

import java.math.BigDecimal;

public class Gerente extends Funcionario{

	public Gerente(String nome, int idade, BigDecimal salario) {
		super(nome, idade, salario);
		
		
	}

	@Override
	public BigDecimal bonificacao() {
		return new BigDecimal("10000").add(this.getSalario());
	}

}
