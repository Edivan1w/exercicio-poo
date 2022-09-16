package exercicio2.util;

import exercicio2.model.Loja;

public class LojaUtil {
	
	public Double calculaPatrimonio(Loja loja ){
		return this.calcularPatrimonioLivros(loja) + this.calcularPatrimonioVideoGames(loja);
	}

	public Double calcularPatrimonioLivros(Loja loja) {
		try {
			return loja.getLivros().stream().mapToDouble(l -> l.getPreco()).sum();
		} catch (NullPointerException e) {
			return 0.0;
		}
	}
	
	public Double calcularPatrimonioVideoGames(Loja loja) {
		try {
			return loja.getVideoGames().stream().mapToDouble(v -> v.getPreco()).sum();
		} catch (NullPointerException e) {
			return 0.0;
		}
	}
}
