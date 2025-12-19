package Dominio;

public class Notificacion {

	private int id;
	private String tipo;
	private String mensaje;
	private Date fecha;

	public int getId() {
		return this.id;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public String getTipo() {
		return this.tipo;
	}

}