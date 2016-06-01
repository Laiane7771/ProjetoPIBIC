package edu.ifg.formosa.principal.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Campus implements Serializable {
	
	private int idCampus;
	private String nomeCampus;
	private Endereco idEndereco;
	private Gerente gerente;
	
	
	public int getIdCampus() {
		return idCampus;
	}
	public void setIdCampus(int idCampus) {
		this.idCampus = idCampus;
	}
	public String getNomeCampus() {
		return nomeCampus;
	}
	public void setNomeCampus(String nomeCampus) {
		this.nomeCampus = nomeCampus;
	}
	public Endereco getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Endereco idEndereco) {
		this.idEndereco = idEndereco;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	

}
