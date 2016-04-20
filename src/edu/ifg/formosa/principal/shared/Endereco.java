package edu.ifg.formosa.principal.shared;

public class Endereco {
	
	private int idEndereco;
	private String numero;
	private String bairro;
	private String cep;
	private String localDoEvento;
	private Cidade idCidade;
	
	
	
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
	public Cidade getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(Cidade idCidade) {
		this.idCidade = idCidade;
	}
	
	

}
