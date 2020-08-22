package net.codejava.javaee.cuestionario.model;

public class Pregunta {
	private long id;
	private String pregunta;

	public Pregunta(long id, String pregunta) {
		super();
		this.id = id;
		this.pregunta = pregunta;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

}
