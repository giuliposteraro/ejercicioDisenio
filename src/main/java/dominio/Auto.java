package dominio;

public class Auto {  // public esta prohibido para los atributos 
	Estado estado;
	private int temperatura; // es de la clase motor 
	private int combustible; 
	public void encender() {
		this.estado.encender(this);
	}
	public void apagar() {
		this.estado.apagar(this);
		
	}
	public void acelerar(int km) {
		this.estado.acelerar(km,this);
	}
	
	public void detener(){
		this.estado.detener(this);
	}

}
