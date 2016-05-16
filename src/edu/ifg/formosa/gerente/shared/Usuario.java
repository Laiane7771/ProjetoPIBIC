package edu.ifg.formosa.gerente.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Usuario implements Serializable{
	
	private int idUsuario;
	private String tipoUsuario;
	private String nome;
	private String cpf;
	private String rg;
	private String senha;
	private Endereco endereco;
	private ContatoUsuario contatoPessoa;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public ContatoUsuario getContatoPessoa() {
		return contatoPessoa;
	}
	public void setContatoPessoa(ContatoUsuario contatoPessoa) {
		this.contatoPessoa = contatoPessoa;
	}
	
}
