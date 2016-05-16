package edu.ifg.formosa.gerente.client.view;


import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.ifg.formosa.gerente.client.presenter.SubMenusGerentePresenter;

public class MenuTelaInicialGerenteView extends Composite {
	
	private VerticalPanel vpMenu;
	private HorizontalPanel hpEspacoLogoMenu;
	private HorizontalPanel hpEspacoNomeGerente;
	private Image iMenu;
	private Image iLogo;
	private Label lbEvento;
	private HorizontalPanel hplbEvento;
	private Label lbCoordenadores;
	private HorizontalPanel hplbCoordenadores;
	private Label lbParticipantes;
	private HorizontalPanel hplbParticipantes;
	private Label lbSair;
	private HorizontalPanel hplbSair;
	private Image iEvento;
	private Image iCoordenador;
	private Image iParticipantes;
	private Image iSair;
	private Image iEvento2;
	private Image iCoordenador2;
	private Image iParticipantes2;
	private Image iSair2;
	private VerticalPanel vpsubItem1;
	private Label lbAdicionarEvento;
	private Label lbSetaCimaE;
	private Label lbSetaCimaC;
	private Label lbSetaCimaP;
	private VerticalPanel vpAdicionaItensEvento;
	private VerticalPanel vpAdicionaItensCoordenador;
	private VerticalPanel vpAdicionaItensParticipante;
	
	
	public MenuTelaInicialGerenteView(){
		
		vpMenu = new VerticalPanel(); //Primeiro Painel de menus;
		vpMenu.addStyleName("vpMenu");
		
		hpEspacoLogoMenu = new HorizontalPanel();
		hpEspacoLogoMenu.setStyleName("hpEspacoLogoMenu");
		
		iLogo = new Image();
		iLogo.setUrl("../Image/logo2.png");
		iLogo.setStyleName("iLogo");
		
		iMenu = new Image();
		iMenu.setUrl("../Image/trocaMenu.jpg");
		iMenu.setStyleName("iMenu");
	
		hpEspacoLogoMenu.add(iLogo); // adiciona elemento
		hpEspacoLogoMenu.setCellWidth(iLogo, "25%");
		hpEspacoLogoMenu.add(iMenu); // adiciona elemento
		
		hpEspacoNomeGerente = new HorizontalPanel();
		hpEspacoNomeGerente.setStyleName("hpEspacoNomeGerente");
		
		Label nomeGerente = new Label("Laiane Ricardo");
		
		hpEspacoNomeGerente.add(nomeGerente);
		
		lbEvento = new Label("EVENTO");
		lbEvento.setStyleName("lbEvento");
		
		iEvento = new Image();
		iEvento.setUrl("../Image/evento2.png");
		iEvento.setStyleName("iEvento");
		
		iEvento2 = new Image();
		iEvento2.setUrl("../Image/evento.jpg");
		iEvento2.setStyleName("iEvento2");
		
		hplbEvento = new HorizontalPanel();
		hplbEvento.setStyleName("hplbEvento");
		
		lbSetaCimaE = new Label(">");
		lbSetaCimaE.setStyleName("lbSetaCimaE");
		
		hplbEvento.add(iEvento);
		hplbEvento.setCellWidth(iEvento, "10%");
		hplbEvento.add(lbEvento);
		hplbEvento.setCellWidth(lbEvento, "50%");
		hplbEvento.setHorizontalAlignment(VerticalPanel.ALIGN_CENTER);
		hplbEvento.add(lbSetaCimaE);
		hplbEvento.setCellWidth(lbSetaCimaE, "10%");
		
		vpAdicionaItensEvento = new VerticalPanel();
		vpAdicionaItensEvento.setStyleName("vpAdicionaItensEvento");
		
		vpAdicionaItensEvento.add(hplbEvento);
		
		lbCoordenadores = new Label("COORDENADORES");
		lbCoordenadores.setStyleName("lbCoordenadores");
		
		iCoordenador = new Image();
		iCoordenador.setUrl("../Image/coordenador2.png");
		iCoordenador.setStyleName("iCoordenador");
		
		iCoordenador2 = new Image();
		iCoordenador2.setUrl("../Image/coordenador.jpg");
		iCoordenador2.setStyleName("iCoordenador2");
		
		lbSetaCimaC = new Label(">");
		lbSetaCimaC.setStyleName("lbSetaCimaC");
		
		vpAdicionaItensCoordenador = new VerticalPanel();
		vpAdicionaItensCoordenador.setStyleName("vpAdicionaItensCoordenador");
		
		hplbCoordenadores = new HorizontalPanel();
		hplbCoordenadores.setStyleName("hplbCoordenadores");
		
		hplbCoordenadores.add(iCoordenador); // adiciona elemento
		hplbCoordenadores.setCellWidth(iCoordenador, "10%");
		hplbCoordenadores.add(lbCoordenadores); // adiciona elemento
		hplbCoordenadores.setCellWidth(lbCoordenadores, "30%");
		hplbCoordenadores.add(lbSetaCimaC);
		hplbCoordenadores.setCellWidth(lbSetaCimaC, "10%");
		hplbCoordenadores.setHorizontalAlignment(VerticalPanel.ALIGN_CENTER);
		
		vpAdicionaItensCoordenador.add(hplbCoordenadores);
		
		lbParticipantes = new Label("PARTICIPANTES");
		lbParticipantes.setStyleName("lbParticipantes");
		
		iParticipantes = new Image();
		iParticipantes.setUrl("../Image/participante2.png");
		iParticipantes.setStyleName("iParticipantes");
		
		iParticipantes2 = new Image();
		iParticipantes2.setUrl("../Image/participantes.jpg");
		iParticipantes2.setStyleName("iParticipantes2");
		
		lbSetaCimaP = new Label(">");
		lbSetaCimaP.setStyleName("lbSetaCimaP");
		
		hplbParticipantes = new HorizontalPanel();
		hplbParticipantes.setStyleName("hplbParticipantes");
		
		hplbParticipantes.add(iParticipantes); // adiciona elemento
		hplbParticipantes.setCellWidth(iParticipantes, "10%");
		hplbParticipantes.add(lbParticipantes); // adiciona elemento
		hplbParticipantes.setCellWidth(lbParticipantes, "30%");
		hplbParticipantes.add(lbSetaCimaP);
		hplbParticipantes.setCellWidth(lbSetaCimaP, "10%");
		hplbParticipantes.setHorizontalAlignment(VerticalPanel.ALIGN_CENTER);
		
		vpAdicionaItensParticipante = new VerticalPanel();
		vpAdicionaItensParticipante.setStyleName("vpAdicionaItensParticipante");
		
		vpAdicionaItensParticipante.add(hplbParticipantes);
		
		lbSair = new Label("Logout");
		lbSair.setStyleName("lbSair");
		
		iSair = new Image();
		iSair.setUrl("../Image/sair2.png");
		iSair.setStyleName("iSair");
		
		iSair2 = new Image();
		iSair2.setUrl("../Image/sair.png");
		iSair2.setStyleName("iSair2");
	
		hplbSair = new HorizontalPanel();
		hplbSair.setStyleName("hplbSair");
		hplbSair.add(iSair); // adiciona elemento
		hplbSair.setCellWidth(iSair, "10%");
		hplbSair.add(lbSair); // adiciona elemento
		hplbSair.setCellWidth(lbSair, "45%");
		hplbSair.setHorizontalAlignment(VerticalPanel.ALIGN_CENTER);
		
		vpMenu.add(hpEspacoLogoMenu);// adiciona elemento
		vpMenu.setCellHeight(hpEspacoLogoMenu, "20%");
		vpMenu.add(vpAdicionaItensEvento); // adiciona elemento
		vpMenu.setCellHeight(vpAdicionaItensEvento, "5%");
		vpMenu.add(vpAdicionaItensEvento ); // adiciona elemento
		vpMenu.setCellHeight(hplbEvento, "5%");
		vpMenu.add(vpAdicionaItensCoordenador);// adiciona elemento
		vpMenu.setCellHeight(vpAdicionaItensCoordenador, "5%");
		vpMenu.add(vpAdicionaItensParticipante);// adiciona elemento
		vpMenu.setCellHeight(vpAdicionaItensParticipante, "5%");
		vpMenu.add(hplbSair);// adiciona elemento
		
		initWidget(vpMenu);
	}

