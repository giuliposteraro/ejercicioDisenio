package dominio;

public interface Estado {
	public void encender(Auto auto);
	public void apagar(Auto auto);
	public void acelerar(int km, Auto auto);
	public void detener(Auto auto);
}
