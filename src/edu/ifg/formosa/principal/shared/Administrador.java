package edu.ifg.formosa.principal.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Administrador implements Serializable{
	
	private int idAdministrador;
	private Usuario idUsuario;
	private String matriculaSiape;
	
	
	public int getIdAdministrador() {
		return idAdministrador;
	}
	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getMatriculaSiape() {
		return matriculaSiape;
	}
	public void setMatriculaSiape(String matriculaSiape) {
		this.matriculaSiape = matriculaSiape;
	}
	
	

}
