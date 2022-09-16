package exercicio1.exception;

public class CapacidadeExcedidaException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public CapacidadeExcedidaException(String mensagem) {
		super(mensagem);
	}

}
