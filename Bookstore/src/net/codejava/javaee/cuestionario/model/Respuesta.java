package net.codejava.javaee.cuestionario.model;

public class Respuesta {
	private long id;
	private String respuesta;

	public Respuesta(long id, String respuesta) {
		super();
		this.id = id;
		this.respuesta = respuesta;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
