package exercicio2.main;

import java.util.Arrays;
import java.util.List;

import exercicio2.model.Livro;
import exercicio2.model.Loja;
import exercicio2.model.Videogame;
import exercicio2.util.LojaUtil;

public class Main {
	
	
	public Main(LojaUtil lojaUtil) {

	}
	
	public static void main(String[] args) {
		
		Livro livro = new Livro("Extermino de largatas", 35.6, 36, "Joao da Lavoura", "Agronegóco", 250);
		Livro livro2 = new Livro("Como ensinar Java", 35.6, 36, "Joao Professor", "Educativo", 250);
		Videogame videogame = new Videogame("Video Game", 6000.5, 10, "Sony", "paystation", false);
		Videogame videogame2 = new Videogame("Video Game", null, 5, "Microsoft", "Xbox", true);
		
		System.out.println(livro.calcularImposto());
		System.out.println(livro2.calcularImposto());
		System.out.println("Imposto video game " + videogame.calcularImposto());
		System.out.println("Imposto video game2 " + videogame2.calcularImposto());
		
		
		List<Livro> livros = Arrays.asList(livro, livro2);
		List<Videogame> videogames = Arrays.asList(videogame, videogame2);
		
		Loja loja = new Loja("Amazon", "12.312.312/0001", livros, videogames);
		
		loja.listarLivros();
		loja.listarVideoGames();
		System.out.println(loja.calculaPatrimonio());
	}

}
