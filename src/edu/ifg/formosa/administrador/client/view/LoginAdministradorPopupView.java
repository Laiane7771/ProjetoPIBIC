package edu.ifg.formosa.administrador.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LoginAdministradorPopupView extends DialogBox{
	
	private VerticalPanel vpPainelLogineSenha;
	private Button btnBotaoLogin;
	private TextBox tbLoginAdm;
	private PasswordTextBox pssTbSenhaLoginAdm;
	private Label lbTituloPopupLoginAdm;
	private Button btnFecharLoginAdm;
	
	public LoginAdministradorPopupView(){
		
		this.setStyleName("dialogboxLoginAdm");
		
		vpPainelLogineSenha  = new VerticalPanel();
		vpPainelLogineSenha.setStyleName("vpPainelLogineSenha");
	
		lbTituloPopupLoginAdm = new Label("Login Administrador");
		lbTituloPopupLoginAdm.setStyleName("lbTituloPopupLoginAdm");
		
		tbLoginAdm = new TextBox();
		tbLoginAdm.setText("Login");
		tbLoginAdm.setStyleName("tbLoginAdm");
		
		pssTbSenhaLoginAdm = new PasswordTextBox();
		pssTbSenhaLoginAdm.setText("Senha");
		pssTbSenhaLoginAdm.setStyleName("pssTbSenhaLoginAdm");
		
		btnBotaoLogin = new Button("Login");
		btnBotaoLogin.setStyleName("btnBotaoLogin");
		
		
		vpPainelLogineSenha.add(lbTituloPopupLoginAdm);//add item
		vpPainelLogineSenha.add(tbLoginAdm);//add item
		vpPainelLogineSenha.add(pssTbSenhaLoginAdm);//add item
		vpPainelLogineSenha.add(btnBotaoLogin);//add item
		
		
		this.add(vpPainelLogineSenha);
		this.show();
		this.setGlassEnabled(true);
		this.setModal(false);
		this.setAnimationEnabled(true);
		
	}

	public VerticalPanel getVpPainelLogineSenha() {
		return vpPainelLogineSenha;
	}

	public void setVpPainelLogineSenha(VerticalPanel vpPainelLogineSenha) {
		this.vpPainelLogineSenha = vpPainelLogineSenha;
	}

	public Button getBtnBotaoLogin() {
		return btnBotaoLogin;
	}

	public void setBtnBotaoLogin(Button btnBotaoLogin) {
		this.btnBotaoLogin = btnBotaoLogin;
	}

	public TextBox getTbLoginAdm() {
		return tbLoginAdm;
	}

	public void setTbLoginAdm(TextBox tbLoginAdm) {
		this.tbLoginAdm = tbLoginAdm;
	}

	public PasswordTextBox getPssTbSenhaLoginAdm() {
		return pssTbSenhaLoginAdm;
	}

	public void setPssTbSenhaLoginAdm(PasswordTextBox pssTbSenhaLoginAdm) {
		this.pssTbSenhaLoginAdm = pssTbSenhaLoginAdm;
	}

}
