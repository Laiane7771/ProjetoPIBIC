package edu.ifg.formosa.gerente.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Participante extends Usuario implements Serializable{
	
	private int Participante;
	private String matricula;

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
	
	

}
