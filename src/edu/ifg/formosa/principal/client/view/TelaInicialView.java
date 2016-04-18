package edu.ifg.formosa.principal.client.view;

import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TelaInicialView extends Composite {

	private HorizontalPanel hpPainelCabecalhoLabel;
	private VerticalPanel vpPainelCabecalho;
	private VerticalPanel vpPainelPaiTelaInicial;
	private Label lbCertificados;
	private Label lbEntrarSite;
	private Anchor aComoFunciona;
	private Image iLogoSite;


	public TelaInicialView(){
		
		// ------- Painel Cabecalho------------------------
		//------------------------------------------------
		hpPainelCabecalhoLabel = new HorizontalPanel();
		hpPainelCabecalhoLabel.setStyleName("hpPainelCabecalhoLabel");
		
		iLogoSite = new Image();
		iLogoSite.setUrl("../Image/logo.png");
		iLogoSite.setStyleName("iLogoSite");
		
		lbCertificados = new Label("Certificado");
		lbCertificados.setStyleName("lbCertificados");
		
		aComoFunciona = new Anchor("Como Funciona", "#comofunciona");
		aComoFunciona.setStyleName("aComoFunciona");
		
		lbEntrarSite = new Label("Entrar");
		lbEntrarSite.setStyleName("lbEntrarSite");
		
		hpPainelCabecalhoLabel.add(iLogoSite);
		hpPainelCabecalhoLabel.setCellWidth(iLogoSite, "10%");
		hpPainelCabecalhoLabel.add(lbCertificados);
		hpPainelCabecalhoLabel.setCellWidth(lbCertificados, "2%");
		//hpPainelCabecalhoLabel.add(aComoFunciona);
		//hpPainelCabecalhoLabel.setCellWidth(aComoFunciona, "4%");
		hpPainelCabecalhoLabel.add(lbEntrarSite);
		hpPainelCabecalhoLabel.setCellWidth(lbEntrarSite, "15%");
		
		//-------------------------------------------
		//-------------------------------------------
		vpPainelCabecalho = new VerticalPanel();
		vpPainelCabecalho.setStyleName("vpPainelCabecalho");
		
		vpPainelCabecalho.add(hpPainelCabecalhoLabel);
		
		//-------------------------------------------
		//-------------------------------------------
		vpPainelPaiTelaInicial = new VerticalPanel();
		vpPainelPaiTelaInicial.setStyleName("vpPainelPaiTelaInicial");
		
		vpPainelPaiTelaInicial.add(vpPainelCabecalho);
		
		initWidget(vpPainelPaiTelaInicial);
	}


	public HorizontalPanel getHpPainelCabecalhoLabel() {
		return hpPainelCabecalhoLabel;
	}


	public void setHpPainelCabecalhoLabel(HorizontalPanel hpPainelCabecalhoLabel) {
		this.hpPainelCabecalhoLabel = hpPainelCabecalhoLabel;
	}


	public VerticalPanel getVpPainelCabecalho() {
		return vpPainelCabecalho;
	}


	public void setVpPainelCabecalho(VerticalPanel vpPainelCabecalho) {
		this.vpPainelCabecalho = vpPainelCabecalho;
	}


	public VerticalPanel getVpPainelPaiTelaInicial() {
		return vpPainelPaiTelaInicial;
	}


	public void setVpPainelPaiTelaInicial(VerticalPanel vpPainelPaiTelaInicial) {
		this.vpPainelPaiTelaInicial = vpPainelPaiTelaInicial;
	}


	public Label getLbCertificados() {
		return lbCertificados;
	}


	public void setLbCertificados(Label lbCertificados) {
		this.lbCertificados = lbCertificados;
	}


	public Label getLbEntrarSite() {
		return lbEntrarSite;
	}


	public void setLbEntrarSite(Label lbEntrarSite) {
		this.lbEntrarSite = lbEntrarSite;
	}


	public Anchor getaComoFunciona() {
		return aComoFunciona;
	}


	public void setaComoFunciona(Anchor aComoFunciona) {
		this.aComoFunciona = aComoFunciona;
	}


	public Image getiLogoSite() {
		return iLogoSite;
	}


	public void setiLogoSite(Image iLogoSite) {
		this.iLogoSite = iLogoSite;
	}

}
