package edu.ifg.formosa.participante.client.view;


import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MenuTelaInicialParticipanteView extends Composite{
	
	private HorizontalPanel hpPainelLogoSiteParticipante;
	private HorizontalPanel hpPainelEspacoNome;
	private HorizontalPanel hpPainelEventoParticipante;
	private HorizontalPanel hpPainelLogoutParticipante;
	private VerticalPanel vpPainelMenuTelaInicialParticipante;
	private VerticalPanel vpPainelEventoParticipante;
	private Image iLogoSiteParticipante;
	private Image iEventoParticipante;
	private Image iLogoutParticipante;
	private Image iMudaMenuParticipante;
	private Label lbNomeParticipanteMenu;
	private Label lbEventoParticipante;
	private Label lbLogoutParticipante;
	
	public MenuTelaInicialParticipanteView(){
		
		//---------------------------------------------
		hpPainelLogoSiteParticipante = new HorizontalPanel();
		hpPainelLogoSiteParticipante.setStyleName("hpPainelLogoSiteParticipante");
		
		iLogoSiteParticipante = new Image();
		iLogoSiteParticipante.setUrl("../Image/logo.png");
		iLogoSiteParticipante.setStyleName("iLogoSiteParticipante");
		
		iMudaMenuParticipante = new Image();
		iMudaMenuParticipante.setUrl("../Image/trocaMenu.jpg");
		iMudaMenuParticipante.setStyleName("iMudaMenuParticipante");
		
		hpPainelLogoSiteParticipante.add(iLogoSiteParticipante); //add item
		hpPainelLogoSiteParticipante.add(iMudaMenuParticipante); //add item
		//---------------------------------------------
		hpPainelEspacoNome = new HorizontalPanel();
		hpPainelEspacoNome.setStyleName("hpPainelEspacoNome");
		
		lbNomeParticipanteMenu = new Label("Olá Fulano");
		lbNomeParticipanteMenu.setStyleName("lbNomeParticipanteMenu");
		
		hpPainelEspacoNome.add(lbNomeParticipanteMenu);//add item
		
		//--------------------------------------------
		hpPainelEventoParticipante = new HorizontalPanel();
		hpPainelEventoParticipante.setStyleName("hpPainelEventoParticipante");
		
		iEventoParticipante = new Image();
		iEventoParticipante.setUrl("../Image/evento2.png");
		iEventoParticipante.setStyleName("iEventoParticipante");
		
		lbEventoParticipante = new Label("Evento");
		lbEventoParticipante.setStyleName("lbEventoParticipante");
		
		hpPainelEventoParticipante.add(iEventoParticipante);//add item
		hpPainelEventoParticipante.add(lbEventoParticipante); //add item
		//----------------------------------------------
		hpPainelLogoutParticipante = new HorizontalPanel();
		hpPainelLogoutParticipante.setStyleName("hpPainelLogoutParticipante");
		
		iLogoutParticipante = new Image();
		iLogoutParticipante.setUrl("../Image/sair2.png");
		iLogoutParticipante.setStyleName("iLogoutParticipante");
		
		lbLogoutParticipante = new Label("Logout");
		lbLogoutParticipante.setStyleName("lbLogoutParticipante");
		
		hpPainelLogoutParticipante.add(iLogoutParticipante);//add item
		hpPainelLogoutParticipante.add(lbLogoutParticipante); //add item
		//----------------------------------------------
		vpPainelEventoParticipante = new VerticalPanel();
		vpPainelEventoParticipante.setStyleName("vpPainelEventoParticipante");
		
		vpPainelEventoParticipante.add(hpPainelEventoParticipante);//add item
		//----------------------------------------------
		vpPainelMenuTelaInicialParticipante = new VerticalPanel();
		vpPainelMenuTelaInicialParticipante.setStyleName("vpPainelMenuTelaInicialParticipante");
		
		vpPainelMenuTelaInicialParticipante.add(hpPainelLogoSiteParticipante);//add item
		vpPainelMenuTelaInicialParticipante.add(hpPainelEspacoNome); //add item
		vpPainelMenuTelaInicialParticipante.add(vpPainelEventoParticipante);//add item
		vpPainelMenuTelaInicialParticipante.add(hpPainelLogoutParticipante);//add item
		
		initWidget(vpPainelMenuTelaInicialParticipante);//inicializa o painel
		
	}

	public HorizontalPanel getHpPainelLogoSiteParticipante() {
		return hpPainelLogoSiteParticipante;
	}

	public void setHpPainelLogoSiteParticipante(
			HorizontalPanel hpPainelLogoSiteParticipante) {
		this.hpPainelLogoSiteParticipante = hpPainelLogoSiteParticipante;
	}

	public HorizontalPanel getHpPainelEspacoNome() {
		return hpPainelEspacoNome;
	}

	public void setHpPainelEspacoNome(HorizontalPanel hpPainelEspacoNome) {
		this.hpPainelEspacoNome = hpPainelEspacoNome;
	}

	public HorizontalPanel getHpPainelEventoParticipante() {
		return hpPainelEventoParticipante;
	}

	public void setHpPainelEventoParticipante(
			HorizontalPanel hpPainelEventoParticipante) {
		this.hpPainelEventoParticipante = hpPainelEventoParticipante;
	}

	public HorizontalPanel getHpPainelLogoutParticipante() {
		return hpPainelLogoutParticipante;
	}

	public void setHpPainelLogoutParticipante(
			HorizontalPanel hpPainelLogoutParticipante) {
		this.hpPainelLogoutParticipante = hpPainelLogoutParticipante;
	}

	public VerticalPanel getVpPainelMenuTelaInicialParticipante() {
		return vpPainelMenuTelaInicialParticipante;
	}

	public void setVpPainelMenuTelaInicialParticipante(
			VerticalPanel vpPainelMenuTelaInicialParticipante) {
		this.vpPainelMenuTelaInicialParticipante = vpPainelMenuTelaInicialParticipante;
	}

	public VerticalPanel getVpPainelEventoParticipante() {
		return vpPainelEventoParticipante;
	}

	public void setVpPainelEventoParticipante(
			VerticalPanel vpPainelEventoParticipante) {
		this.vpPainelEventoParticipante = vpPainelEventoParticipante;
	}

	public Image getiLogoSiteParticipante() {
		return iLogoSiteParticipante;
	}

	public void setiLogoSiteParticipante(Image iLogoSiteParticipante) {
		this.iLogoSiteParticipante = iLogoSiteParticipante;
	}

	public Image getiEventoParticipante() {
		return iEventoParticipante;
	}

	public void setiEventoParticipante(Image iEventoParticipante) {
		this.iEventoParticipante = iEventoParticipante;
	}

	public Image getiLogoutParticipante() {
		return iLogoutParticipante;
	}

	public void setiLogoutParticipante(Image iLogoutParticipante) {
		this.iLogoutParticipante = iLogoutParticipante;
	}

	public Label getLbNomeParticipanteMenu() {
		return lbNomeParticipanteMenu;
	}

	public void setLbNomeParticipanteMenu(Label lbNomeParticipanteMenu) {
		this.lbNomeParticipanteMenu = lbNomeParticipanteMenu;
	}

	public Label getLbEventoParticipante() {
		return lbEventoParticipante;
	}

	public void setLbEventoParticipante(Label lbEventoParticipante) {
		this.lbEventoParticipante = lbEventoParticipante;
	}

	public Label getLbLogoutParticipante() {
		return lbLogoutParticipante;
	}

	public void setLbLogoutParticipante(Label lbLogoutParticipante) {
		this.lbLogoutParticipante = lbLogoutParticipante;
	}

}
