package dominio;

public class Motor {
	private double temperatura = 0.0;
	public void aumentarTemperatura(Auto auto, double grados) {
		this.setTemperatura(this.temperatura() + grados);
	}
	public void apagar(Auto auto) {
		this.setTemperatura(0.0);
	}
	public double temperatura() {
		return this.temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public void enfriarMotor(int grados) {
		temperatura -= grados;
	}
}
