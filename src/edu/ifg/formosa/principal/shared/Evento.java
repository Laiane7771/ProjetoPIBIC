package edu.ifg.formosa.principal.shared;

import java.io.Serializable;
import java.util.Calendar;

@SuppressWarnings("serial")
public class Evento implements Serializable {
	
	private int idEvento;
	private String nomeEvento;
	private String descricao;
	private String dataInicio;
	private String dataEncerra;
	private String telefoneContato;
	private String emailContato;
	private String organizador;
	private  String dataHoraCertificado;
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
	
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataEncerra() {
		return dataEncerra;
	}
	public void setDataEncerra(String dataEncerra) {
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
	
	public String getDataHoraCertificado() {
		return dataHoraCertificado;
	}
	public void setDataHoraCertificado(String dataHoraCertificado) {
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
