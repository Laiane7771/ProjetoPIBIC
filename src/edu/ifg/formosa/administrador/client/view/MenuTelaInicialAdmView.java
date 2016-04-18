package edu.ifg.formosa.administrador.client.view;


import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MenuTelaInicialAdmView extends Composite{

	private VerticalPanel vpPainelMenuTelaInicialAdm;
	private HorizontalPanel hpPainelMenuCampusAdm;
	private HorizontalPanel hpPainelMenuGerenteAdm;
	private HorizontalPanel hpPainelMenuSairAdm;
	private Label lbMenuCampus;
	private Label lbMenuGerente;
	private Label lbMenuSair;
	private Image iMenuCampus;
	private Image iMenuGerente;
	private Image iMenuSair;
	
	public MenuTelaInicialAdmView(){
		
		vpPainelMenuTelaInicialAdm = new VerticalPanel();
		vpPainelMenuTelaInicialAdm.setStyleName("vpPainelMenuTelaInicialAdm");
		
		hpPainelMenuCampusAdm = new HorizontalPanel();
		hpPainelMenuCampusAdm.setStyleName("hpPainelMenuCampusAdm");
		
		iMenuCampus = new Image();
		iMenuCampus.setStyleName("iMenuCampus");
		
		lbMenuCampus = new Label("Câmpus");
		lbMenuCampus.setStyleName("lbMenuCampus");
		
		hpPainelMenuCampusAdm.add(iMenuCampus); //add item
		hpPainelMenuCampusAdm.add(lbMenuCampus);//add item
		
		hpPainelMenuGerenteAdm = new HorizontalPanel();
		hpPainelMenuGerenteAdm.setStyleName("hpPainelMenuGerenteAdm");
		
		iMenuGerente = new Image();
		iMenuGerente.setStyleName("iMenuGerente");
		
		lbMenuGerente = new Label("Gerente");
		lbMenuGerente.setStyleName("lbMenuGerente");
		
		hpPainelMenuGerenteAdm.add(iMenuGerente);//add item
		hpPainelMenuGerenteAdm.add(lbMenuGerente);//add item
		
		hpPainelMenuSairAdm = new HorizontalPanel();
		hpPainelMenuSairAdm.setStyleName("hpPainelMenuSairAdm");
		
		iMenuSair = new Image();
		iMenuSair.setStyleName("iMenuSair");
		
		lbMenuSair = new Label("Sair");
		lbMenuSair.setStyleName("lbMenuSair");
		
		hpPainelMenuSairAdm.add(iMenuSair);//add item
		hpPainelMenuSairAdm.add(lbMenuSair);//add item
		
		vpPainelMenuTelaInicialAdm.add(hpPainelMenuCampusAdm);//add item
		vpPainelMenuTelaInicialAdm.add(hpPainelMenuGerenteAdm);//add item
		vpPainelMenuTelaInicialAdm.add(hpPainelMenuSairAdm);//add item
		
		initWidget(vpPainelMenuTelaInicialAdm);//inicializa o widget;
	}

	public VerticalPanel getVpPainelMenuTelaInicialAdm() {
		return vpPainelMenuTelaInicialAdm;
	}

	public void setVpPainelMenuTelaInicialAdm(VerticalPanel vpPainelMenuTelaInicialAdm) {
		this.vpPainelMenuTelaInicialAdm = vpPainelMenuTelaInicialAdm;
	}

	public HorizontalPanel getHpPainelMenuCampusAdm() {
		return hpPainelMenuCampusAdm;
	}

	public void setHpPainelMenuCampusAdm(HorizontalPanel hpPainelMenuCampusAdm) {
		this.hpPainelMenuCampusAdm = hpPainelMenuCampusAdm;
	}

	public HorizontalPanel getHpPainelMenuGerenteAdm() {
		return hpPainelMenuGerenteAdm;
	}

	public void setHpPainelMenuGerenteAdm(HorizontalPanel hpPainelMenuGerenteAdm) {
		this.hpPainelMenuGerenteAdm = hpPainelMenuGerenteAdm;
	}

	public HorizontalPanel getHpPainelMenuSairAdm() {
		return hpPainelMenuSairAdm;
	}

	public void setHpPainelMenuSairAdm(HorizontalPanel hpPainelMenuSairAdm) {
		this.hpPainelMenuSairAdm = hpPainelMenuSairAdm;
	}

	public Label getLbMenuCampus() {
		return lbMenuCampus;
	}

	public void setLbMenuCampus(Label lbMenuCampus) {
		this.lbMenuCampus = lbMenuCampus;
	}

	public Label getLbMenuGerente() {
		return lbMenuGerente;
	}

	public void setLbMenuGerente(Label lbMenuGerente) {
		this.lbMenuGerente = lbMenuGerente;
	}

	public Label getLbMenuSair() {
		return lbMenuSair;
	}

	public void setLbMenuSair(Label lbMenuSair) {
		this.lbMenuSair = lbMenuSair;
	}

	public Image getiMenuCampus() {
		return iMenuCampus;
	}

	public void setiMenuCampus(Image iMenuCampus) {
		this.iMenuCampus = iMenuCampus;
	}

	public Image getiMenuGerente() {
		return iMenuGerente;
	}

	public void setiMenuGerente(Image iMenuGerente) {
		this.iMenuGerente = iMenuGerente;
	}

	public Image getiMenuSair() {
		return iMenuSair;
	}

	public void setiMenuSair(Image iMenuSair) {
		this.iMenuSair = iMenuSair;
	}
	
}
