package exercicio4.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import exercicio4.model.Pessoa;

public class Main {
	
	public static void main(String[] args) {
		
		List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("joão", 15),
				      new Pessoa("Leandro", 21),
				      new Pessoa("Paulo", 17),
				      new Pessoa("jessica", 18));
		
		System.out.println(Collections.max(listaPessoas
				.stream()
				.map(Pessoa::getIdade)
				.collect(Collectors.toList())));
		
	}

}
