package edu.ifg.formosa.principal.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Coordenador implements Serializable{
	
	private int idCoordenador;
	private String matriculaSiape;
	private Usuario idUsuario;
	
	
	public int getIdCoordenador() {
		return idCoordenador;
	}
	public void setIdCoordenador(int idCoordenador) {
		this.idCoordenador = idCoordenador;
	}
	public String getMatriculaSiape() {
		return matriculaSiape;
	}
	public void setMatriculaSiape(String matriculaSiape) {
		this.matriculaSiape = matriculaSiape;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	

}
