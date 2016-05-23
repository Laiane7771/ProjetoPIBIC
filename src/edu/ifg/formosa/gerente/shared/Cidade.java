package edu.ifg.formosa.gerente.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cidade extends Estado implements Serializable{
	
	private int idCidade;
	private String nomeCidade;
	

	public int getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	
	

}
