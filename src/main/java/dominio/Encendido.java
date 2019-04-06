package dominio;

public class Encendido implements Estado {
	@Override 
	public void encender(Auto auto) {
		throw new YaEncendidoException("Ya esta encendido el auto");
	}
	@Override
	public void apagar(Auto auto) {
		
	}
	@Override 
	public void acelerar(int km, Auto auto) {
		
	}
	@Override 
	public void detener(Auto auto) {
		
	}
}