	public void apagaLabelMenus(){
		
		vpMenu.clear();
		getVpMenu().setWidth("2%");
		hpEspacoLogoMenu.clear();
		hpEspacoLogoMenu.add(iMenu);
		
		hplbEvento.clear();
		hplbEvento.removeStyleName("hplbEvento");
		hplbEvento.removeStyleName("hplbEventoVoltaMenu");
		hplbEvento.add(iEvento);
		
		vpAdicionaItensEvento.removeStyleName("vpAdicionaItensEvento");
		vpAdicionaItensEvento.add(hplbEvento);
		
		hplbCoordenadores.clear();
		
		hplbCoordenadores.removeStyleName("hplbCoordenadores");
		hplbCoordenadores.removeStyleName("hplbCoordenadoresVoltaMenu");
		hplbCoordenadores.add(iCoordenador);
		
		vpAdicionaItensCoordenador.removeStyleName("vpAdicionaItensCoordenador");
		vpAdicionaItensCoordenador.add(hplbCoordenadores);
		
		hplbParticipantes.clear();
		hplbParticipantes.removeStyleName("hplbParticipantes");
		hplbParticipantes.removeStyleName("hplbParticipantesVoltaMenu");
		hplbParticipantes.add(iParticipantes);
		
		vpAdicionaItensParticipante.removeStyleName("vpAdicionaItensParticipante");
		vpAdicionaItensParticipante.add(hplbParticipantes);
		
		hplbSair.clear();
		hplbSair.removeStyleName("hplbSair");
		hplbSair.add(iSair);
		
		getiMenu().addStyleName("iMenuReduzido");
		getiEvento().addStyleName("iEventoReduzido");
		getiCoordenador().addStyleName("iCoordenadorReduzido");
		getiParticipantes().addStyleName("iParticipanteReduzido");
		getiSair().addStyleName("iSairReduzido");
		
		vpMenu.add(hpEspacoLogoMenu);
		vpMenu.add(vpAdicionaItensEvento);
		vpMenu.add(vpAdicionaItensCoordenador);
		vpMenu.add(vpAdicionaItensParticipante);
		vpMenu.add(hplbSair);
		
		
	}
	
