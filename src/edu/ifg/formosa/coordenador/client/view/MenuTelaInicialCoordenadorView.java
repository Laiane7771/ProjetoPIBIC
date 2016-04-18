package edu.ifg.formosa.coordenador.client.view;


import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MenuTelaInicialCoordenadorView extends Composite{

	private HorizontalPanel hpPainelLogoSiteCoordenador;
	private HorizontalPanel hpPainelNomeCoordenador;
	private HorizontalPanel hpPainelCoordenadorEmAtividades;
	private HorizontalPanel hpPainelCoordenadorEmParticipantes;
	private HorizontalPanel hpPainelCoordenadorEmMonitores;
	private HorizontalPanel hpPainelLogoutCoordenador;
	private VerticalPanel vpPainelGuardaAtividades;
	private VerticalPanel vpPainelGuardaParticipantes;
	private VerticalPanel vpPainelGuardaMonitores;
	private VerticalPanel vpPainelMenuTelaInicialCoordenador;
	private Label lbNomeCoordenadorHome;
	private Label lbAtividadeCoordenador;
	private Label lbParticipanteCoordenador;
	private Label lbMonitoresCoordenador;
	private Label lbLogoutCoordenador;
	private Image iTrocaMenuCoordenador;
	private Image iLogoSiteCoordenador;
	private Image iAvatarCoordenador;
	private Image iAtividadesCoordenador;
	private Image iParticipanteCoordenador;
	private Image iMonitoresCoordenador;
	private Image iLogoutCoordenador;
	

	public MenuTelaInicialCoordenadorView(){
		hpPainelLogoSiteCoordenador = new HorizontalPanel();
		hpPainelLogoSiteCoordenador.setStyleName("hpPainelLogoSiteCoordenador");
		
		iLogoSiteCoordenador = new Image();
		iLogoSiteCoordenador.setStyleName("iLogoSiteCoordenador");
		iLogoSiteCoordenador.setUrl("../Image/logo2.png");
		
		iTrocaMenuCoordenador = new Image();
		iTrocaMenuCoordenador.setUrl("../Image/Menu.png");
		iTrocaMenuCoordenador.setStyleName("iTrocaMenuCoordenador");

		hpPainelLogoSiteCoordenador.add(iLogoSiteCoordenador);//add item
		hpPainelLogoSiteCoordenador.setCellWidth(iLogoSiteCoordenador, "10%");
		hpPainelLogoSiteCoordenador.add(iTrocaMenuCoordenador);//add item
		//----------------------------------------------------------------
		hpPainelNomeCoordenador = new HorizontalPanel();
		hpPainelNomeCoordenador.setStyleName("hpPainelNomeCoordenador");

		iAvatarCoordenador = new Image();
		iAvatarCoordenador.setStyleName("iAvatarCoordenador");
		
		lbNomeCoordenadorHome = new Label("Olá Coordenador fulano!");
		lbNomeCoordenadorHome.setStyleName("lbNomeCoordenadorHome");
		
		hpPainelNomeCoordenador.add(iAvatarCoordenador);//add item
		hpPainelNomeCoordenador.add(lbNomeCoordenadorHome);//add item
		
		///-------------------------------------------------------

		hpPainelCoordenadorEmAtividades = new HorizontalPanel();
		hpPainelCoordenadorEmAtividades.setStyleName("hpPainelCoordenadorEmAtividades");
		
		iAtividadesCoordenador = new Image();
		iAtividadesCoordenador.setStyleName("iAtividadesCoordenador");
		
		lbAtividadeCoordenador = new Label("ATIVIDADES");
		lbAtividadeCoordenador.setStyleName("lbAtividadeCoordenador");
		
		hpPainelCoordenadorEmAtividades.add(iAtividadesCoordenador);//add item
		hpPainelCoordenadorEmAtividades.add(lbAtividadeCoordenador);//add item
		
		//--------------------------------------------------------------
		hpPainelCoordenadorEmParticipantes = new HorizontalPanel();
		hpPainelCoordenadorEmParticipantes.setStyleName("hpPainelCoordenadorEmParticipantes");
		
		iParticipanteCoordenador = new Image();
		iParticipanteCoordenador.setStyleName("iParticipanteCoordenador");

		lbParticipanteCoordenador = new Label("PARTICIPANTE");
		lbParticipanteCoordenador.setStyleName("lbParticipanteCoordenador");
		
		hpPainelCoordenadorEmParticipantes.add(iParticipanteCoordenador);//add item
		hpPainelCoordenadorEmParticipantes.add(lbParticipanteCoordenador);//add item
		//---------------------------------------------------------------
		hpPainelCoordenadorEmMonitores = new HorizontalPanel();
		hpPainelCoordenadorEmMonitores.setStyleName("hpPainelCoordenadorEmMonitores");
		
		iMonitoresCoordenador = new Image();
		iMonitoresCoordenador.setStyleName("iMonitoresCoordenador");
		
		lbMonitoresCoordenador = new Label("MONITORES");
		lbMonitoresCoordenador.setStyleName("lbMonitoresCoordenador");
		
		hpPainelCoordenadorEmMonitores.add(iMonitoresCoordenador);//add item
		hpPainelCoordenadorEmMonitores.add(lbMonitoresCoordenador);//add item
		
		//-------------------------------------------------------------
		hpPainelLogoutCoordenador = new HorizontalPanel();
		hpPainelLogoutCoordenador.setStyleName("hpPainelLogoutCoordenador");

		iLogoutCoordenador = new Image();
		iLogoutCoordenador.setStyleName("iLogoutCoordenador");
		
		lbLogoutCoordenador = new Label("Logout");
		lbLogoutCoordenador.setStyleName("lbLogoutCoordenador");
		
		hpPainelLogoutCoordenador.add(lbLogoutCoordenador); //add item
		
		//-----------------------------------------------------------
		vpPainelGuardaAtividades = new VerticalPanel();
		vpPainelGuardaAtividades.setStyleName("vpPainelGuardaAtividades");
		
		vpPainelGuardaAtividades.add(hpPainelCoordenadorEmAtividades);//add item
		//------------------------------------------------------------
		vpPainelGuardaParticipantes = new VerticalPanel();
		vpPainelGuardaParticipantes.setStyleName("vpPainelGuardaParticipantes");

		vpPainelGuardaParticipantes.add(hpPainelCoordenadorEmParticipantes);//add item
		//-------------------------------------------------------------
		vpPainelGuardaMonitores = new VerticalPanel();
		vpPainelGuardaMonitores.setStyleName("vpPainelGuardaMonitores");
		
		vpPainelGuardaMonitores.add(hpPainelCoordenadorEmMonitores);//add item
		//--------------------------------------------------------------
		vpPainelMenuTelaInicialCoordenador = new VerticalPanel();
		vpPainelMenuTelaInicialCoordenador.setStyleName("vpPainelMenuTelaInicialCoordenador");
		
		vpPainelMenuTelaInicialCoordenador.add(hpPainelLogoSiteCoordenador);//add item
		vpPainelMenuTelaInicialCoordenador.add(hpPainelNomeCoordenador);//add item
		vpPainelMenuTelaInicialCoordenador.add(vpPainelGuardaAtividades);//add item
		vpPainelMenuTelaInicialCoordenador.add(vpPainelGuardaParticipantes);//add itens 
		vpPainelMenuTelaInicialCoordenador.add(vpPainelGuardaMonitores);//add itens
		vpPainelMenuTelaInicialCoordenador.add(hpPainelLogoutCoordenador);//add itens
		
		initWidget(vpPainelMenuTelaInicialCoordenador);//inicializa
		
	}


	public HorizontalPanel getHpPainelLogoSiteCoordenador() {
		return hpPainelLogoSiteCoordenador;
	}


	public void setHpPainelLogoSiteCoordenador(
			HorizontalPanel hpPainelLogoSiteCoordenador) {
		this.hpPainelLogoSiteCoordenador = hpPainelLogoSiteCoordenador;
	}


	public HorizontalPanel getHpPainelNomeCoordenador() {
		return hpPainelNomeCoordenador;
	}


	public void setHpPainelNomeCoordenador(HorizontalPanel hpPainelNomeCoordenador) {
		this.hpPainelNomeCoordenador = hpPainelNomeCoordenador;
	}


	public HorizontalPanel getHpPainelCoordenadorEmAtividades() {
		return hpPainelCoordenadorEmAtividades;
	}


	public void setHpPainelCoordenadorEmAtividades(
			HorizontalPanel hpPainelCoordenadorEmAtividades) {
		this.hpPainelCoordenadorEmAtividades = hpPainelCoordenadorEmAtividades;
	}


	public HorizontalPanel getHpPainelCoordenadorEmParticipantes() {
		return hpPainelCoordenadorEmParticipantes;
	}


	public void setHpPainelCoordenadorEmParticipantes(
			HorizontalPanel hpPainelCoordenadorEmParticipantes) {
		this.hpPainelCoordenadorEmParticipantes = hpPainelCoordenadorEmParticipantes;
	}


	public HorizontalPanel getHpPainelCoordenadorEmMonitores() {
		return hpPainelCoordenadorEmMonitores;
	}


	public void setHpPainelCoordenadorEmMonitores(
			HorizontalPanel hpPainelCoordenadorEmMonitores) {
		this.hpPainelCoordenadorEmMonitores = hpPainelCoordenadorEmMonitores;
	}


	public HorizontalPanel getHpPainelLogoutCoordenador() {
		return hpPainelLogoutCoordenador;
	}


	public void setHpPainelLogoutCoordenador(
			HorizontalPanel hpPainelLogoutCoordenador) {
		this.hpPainelLogoutCoordenador = hpPainelLogoutCoordenador;
	}


	public VerticalPanel getVpPainelGuardaAtividades() {
		return vpPainelGuardaAtividades;
	}


	public void setVpPainelGuardaAtividades(VerticalPanel vpPainelGuardaAtividades) {
		this.vpPainelGuardaAtividades = vpPainelGuardaAtividades;
	}


	public VerticalPanel getVpPainelGuardaParticipantes() {
		return vpPainelGuardaParticipantes;
	}


	public void setVpPainelGuardaParticipantes(
			VerticalPanel vpPainelGuardaParticipantes) {
		this.vpPainelGuardaParticipantes = vpPainelGuardaParticipantes;
	}


	public VerticalPanel getVpPainelGuardaMonitores() {
		return vpPainelGuardaMonitores;
	}


	public void setVpPainelGuardaMonitores(VerticalPanel vpPainelGuardaMonitores) {
		this.vpPainelGuardaMonitores = vpPainelGuardaMonitores;
	}


	public VerticalPanel getVpPainelMenuTelaInicialCoordenador() {
		return vpPainelMenuTelaInicialCoordenador;
	}


	public void setVpPainelMenuTelaInicialCoordenador(
			VerticalPanel vpPainelMenuTelaInicialCoordenador) {
		this.vpPainelMenuTelaInicialCoordenador = vpPainelMenuTelaInicialCoordenador;
	}


	public Label getLbNomeCoordenadorHome() {
		return lbNomeCoordenadorHome;
	}


	public void setLbNomeCoordenadorHome(Label lbNomeCoordenadorHome) {
		this.lbNomeCoordenadorHome = lbNomeCoordenadorHome;
	}


	public Label getLbAtividadeCoordenador() {
		return lbAtividadeCoordenador;
	}


	public void setLbAtividadeCoordenador(Label lbAtividadeCoordenador) {
		this.lbAtividadeCoordenador = lbAtividadeCoordenador;
	}


	public Label getLbParticipanteCoordenador() {
		return lbParticipanteCoordenador;
	}


	public void setLbParticipanteCoordenador(Label lbParticipanteCoordenador) {
		this.lbParticipanteCoordenador = lbParticipanteCoordenador;
	}


	public Label getLbMonitoresCoordenador() {
		return lbMonitoresCoordenador;
	}


	public void setLbMonitoresCoordenador(Label lbMonitoresCoordenador) {
		this.lbMonitoresCoordenador = lbMonitoresCoordenador;
	}


	public Label getLbLogoutCoordenador() {
		return lbLogoutCoordenador;
	}


	public void setLbLogoutCoordenador(Label lbLogoutCoordenador) {
		this.lbLogoutCoordenador = lbLogoutCoordenador;
	}


	public Image getiTrocaMenuCoordenador() {
		return iTrocaMenuCoordenador;
	}


	public void setiTrocaMenuCoordenador(Image iTrocaMenuCoordenador) {
		this.iTrocaMenuCoordenador = iTrocaMenuCoordenador;
	}


	public Image getiLogoSiteCoordenador() {
		return iLogoSiteCoordenador;
	}


	public void setiLogoSiteCoordenador(Image iLogoSiteCoordenador) {
		this.iLogoSiteCoordenador = iLogoSiteCoordenador;
	}


	public Image getiAvatarCoordenador() {
		return iAvatarCoordenador;
	}


	public void setiAvatarCoordenador(Image iAvatarCoordenador) {
		this.iAvatarCoordenador = iAvatarCoordenador;
	}


	public Image getiAtividadesCoordenador() {
		return iAtividadesCoordenador;
	}


	public void setiAtividadesCoordenador(Image iAtividadesCoordenador) {
		this.iAtividadesCoordenador = iAtividadesCoordenador;
	}


	public Image getiParticipanteCoordenador() {
		return iParticipanteCoordenador;
	}


	public void setiParticipanteCoordenador(Image iParticipanteCoordenador) {
		this.iParticipanteCoordenador = iParticipanteCoordenador;
	}


	public Image getiMonitoresCoordenador() {
		return iMonitoresCoordenador;
	}


	public void setiMonitoresCoordenador(Image iMonitoresCoordenador) {
		this.iMonitoresCoordenador = iMonitoresCoordenador;
	}


	public Image getiLogoutCoordenador() {
		return iLogoutCoordenador;
	}


	public void setiLogoutCoordenador(Image iLogoutCoordenador) {
		this.iLogoutCoordenador = iLogoutCoordenador;
	}
	
}

