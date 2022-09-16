package exercicio1;

public class Play {
	
	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		veiculo.setMarca("Fiat");
		veiculo.setModelo("Strada");
		veiculo.setKm(8000.3f);
		veiculo.setPlaca("4ST65");
		veiculo.setPreco(65000.0);
		veiculo.setVelocidade(0);
		veiculo.setLigado(false);
		veiculo.setCor("Branco");
		veiculo.setLitrosCombustivel(0);
		
		System.out.println("inicio");
		testarGeters(veiculo);
		System.out.println("======================");
		
		
		try {
			veiculo.desligar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			veiculo.ligar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		veiculo.acelerar();
		veiculo.acelerar();
		
		try {
			veiculo.frear();
//			veiculo.frear();
//			veiculo.frear();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			veiculo.abastecer(20);
			veiculo.abastecer(50);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			veiculo.desligar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		veiculo.pintar("Vermelho");
		
		System.out.println("======================");
		System.out.println("Depois de utilizar os metodos");
		testarGeters(veiculo);
		
	}
	
	
	private static void testarGeters(Veiculo veiculo) {
		System.out.println("Marca -> " + veiculo.getMarca() + "\n" + "Modelo -> " + veiculo.getModelo()
		+ "\n" + "Km -> " + veiculo.getKm() + "\n" + "Placa -> " + veiculo.getPlaca() + "\n" + 
		"Preço -> " + veiculo.getPreco()
		+ "\n" + "Velocidade -> " + veiculo.getVelocidade() + "\n" + "isLigado -> " + veiculo.isLigado()
		+ "\n" + "Cor -> " + veiculo.getCor() 
		+ "\n" + "Qtd combustrível -> " + veiculo.getLitrosCombustivel());
	}

}
