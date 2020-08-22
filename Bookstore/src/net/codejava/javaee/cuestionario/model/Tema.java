package net.codejava.javaee.cuestionario.model;

public class Tema {
	private long id;
	private String tema;

	public Tema(long id, String tema) {
		super();
		this.id = id;
		this.tema = tema;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

}
