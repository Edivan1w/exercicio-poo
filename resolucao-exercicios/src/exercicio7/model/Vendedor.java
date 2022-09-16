package exercicio7.model;

import java.math.BigDecimal;

public class Vendedor extends Funcionario{

	public Vendedor(String nome, int idade, BigDecimal salario) {
		super(nome, idade, salario);
		
		
	}

	@Override
	public BigDecimal bonificacao() {
		return new BigDecimal("3000").add(this.getSalario());
	}

}
