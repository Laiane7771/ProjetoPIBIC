package edu.ifg.formosa.principal.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Gerente  implements Serializable{
	
	private int idGerente;
	private String matriculaSiape;
	private Usuario idUsuario;
	public int getIdGerente() {
		return idGerente;
	}
	public void setIdGerente(int idGerente) {
		this.idGerente = idGerente;
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
