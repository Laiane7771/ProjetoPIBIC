package edu.ifg.formosa.gerente.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Administrador implements Serializable{
	
	private int idAdministrador;
	private Usuario usuario;
	private String matriculaSiape;
	
	
	public int getIdAdministrador() {
		return idAdministrador;
	}
	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getMatriculaSiape() {
		return matriculaSiape;
	}
	public void setMatriculaSiape(String matriculaSiape) {
		this.matriculaSiape = matriculaSiape;
	}
	
	

}
