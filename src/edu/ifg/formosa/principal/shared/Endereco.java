package edu.ifg.formosa.principal.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Endereco  extends Cidade implements Serializable{
	
	private int idEndereco;
	private String endereco;
	private String numero;
	private String bairro;
	private String cep;
	private String localDoEvento;
	
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalDoEvento() {
		return localDoEvento;
	}
	public void setLocalDoEvento(String localDoEvento) {
		this.localDoEvento = localDoEvento;
	}

	

}
