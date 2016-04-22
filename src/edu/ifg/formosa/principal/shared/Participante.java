package edu.ifg.formosa.principal.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Participante implements Serializable{
	
	private int Participante;
	private String matricula;
	private Usuario idUsuario;
	public int getParticipante() {
		return Participante;
	}
	public void setParticipante(int participante) {
		Participante = participante;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	

}
