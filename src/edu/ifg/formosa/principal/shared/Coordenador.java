package edu.ifg.formosa.principal.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Coordenador extends Usuario implements Serializable{
	
	private int idCoordenador;
	private String matriculaSiape;
	

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
	
	
}
