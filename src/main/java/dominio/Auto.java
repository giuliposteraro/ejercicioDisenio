package dominio;

public class Auto {   
	private Estado estado;
	private Motor motor; 
	private Tanque tanque;
	private ElectroVentilador ventilador;
	private int velocidadActual;
	public void encender() {
		this.estado.encender(this);
	}
	public Motor setMotor() {
		return this.motor;
	}
	public void apagar() {
		this.motor.apagar(this);
		
	}
	public void acelerar(int km) {
		this.estado.acelerar(km,this);
	}
	
	public void detener(){
		this.estado.detener(this);
	}
	
	public void aumentarTemperatura(double grados) {
		this.motor.aumentarTemperatura(this,grados);
	}
	public void consumirCombustible(double litros) {
		this.tanque.consumirCombustible(this,litros);
	}
	public double capacidadMaxima() {
		return this.tanque.capacidadMaximaCombustible();
	}
	public void estaCaliente() {
		if(this.motor.temperatura() >= 95.0) {
			this.ventilador.activar(this);
		}
	}
	public int velocidadActual() {
		return this.velocidadActual;
	}

}
