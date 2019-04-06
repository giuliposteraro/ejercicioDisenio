package dominio;

public class YaEncendidoException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public YaEncendidoException (String mensaje) {
		super(mensaje);
	}
}
