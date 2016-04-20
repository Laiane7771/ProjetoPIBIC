package edu.ifg.formosa.principal.shared;

public class enderecoUsuario {
	
	private int idEnderecoPessoa; 
	private String numero;
	private String bairro;
	private String cep;
	private Cidade idCidade;
	
	
	public int getIdEnderecoPessoa() {
		return idEnderecoPessoa;
	}
	public void setIdEnderecoPessoa(int idEnderecoPessoa) {
		this.idEnderecoPessoa = idEnderecoPessoa;
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
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Cidade getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(Cidade idCidade) {
		this.idCidade = idCidade;
	}
	
	

}
