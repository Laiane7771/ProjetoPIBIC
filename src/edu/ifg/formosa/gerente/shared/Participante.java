package edu.ifg.formosa.gerente.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Participante implements Serializable{
	
	private int Participante;
	private String matricula;
	private Usuario usuario;
	
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
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
