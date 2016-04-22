package edu.ifg.formosa.principal.shared;

import java.io.Serializable;

@SuppressWarnings("serial") 
public class Certificado implements Serializable{
	
	private int idCodigoCertificado;
	private Participante idParticipante;
	private Atividade idAtividade;
	
	
	public int getIdCodigoCertificado() {
		return idCodigoCertificado;
	}
	public void setIdCodigoCertificado(int idCodigoCertificado) {
		this.idCodigoCertificado = idCodigoCertificado;
	}
	public Participante getIdParticipante() {
		return idParticipante;
	}
	public void setIdParticipante(Participante idParticipante) {
		this.idParticipante = idParticipante;
	}
	public Atividade getIdAtividade() {
		return idAtividade;
	}
	public void setIdAtividade(Atividade idAtividade) {
		this.idAtividade = idAtividade;
	}
	
	

}
