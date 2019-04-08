package dominio;

public class ElectroVentilador {
	private int gradosQueEnfria = 15;
	public void activar(Auto auto) {
		auto.setMotor().enfriarMotor(gradosQueEnfria);
	}
}
