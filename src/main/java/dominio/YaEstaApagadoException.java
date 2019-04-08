package dominio;

public class YaEstaApagadoException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public YaEstaApagadoException (String mensaje) {
		super(mensaje);
	}

}
