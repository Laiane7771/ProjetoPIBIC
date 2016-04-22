package edu.ifg.formosa.principal.shared;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class Presenca implements Serializable{
	
	private int idPresenca;
	private Timestamp horaSaida;
	private Timestamp horaEntrada;
	private Participante idParticipante;
	private Atividade idAtividade;
	public int getIdPresenca() {
		return idPresenca;
	}
	public void setIdPresenca(int idPresenca) {
		this.idPresenca = idPresenca;
	}
	public Timestamp getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(Timestamp horaSaida) {
		this.horaSaida = horaSaida;
	}
	public Timestamp getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(Timestamp horaEntrada) {
		this.horaEntrada = horaEntrada;
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
