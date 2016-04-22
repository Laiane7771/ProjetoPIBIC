package edu.ifg.formosa.principal.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Usuario implements Serializable{
	
	private int idUsuario;
	private String tipoUsuario;
	private String cpf;
	private String rg;
	private String senha;
	private Endereco idEndereco;
	private ContatoUsuario idContatoPessoa;
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Endereco getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Endereco idEndereco) {
		this.idEndereco = idEndereco;
	}
	public ContatoUsuario getIdContatoPessoa() {
		return idContatoPessoa;
	}
	public void setIdContatoPessoa(ContatoUsuario idContatoPessoa) {
		this.idContatoPessoa = idContatoPessoa;
	}
	
	
	
	

}
