package dominio;

public class Apagado implements Estado {
	@Override 
	public void encender(Auto auto) {
		aumentarTemperatura(auto);
		consumirCombustible(auto);
	}
	public void aumentarTemperatura(Auto auto) {
		auto.aumentarTemperatura(70.0);
	}
	public void consumirCombustible(Auto auto) {
		double litrosAConsumir = 0.001 * auto.capacidadMaxima();
		auto.consumirCombustible(litrosAConsumir);
	}
	@Override
	public void apagar(Auto auto) {
		throw new YaEstaApagadoException("El auto ya esta apagado");
	}
	@Override 
	public void acelerar(int km, Auto auto) {
		
	}
	@Override 
	public void detener(Auto auto) {
		
	}
}
