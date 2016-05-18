package edu.ifg.formosa.gerente.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContatoUsuario implements Serializable{
	
	private int idContatoPessoa;
	private String telefonePessoa;
	private String email;
	
	public int getIdContatoPessoa() {
		return idContatoPessoa;
	}
	public void setIdContatoPessoa(int idContatoPessoa) {
		this.idContatoPessoa = idContatoPessoa;
	}
	public String getTelefonePessoa() {
		return telefonePessoa;
	}
	public void setTelefonePessoa(String telefonePessoa) {
		this.telefonePessoa = telefonePessoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