	public void voltaMenu(){
		
		vpAdicionaItensEvento.clear();
		vpAdicionaItensCoordenador.clear();
		vpAdicionaItensParticipante.clear();
		vpMenu.clear();
		vpMenu.setWidth("15%");
		
		
		
		vpAdicionaItensEvento.addStyleName("vpAdicionaItensEvento");
		vpAdicionaItensCoordenador.addStyleName("vpAdicionaItensCoordenador");
		vpAdicionaItensParticipante.addStyleName("vpAdicionaItensParticipante");
		
		hpEspacoLogoMenu.add(iLogo);
		hpEspacoLogoMenu.add(iMenu);
		
		hplbEvento.addStyleName("hplbEventoVoltaMenu");
		hplbCoordenadores.addStyleName("hplbCoordenadoresVoltaMenu");
		hplbParticipantes.addStyleName("hplbParticipantesVoltaMenu");
		
		lbEvento.addStyleName("lbEventoVoltaMenu");
		lbCoordenadores.addStyleName("lbCoordenadoresVoltaMenu");
		lbParticipantes.addStyleName("lbParticipantesVoltaMenu");
		
		iEvento.addStyleName("iEventoVoltaMenu");
		iCoordenador.addStyleName("iCoordenadorVoltaMenu");
		iParticipantes.addStyleName("iParticipantesVoltaMenu");
		
		lbSetaCimaE.addStyleName("lbSetaCimaEVoltaMenu");
		lbSetaCimaC.addStyleName("lbSetaCimaCVoltaMenu");
		lbSetaCimaP.addStyleName("lbSetaCimaPVoltaMenu");
		
		hplbEvento.add(iEvento);
		hplbEvento.setCellWidth(iEvento, "10%");
		hplbEvento.add(lbEvento);
		hplbEvento.setCellWidth(lbEvento, "50%");
		hplbEvento.add(lbSetaCimaE);
		hplbEvento.setCellWidth(lbSetaCimaE, "10%");
		
		vpAdicionaItensEvento.add(hplbEvento);
		
		hplbCoordenadores.add(iCoordenador);
		hplbCoordenadores.setCellWidth(iCoordenador, "10%");
		hplbCoordenadores.add(lbCoordenadores);
		hplbCoordenadores.setCellWidth(lbCoordenadores, "30%");
		hplbCoordenadores.add(lbSetaCimaC);
		hplbCoordenadores.setCellWidth(lbSetaCimaC, "10%");
		
		vpAdicionaItensCoordenador.add(hplbCoordenadores);
		
		hplbParticipantes.add(iParticipantes);
		hplbParticipantes.setCellWidth(iParticipantes, "10%");
		hplbParticipantes.add(lbParticipantes);
		hplbParticipantes.setCellWidth(lbParticipantes, "30%");
		hplbParticipantes.add(lbSetaCimaP);
		hplbParticipantes.setCellWidth(lbSetaCimaP, "10%");
		
		vpAdicionaItensParticipante.add(hplbParticipantes);
		hplbSair.add(iSair);
		hplbSair.setCellWidth(iSair, "10%");
		hplbSair.add(lbSair);
		hplbSair.setCellWidth(lbSair, "45%");
		
		hplbEvento.addStyleName("hplbEvento");
		hplbCoordenadores.addStyleName("hplbCoordenadores");
		hplbParticipantes.addStyleName("hplbParticipantes");
		hplbSair.addStyleName("hplbSair");
		
		vpMenu.add(hpEspacoLogoMenu);
		vpMenu.add(vpAdicionaItensEvento);
		vpMenu.add(vpAdicionaItensCoordenador);
		vpMenu.add(vpAdicionaItensParticipante);
		vpMenu.add(hplbSair);
		
		
	}

