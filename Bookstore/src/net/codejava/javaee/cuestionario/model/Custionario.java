package net.codejava.javaee.cuestionario.model;

public class Custionario {

	private long id;
	private Tema tema;
	private Pregunta preg;
	private Respuesta resp;
	private long status;

	public Custionario(long id, Tema tema, Pregunta preg, Respuesta resp, long status) {
		super();
		this.id = id;
		this.tema = tema;
		this.preg = preg;
		this.resp = resp;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Pregunta getPreg() {
		return preg;
	}

	public void setPreg(Pregunta preg) {
		this.preg = preg;
	}

	public Respuesta getResp() {
		return resp;
	}

	public void setResp(Respuesta resp) {
		this.resp = resp;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

}
