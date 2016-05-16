package edu.ifg.formosa.gerente.shared;

import java.io.Serializable;

@SuppressWarnings("serial") 
public class TipoAtividade implements Serializable{
 
	private int tipoAtivi;
	private String tipoAtividade;
	
	public int getTipoAtivi() {
		return tipoAtivi;
	}
	public void setTipoAtivi(int tipoAtivi) {
		this.tipoAtivi = tipoAtivi;
	}
	public String getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(String tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}
	
	
}
