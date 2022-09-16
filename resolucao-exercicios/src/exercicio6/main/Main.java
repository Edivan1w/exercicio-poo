package exercicio6.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import exercicio4.model.Pessoa;

public class Main {
	
	public static void main(String[] args) {
		
		List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("joão", 15),
			      new Pessoa("Leandro", 21),
			      new Pessoa("Paulo", 17),
			      new Pessoa("Jessica", 18));
	listaPessoas.forEach(p -> System.out.println(p));
	
	System.out.println("==Verificando se existe o objeto Jessica==");
	
	List<Pessoa> listaFiltrada = listaPessoas
			.stream().filter(p -> p.getNome().equals("Jessica"))
			.collect(Collectors.toList());
	
	listaFiltrada
	.forEach(p -> System.out.println(
			"Quantidade = " + listaFiltrada.size() + "\n" + "Idade = " + p.getIdade()));
	
	}

}
