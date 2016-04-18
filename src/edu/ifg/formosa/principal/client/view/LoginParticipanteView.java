package edu.ifg.formosa.principal.client.view;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class LoginParticipanteView extends DialogBox{
	
	private HorizontalPanel hpPainelPai;
	private VerticalPanel vpAreaLogin;
	private VerticalPanel vpAreaFoto;
	private HorizontalPanel hpAreaBotoes;
	private TextBox tbNome;
	private PasswordTextBox tbSenha;
	private Button btnLogin;
	private Button btnVoltar;
	private Button btnFecharLogin;
	private Image iLogoemLogin;
	private Label lbLoginemLogin;
	private Label lbSenhaemLogin;
	
	public LoginParticipanteView(){
		
		this.setStyleName("DialogBoxLoginView");
		hpPainelPai = new HorizontalPanel();
		hpPainelPai.setStyleName("hpPainelPai");
		
		vpAreaLogin = new VerticalPanel();
		vpAreaLogin.setStyleName("vpAreaLogin");
	
		lbLoginemLogin = new Label("Login:");
		lbLoginemLogin.setStyleName("lbLoginemLogin");
	
		tbNome = new TextBox();
		tbNome.setStyleName("tbNome");
		
		lbSenhaemLogin = new Label("Senha:");
		lbSenhaemLogin.setStyleName("lbSenhaemLogin");
		
		tbSenha = new PasswordTextBox();
		tbSenha.setStyleName("tbSenha");
		
		hpAreaBotoes = new HorizontalPanel();
		hpAreaBotoes.setStyleName("hpAreaBotoes");
		
		vpAreaLogin.add(lbLoginemLogin);
		vpAreaLogin.setCellWidth(lbLoginemLogin, "20%");
		vpAreaLogin.add(tbNome);
		vpAreaLogin.setCellWidth(tbNome, "20%");
		vpAreaLogin.add(lbSenhaemLogin);
		vpAreaLogin.setCellWidth(lbSenhaemLogin, "20%");
		vpAreaLogin.add(tbSenha);
		vpAreaLogin.setCellWidth(tbSenha, "20%");
		vpAreaLogin.add(hpAreaBotoes);
		vpAreaLogin.setCellWidth(hpAreaBotoes, "20%");
		
		btnLogin = new Button("Login");
		btnLogin.setStyleName("btnLogin");
		
		btnVoltar = new Button("Voltar");
		btnVoltar.setStyleName("btnVoltar");
		
		btnFecharLogin = new Button("x");
		btnFecharLogin.setStyleName("btnFecharLogin");
		
		
		hpAreaBotoes.add(btnLogin);
		hpAreaBotoes.setCellWidth(btnLogin, "5%");
		hpAreaBotoes.add(btnVoltar);
		
		vpAreaFoto = new VerticalPanel();
		vpAreaFoto.setStyleName("vpAreaFoto");
		
		
		iLogoemLogin = new Image();
		iLogoemLogin.setUrl("../Image/logo.png");
		iLogoemLogin.setStyleName("iLogoemLogin");
		
		vpAreaFoto.add(btnFecharLogin);
		vpAreaFoto.add(iLogoemLogin);
		
		hpPainelPai.add(vpAreaLogin);
		hpPainelPai.add(vpAreaFoto);
		
		
		this.setModal(true);
		this.add(hpPainelPai);
		this.center();
		this.show();
	}

	public HorizontalPanel getHpPainelPai() {
		return hpPainelPai;
	}

	public void setHpPainelPai(HorizontalPanel hpPainelPai) {
		this.hpPainelPai = hpPainelPai;
	}

	public VerticalPanel getVpAreaLogin() {
		return vpAreaLogin;
	}

	public void setVpAreaLogin(VerticalPanel vpAreaLogin) {
		this.vpAreaLogin = vpAreaLogin;
	}

	public VerticalPanel getVpAreaFoto() {
		return vpAreaFoto;
	}

	public void setVpAreaFoto(VerticalPanel vpAreaFoto) {
		this.vpAreaFoto = vpAreaFoto;
	}

	public HorizontalPanel getHpAreaBotoes() {
		return hpAreaBotoes;
	}

	public void setHpAreaBotoes(HorizontalPanel hpAreaBotoes) {
		this.hpAreaBotoes = hpAreaBotoes;
	}

	public TextBox getTbNome() {
		return tbNome;
	}

	public void setTbNome(TextBox tbNome) {
		this.tbNome = tbNome;
	}

	

	public PasswordTextBox getTbSenha() {
		return tbSenha;
	}

	public void setTbSenha(PasswordTextBox tbSenha) {
		this.tbSenha = tbSenha;
	}

	public Label getLbLoginemLogin() {
		return lbLoginemLogin;
	}

	public void setLbLoginemLogin(Label lbLoginemLogin) {
		this.lbLoginemLogin = lbLoginemLogin;
	}

	public Label getLbSenhaemLogin() {
		return lbSenhaemLogin;
	}

	public void setLbSenhaemLogin(Label lbSenhaemLogin) {
		this.lbSenhaemLogin = lbSenhaemLogin;
	}

	public Button getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(Button btnLogin) {
		this.btnLogin = btnLogin;
	}

	public Button getBtnVoltar() {
		return btnVoltar;
	}

	public void setBtnVoltar(Button btnVoltar) {
		this.btnVoltar = btnVoltar;
	}

	

	public Button getBtnFecharLogin() {
		return btnFecharLogin;
	}

	public void setBtnFecharLogin(Button btnFecharLogin) {
		this.btnFecharLogin = btnFecharLogin;
	}

	public Image getiLogoemLogin() {
		return iLogoemLogin;
	}

	public void setiLogoemLogin(Image iLogoemLogin) {
		this.iLogoemLogin = iLogoemLogin;
	}
	
	
}
