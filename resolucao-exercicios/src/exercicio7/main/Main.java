package exercicio7.main;

import java.math.BigDecimal;

import exercicio7.model.Gerente;
import exercicio7.model.Supervisor;
import exercicio7.model.Vendedor;

public class Main {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Paulo José", 55, new BigDecimal("20000.32"));
		Supervisor supervisor = new Supervisor("Maria das Neves", 32, new BigDecimal("8000.51"));
		Vendedor vendedor = new Vendedor("jose de Abreu", 38, new BigDecimal("25000.87"));
		
		System.out.println("Bonificação Gerente = " + gerente.bonificacao() + "\n" +
		                   "Bonificação Supervisor = " + supervisor.bonificacao() + "\n" +
				           "Bonificação Vendedor = " + vendedor.bonificacao());
		
	}

}
