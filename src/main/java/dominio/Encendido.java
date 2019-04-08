package dominio;

public class Encendido implements Estado {
	@Override 
	public void encender(Auto auto) {
		throw new YaEncendidoException("Ya esta encendido el auto");
	}
	@Override
	public void apagar(Auto auto) {
		auto.apagar();
	}
	@Override 
	public void acelerar(int km, Auto auto) {
		auto.aumentarTemperatura(0.2 * km);
	}
	@Override 
	public void detener(Auto auto) {
		double temperaturaAAumentar = 0.04 * auto.velocidadActual();
		auto.aumentarTemperatura(temperaturaAAumentar);
	}
}
