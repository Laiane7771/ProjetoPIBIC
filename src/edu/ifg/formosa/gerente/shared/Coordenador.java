package edu.ifg.formosa.gerente.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Coordenador implements Serializable{
	
	private int idCoordenador;
	private String matriculaSiape;
	private Usuario usuario;
	
	
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
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
