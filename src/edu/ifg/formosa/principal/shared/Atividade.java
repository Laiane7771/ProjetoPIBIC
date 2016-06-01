package edu.ifg.formosa.principal.shared;

import java.io.Serializable;
import java.util.Calendar;

@SuppressWarnings("serial")
public class Atividade implements Serializable{
	
	private int idAtividade;
	private String nomeAtividade;
	private String ministrante;
	private Calendar data;
	private Calendar horaInicio;
	private Calendar horaEncerra;
	private int cargaHoraria;
	private int vagasDisponíveis;
	private int numeroVagas;
	private TipoAtividade tipoAtividade;
	private Evento evento;
	
	
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public int getIdAtividade() {
		return idAtividade;
	}
	public void setIdAtividade(int idAtividade) {
		this.idAtividade = idAtividade;
	}
	public String getNomeAtividade() {
		return nomeAtividade;
	}
	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}
	public String getMinistrante() {
		return ministrante;
	}
	public void setMinistrante(String ministrante) {
		this.ministrante = ministrante;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Calendar getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Calendar horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Calendar getHoraEncerra() {
		return horaEncerra;
	}
	public void setHoraEncerra(Calendar horaEncerra) {
		this.horaEncerra = horaEncerra;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public int getVagasDisponíveis() {
		return vagasDisponíveis;
	}
	public void setVagasDisponíveis(int vagasDisponíveis) {
		this.vagasDisponíveis = vagasDisponíveis;
	}
	public int getNumeroVagas() {
		return numeroVagas;
	}
	public void setNumeroVagas(int numeroVagas) {
		this.numeroVagas = numeroVagas;
	}

	public TipoAtividade getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}
	
	
	

}
