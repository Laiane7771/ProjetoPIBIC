package edu.ifg.formosa.principal.shared;

import java.util.Calendar;

public class Evento {
	
	private int idEvento;
	private String nomeEvento;
	private String descricao;
	private Calendar dataInicio;
	private Calendar dataEncerra;
	private String telefoneContato;
	private String emailContato;
	private String organizador;
	private Calendar dataHoraCertificado;
	private Gerente idGerente;
	private Endereco idEndereco;
	
	
	
	public String getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataEncerra() {
		return dataEncerra;
	}
	public void setDataEncerra(Calendar dataEncerra) {
		this.dataEncerra = dataEncerra;
	}
	public String getEmailContato() {
		return emailContato;
	}
	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}
	public String getOrganizador() {
		return organizador;
	}
	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}
	public Calendar getDataHoraCertificado() {
		return dataHoraCertificado;
	}
	public void setDataHoraCertificado(Calendar dataHoraCertificado) {
		this.dataHoraCertificado = dataHoraCertificado;
	}
	public Gerente getIdGerente() {
		return idGerente;
	}
	public void setIdGerente(Gerente idGerente) {
		this.idGerente = idGerente;
	}
	public Endereco getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Endereco idEndereco) {
		this.idEndereco = idEndereco;
	}
	
	
	

}