	public VerticalPanel getVpMenu() {
		return vpMenu;
	}


	public void setVpMenu(VerticalPanel vpMenu) {
		this.vpMenu = vpMenu;
	}


	public HorizontalPanel getHpEspacoLogoMenu() {
		return hpEspacoLogoMenu;
	}


	public void setHpEspacoLogoMenu(HorizontalPanel hpEspacoLogoMenu) {
		this.hpEspacoLogoMenu = hpEspacoLogoMenu;
	}


	public HorizontalPanel getHpEspacoNomeGerente() {
		return hpEspacoNomeGerente;
	}


	public void setHpEspacoNomeGerente(HorizontalPanel hpEspacoNomeGerente) {
		this.hpEspacoNomeGerente = hpEspacoNomeGerente;
	}


	public Image getiMenu() {
		return iMenu;
	}


	public void setiMenu(Image iMenu) {
		this.iMenu = iMenu;
	}


	public Image getiLogo() {
		return iLogo;
	}


	public void setiLogo(Image iLogo) {
		this.iLogo = iLogo;
	}


	public Label getLbEvento() {
		return lbEvento;
	}


	public void setLbEvento(Label lbEvento) {
		this.lbEvento = lbEvento;
	}


	public HorizontalPanel getHplbEvento() {
		return hplbEvento;
	}


	public void setHplbEvento(HorizontalPanel hplbEvento) {
		this.hplbEvento = hplbEvento;
	}


	public Label getLbCoordenadores() {
		return lbCoordenadores;
	}


	public void setLbCoordenadores(Label lbCoordenadores) {
		this.lbCoordenadores = lbCoordenadores;
	}


	public HorizontalPanel getHplbCoordenadores() {
		return hplbCoordenadores;
	}


	public void setHplbCoordenadores(HorizontalPanel hplbCoordenadores) {
		this.hplbCoordenadores = hplbCoordenadores;
	}


	public Label getLbParticipantes() {
		return lbParticipantes;
	}


