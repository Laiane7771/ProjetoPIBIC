package edu.ifg.formosa.gerente.shared;

import java.io.Serializable;

@SuppressWarnings("serial") 
public class Certificado implements Serializable{
	
	private int idCodigoCertificado;
	private Participante idParticipante;
	private Atividade atividade;
	
	
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
	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	
	
	

}
