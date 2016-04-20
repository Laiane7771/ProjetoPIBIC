package edu.ifg.formosa.principal.shared;

public class Participante {
	
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