	public void setLbParticipantes(Label lbParticipantes) {
		this.lbParticipantes = lbParticipantes;
	}


	public HorizontalPanel getHplbParticipantes() {
		return hplbParticipantes;
	}


	public void setHplbParticipantes(HorizontalPanel hplbParticipantes) {
		this.hplbParticipantes = hplbParticipantes;
	}


	public Label getLbSair() {
		return lbSair;
	}


	public void setLbSair(Label lbSair) {
		this.lbSair = lbSair;
	}


	public HorizontalPanel getHplbSair() {
		return hplbSair;
	}


	public void setHplbSair(HorizontalPanel hplbSair) {
		this.hplbSair = hplbSair;
	}


	public Image getiEvento() {
		return iEvento;
	}


	public void setiEvento(Image iEvento) {
		this.iEvento = iEvento;
	}


	public Image getiCoordenador() {
		return iCoordenador;
	}


	public void setiCoordenador(Image iCoordenador) {
		this.iCoordenador = iCoordenador;
	}


	public Image getiParticipantes() {
		return iParticipantes;
	}


	public void setiParticipantes(Image iParticipantes) {
		this.iParticipantes = iParticipantes;
	}


	public Image getiSair() {
		return iSair;
	}


	public void setiSair(Image iSair) {
		this.iSair = iSair;
	}

	public VerticalPanel getVpsubItem1() {
		return vpsubItem1;
	}


	public void setVpsubItem1(VerticalPanel vpsubItem1) {
		this.vpsubItem1 = vpsubItem1;
	}


	public Label getLbAdicionarEvento() {
		return lbAdicionarEvento;
	}


	public void setLbAdicionarEvento(Label lbAdicionarEvento) {
		this.lbAdicionarEvento = lbAdicionarEvento;
	}


	public Label getLbSetaCimaE() {
		return lbSetaCimaE;
	}


	public void setLbSetaCimaE(Label lbSetaCimaE) {
		this.lbSetaCimaE = lbSetaCimaE;
	}


	public Label getLbSetaCimaC() {
		return lbSetaCimaC;
	}


	public void setLbSetaCimaC(Label lbSetaCimaC) {
		this.lbSetaCimaC = lbSetaCimaC;
	}


	public Label getLbSetaCimaP() {
		return lbSetaCimaP;
	}


	public void setLbSetaCimaP(Label lbSetaCimaP) {
		this.lbSetaCimaP = lbSetaCimaP;
	}


	public VerticalPanel getVpAdicionaItensEvento() {
		return vpAdicionaItensEvento;
	}


	public void setVpAdicionaItensEvento(VerticalPanel vpAdicionaItensEvento) {
		this.vpAdicionaItensEvento = vpAdicionaItensEvento;
	}


	public VerticalPanel getVpAdicionaItensCoordenador() {
		return vpAdicionaItensCoordenador;
	}


	public void setVpAdicionaItensCoordenador(
			VerticalPanel vpAdicionaItensCoordenador) {
		this.vpAdicionaItensCoordenador = vpAdicionaItensCoordenador;
	}


	public VerticalPanel getVpAdicionaItensParticipante() {
		return vpAdicionaItensParticipante;
	}


	public void setVpAdicionaItensParticipante(
			VerticalPanel vpAdicionaItensParticipante) {
		this.vpAdicionaItensParticipante = vpAdicionaItensParticipante;
	}


	public Image getiEvento2() {
		return iEvento2;
	}


	public void setiEvento2(Image iEvento2) {
		this.iEvento2 = iEvento2;
	}


	public Image getiCoordenador2() {
		return iCoordenador2;
	}


	public void setiCoordenador2(Image iCoordenador2) {
		this.iCoordenador2 = iCoordenador2;
	}


	public Image getiParticipantes2() {
		return iParticipantes2;
	}


	public void setiParticipantes2(Image iParticipantes2) {
		this.iParticipantes2 = iParticipantes2;
	}


	public Image getiSair2() {
		return iSair2;
	}


	public void setiSair2(Image iSair2) {
		this.iSair2 = iSair2;
	}

	

}
