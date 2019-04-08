package dominio;

public class Tanque {
	private double combustible;
	private int capacidadMaximaCombustible;
	public void consumirCombustible(Auto auto, double litros){
		this.setCombustible(this.getCombustible() - litros);
	}
	public double getCombustible() {
		return combustible;
	}
	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}
	public double capacidadMaximaCombustible() {
		return this.capacidadMaximaCombustible;
	}
	public boolean enReserva() {
		return this.combustible < 0.1 * this.capacidadMaximaCombustible;
	}
	public boolean proximoAReserva() {
		return this.combustible < 0.15 * this.capacidadMaximaCombustible;
	}
}

