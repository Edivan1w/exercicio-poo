package exercicio5.main;

import java.util.Arrays;
import java.util.List;

import exercicio4.model.Pessoa;

public class Main {
	
@SuppressWarnings("unlikely-arg-type")
public static void main(String[] args) {
		
		List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("joão", 15),
				      new Pessoa("Leandro", 21),
				      new Pessoa("Paulo", 17),
				      new Pessoa("jessica", 18));
		listaPessoas.forEach(p -> System.out.println(p));
		
		System.out.println("==escluindo pessoas com idade superior a 18 anos==");
		
		listaPessoas.forEach(p -> listaPessoas.remove(p.getIdade() < 15));
		listaPessoas.forEach(System.out::println);
	}

}
